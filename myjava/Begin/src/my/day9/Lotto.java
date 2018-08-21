/*
 int ball ==> 1 ~ 45
 
 int[] ball 
 ----------------------------------------------------
 |0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|...|43|44|
 -----------------------------------------------------
*/
package my.day9;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] ballArr = new int[45];
		int idx = 0; // 방번호
		int[] tempArr = new int[5]; // 기존에 뽑았던 방번호를 기억시켜두는 공간 
		
		for(int i=0; i<ballArr.length; i++) {
			ballArr[i] = i+1; // 초기치로 1번공 ~ 45번공 까지 준비함. 
		}
		
		for(int i=0; i<tempArr.length; i++) {
			tempArr[i] = -1; // 공을 꺼내어 오면 꺼내온 공의 방번호(index 번호)를 담아두는 곳으로 사용.
			                 // 꺼내온 공의 방번호(index 번호)가 0 값이 들어올수도 있으므로 
			                 // 초기치는 방번호(index 번호)로 사용하지 않는 -1로 모두(5개) 초기화함. 
		}
		// tempArr
		// --------------------------
		// | -1 | -1 | -1 | -1 | -1 |
		// --------------------------
		
		// --------------------------
		// | 9 | 0 | 34 | 2 | 1 |
		// --------------------------
		
		outer:
		for(int i=0; i<6; i++) {  // 공의 방번호를 꺼내는 작업을 6번 반복. 
			// rnd.nextInt(max - min + 1) + min;
			idx = rnd.nextInt(44-0+1)+0;   // 0 ~ 44 까지 난수 발생
			// 9 0 34 2 1 40
			
			for(int j=0; j<tempArr.length; j++) {
				if(tempArr[j]==idx) {
					i--;
					continue outer;
				}
			}// end of for--------------
			
			String str = (i<5)?",":"\n";
			System.out.print(ballArr[idx]+str);
			
			if(i<5) {
				tempArr[i] = idx;	
			}
			
		}// end of for---------------------
		
		System.out.println("1등 로또 당첨번호 입니다.");
		
	}// end of main()----------------------------

}
