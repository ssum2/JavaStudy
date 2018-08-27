package my.day15.Exception;

public class ExceptionTest2 {
//	2. 예외처리(2); 분모가 0일 때의 오류
	
	public static void main(String[] args) {
		for(int i=0; i<=5; i++) {	// 6번 반복
			int result = 50/(3-i);
			System.out.println("result => 50/"+(3-i)+"="+result);
		}
		System.out.println("오류가 발생해도 반드시 나와야할 문장");	
	}

}
