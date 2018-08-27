package my.day15.Exception;

public class ExceptionTest4 {
//	4. 예외처리(4); try-catch-finally(1)
	
	public static void main(String[] args) {
		try {
			for(int i=0; i<=5; i++) {	

				int result = 50/(3-i);
				System.out.println("result => 50/"+(3-i)+"="+result);
			}
		} 
		catch(ArithmeticException e) {
			System.out.println(">> 분모는 0으로 할 수 없습니다 <<");
		}
		finally {
			System.out.println(">>> 오류가 발생해도 반드시 나와야할 문장 <<<");	
		}
	}

}
