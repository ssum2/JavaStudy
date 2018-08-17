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

package my.day7;

public class DoWhileTest {

	public static void main(String[] args) {
		
		int i=0;
		
		while(i>1) {
			System.out.println("최민주는 닭똥집을 먹습니다.");
		}
		
		do {
			System.out.println("최민주는 햄버거를 먹습니다.");
		} while (i>1);
		
		System.out.println("\n==============\n");
		
		// 1부터 100까지중 17배수는 17, 34, 51, 68, 85
		// 1부터 100까지중 17배수의 합은 255 입니다.
		int num=0, sum=0;
		String str = "";
		do {
			if(num > 100) break;
			
			if(++num%17 == 0) { // 17배수이라면
				String comma = (num > 17)?", ":"";
				str += comma+num;
				sum += num;
			}
			
		} while (true);
		
		System.out.println("1부터 100까지중 17배수는 " + str);
		System.out.println("1부터 100까지중 17배수의 합은 " + sum + "입니다.");

		System.out.println("\n==== 퀴즈 ====");
		// 아래의 출력결과가 어떻게 나오는지 직접 손으로 적어보세요.
		int m=1, n=10;
		do {
			if(m>n) break;
			n--;
		} while(++m<5);
		
		System.out.println("m="+m+", n="+n);
		// m=5, n=6
		
	}// end of main()--------------------------

}
