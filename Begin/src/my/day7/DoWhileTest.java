package my.day7;

import java.text.DecimalFormat;

public class DoWhileTest {
	/*
	    === do ~ while() ===
	    
	         변수초기화;
	    
	    do{
	               반복해서 실행할 명령문;
	               증감식;
	    } while(조건식);
	    
	    while 문의 경우 조건식이 true 일때만 반복 실행하지만,
	    do ~ while 문의 경우는 조건식이 false 일지라도
	        무조건 do{ } 속에 있는 명령문은 1번은 실행하고서 반복문을 벗어난다.
	        
	        그러므로 do ~ while 문은 무조건 do{ } 속에 있는 명령문을 실행하고서
	    while(조건식) 속의 조건에 따라 참(true)이라면 계속 반복하고,
	        조건이 거짓(false)이라면 중지한다.
          
	 */
	
	public static void main(String[] args) {
		
		int i=0;
		while(i>1) {
			System.out.println("최민주는 닭똥집을 먹습니다.");
		}
		
		do {
			System.out.println("최민주는 햄버거를 먹습니다.");
		} while (i>1); // while의 조건이 거짓이더라도 일단 do 안의 문장을 실행
		
	
		System.out.println("\n========================\n");
		
		// 1부터 100까지 중 17의 배수는? 17, 34, 51, 68, 85,( 102)
		// 1부터 100까지 중 17의 배수 총합은? 255
		
		int num=0, sum=0;
		String str ="";
		do {
			if(num>100)
				break;
			if(++num%17==0) { // 전위로 num을 1로 만든 다음 17로 나눈 나머지를 구함 ==> 17의 배수라면~
				String comma = (num >17)? ", ":""; // 강사님이 한 삼항연산자를 이용한 , 출력
				str += comma+num; // 문자열 결합, 1~100까지 17의 배수 일괄 출력
					// 강사님이 한 버전 comma를 결합 
				sum += num; // 17의 배수 누적
			}
			
		} while (true); // 무한루프
		
//		System.out.println("내가 한 거: DecimalFormat 클래스, format메소드 사용");
//		DecimalFormat df = new DecimalFormat("##, ##");
//	
//		System.out.println("1부터 100까지 중 17의 배수는? "+df.format(Integer.parseInt(str)));
//		System.out.println("1부터 100까지 중 17의 배수 총합은? "+sum);
		
		System.out.println("\n강사님이 한 거: 삼항연산자 이용---------------------");
		
		System.out.println("1부터 100까지 중 17의 배수는? "+str);
		System.out.println("1부터 100까지 중 17의 배수 총합은? "+sum);
		
		
		System.out.println("\n==========퀴즈=========\n");
		// 아래의 출력 결과가 어떻게 나오는 지 직접 손으로 작성
		int m=1, n=10;
		do {
			if(m>n) break;
			n--;
		} while (++m<5); // m=4될 때까지  --> 전위니까 5가 됐을 때
		
		System.out.println("m="+m+", n="+n);
		
		/*
		 	m=5, m=6
		 
		 */
		
		
		
		
		
		
		
		
		
		
	} //end of main()

}
