package my.day6;
	// 이중for문, 다중for문




public class MultiForTest {

	
	
	
	public static void main(String[] args) {
		System.out.println("============예제1============");
		//<예제1> 1 2 3 4 5 6 7 8 9......19 20 찍어보기
		for (int i=0; i<20; i++) {
			System.out.print(i+1+" ");
		}
		
		System.out.println("\n\n");
		System.out.println("============예제2============");
		/*
		 	<예제2> 5의 배수 다음 줄바꿈이 있게끔 출력
		 	1 2 3 4 5
		 	6 7 8 9 10
		 	11 12 13 14 15
		 	16 17 18 19 20
		 */
		System.out.println("> 첫번째 방법-------------------");
		for (int i=0; i<20; i++) {
			// 5의 배수면 줄바꿈, 5의 배수가 아니면 공백
			// 삼항연산자를 이용해서 출력해보기
			String str = ((i+1)%5==0)?"\n":" "; //i+1을 5로 나눈 나머지가 0이라면 줄바꿈, 아니면 공백
			System.out.print(i+1+str);
		}
		
		System.out.println("\n> 두번째 방법-------------------");
		/*
		 	>>>>> ※필수 암기※ <<<<<
		 	다중 루프문은 루프 속 루프가 포함,
		 	외부 loop문 ==> 행의 개수
		 	내부 loop문 ==> 열의 개수
		 	
		 	ex) 4행 5열 4X5 => 외부 루프 4번 반복, 내부 루프 5번 반복
		 */

		int n = 0;
		for(int i=0; i<4; i++) {// 바깥 루프 ---> 4행 ==> 4번 반복
			for(int j=0; j<5; j++) { // 내부 루프 ---> 5열 ==> 5번 반복
			// j 값은 외부 for문이 한번 반복 돌아갈 때마다 0값으로 초기화
			System.out.print(++n+" ");
			// 1 2 3 4 5 --> 빠져나감 (첫번째 내부 루프) -> 바깥 루프에서 줄바꿈 
			// 6 7 8 9 10 --> 5번 반복하고 빠져나감 (두번째 내부 루프) -> 외부에서 줄바꿈
			// 11 12 13 14 15
			// 16 17 18 19 20
			
			} // 내부 for문 끝
			
			System.out.print("\n");
			
		} // 외부 for문 끝
		
		System.out.println("\n============예제3============");
		// 별 찍어보기
		/*
		 	******
		 	******
		 	******
		 	******
		 	******
		 */
		
		for(int i=0; i<5; i++) { //5행
			for (int j=0; j<5; j++) { // 5열
				System.out.print("*");

			} // 내부 for문 끝
			System.out.print("\n");
			
		}// 외부 for문 끝
		
		
		System.out.println("\n============예제4============");
		
		/*
		 	***
		 	***
		 	***
		 	***
		 	4행X3열
		 */
		System.out.println("> 첫번째 방법-------------------");
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.println("\n> 두번째 방법-------------------");
		// for문 하나로만 출력
		System.out.println("내가 한 거: i값을 1로 잡음");
		for(int i=1; i<13; i++) {
			String str = (i%3==0)? "*\n":"*";
			System.out.print(str);
		}
		
		System.out.println("강사님 답변: i값을 0으로 잡음");
		// 강사님 답변
		for(int i=0; i<12; i++) {
			String str = ((i+1)%3==0)? "*\n":"";
			System.out.print("*"+str);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // end of main()

} // end of class
