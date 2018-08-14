package my.day7;

public class whileTest {
	/*
	    === while 문 형식 ===
	    
	       변수의 초기화;
	       
	    while(조건식) {
	             조건식이 참(true)이라면 반복해서 실행할 명령문 계속해서 실행하고,
	             조건식이 거짓(false)이라면 { } 이부분을 빠져나간다.       
	             
	             반복해서 실행할 명령문;
	             증감식;      
	    }
	    
	 */

	public static void main(String[] args) {
		int i=0;
		while(i<5) {
			System.out.println((i+1)+". 안녕자바~~");
			i++;
		}// end of while
	
		System.out.println("");
		
		i=0;
		while(++i <5) {
			System.out.println(i+". Hello Java~~");

		}
		/*1. Hello Java~~
		2. Hello Java~~
		3. Hello Java~~
		4. Hello Java~~*/
		
		System.out.println("");
		
		i=0;
		while(i++ <5) { // 0은 5보다 작습니까? => O => 후위연산 => i=1
			System.out.println(i+". Hello Java~~");

		}
		
		System.out.println("");
		System.out.println("\n=== 3단 ===\n");
		// while문으로 3단 출력
		System.out.println("-----내가 한 거, 방법 1-----");
		i=0;
		while(i++ < 9) {
			System.out.println("3*"+i+"="+3*i);
		}
		
		System.out.println("\n-----방법 2-----");
		i=0;
		while(i<9) {
			System.out.println("3*"+(i+1)+"="+3*(i+1));
			i++;
		}
		
		System.out.println("\n=== 3단(짝수) ===");
		// 3단 중 짝수만 출력
		System.out.println("-----내가 한 거-----");
		i=0;
		while(i++<9) {
			if(i%2==0)
			System.out.println("3*"+i+"="+3*i);
		}
		System.out.println("\n-----강사님이 한 거-----");
		i=0;
		while(i++<9) {
			if(i%2!=0)
				continue;
			
			System.out.println("3*"+i+"="+3*i);
		}
	
	
		System.out.println("\n=== 3단(6부터 제외) ===");
		i=0;
		while(i++<9) {
			if(i>5)
				break;
			// break로 반복문을 빠져나감 --> i값이 5미만일 때까지만 계산하고 나감 ==> 후위증감으로 값은 5까지 출력
		
			System.out.println("3*"+i+"="+3*i);
		}
	
		System.out.println("\n====== 구구단 ======");
		
		//while문으로 구구단 나타내기
		
		int row=0, col=0; // 행 열
		
		while(row++<9) { // 바깥은 행, 9번 반복(1~9까지)
			while(col++<8) { // 안쪽은 열, 2~9까지 8단
				String str=((col+1)<9)? "\t":"\n";
				System.out.print((col+1)+"*"+row+"="+(col+1)*row+str);
			}
			//col==9 일 때 안쪽 while문을 빠져나감 (비교한 뒤 1증가해서)
			//row==1 일 때
			col=0; // 안쪽while을 빠져나간 다음에 초기화를 해야 또 1부터 돌아갈 수 있음!
		}
	
		System.out.println("\n====== 문제 1) 3단, 7단 제외한 구구단 출력 ======");
		
		
		System.out.println("-----내가 한 거-----");
		row=0;
		col=0; 
		
		while(row++<9) { 
			while(col++<8) { 
				
				if((col+1)==3 || (col+1)==7)
					continue;
				else {
				String str=((col+1)<9)? "\t":"\n";
				System.out.print((col+1)+"*"+row+"="+(col+1)*row+str);
				}
			}
			
			col=0; 
		}
		
		System.out.println("\n-----강사님이 한 거-----");
		row=0;
		col=0;
		
		while(row++<9) {
			while(col++<8) {
				if((col+1)==3 || (col+1)==7)
					continue; // 조건에 맞는 경우 아래로 내려가지 말고 다시 반복문 처음으로 돌아가라 --> 반복문 조건으로 돌아감
				String str=((col+1)<9)? "\t":"\n";
				System.out.print((col+1)+"*"+row+"="+(col+1)*row+str);
			}
			col=0;
		}
		
		
	}// end of main()

}
