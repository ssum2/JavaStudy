package my.day7;

import java.util.Scanner;

import my.util.MyUtil;

public class GayBayBo {

	public static void menu() {
		System.out.println("\n===== 가위,바위,보 Game =====");
		System.out.println("1.가위\t2.바위\t3.보\t4.게임종료"); 
		System.out.print(">> 선택하세요(1,2,3,4) => ");
	}
	
	public void gameResult(String userNo, String pcNo) {
		
		// userNo "1"(가위) pcNo "3"(보)   ==>  사용자가 이겼습니다.
		// userNo "1"(가위) pcNo "2"(바위) ==>  사용자가 졌습니다.
		
		// userNo "2"(바위) pcNo "1"(가위)  ==>  사용자가 이겼습니다.
		// userNo "2"(바위) pcNo "3"(보)   ==>  사용자가 졌습니다.
		
		// userNo "3"(보) pcNo "2"(바위)   ==>  사용자가 이겼습니다.
		// userNo "3"(보) pcNo "1"(가위)   ==>  사용자가 졌습니다.
		
		String gameResult = "";
		
		if("1".equals(userNo) && "3".equals(pcNo) ||
		   "2".equals(userNo) && "1".equals(pcNo) ||
		   "3".equals(userNo) && "2".equals(pcNo) )
			    gameResult = "사용자가 이겼습니다.";
		
		else if("1".equals(userNo) && "2".equals(pcNo) ||
			    "2".equals(userNo) && "3".equals(pcNo) ||
			    "3".equals(userNo) && "1".equals(pcNo) )
				gameResult = "사용자가 졌습니다.";
		else
			    gameResult = "비겼습니다.";
		
		String userStr = "";
		String pcStr = "";
		if("1".equals(userNo)) {
			userStr = "가위";
		}
		else if("2".equals(userNo)) {
			userStr = "바위";
		}
		else if("3".equals(userNo)) {
			userStr = "보";
		}
		
		
		if("1".equals(pcNo)) {
			pcStr = "가위";
		}
		else if("2".equals(pcNo)) {
			pcStr = "바위";
		}
		else if("3".equals(pcNo)) {
			pcStr = "보";
		}
		
		System.out.println(">>> 사용자 : " + userStr +", 컴퓨터 : " + pcStr);    
		System.out.println(gameResult+"\n");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		GayBayBo obj = new GayBayBo();
		String userNo = "";
		
		do {
			GayBayBo.menu();
			userNo = sc.nextLine();
			int pcNo = MyUtil.random(1, 3);
			
			switch (userNo) {
				case "1":
				case "2":
				case "3":
					obj.gameResult(userNo, Integer.toString(pcNo));
					break;
					
				case "4":	
					break;
	
				default:
					System.out.println(">>> 메뉴는 1,2,3,4 중에 하나이어야 합니다."); 
				//	continue;
					break;
			}// end of switch------------------
			
		} while (!"4".equals(userNo));

		System.out.print(">> 프로그램 종료 시각 : ");
		MyUtil.currentTime();
		
		sc.close();

	}// end of main()----------------------------

}
