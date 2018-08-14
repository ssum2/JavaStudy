package my.day7;

import java.util.Scanner;

import my.util.MyUtil;

public class GayBayBo {

	public static void menu() {
		System.out.println("\n===== 가위, 바위, 보 Game =====");
		System.out.println("1.가위\t2.바위\t3.보\t4.게임종료");
		System.out.print(">> 선택하세요(1,2,3,4) => ");
	}
	
	public void gameResult(String userNo, String pcNo) {
		// userNo="1" pcNo="3" -> 사용자가 이겼습니다.
		// userNo="1" pcNo="2" -> 사용자가 졌습니다.
		
		// userNo="2" pcNo="1" -> 사용자가 이겼습니다.
		// userNo="2" pcNo="3" -> 사용자가 졌습니다.
		
		// userNo="3" pcNo="2" -> 사용자가 이겼습니다.
		// userNo="3" pcNo="1" -> 사용자가 졌습니다.
		
		// else 비김
		
		
		String gameResult = "";
		
		if("1".equals(userNo) && "3".equals(pcNo) ||
		   "2".equals(userNo) && "1".equals(pcNo) ||
		   "3".equals(userNo) && "2".equals(pcNo)) {
				gameResult ="사용자가 이겼습니다.";	
		}
		else if("1".equals(userNo) && "2".equals(pcNo) ||
				"2".equals(userNo) && "3".equals(pcNo) ||
				"3".equals(userNo) && "1".equals(pcNo)) {
				gameResult ="사용자가 졌습니다.";
					
		}
		else
			gameResult = "비겼습니다.";
		
		String userStr ="";
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
		
		if("1".equals(pcNo))
			pcStr = "가위";
		
		else if ("2".equals(pcNo))
			pcStr = "바위";
		else if("3".equals(pcNo))
			pcStr = "보";
		
	 
		System.out.println(">>> 사용자 : "+userStr+", 컴퓨터: "+pcStr);
		System.out.println(userStr+" VS "+pcStr);
		System.out.println(gameResult+"\n");
	
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		GayBayBo obj = new GayBayBo();
			
		String userNo = "";
		int pcNo;
		
		do {
			GayBayBo.menu();
			userNo=sc.nextLine();
			pcNo = MyUtil.random(1, 3);
			
			
			switch (userNo) {
			case "1":
			case "2":
			case "3":
				obj.gameResult(userNo, Integer.toString(pcNo));
				System.out.println();
				break;
			case "4":
				break;

			default:
				System.out.println(">> 입력값은 1,2,3,4만 가능합니다");
				continue;
//				break;  둘 다 가능
			}// end of switch
	
		} while (!"4".equals(userNo)); // 입력한 값이 4번이 아니라면 계속 반복
		
		System.out.print("\n>> 프로그램 종료 시각: ");
		MyUtil.currentTime();
		
		sc.close();
			
	} // end of main()

} // end of class
