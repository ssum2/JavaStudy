package my.day6.quiz;

import java.text.DecimalFormat;
import java.util.Scanner;

public class WaterTax {

	public static void menu() {
		System.out.println("\n-------- Menu ---------");
		System.out.println("1. 가정용(liter 당 50원)");
		System.out.println("2. 상업용(liter 당 45원)");
		System.out.println("3. 공업용(liter 당 30원)");
		System.out.println("4. 종료");
		System.out.println("-----------------------");
		System.out.print(">> 메뉴번호를 선택하세요 => ");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			WaterTax.menu();
			
			String strMenuno = sc.nextLine();
			
			switch (strMenuno) {
			    case "1":
				case "2":
				case "3":
				case "4":	
					break;
	
				default:
					System.out.println(">> 메뉴번호는 1,2,3,4 만 가능합니다."); 
					continue;
			}// end of switch--------------------
			
			if("4".equals(strMenuno))
				break;
			
			for(;;) {
				try {
					System.out.print(">> 물사용량을 입력 => ");
					int useLiter = Integer.parseInt(sc.nextLine());
					
					if(useLiter < 0) {
						System.out.println(">> 물사용량은 0보다 큰 정수이어야 합니다.");
						continue;
					}
					
					int tax = 0;
					String type = "";
					
					if("1".equals(strMenuno)) {
						tax = useLiter*50;
						type = "가정용";
					}
					else if("2".equals(strMenuno)) {
						tax = useLiter*45;
						type = "상업용";
					}
					else if("3".equals(strMenuno)) {
						tax = useLiter*30;
						type = "공업용";
					}
					
					DecimalFormat df = new DecimalFormat("#,###");
					// df 는 숫자로 되어진 데이터를 세자리 마다 콤마(,)를 찍어주는 객체이다. 
										
					System.out.println(">> 수도요금("+type+") : " + df.format(tax) +"원"); 
					break;
				} catch (NumberFormatException e) {
					System.out.println(">> 물사용량은 0보다 큰 정수 이어야 합니다.");
				 // continue;
				}
			} // end of for-----------------
			
				
		}// end of for-----------------------
		
		System.out.println(">>> 프로그램 종료!! <<<");
		
		sc.close();
	}// end of main()----------------------------

}
