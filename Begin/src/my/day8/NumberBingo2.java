package my.day8;

	import java.util.Scanner;

	import my.util.MyUtil;

	
	public class NumberBingo2 {
	
		int count; // 멤버변수는 초기치를 JVM에서 알아서 초기화해줌
		// 현재 이 클래스에서 객체를 하나만 생성했기 때문에 굳이 static으로 선언해줄 필요 없음.
		// 그러나 여러 객체를 생성할 것을 생각하면 웬만하면 static 해주자...
		
		
		// 3-2. 숫자를 맞추는 메소드 만듦 (1~100 사이 정수값을 제대로 입력했을 때 실행)
		public void bingo(int random, int userNum) {
			String str = "";
			
			if(userNum>random) {
				str = userNum + " 보다 작습니다.";
				count++; // 메소드가 돌아간 횟수를 누적으로 셈 ==> 멤버변수로 선언해줘서 써야함
			}
			else if(userNum<random) {
				str = userNum + " 보다 큽니다.";
				count++;
			}
			
			else {
				str = "BINGO~~!!"+ ++count +"번만에 맞췄습니다.";
				// count의 초기값이 0이기 때문에 전위로 +1 해준 값으로 출력해야함
			}
			System.out.println(str);
			
			
		} // end of bingo(a,b)
		
		public static void main(String[] args) {
			// 1. 컴퓨터가 1~100 사이의 랜덤한 숫자를 가지도록 한다.
			int random = MyUtil.random2(1, 100);
			
			// 2. 유저가 키보드에 입력한 값을 받아온다. ( random과 userNum을 비교할 것)
			int userNum = 0;
			
			Scanner sc = new Scanner(System.in);
			NumberBingo obj = new NumberBingo(); // 기본생성자로 객체 생성
			

			
			System.out.println("*************BINGO GAME*************");
			
			GAMELable:
			do {
				// 3-1.예외처리
				try {
					System.out.print("\n>> 1부터 100 사이의 정수를 입력하세요 => ");
					userNum = Integer.parseInt(sc.nextLine());
					if(userNum < 1 || userNum >100) {
						System.out.println(">> 경고: 1~100 사이의 정수만 입력하세요 <<");
						continue; 
						
					} // end of try 
					
	 				
					// 3-3. 숫자를 맞추는 메소드 호출 (1~100 사이 정수값을 제대로 입력했을 때 실행)
					obj.bingo(random, userNum);
					
					
				} catch (NumberFormatException e) {
					System.out.println(">> 정수만 입력하세요 <<");
					continue; // 조건식 바로 위로 떨어지도록 --> do 쪽으로
					// try-catch 블럭 밑 ~ while 블럭 위 사이에 명령문이 없으면 continue 생략 가능
					
				} // end of catch
				
				
				//---------------------NumberBingo2 내용 다른 부분!-------------------------
				
				// 4. 게임 종료할지 안할지 물어보기
				// 강사님이 한 것: 라벨 + if문
				if(random == userNum) {
				//	YNLable:
					do {
				
						System.out.print("\n>> 게임을 계속 하시겠습니까? (y/n) => ");
						String str1 = sc.nextLine();
						
						if("y".equals(str1) || "Y".equals(str1)) {
							obj.count =0; // 새로운 게임이 되어야 하니까 count 초기화 해줘야함
							random = MyUtil.random2(1, 100); // 새로운 게임이기 때문에 랜덤값도 초기화
							break; // 가장 가까운 do while => YNLable 빠져나감 => while true니까 바깥 do로 감
						}
						else if ("n".equals(str1) || "N".equals(str1)){
							System.out.println("\n**************THE END***************");
							break GAMELable;
						}
						else { // y나 n이 아닌 경우
							System.out.println(">> Y(y) 또는 N(n)만 입력하세요 <<");
							continue; // continue 생략해도 안쪽 do while을 못벗어남 -> YNLable로 들어감
						}
					
					} while (true); // end of do-while
			
					
				} // end of if(random == userNum)
				
			} while (true);
			
			
			
			
			
		} // end of main()

	} // end of class

