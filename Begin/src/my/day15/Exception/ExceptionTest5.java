package my.day15.Exception;

public class ExceptionTest5 {
//	5. 예외처리(5); try-catch-finally(2)
//		- catch에서 return을 걸었을 때 finally부분만 나오고 그 밑에 내용 출력X ==> finally를 무조건 해주고 종료
//		- catch에서 System.exit(0);을 쓰면 finally도 출력X
	
	public static void main(String[] args) {
		try {
			for(int i=0; i<=5; i++) {	

				int result = 50/(3-i);
				System.out.println("result => 50/"+(3-i)+"="+result);
			}
		} 
		catch(ArithmeticException e) {
			System.out.println(">> 분모는 0으로 할 수 없습니다 <<");
//			return;			// finally절 수행O, main()마지막 연산X
			System.exit(0);	// finally절 수행X, main()마지막 연산X
		}
		finally {
			System.out.println(">>> 오류가 발생해도 반드시 나와야할 문장 <<<");	
		}
		
		System.out.println(">> 프로그램을 종료합니다 <<");

	}
}
