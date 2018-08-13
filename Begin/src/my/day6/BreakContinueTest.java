package my.day6;

public class BreakContinueTest {

	public static void main(String[] args) {
		System.out.println(">> 예제 1 ==================");
		for(int i=0; i<4; i++) {
			if(i==2) break; // 가장 가까운 반복문을 벗어남
			System.out.println("i=>"+i);
		}
	
		System.out.println("\n>> 예제 2 ==================");
		/*
		 	총 10행 3열인데 아래처럼 출력
		 	1 2 3
		 	4 5 6 
		 	
		 */
		
		
		System.out.println("> 내가 한 거 ---------------");
		  for(int i=0, n=0; i<10; i++) {
			  if(i==2) break;
			for(int j=0; j<3; j++) {
				System.out.print(++n+" ");	
			}
			System.out.print("\n");
			
		}
		 
		  System.out.println("\n> 강사님 답변 -------------");
		for(int i=0, n=0; i<10; i++) {
			if(i==2) break;
			for(int j=0; j<3; j++) {
				String str =(++n%3==0)? "\n":" ";
				System.out.print(n+str);
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	} // end of main()

} // end of class
 