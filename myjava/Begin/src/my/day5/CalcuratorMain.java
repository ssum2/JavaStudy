package my.day5;

import java.util.Scanner;

public class CalcuratorMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.print("▷ 첫번째수 => ");
			String str1 = sc.nextLine();
			double a = Double.parseDouble(str1); 
			
			System.out.print("▷ 두번째수 => ");
			String str2 = sc.nextLine();
			double b = Double.parseDouble(str2); 
			
			System.out.print("▷ 연산자선택(+ - * /) => ");
			String op = sc.nextLine();
			
			/*switch (op) {
				case "+":
				case "-":
				case "*":
				case "/":	
					break;
	
				default:
					System.out.println(">> 연산자는 + - * / 중에 하나만 선택하세요!!! <<"); 
					sc.close();
					return;  // 프로그램 종료!!
			}*/
			
			if(!("+".equals(op) || 
			     "-".equals(op) ||
			     "*".equals(op) || 
			     "/".equals(op)) ) {
				System.out.println(">> 연산자는 + - * / 중에 하나만 선택하세요!!! <<"); 
				sc.close();
				return; // 프로그램 종료!!
			}
			
			Calcurator cl = new Calcurator();
			String result = cl.calc(a, b, op);
			
			// result 가 7.0 이라면 7 이라고 나타내고자 한다.
			// result 가 7.5 이라면 7.5 이라고 나타내고자 한다.
			
			// 7.0%7 ==> 0 이다.      7.0%(int)7.0
			// 7.5%7 ==> 0 이 아니다.  7.5%(int)7.5
			
			System.out.println("==== 계산결과 ====");
			if( b==0 && "/".equals(op) ) {
				System.out.println(result);
			}
			else {
				System.out.println(str1 + op + str2 + "=" + result);	
			}
			        
		} catch (NumberFormatException e) {
			System.out.println(">>> 숫자로만 입력하세요!!");
		//	System.out.println(e.getMessage());
		//	e.printStackTrace();
		}	
		
		sc.close();
	}// end of main()----------------------

}
