package my.day9;

import java.util.Random;

/*
 	int ball ==> 1번공 ~ 45번공 => 동일한 데이터 타입 여러개 존재 ==> 배열 사용!!
 	
 	int[] ball
 	-------------------------------------------------------
 	|0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|...|43|44|
 	-------------------------------------------------------
 */

public class Lotto {

	public static void main(String[] args) {
		
		//난수 발생
		Random rnd = new Random(); // 배열의 방번호 0~44번 중 6개를 뽑아오면 됨
		
		// 배열 생성 -> 무슨 값이 들어갈 지 모르기 때문에 초기화X
		int[] ballArr = new int[45]; // 초기치 int ==0
		
		int idx =0; // << 배열의 방 번호값을 넣어줄 변수 선언
		
		int[] tempArr = new int[5]; // << 기존에 뽑았던 방 번호를 기억시킬 공간
		// 6번째 공은 이미 뽑은 5개 전부와 비교해서 뽑으면 되니까 배열 6칸 만들 필요 X
		
	
		for(int i=0; i<ballArr.length; i++) {
			ballArr[i] = i+1; //초기치로 1번공 ~ 45번공까지 각 배열 방에 부여
		} // end of for1
		
		
		// 3. 비교할 대상의 배열 값이 모두 0이여서 0 뽑았을 때 중복처리 되기 때문에 이를 방지하려고 만듦 
		for(int i=0; i<tempArr.length; i++) {
			tempArr[i] = -1; // 공을 꺼냈을 때 그 공의 방번호(index number)를 담아두는 곳으로 사용
			// 배열 초기값이 int여서 모두 0이니까 만약 0인 공을 뽑았을 때 모두 중복으로 나올 것을 방지하는 것임
			// ==> 초기치는 방번호로 사용 하지 않는 "-1"로 모든 배열방을 초기화 함
		} // end of for2
		
		/*
		 	# tempArr의 초기 모습
		 	--------------------------
		 	| -1 | -1 | -1 | -1 | -1 |
		 	--------------------------
		 	
		 	# tempArr에 idx값을 넣어줬을 때
		 	-------------------------------
		 	|  9 |  0 | 34 |  2 |  1 | 마지막값(tempArr에 방없음)
		 	-------------------------------
		 
		 */
		
		
		// 2. 공의 방 번호를 뽑는 작업
		GetBall:
		for(int i=0; i<6; i++) { // -> 공을 6번 뽑아야해서 6번 반복
			
			// rnd.nextInt(max - min + 1) + min;
			idx = rnd.nextInt(44-0+1)+0; // 0 ~ 44 까지 난수 발생 
			// ex) 9 0 32 2 1 40 이 나왔을 때 => 중복된 방번호 X
			// ex2) 9 9 32 21 40 --> 중복 발생 ==> 중복 방지 필요
		
			// tempArr에 넣기 전에 비교 (tempArr 초기값과 비교)
			for(int j=0; j<tempArr.length; j++) {
				if(tempArr[j]==idx) {
					i--; // 이미 뽑았던 공값을 또 뽑으면 다시 뽑을 기회를 줘야함 
						 //==> 근데 i값은 계속 증가해서 방이 바뀌어버리니까 i에서 1을 빼줘야함
					continue GetBall; // 다시 뽑을 기회를 줘야하기 때문에 바깥 for의 증감식으로 가게끔!	
				} // end of if
			}// end of for inner1
			
			// 4. 공값 중복 안됐을 때 공 값을 출력하기 (당첨번호 출력)
			String str = (i<5)? ",":"\n";
			System.out.print(ballArr[idx]+str);
			
			if(i<5) { // tempArr의 방 번호 0~4까지
				tempArr[i] = idx; // 위에서 랜덤하게 뽑은 공을 tempArr에 넣어줌
			}	
		} // end of for2
		
		//4. 실제 뽑은 공의 값을 출력
		System.out.println("1등 로또 당첨번호 입니다!");
		
	
		
	} // end of main()

} // end of class
