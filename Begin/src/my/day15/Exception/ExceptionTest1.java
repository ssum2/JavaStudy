package my.day15.Exception;

public class ExceptionTest1 {
//	1. 예외처리(1); try-catch
	
	public static void main(String[] args) {
		
		String[] subjectArr = {"Java", "Oracle", "JSP"};
		

		try {
			for(int i=0; i<subjectArr.length+1; i++) {
				System.out.println(subjectArr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(">> 배열 인덱스 범위가 초과되었습니다 <<");
		}

	} // end of main()
} // end of class
