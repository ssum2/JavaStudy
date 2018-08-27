package my.day15.Exception;

public class ExceptionTest6 {
//	6. 예외처리(6); 오류메세지 출력

	public static void main(String[] args) {
		try {
			for(int i=0; i<=5; i++) {	
				int result = 50/(3-i);	// 50/3 50/2 50/1 50/0 50/-1 50/-2
				System.out.println("result => 50/"+(3-i)+"="+result);
			}
		} 
		catch(ArithmeticException e) {
			System.out.println(">> 분모는 0으로 할 수 없습니다 <<");
			System.out.println("e.getMessage(): "+e.getMessage()); // e.getMessage() >> 왜 오류가 생겼는지 메세지 출력
			e.printStackTrace();	// e.printStackTrace() >> 어디에서 오류가 발생했는지 추적하여 출력
			
		}
		finally {
			
			System.out.println(">>> 오류가 발생해도 반드시 나와야할 문장 <<<");	
		}
		
		System.out.println(">> 프로그램을 종료합니다 <<");
	}

}
