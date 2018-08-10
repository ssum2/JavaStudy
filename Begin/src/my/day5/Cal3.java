package my.day5;

import java.util.Scanner;

public class Cal3 {

	public static void main(String[] args) {
		// 프로그램의 종료
		// return; >> 메인메소드의 return은 JVM으로 돌아가는 것 => 프로그램의 종료
		// System.exit(0); >> 파라미터에 숫자 아무거나 넣어도 되지만, 0은 정상종료, 0이 아닌 값은 비정상적인 종료를 의미 (프로그래머끼리의 표기약속)
		Scanner sc = new Scanner(System.in);
		
		try { //시도하다 --> 이 부분에서는 가져가야할 조건을 넣어줌
			
			
			
			System.out.print("▷ 첫번째 수 => ");
			String str1 = sc.nextLine(); // // sc.nextLine()은 키보드에서 입력한 값을 String타입으로 받아오는 것
			double a = Double.parseDouble(str1);  // throws NumberFormatException 발생할 수 있음 -> 유저들이 숫자만 입력하는게 아니기 때문!
			// 오류가 나지 않도록 해야함  ==> try
			
			System.out.print("▷ 두번째 수 => ");
			String str2 = sc.nextLine();
			double b = Double.parseDouble(str2);
			
			System.out.print("▷ 연산자선택 => ");
			String op = sc.nextLine();
			
			
//			Calcurator cl = new Calcurator();
//			double result = cl.calc(a, b, op); // return type is double
			
					// result가 7.0이라면 7
					// result가 7.5라면 7.5 
				
					// 7.0%7 == 0  = 7.0%(int)7.0
					// 7.5%7 == 0아님 = 7.5%(int)7.5 
		
			// if문으로 처리했을 때 (switch문으로 처리했을 때는 CalcuratorMain.java 참조)
			
			if(!("+".equals(op) || 
				"-".equals(op) || 
				"*".equals(op) || 
				"/".equals(op))) {
				System.out.println("지정된 연산자만 입력하시오.");
				sc.close();
				return;	
			}
			
			
			Calcurator cl = new Calcurator();
			double result = cl.calc(a, b, op); // return type is double
			// result가 7.0이라면 7
			// result가 7.5라면 7.5 
		
			// 7.0%7 == 0  = 7.0%(int)7.0
			// 7.5%7 == 0아님 = 7.5%(int)7.5
			System.out.println("==== 계산 결과(클래스에 있는 메소드 변경한 후) ====");
				// calcurator 클래스에서 연산 다 해서 뱉어줘서 그냥 쓰면됨
				System.out.println(str1 + op + str2 + "="+ result);
			
			
			
		} catch (NumberFormatException e) { // 예외의 입력이 있었을 때
		
			System.out.println(">>> 숫자로만 입력하시오 <<<");
//			e.printStackTrace();
			
			
			
//			System.out.println(e.getMessage()); // 잘못된 내역을 보여줌
//			e.printStackTrace(); // 어디가 잘못되었는지 추적하여 상세내역을 보여줌
			
		} // end of try

//		System.out.println(str1 + op + str2 + "=" + result);
		
		sc.close();
		
	} // end of main()

}
