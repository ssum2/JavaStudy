/*
      **** 반복문(loop) ==> for 문 ****
      
              ※ for 문의 형식
       
        for(초기화; 조건식; 증감식) {
           	반복해서 실행할 문장;
        }  
        
                   ▣ 순서
        1) 초기화;
        2) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
                                  조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
                   } 을 빠져나간다.)
        3) 증감식
        4) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
                                  조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
                   } 을 빠져나간다.) 
        5) 증감식
        6) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
                                  조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
                   } 을 빠져나간다.)                                                  
        
 */

package my.day6;

import java.util.Scanner;

public class ForTest {

	public void loopName(int n, String name) {
		for(int i=0; i<n; i++) {
			System.out.println((i+1)+"."+name);
		}
	}
	
	public static void main(String[] args) {
		/*
		   1.안녕자바~ 
		   2.안녕자바~ 
		   3.안녕자바~ 
		   4.안녕자바~ 
		   5.안녕자바~ 
		   6.안녕자바~ 
		   7.안녕자바~ 
		   8.안녕자바~ 
		   9.안녕자바~ 
		   10.안녕자바~ 
		 */
		
		for(int i=0; i<10; i++) {
			System.out.println((i+1)+".안녕자바~");
		}
		
		System.out.println("-------------------");
		
		ForTest ft = new ForTest();
		ft.loopName(5, "설현");
		/*
		   1.설현
		   2.설현
		   3.설현
		   4.설현
		   5.설현
		 */
		
		System.out.println("-------------------");
		/*
		    1.박보검
		    3.박보검
		    5.박보검
		    7.박보검
		    9.박보검 
		 */
		for(int i=0,j=1; i<5; i++,j+=2) {
			System.out.println(j+".박보검");
		}
		
		System.out.println("-------------------");
		/*
		   10. Hello 이클립스~ 
		   9. Hello 이클립스~
		   8. Hello 이클립스~
		   7. Hello 이클립스~
		   6. Hello 이클립스~
		   5. Hello 이클립스~
		   4. Hello 이클립스~
		   3. Hello 이클립스~
		   2. Hello 이클립스~
		   1. Hello 이클립스~
		 */
		for(int i=10; i>0; i--) {
			System.out.println(i+". Hello 이클립스~");
		}
		
		System.out.println("-------------------");
		
		/*
		   9. Hello 이클립스~
		   7. Hello 이클립스~
		   5. Hello 이클립스~
		   3. Hello 이클립스~
		   1. Hello 이클립스~
		 */
		for(int i=0, j=9; i<5; i++, j-=2) {
			System.out.println(j+". Hello 이클립스~");
		}
		
		System.out.println("===================");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 => ");
		String str = sc.nextLine(); // 자바개발자
		
		int i=0;
		try {
			System.out.print("반복할 횟수 => ");
			int n = Integer.parseInt(sc.nextLine()); // 10
			
			for(; i<n; i++) {
				System.out.println((i+1)+"."+str);
			}
			
		} catch (NumberFormatException e) {
			System.out.println(">> 반복횟수는 숫자만 입력가능합니다.\n프로그램 종료!!"); 
		 // System.exit(0);
		 // System.exit(1);
			return;
		}
		
		System.out.println(">> 반복을 마친 이후의 i => " +i);
		
		System.out.println("------------------");
		
		for(; i>0; i--) {
			System.out.println(i+"."+str);
		}

	}

}
