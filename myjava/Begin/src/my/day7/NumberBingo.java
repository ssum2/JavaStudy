package my.day7;

import java.util.Scanner;

import my.util.MyUtil;

public class NumberBingo {

	int count;
	
	public void bingo(int random, int userNum) {
		String str = "";
		
		if(userNum > random) {
			str = userNum + " 보다 작습니다.";
			count++;
		}
		else if(userNum < random) {
			str = userNum + " 보다 큽니다.";
			count++;
		}
		else {
			str = "빙고~~ " + ++count + "번만에 맞추었습니다.";
		}
		
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		
		// 컴퓨터가 1 ~ 100 사이의 랜덤한 숫자를 가지도록 한다.
		int random = MyUtil.random2(1, 100);
		int userNum = 0;
		
		Scanner sc = new Scanner(System.in);
		NumberBingo obj = new NumberBingo();
		
		outer:
		do {
			try {
				System.out.print("1부터 100사이의 정수를 입력하세요=> "); 
				userNum = Integer.parseInt(sc.nextLine());	
				if(userNum < 1 || userNum > 100) {
					System.out.println(">> 경고 : 1과 100 사이의 정수만 가능합니다.");
					continue;
				}
				// 숫자를 맞추는 메소드 호출;
				obj.bingo(random, userNum);
			} catch (NumberFormatException e) {
				System.out.println(">> 정수만 입력하세요!!");
			//	continue;
			}
			
			if(random == userNum) { 
				
				do {
					System.out.print(">> 게임을 계속하시겠습니까?(Y/N)=> "); 
					String yn = sc.nextLine();
					if("n".equals(yn) || "N".equals(yn)) {
						System.out.println("=== 게임종료!! ===");
						break outer;	
					}
					else if("y".equals(yn) || "Y".equals(yn)) { 
						obj.count = 0; // 초기화
						random = MyUtil.random2(1, 100); // 초기화
						break;
					}
					else { 
						System.out.println(">> Y(y) 또는 N(n)만 입력하세요!!"); 
                     // continue;					
					}// end of if~else--------------------
				
				} while (true); // end of do~while---------
				
			}// end of if~else--------------------
				
		} while (true);
		
		sc.close();
	}// end of main()------------------------

}
