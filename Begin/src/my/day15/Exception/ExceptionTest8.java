package my.day15.Exception;

/*
 	try{} 블럭 하나에 catch 절 여러개 가능, 순서에 주의!
 		- 1) ~~Exception(자식 예외처리자)을 기술하고
		- 2) 부모 예외처리자(Exception)을 나중에 기술
 */
public class ExceptionTest8 {
//	8. 예외처리(8); try catch catch (...여러개) finally

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40};
		String str = "abc";
		
		for(int i=0; i<arr.length+1; i++) {	
			
			try {
				// arr.length+1 >> 배열 갯수 초과범위
				int no1 = arr[i];
				
				arr[i] = no1/(3-i)*Integer.parseInt(str);
//				10/3	20/2	30/0^ > ArithmeticException
				
				System.out.println("arr[i] => "+no1+"/"+(3-i)+"="+arr[i]);
			}
			
			
			catch(ArithmeticException e) {
				System.out.println(">>> catch1: 분모는 0으로 할 수 없습니다 <<<");
			}
			
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(">>> catch2: 배열 크기 초과로 연산 불가능 <<<");
			}
			
			catch(Exception e) {		
			// Exception이 최상위 예외처리자여서 맨 위에 쓰면 아래의 예외문이 Unreachable
			// 맨 아래에 써서 나머지 예외를 다 처리할수 있도록 함 (if~else와 같은 구조)
				System.out.println("기타오류 발생");
				System.out.println(e.getMessage());
			}
			
			finally {
				if(arr.length==i)		// for문을 빠져나왔을 때 한번만 실행하도록
					System.out.println(">>> finally: 오류가 발생해도 반드시 나와야할 문장 <<<");	
			}
			
		} // end of for 
		
		System.out.println(">> 프로그램을 종료합니다 <<");
		
	} // end of main()
} // end of class
