package my.day6;

public class BreakContinueTest {

	public static void main(String[] args) {
		
		System.out.println(">> 1.==================");
		
		for(int i=0; i<4; i++) {
			if(i==2) break; // 가장 가까운 반복문을 벗어난다.
			System.out.println("i=>"+i);
		}
		
		System.out.println("\n>> 2.==================");
		
		/*
		     1 2 3
		     4 5 6
		 */
		
		for(int i=0, n=0; i<10; i++) {
			if(i==2) break;
			for(int j=0; j<3; j++) {
				String str = (++n%3==0)?"\n":" ";
				System.out.print(n+str);
			}
		}
		
		System.out.println("");
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<5; j++) {
				if(j==3) break; // 가장 가까운 반복문을 벗어난다.
				System.out.print("["+i+","+j+"]");
			}
			System.out.print("\n");
		}
		
		System.out.println("");
		
		/*
		    레이블명은 outer 라고 하겠다.
		    레이블명 뒤에 : 을 붙이며 반드시 반복문 앞에 써야 한다. 
		 */
		outer:  // 레이블명
		for(int i=0; i<10; i++) {
			for(int j=0; j<5; j++) {
				if(j==3) break outer; // break 레이블명; 을 하면 가장 가까운 레이블명이 붙은 반복문을 벗어난다.  
				System.out.print("["+i+","+j+"]");
			}
			System.out.print("\n");
		}
		
		System.out.println("\n>> 3.==================");
		
		for(int i=0; i<10; i++) {
			String str = (i<9)?",":"\n";
			System.out.print((i+1)+str);
		}
		// 1,2,3,4,5,6,7,8,9,10
		
		for(int i=0; i<10; i++) {
			if((i+1)%2==0) continue; 
			// continue; 는 아래의 명령줄을 실행하지 말고
			// 증감식(여기서는 i++)으로 올라가라는 말이다.
			String str = ((i+1)<9)?",":"\n";
			System.out.print((i+1)+str);
		}
		// 1,3,5,7,9
		
		for(int i=0; i<10; i++) {
			if((i+1)%2!=0) continue; 
			String str = (i+1 < 10)?",":"\n";
			System.out.print((i+1)+str);
		}
		// 2,4,6,8,10
		
		System.out.println("\n>> 4.==================");
		
		// >> 1 부터 10까지의 누적의 합은 => 1+2+3+4+5+6+7+8+9+10  55
		int sum = 0;
		
		for(int i=0; i<10; i++) {
			sum += (i+1); // sum = sum + 1;
			              // sum = sum + 2;
			              // sum = sum + 3;
			              // .......
			              // sum = sum + 10;
		}
		
		System.out.println(">> 1 부터 10까지의 누적의 합은 => " + sum);
		
		sum = 0;
		for(int i=0; i<10; i++) {
			if((i+1)%2==0) continue;
			sum += (i+1);
		}
		// 1+3+5+7+9
		System.out.println(">> 1 부터 10까지 홀수의 누적의 합은 => " + sum);
		
		sum = 0;
		for(int i=0; i<10; i++) {
			if((i+1)%2 != 0) continue;
			sum += (i+1);
		}
		// 2+4+6+8+10
		System.out.println(">> 1 부터 10까지 짝수의 누적의 합은 => " + sum);
		
		sum = 0;
		for(int i=0; i<10; i++) {
			if(i+1 == 5 || i+1 == 7) continue;
			sum += i+1;
		}
		
		// 1+2+3+4+6+8+9+10
		System.out.println(">> 5 와 7을 제외한 1 부터 10까지의 누적의 합은 => " + sum);
		
		int sum1=0, sum2=0;
		for(int i=0; i<100; i++) {
			if((i+1)%3==0) 
			  sum1 += (i+1);
			
			if((i+1)%9==0) 
			  sum2 += (i+1);
		}
		System.out.println("1 부터 100까지 중 3의 배수의 합은 => " + sum1); 
		System.out.println("1 부터 100까지 중 9의 배수의 합은 => " + sum2);
		
		// === 입사문제 ===
		// 1 부터 100까지 중 3의 배수의 합은 => 1683
		// 1 부터 100까지 중 9의 배수의 합은 => 594
		
		System.out.println("\n---------------\n");
		
		sum = 0;
		for(int i=0; i<10; i++) {
			String str = (i+1<10)?"+":"=";
			System.out.print(i+1+str);
			sum += (i+1);
		}
		System.out.println(sum);
		// 1+2+3+4+5+6+7+8+9+10=55
		
		sum = 0;
		for(int i=0; i<10; i++) {
			if((i+1)%2==0) continue;
			String str = (i+1<9)?"+":"=";
			System.out.print(i+1+str);
			sum += (i+1);
		}
		System.out.println(sum);
		// 1+3+5+7+9=25
		
		sum = 0;
		for(int i=0; i<10; i++) {
			if((i+1)%2!=0) continue;
			String str = (i+1<10)?"+":"=";
			System.out.print(i+1+str);
			sum += (i+1);
		}
		System.out.println(sum);
		// 2+4+6+8+10=30
		
		sum = 0;
		for(int i=0; i<10; i++) {
			if((i+1)==5 || (i+1)==7) continue;
			String str = (i+1<10)?"+":"=";
			System.out.print(i+1+str);
			sum += (i+1);
		}
		System.out.println(sum);
		// 1+2+3+4+6+8+9+10=43

		System.out.println("\n---------------\n");
		sum = 0;
		for(int i=0; ; i++) {
			if(i==10) break;
			String str = (i+1)<10?"+":"=";
			System.out.print(i+1+str);
			sum += i+1;
		}
		System.out.println(sum);
		// 1+2+3+4+5+6+7+8+9+10=55
		
		System.out.println("\n====== 숙제 1. =======\n");
		/*
		    301호	302호	303호	305호
		    201호	202호	203호	205호
		    101호	102호	103호	105호
		 */
		
		
		System.out.println("\n====== 숙제 2. =======\n");
		/*
		    501호	502호	503호	505호 
		    301호	302호	303호	305호
		    201호	202호	203호	205호
		    101호	102호	103호	105호
		 */
		
		
	}// end of main()-----------------------------

}
