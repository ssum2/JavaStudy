package my.day15.Exception;

public class ExceptionTest3 {
//	3. 예외처리(3); 분모가 0일 때의 오류 -> try-finally

	public static void main(String[] args) {
		try {
			for(int i=0; i<=5; i++) {	// 6번 반복
//				int result = 50/(6-i);
//				System.out.println("result => 50/"+(6-i)+"="+result);
				int result = 50/(3-i);
				System.out.println("result => 50/"+(3-i)+"="+result);
			}
		} finally {
//		 >> finally
//		 	try의 오류(exception) 발생 여부와 관계없이 try 실행이 끝난 뒤 무조건 실행되는 부분
			System.out.println(">>> 오류가 발생해도 반드시 나와야할 문장 <<<");	
		}
		
	} // end of main()
} // end of class
