package my.day15.Exception;

public class ExceptionTest7 {
//	7. 예외처리(7); 0이하 값까지 출력하기

	public static void main(String[] args) {
		
		for(int i=0; i<=5; i++) {
			try {
				int result = 50/(3-i);	// 50/3 50/2 50/1 50/0 50/-1 50/-2
				System.out.println("result => 50/"+(3-i)+"="+result);
			} 
			catch(ArithmeticException e) {
				System.out.println(">> 분모는 0으로 할 수 없습니다 <<");
				continue;
			}
			
		}
	
		System.out.println(">> 프로그램을 종료합니다 <<");
		
	}

}
