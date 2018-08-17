package my.day6;

import java.util.Scanner;

public class Gugudan {

	public void showDan(int dan) {
		System.out.println("=== "+dan+"단 ===");
		for(int i=0; i<9; i++) {
			System.out.println(dan+"*"+(i+1)+"="+ dan*(i+1) );
		}
	}
	
	
	public void nujukSum(int startno, int endno) {
		int sum = 0;
		
		for(int i=startno; i<=endno; i++) {
			sum += i;
		}
		
		System.out.println(">> 결과 : "+startno+" 부터 "+endno+"까지 누적의 합은 "+sum+" 입니다.");    
	}
	
	public static void main(String[] args) {
		
		/*
		    2*1=2	3*1=3	4*1=4	.... 8*1=8	9*1=9
		    2*2=4	3*2=3	4*2=4	.... 8*2=8	9*2=9
		    2*3=6	3*3=3	4*3=4	.... 8*3=8	9*3=9
		    2*4=8	3*4=3	4*4=4	.... 8*4=8	9*4=9
		    2*5=10	3*5=3	4*5=4	.... 8*5=8	9*5=9
		    2*6=12	3*6=3	4*6=4	.... 8*6=8	9*6=9
		    2*7=14	3*7=3	4*7=4	.... 8*7=8	9*7=9
		    2*8=16	3*8=3	4*8=4	.... 8*8=8	9*8=9
		    2*9=18	3*9=3	4*9=4	.... 8*9=8	9*9=9
		 */
		System.out.println("===== 구구단 =====\n");
		for(int i=0; i<9; i++) {
			for(int j=0; j<8; j++) {
				String str = (j+2<9)?"\t":"\n";
				System.out.print((j+2)+"*"+(i+1)+"="+((j+2)*(i+1))+str);           
			}
		}
		
		System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		
		Gugudan obj = new Gugudan();
		
		for(;;) {
		
			try {
				System.out.print(">> 몇단볼래? => ");
				int dan = Integer.parseInt(sc.nextLine());
				
				obj.showDan(dan);
				/*
				    >> 몇단볼래? => 7
				    === 7단 ===
				    7*1=7
				    7*2=14
				    7*3=21
				    ....
				    7*9=63 
				 */
				System.out.println("\n>>> 누적치 합 구하기 <<<\n");
				/*
				   >> 시작 수 => 1
				   >> 종료 수 => 10
				   >> 결과 : 1 부터 10까지 누적의 합은 55 입니다. 
				   
				   >> 시작 수 => 2
				   >> 종료 수 => 9
				   >> 결과 : 2 부터 9까지 누적의 합은 44 입니다.
				 */
				System.out.print(">> 시작 수 => ");
				int startno = Integer.parseInt(sc.nextLine());
				
				System.out.print(">> 종료 수 => ");
				int endno = Integer.parseInt(sc.nextLine());
				
				obj.nujukSum(startno, endno);
				
				break;
			} catch (NumberFormatException e) {
				System.out.println(">>> 정수만 입력하세요!!");
			//	continue;
			}
		
		}// end of for------------------------
		
        sc.close();
	}// end of main()--------------------------

}
