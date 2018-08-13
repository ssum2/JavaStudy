package my.day6;

import java.util.Scanner;

/*
 **** 반복문(loop) ==> for 문 ****
 
         ※ for 문의 형식
  
   for(초기화; 조건식; 증감식) {
      	반복해서 실행할 문장;
   }  
   
              ▣ 순서
   1) 초기화;
   2) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
                             조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
              } 을 빠져나간다.)
   3) 증감식
   4) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
                             조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
              } 을 빠져나간다.) 
   5) 증감식
   6) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
                             조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
              } 을 빠져나간다.)                                                  
   
*/
public class ForTest {
	
	
	public void loopName(int n, String name) {
		for(int i=0; i<n; i++) { // n번 반복이기 때문에 i<n
			System.out.println((i+1)+". "+name);
			
			
		} // end of for
	} // end of loopName()
	
	public static void main(String[] args) {
		
		
	/*
	 * <구현해보자>
	 * 1. 안녕자바~
	 * 2. 안녕자바~
	 * 3. 안녕자바~
	 * ......
	 * 10. 안녕자바~
	 */
		for(int i=0; i<10; i++) { // 초기화; 조건식; 증감식
			System.out.println((i+1)+". 안녕자바~");
		} // 처음 i값 0 -> 조건 true > 안의 내용 실행 > i값 1 증가 > i = 1 > true > 내용 실행 > i값 1증가 > i = 3 ...
		
		System.out.println("-------------예제1------------");
		
		ForTest ft = new ForTest();
		ft.loopName(5, "설현");
		/*
		 	<예제1> 매번 1씩 증가하는 숫자 표현
		 	1. 설현
		 	2. 설현
		 	3. 설현
		 	4. 설현
		 	5. 설현
		 	
		 	> 인스턴스메소드, 반환타입 void, 파라미터 int / String
		 
		 */
		
		
		System.out.println("-------------예제2------------");
		
		/*
		 	<예제2> 매번 2씩 증가하는 숫자 표현
		 	1. 박보검
		 	3. 박보검
		 	5. 박보검
		 	7. 박보검
		 	9. 박보검
		 	
		 */
		
		for(int i=0, j=1; i<5; i++, j+=2) { // 반복횟수는 i로, 5번반복. j로 출력될 숫자표현
			System.out.println(j+". 박보검");
			
		} // end of for2
		
		System.out.println("-------------예제3------------");
		
		/*
		 	<예제3> 매번 1씩 감소하는 숫자  표현
		 	10. Hello 이클립스~
		 	9. Hello 이클립스~
		 	8. Hello 이클립스~
		 	......
		 	1. Hello 이클립스~
		 */
		
		for(int i=10; i>0; i--) {
			System.out.println(i+". Hello 이클립스~");
		}
		System.out.println("-------------예제4------------");
		
		/*
	 	<예제4> 매번 2씩 감소하는 숫자  표현
	 	9. Hello 이클립스~
	 	7. Hello 이클립스~
	 	......
	 	1. Hello 이클립스~
	 */
		for(int i=0, j=9; i<5; i++, j-=2) {
			System.out.println(j+". Hello 이클립스~");
		}
		
		System.out.println("-------------예제5------------");
		// 입력한 문자열을 임의의 횟수만큼 반복해서 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요=> ");
		String str = sc.nextLine(); // 자바개발자 
		
		
		int i=0; // i값을 for문 밖에서 초기화 가능
		
		// String값으로 받기는 하지만 int값을 변형시켜야 횟수 돌아갈 수 있음 => exception처리 해야함
		try {
			System.out.print("반복할 횟수=> "); 
			int n = Integer.parseInt(sc.nextLine()); // 반복할 횟수 정하기 
			// for문에서 쓸 반복횟수는 int형이기 때문에 int형으로 형변환
			for(; i<n; i++) { // 초기치를 for문 밖에서 선언하고 for문내에 초기화 안해도 됨!
				System.out.println((i+1)+". "+str);
			}
			
			
		} catch (NumberFormatException e) {
			System.out.println(">> 반복횟수는 숫자만 입력 가능합니다.\n프로그램 종료!");
			
//			<프로그램 종료하는 방법>
//			System.exit(0); // 정상종료
//			System.exit(1); // 비정상종료
			return; 
			// main()에서 return은 종료(JVM이 main()을 호출한 것이기 때문에 호출한 곳으로 돌아간다는 return을 쓰면
//				JVM으로 돌아가게돼서 실질적으로 종료됨)
//				main말고 다른 메소드에서는 사용불가
			
		} // end of try - catch
		
		System.out.println(">> 반복을 마친 이후의 i => "+i);

		System.out.println("-------------예제6------------");
		// 위에서 선언해준 int i 값을 그대로 받아오는 것 -> 앞에서 입력한 n값을 기반으로 i값이 위의 for문으로 변경 -> 그 값을 받아와서 적용
		for(; i>0; i--) {
			System.out.println(i+". "+str);
		}
		
		
		
		
		
		
		
		
		
		
		

	} // end of main()

} // end of class
