package my.day6;

import java.util.Scanner;

// 입사문제
public class Factorial {

	public static void calc1(int num) { //  cf) num=5
		int result = 1; // 곱하기를 해야하기 때문에 1로 초기화
		for(int i=num; i>0; i--) { // 0이 들어가면 안되니까 0보단 크게, 1씩 감하여 곱하기때문에 i--
			result *= i; // result = result *i ==> 1*5 ==> 5 ===> 5*4 ===> 20 ==> 20*3....
		}
		System.out.println(">> 정답: "+num+"! = "+result);
		
	}
	
	public static void main(String[] args) {
		// >> 알고 싶은 팩토리얼 수 입력 => 5 입력 
		// >> 정답: 5! = 120 (5*4*3*2*1)
		// >> 계속 하시겠습니까? (예: Y, 아니오: N) --> y엔터, Y엔터 똑같이 동작하도록
		// y엔터 했을 때 =>  >> 알고 싶은 팩토리얼 수 입력 => 출력
		// n엔터 했을 때 => >> -- 프로그램 종료 --
		
		
		Scanner sc = new Scanner(System.in);
		
		// 방법1) 무한루프
		for(;;) { // n을 입력하기 전까지 계속 무한 루프
			
			System.out.print(">> 알고 싶은 팩토리얼 수 입력 => ");
			try { // 팩토리얼수 입력할 때 정수만 입력하도록 예외처리
				int num = Integer.parseInt(sc.nextLine());
				Factorial.calc1(num);
				
			} catch (NumberFormatException e) {
				System.out.println("------ 정수만 입력하세요 ------");
				continue;
			} // end of try - catch
			
			
			System.out.print(">> 계속 하시겠습니까? (예: Y, 아니오: N) => ");
			String yn = sc.nextLine(); // y 일때는 무한루프, n일때는 break;
			
			if("n".equals(yn) || "N".equals(yn)) { // 문자열 비교는 "문자열".equals(문자열이 들어가는 변수)
				System.out.println(" --- 프로그램을 종료합니다 ---");
				break;
			}
			if ("y".equals(yn) || "Y".equals(yn))
				continue;
			
		}
	
		
		sc.close();
	
	} // end of main()

}
