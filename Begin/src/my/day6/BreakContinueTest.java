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
		
		System.out.println("\n>> break위치에 따라 for문 멈추는 구간====");
		
//		for(int i=0, n=0; i<10; i++) {
//			
//			for(int j=0; j<3; j++) {
//				if(i==2) break;
//				String str =(++n%3==0)? "\n":" ";
//				System.out.print(n+str);
//				
//			}
//			
//		}
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<5; j++) {
				if(j==3) break; // 가장 가까운 반복문을 빠져나감 --> 안쪽for문
				System.out.print("["+i+","+j+"] ");
			}
			System.out.print("\n");
		}
		
		System.out.println("\n>> 레이블 활용==================");
		
		/*
		 	레이블명은 임의로 설정
		 	레이블명 뒤에 ":"을 붙이고, 반드시 반복문 앞에 써야함
		 */
		lablename: // 레이블명
		for(int i=0; i<10; i++) {
			for(int j=0; j<5; j++) {
				if(j==3) break lablename; // break 레이블명; (레이블명은 임의로 설정)
										  // 해당 레이블명이 가장 가까이 붙어있는 반복문을 벗어남
				System.out.print("["+i+","+j+"] ");
			}
			System.out.print("\n");
		}
		
		
		System.out.println("\n>> Continue ==================");
		
		// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 출력하기
		for(int i=0; i<10; i++) {
			String str = (i<9)? ", ":"\n";
			System.out.print(i+1+str);
		}
		
		System.out.println("홀수 출력하기------------------------");
		// 홀수만 출력하기
		for(int i=0; i<10; i++) {
			if((i+1)%2==0) continue;
			// continue; 이하 명령줄을 실행하지 않고 증감식으로 올라가라
			// if의 조건식이 참일 때 continue 실행하고 거짓이면 if문 밖으로 나감
			// 짝수일 때 continue 실행, 홀수일 때는 if문 밖으로 나가져서 아래 명령문 실행됨
			
			String str = ((i+1)<9)? ", ":"\n";
			System.out.print((i+1)+str);
		}
		
		System.out.println("짝수 출력하기------------------------");
		// 짝수만 출력하기
		for(int i=0; i<10; i++) {
			if((i+1)%2!=0) continue; // 또는 (i+1)%2==1
		
			String str = ((i+1)<9)? ", ":"\n";
			System.out.print((i+1)+str);
		}
		
		
		System.out.println("\n>> 응용문제 1 ===================");
		
		for(int i=0; i<10; i++) {
			
		}
		System.out.print("1부터 10까지의 누적된 합은? ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	} // end of main()

} // end of class
 