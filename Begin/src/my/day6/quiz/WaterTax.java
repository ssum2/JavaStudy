package my.day6.quiz;

import java.text.DecimalFormat;
import java.util.Scanner;

public class WaterTax {

	public static void menu() {
		System.out.println("---------- Menu -----------");
		System.out.println("1. 가정용(liter 당 50원)");
		System.out.println("2. 상업용(liter 당 45원)");
		System.out.println("3. 공업용(liter 당 30원)");
		System.out.println("4. 종료");
		System.out.println("---------------------------");
		System.out.print(">> 메뉴 번호를 선택하세요 => ");
	
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			
			WaterTax.menu();
			String strMenuNo = sc.nextLine();
			
			switch (strMenuNo) {
			case "1":
			
			case "2":
			
			case "3":
			
			case "4":
				
				break; // switch문의 종료를 뜻함

			default:
				System.out.println(">> 메뉴번호는 1,2,3,4만 가능합니다.");
				continue; // 처음으로 올라가 메뉴를 다시 보여주게끔 함
				// 여기서 1,2,3,4 필터링을 하기 때문에 스위치문 밖으로 나가는 값은 1,2,3,4뿐임
				
			} // end of switch
			
			// switch문을 빠져나온 다음에 종료 실행
			if("4".equals(strMenuNo))
				break; // for문을 빠져나감
			
			for(;;) {
				try {
					System.out.print(">> 물사용량을 입력하세요 => ");
					int useLiter = Integer.parseInt(sc.nextLine());
					
					if(useLiter<0) { // useLiter값이 0미만의 값이 들어왔을 때 필터
						System.out.println(">> 물사용량은 0보다 큰 정수여야 합니다.\n");
						continue; // for문 처음으로 돌아감
					}
					
					int tax = 0;
					String type = "";
					
					if("1".equals(strMenuNo)){ 
					//else if 해도 되지만 첫번째 if문 바로 밑 문장을 실행하려면 if로 나눠줘야함
						tax = useLiter*50;
						type = "가정용";
					}
					else if("2".equals(strMenuNo)){
						tax = useLiter*45;
						type = "상업용";
					}
					else if("3".equals(strMenuNo)){
						tax = useLiter*30;
						type = "공업용";
					}
					
					
					// 숫자 세자리 마다 ,를 찍어주기
					DecimalFormat df = new DecimalFormat("#,###");
//					df.format(tax); ==> long타입의 정수를 받아서 위에 쓴 "#,###"포맷에 맞춰 string타입으로 변환
					
					// 수도세 출력
					System.out.println(">> 수도세("+type+"): "+df.format(tax)+"원\n");
					
					break; // for문을 빠져나감 --> 바깥for문 처음으로 돌아감
	
				} catch (NumberFormatException e) {
					System.out.println(">> 물사용량은 0보다 큰 정수여야 합니다.");
					// 메뉴 보여줄 필요 없이 >>물사용량~~ 이부분으로 다시 돌아가도록 해야함
					//continue; 생략 가능 -> 어차피 끝나도 무한루프라 for 처음으로 돌아가기 때문
					
				} // end of try-catch
			}// end of for(;;) -> 안쪽 for문
			
			
				
		} // end of for(;;) -> 바깥 for문
		
		System.out.println("===== 프로그램을 종료합니다 =====");
		sc.close();
		
		
	} // end of main()

} // end of class
