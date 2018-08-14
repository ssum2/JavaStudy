package my.day6;

import java.util.Scanner;

public class Gugudan {

	//>> 예제 1, 내가 한 것
	public void gugudan1(int n) {
		System.out.println("==== "+n+"단 ====");
		for(int i=0; i<9; i++){
			for(int j=0; j<1; j++) {
				System.out.println(n+"*"+(i+1)+"="+n*(i+1));
			}
			
		}
	} // end of gugudan1()
	
	// 예제 1. 강사님이 한 것
	public void showDan(int dan) {
		System.out.println("==== "+dan+"단 ====");
		for(int i=0; i<9; i++) {
			System.out.println(dan+"*"+(i+1)+"="+(dan*(i+1)));
		}
	}
	
	
	
	
	
	
	
	// 예제 2. 내가 먼저 함 만들어봤는데 망했다 ㅠㅠ
	// ==>> 문제 해결: startNo 변수를 그대로 쓰지 말고, i값에 한번 초기화해서 i값을 변형하는 방법으로 써야 오류가 안 생긴다...!
//	public void nujukSum(int startNo, int endNo) {
//		int sum=0;
//		for( ; startNo<endNo; startNo++) {
//			sum += startNo;
//		}
//		System.out.println((startNo-(endNo+1))+"부터 "+endNo+"까지의 누적된 합은 "+sum+" 입니다.");
//	}
	
	
//	// 예제2. 강사님이 한 것
	public void nujukSum(int startNo, int endNo) {
		int sum = 0;
		for(int i=startNo; i<=endNo; i++) { // i에 startNo값을 부여하고, endNo를 포함하는 범위까지만큼 돌아가게한다
			sum += i;
		}
		System.out.println(">> 결과: "+startNo+"부터 "+endNo+"까지의 누적된 합은 "+sum+" 입니다.");
	}
	
	// 예제 2 하다 만건데 조금 망함
//	public void sum1(int a, int b) {
//		
//		int sum=0;
//		for( ; a<b; a++) {
//			sum += a;
//		}
//		System.out.println(a+"부터 "+b+"까지의 누적된 합은 "+sum+" 입니다.");
//		
//		
//	}
	

	public static void main(String[] args) {
		/*
		  	2X1=2 3X1=3 4X1=4 5X1=5 6X1=6 7X1=7 8X1=8 9X1=9 
			2X2=4 3X2=6 4X2=8 5X2=10 6X2=12 7X2=14 8X2=16 9X2=18 
			2X3=6 3X3=9 4X3=12 5X3=15 6X3=18 7X3=21 8X3=24 9X3=27 
			2X4=8 3X4=12 4X4=16 5X4=20 6X4=24 7X4=28 8X4=32 9X4=36 
			2X5=10 3X5=15 4X5=20 5X5=25 6X5=30 7X5=35 8X5=40 9X5=45 
			2X6=12 3X6=18 4X6=24 5X6=30 6X6=36 7X6=42 8X6=48 9X6=54 
			2X7=14 3X7=21 4X7=28 5X7=35 6X7=42 7X7=49 8X7=56 9X7=63 
			2X8=16 3X8=24 4X8=32 5X8=40 6X8=48 7X8=56 8X8=64 9X8=72 
			2X9=18 3X9=27 4X9=36 5X9=45 6X9=54 7X9=63 8X9=72 9X9=81 
			9행 8열
		 */
		
		System.out.println("====== 1. 구구단 ======");
		for(int i=0; i<9;i++) {
			for(int j=0; j<8; j++) {
				String str = ((j+2)<9)? "\t":"\n"; // '9단'열일 때 탭, 아니면 줄바꿈 
				System.out.print((j+2)+"*"+(i+1)+"="+(j+2)*(i+1)+str);
			}
		}
		
		System.out.println("-------- 예제1 --------");
		/*
		 	>> 몇 단 볼래? => 입력
		 	=== n단 ===
		 	n*1=nn
		 	n*2=nn
		 	...
		 	n*9=nn
		 	
		 */
		
		System.out.println(">> 내가 한 것----------------");
		Scanner sc = new Scanner(System.in);
		Gugudan a = new Gugudan();
		System.out.print(">> 몇 단 볼래? => ");
		int n = Integer.parseInt(sc.nextLine());
		a.gugudan1(n);
		
		
		System.out.println("\n>> 강사님이 한 것----------------");
		
		Gugudan obj = new Gugudan();
		
		// Scanner sc = new Scanner(System.in);
		for(;;) { //무한루프
			try {
				System.out.print(">> 몇 단 볼래? => ");
				int dan = Integer.parseInt(sc.nextLine());
				obj.showDan(dan);
				break; // 정상적으로 수행될 부분이 움직이면 for가 끝나도록 설정
				
			} catch (NumberFormatException e) {
				System.out.println(">> 정수를 입력해주세요."); 
				continue; // 생략해도 for에 갇혀있기 때문에 무한반복
				
				// 올바른 값을 넣을 때까지 try안 에 있는 옳은 구문을 반복해야함 ==> 무한루프
			}
		} // end of for(;;)
		
		
		
		System.out.println("\n-------- 예제2 --------");
		// 누적 합계 구하기
		
		/*
		  	>> 시작 수 => 1
		 	>> 종료 수 => 10
		 	>> 결과 : 1부터 10까지의 누적의 합은 55 입니다.
		 	
		 	>> 시작 수 => 2
		 	>> 종료 수 => 9
		 	>> 결과 : 2부터 9까지의 누적의 합은 44 입니다.

		 */
		
//		a.sum1();
//		
//		int a = Integer.parseInt(sc.nextLine());
		
		System.out.println("\n>> 강사님이 한 것");
		for(;;) {
			try {
				System.out.print(">> 시작 수 => ");
				int startNo = Integer.parseInt(sc.nextLine());
				
				System.out.print(">> 종료 수 => ");
				int endNo = Integer.parseInt(sc.nextLine());
				
				obj.nujukSum(startNo, endNo);
				break;
			} catch (NumberFormatException e) {
				System.out.println(">> 정수를 입력하세요.");
			}
		}
		
		sc.close();
		
		
	} // end of main()

} // end of class
