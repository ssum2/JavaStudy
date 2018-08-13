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
		// 1부터 10까지의 누적합계 구하기
		
		int sum =0;
		for(int i=0; i<10; i++) {
			sum += (i+1); // sum = sum+(i+1); = 0+1 = 1
						  // sum = sum+(1+1); = 1+2 = 3
						  // sum = sum+(2+1); = 3+2 = 5
						  // ..... 
						  // sum = sum + 10 = 55
		}
		System.out.println("1부터 10까지의 누적된 합은? "+sum);
		
		System.out.println("\n>> 응용문제 2 ===================");
		System.out.println("> 내가 한 거 ----------------------");
		// 1부터 10까지의 홀수 누적 합계 구하기
		int sum1 =0;
		for(int i=0; i<10; i++) {
			if(i%2==0) 
			sum1 += (i+1); 
			
			// 1 3 5 7 9 = 25
		}
		
		
		System.out.println("1부터 10까지 홀수의 누적된 합은? "+sum1);
		
		
		
		// 1부터 10까지의 짝수 누적 합계 구하기
		int sum2 =0;
		for(int i=0; i<10; i++) {
			if(i%2==1) // 이게 지금 continue 안써도 if문 false일 때 if문 바깥으로 나감... 
			sum2 += (i+1); 
			
			// 2 4 6 8 10 = 30
		}
		System.out.println("1부터 10까지 짝수의 누적된 합은? "+sum2);
		
		System.out.println("\n> 강사님 답변 ----------------------");
		
		// 홀수 일 때
		sum=0;
		for(int i=0; i<10; i++) {
			if((i+1)%2==0) continue;
			sum +=(i+1);
		}
		System.out.println("1부터 10까지 홀수의 누적된 합은? "+sum);
		
		
		sum=0;
		for(int i=0; i<10; i++) {
			
			if((i+1)%2!=0) continue;
			sum +=(i+1);
			
		}
		
		System.out.println("1부터 10까지 짝수의 누적된 합은? "+sum);
		
		
		System.out.println("\n>> 응용문제 3 ===================");
		System.out.println("> 내가 한 거 ----------------------");
		// 5와 7을 제외한 1~10까지 누적합계
		// 1+2+3+4+6+8+9+10
		
		for(int i=0; i<10; i++) {
			if(i+1 == 5 || i+1 == 7) continue;
			sum += i+1;
			
		}
		System.out.println("1부터 10까지 5,7을 제외한 누적된 합은? "+sum);
		
		// 1부터 100까지 중 3의 배수의 합
		// 1부터 100까지 중 9의 배수의 합
		
		// 3 6 9 12 15 18 21 24 27
		sum =0;
		int sum3=0;
		for(int i=0; i<100; i++) {
			if((i+1)%3==0)
				sum += i+1;
			if((i+1)%9==0)
				sum3 += i+1;
		}
		System.out.println("1부터 100까지 중 3의 배수 합: "+sum);
		System.out.println("1부터 100까지 중 9의 배수 합: "+sum3);
		
		System.out.println("\n> 강사님 답변 ----------------------");
		// 5와 7을 제외한 1~10까지 누적합계
				// 1+2+3+4+6+8+9+10
				
		for(int i=0; i<10; i++) {
			if(i+1 == 5 || i+1 == 7) continue;
			sum += i+1;
			
		}
		System.out.println("1부터 10까지 5,7을 제외한 누적된 합은? "+sum);
		
		// 1~100까지 3의 배수의 합, 9의 배수의 합
		int sum4=0, sum5=0;
		
		for(int i=0; i<100; i++) {
			if((i+1)%3==0) {
				sum4 +=(i+1);
				
			} // end of if
			
			if((i+1)%9==0) {
				sum5 +=(i+1);
				
			} // end of if
			
		} // end of for
		System.out.println("1부터 100까지 중 3의 배수 합: "+sum4);
		System.out.println("1부터 100까지 중 9의 배수 합: "+sum5);
				
		System.out.println("\n>> 응용문제 4 ===================");	
		System.out.println("> 내가 한 거 ----------------------");
		// 1+2+3+4+5+6+7+8+9+10 = 55 이렇게 출력하기
		// 1+3+5+7+9 = 25
		// 2+4+6+8+10 = 30
		System.out.println("1. 전체의 합");
		int a =0, b=0, c=0;
		for(int i=0; i<10; i++) {
			a +=(i+1);
			if(i<9)
				System.out.print(i+1+"+");
			else
				System.out.print(i+1);
		}
		System.out.println("="+a);
		
		System.out.println("\n2. 홀수의 합");
		for(int i=0; i<10; i++) {
			if((i+1)%2==0) continue;
			b +=(i+1);
			if(i<9)
				System.out.print(i+1+"+");
			else
				System.out.print(i+1);
		}
		System.out.println("="+b);		
				
		System.out.println("\n3. 짝수의 합");
		for(int i=0; i<10; i++) {
			if((i+1)%2!=0) continue;
			c +=(i+1);
			
			if(i<9)
				System.out.print(i+1+"+");
			else
				System.out.print(i+1);
		}
		System.out.println("="+c);			
				
		System.out.println("\n> 강사님 답변 ----------------------");
		
		System.out.println("1. 전체의 합");	
		sum=0;
		for(int i=0; i<10; i++) {
			String str = (i+1<10)? "+":"=";
			System.out.print(i+1+str);
			sum += i+1;
		}
		System.out.println(sum);
		
		
		System.out.println("\n2. 홀수의 합");	
		sum=0;
		for(int i=0; i<10; i++) {
			if((i+1)%2==0) continue;
			String str = (i+1<9)? "+":"=";
			System.out.print(i+1+str);
			sum +=(i+1);
		}
		System.out.println(sum);
		
		
		System.out.println("\n3. 짝수의 합");
		sum=0;		
				
		for(int i=0; i<10; i++) {
			if((i+1)%2!=0) continue;
			String str = (i+1<9)? "+":"=";
			System.out.print(i+1+str);
			sum +=(i+1);
		}
		System.out.println(sum);	
			
		
		System.out.println("\n>> 응용문제 5 ===================");
		// 1+2+3+4+5+6+7+8+9+10 = 55 이렇게 출력하기 2
		
		sum=0;
		for(int i=0; ; i++) { // 조건을 없애면 무한루프가 됨  -> 조건이 없어서 무조건 참이 됨
			if(i==10) break; // 가까운 for문을 빠져나가기 때문에 break로 해도 됨
			String str = ((i+1)<10)? "+":"="; // i+1로 출력되는 값이 9라면 +, 10이라면 =를 붙인다
			System.out.print(i+1+str);
			sum += i+1;
		}
		System.out.println(sum);
		
		System.out.println("\n ===========숙제 1=========== \n");
		/*
		 	아파트 층수 나타내기, 4호 없음~~!!
		 	301호 	302호	303호	305호
		 	201호 	202호	203호	205호
		 	101호 	102호	103호	105호
		 	\t 탭키
		 */
		
		for(int i=3; i>0; i--) {
			for(int j=1; j<6; j++) {
				String str = (j<5)? "호\t":"호";
				if(j==4) continue;
				System.out.print(i+"0"+j+str);
			}
			
			System.out.println("\n");		
		}
			
		System.out.println("\n ===========숙제 2=========== \n");
		
		/*
	 	아파트 층수 나타내기, 4층 없음~~!!
	 	401호 	402호	403호	405호
	 	301호 	302호	303호	305호
	 	201호 	202호	203호	205호
	 	101호 	102호	103호	105호
		*/
		
		for(int i=5; i>0; i--) {
			if(i==4) continue;
			for(int j=1; j<6; j++) {
				String str = (j<5)? "호\t":"호";
				System.out.print(i+"0"+j+str);
			}
			System.out.println("\n");		
		}
		
		
		
		
		// 혼자해보기
		System.out.println("구구단출력 ---------");
		
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.print(i+"X"+j+"="+i*j+" ");
			}
			System.out.print("\n");
		}
		System.out.println("구구단출력2 ---------");
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.print(j+"X"+i+"="+i*j+" ");
			}
			System.out.print("\n");
		}
				
				
	} // end of main()

} // end of class
 