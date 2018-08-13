package my.day6;

public class MultiForHomework {

	public static void main(String[] args) {
		/*
		 	<문제 1>
		 			(i,j)
		 	*****	(0,0)(0,1)(0,2)(0,3)(0,4) -> 0행
		 	****	(1,0)(1,1)(1,2)(1,3)(1,4)	1행
		 	***		(2,0)(2,1)(2,2)(2,3)(2,4)	2행
		 	**		(3,0)(3,1)(3,2)(3,3)(3,4)	3행
		 	*		(4,0)(4,1)(4,2)(4,3)(4,4)	4행
		 			↓0열		1열	2열	3열	4열
		 	
		 	>>> 규칙 찾기
		 	*****	(0,0)(0,1)(0,2)(0,3)(0,4)
		 	****	(1,0)(1,1)(1,2)(1,3)	
		 	***		(2,0)(2,1)(2,2)	
		 	**		(3,0)(3,1)
		 	*		(4,0)
		 	
		 	==> i+j <=4 이라면 *을 출력한다
		 	
		 */
		
		System.out.println("=========== 문제 1 ==========\n");
		System.out.println("> 첫번째 방법-------------------");
		for(int i=0; i<5; i++) { // 5행
			for(int j=0; j<5; j++) { //5열
				if(i+j<=4) {
				System.out.print("*");
				} // end of if
				
			} // end of for
			System.out.print("\n");

		} // end of for
		
		
		
		
		System.out.println("\n> 두번째 방법-------------------");
		// i값이 증가할 때마다 반복하는 횟수가 줄어들고 있음
		
		for(int i=0; i<5; i++){
			for(int j=0; j<5-i; j++){// i==0 일 때, j<5
									 // i==1 일 때, j<4
							 		 // i==2 일 때, j<3
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.println("\n> 세번째 방법-------------------");
		// i값을 5로 초기화하고, 감소하는 것으로 가능
		for(int i=5; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		
		System.out.println("\n=========== 문제 2 ==========\n");
		/*
		 	*********1
		 	********2
		 	*******3
		 	******4
		 	*****5
		 	****6
		 	***7
		 	**8
		 	*9
		 */
		
		System.out.println("> 내가 한 거: n값 따로 빼서 설정, 감소하는 걸로");
		int n =1;
		for(int i=9; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.print(n+++"\n");
		}
		
		System.out.println("\n> 강사님 답변: i값 활용해서 감소하는 걸로");
		for(int i=9; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.print((10-i)+"\n");
		}
		
		
		System.out.println("\n=========== 문제 3 ==========\n");
		/*
	 	<문제 3>
	 			(i,j)
	 	*		(0,0)(0,1)(0,2)(0,3)(0,4) -> 0행
	 	**		(1,0)(1,1)(1,2)(1,3)(1,4)	1행
	 	***		(2,0)(2,1)(2,2)(2,3)(2,4)	2행
	 	****	(3,0)(3,1)(3,2)(3,3)(3,4)	3행
	 	*****	(4,0)(4,1)(4,2)(4,3)(4,4)	4행
	 			↓0열		1열	2열	3열	4열
	 	
	 	>>> 규칙 찾기
	 	*		(0,0)
	 	**		(1,0)(1,1)
	 	***		(2,0)(2,1)(2,2)
	 	****	(3,0)(3,1)(3,2)(3,3)
	 	*****	(4,0)(4,1)(4,2)(4,3)(4,4)
	 	
	 	==> i >= j 이라면 *을 출력
	 	
	 */
		System.out.println("> 첫번째 방법-------------------");
		//if를 써서 조건 맞춰서 출력
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i>=j)
					System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.println("\n> 두번째 방법-------------------");
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) { // i값에 1을 더한값 보다 j가 작을 경우를 반복횟수로
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.println("\n> 세번째 방법-------------------");
		// j값이 감소하는 방법으로 *찍는 횟수 정하기
		for(int i=0; i<5; i++) {
			for(int j=i+1; j>0; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		
		System.out.println("\n=========== 문제 4 ==========\n");
		/*
	 	<문제 4>
	 			(i,j)
	 		 *		(0,0)(0,1)(0,2)(0,3)(0,4) -> 0행
	 		**		(1,0)(1,1)(1,2)(1,3)(1,4)	1행
	 	   ***		(2,0)(2,1)(2,2)(2,3)(2,4)	2행
	 	  ****		(3,0)(3,1)(3,2)(3,3)(3,4)	3행
	 	 *****		(4,0)(4,1)(4,2)(4,3)(4,4)	4행
	 				↓0열		1열	2열	3열	4열
		 */
		
		System.out.println("> 내가 한 거: 삼항연산자, if문으로");
		// 삼항연산자
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				String str = ((i+j)>3)? "*":" ";
				System.out.print(str);
			}
			System.out.print("\n");
		}
		
		
		// if문
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if((i+j)>3) {
					System.out.print("*");
				} 
				else {
					System.out.print(" ");
				}
				
			}
			System.out.print("\n");
		}
		

		System.out.println("\n> 강사님 답변 1: if문");
		// i+j>=4 일 때 "*", i+j<4 일 때 " "
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i+j<4)
					System.out.print(" ");
				else
					System.out.print("*");
				
			}
			System.out.print("\n");
		}
		
		System.out.println("\n> 강사님 답변 2: 다중for문");
		for(int i=0; i<5; i++) {
			// " "을 4번, "*"을 1번 출력
			// " "을 3번, "*"을 2번 출력
			// " "을 2번, "*"을 3번 출력
			// " "을 1번, "*"을 4번 출력
			// " "을 0번, "*"을 5번 출력
		
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.println("\n=========== 문제 5 ==========\n");
		/*
	 	<문제 5>
	 					(i,j)
	 		 *			(0,0)(0,1)(0,2)(0,3)(0,4) -> 0행
	 		***			(1,0)(1,1)(1,2)(1,3)(1,4)	1행
	 	   *****		(2,0)(2,1)(2,2)(2,3)(2,4)	2행
	 					↓0열		1열	2열	3열	4열
	 					
	 		
	 		1) "*" 출력하는 경우
		 				 (0,2)
		 			(1,1)(1,2)(1,3)
	 			(2,0)(2,1)(2,2)(2,3)(2,4)
	 			
	 			i+j >= 2 && j-i<=2
	 			
	 			
	 		2) " " 출력하는 경우
		 		(0,0)(0,1)		(0,3)(0,4)
		 		(1,0)			 	 (1,4)
		 				   공백없음
		 		
		 		!(i+j >= 2 && j-i<=2)
		 		== i+j < 2 || j-1 > 2
	 				
		 */
		
		System.out.println("> 첫번째 방법-------------------");
		for(int i=0; i<3; i++) { // 3행
			for(int j=0; j<5; j++) { // 5열
				if(i+j >= 2 && j-i<=2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
		
		System.out.println("\n> 두번째 방법-------------------");
		//바깥 for문 안에 안쪽 for문이 3번
		// 공백 * 공백 1set
		for(int i=1; i<=3; i++) {
			// " " 2번, "*" 1번, " " 2번
			// " " 1번, "*" 3번, " " 1번
			// " " 0번, "*" 5번, " " 0번
			for(int j=0; j<(5-(i*2-1))/2 ; j++) { // j< 2, 1, 0
				// i==1 -> 1*2-1 = 1 ==> 5-1==4 ==> 4/2 ===> 2
				System.out.print(" ");
			}
			for(int j=0; j<(i*2-1); j++) { // i값을 1로 초기화, j< 1, 3, 5
				System.out.print("*");
			}
			for(int j=0; j<(5-(i*2-1))/2 ; j++) { // j< 2, 1, 0
				System.out.print(" ");
			}
			
			System.out.print("\n");
		}
		
		System.out.println("\n=========== 문제 6 ==========\n");
		/*
	 	<문제 6>
	 					(i,j)
	 		*****		(0,0)(0,1)(0,2)(0,3)(0,4) -> 0행 
	 		 ***		(1,0)(1,1)(1,2)(1,3)(1,4)	1행
	 	   	  *			(2,0)(2,1)(2,2)(2,3)(2,4)	2행
	 					↓0열		1열	2열	3열	4열
	 					
	 		
	 		
	 		1) "*"이 출력될 때
	 		 			(i,j)
	 		*****		(0,0)(0,1)(0,2)(0,3)(0,4) 
	 		 ***			 (1,1)(1,2)(1,3)	
	 	   	  *					  (2,2)	
	 					
	 		i+j <=4 && i<=j
	 		
	 		
	 		2) " "이 출력될 때
	 							공백없음
				 		(1,0)			(1,4)
				 		(2,0)(2,1)	(2,3)(2,4)
				 		
				 		
		 */
		System.out.println("> 내가 한 거: if문");
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				if(i+j<=4 && i<=j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}			
			}
				System.out.print("\n");
				
		}
				
		System.out.println("\n> 강사님 답변 1: if문");
		// i+j<=4 &&  i<=j : "*"
		// !(i+j<=4 &&  i<=j) : " " 
		// --> i+j>4 || i>j
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				if(i+j<=4 &&  i<=j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	
			
		System.out.println("\n> 강사님 답변 2: 다중for");	
		// " " 0번, "*" 5번, " " 0번
		// " " 1번, "*" 3번, " " 1번
		// " " 2번, "*" 1번, " " 2번
		// ==> 점점 줄어들고 있음
		for(int i=3; i>0; i--) {
			for(int j=(5-(i*2-1))/2; j>0 ; j--) { // j= 0, 1, 2
				
				System.out.print(" ");
			}
			for(int j=i*2-1; j>0; j--) { // i값을 3으로 초기화, j= 5, 3, 1
				// i=3 -> 3*2-1 = 5
				// i=2 -> 2*2-1 = 3
				// i=1 -> 1*2-1 = 1
				System.out.print("*");
			}
			for(int j=(5-(i*2-1))/2; j>0 ; j--) { // j= 0, 1, 2
				System.out.print(" ");
			}
			
			System.out.print("\n");
		}	
		
		
		
	} // end of main()

} // end of class
