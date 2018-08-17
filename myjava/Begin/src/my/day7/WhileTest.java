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

package my.day7;

public class WhileTest {

	public static void main(String[] args) {
		
		int i=0;
		while(i<5) {
			System.out.println((i+1)+". 안녕자바~~");
			i++;
		}// end of while------------------
		
		System.out.println("");
		
		i=0;
		while(i++ < 5) { // 0  1  2  3  4  
			System.out.println(i+". Hello Java~~");
			             // 1  2  3  4  5
		}
		
		System.out.println("");
		
		System.out.println("\n=== 3단 ====\n");
		i=0;
		while(i<9) {
			System.out.println("3*"+(i+1)+"="+3*(i+1));
			i++;
		}// end of while--------------------
		
		System.out.println("");
		i=0;
		while(i++<9) {
			System.out.println("3*"+i+"="+(3*i));
		}
		
		System.out.println("\n=== 3단(짝수만) ====");
		/*
		    3*2=6
		    3*4=12
		    3*6=18
		    3*8=24
		 */
		i=0;
		while(i++<9) {
			if(i%2 != 0)
				continue;
			System.out.println("3*"+i+"="+(3*i));
		}
		
		System.out.println("\n=== 3단(6부터는 제외) ====");
		/*
		    3*1=3
		    3*2=6
		    3*3=9
		    3*4=12
		    3*5=15
		 */
		i=0;
		while(i++<9) {
			if(i>5)
				break;
			System.out.println("3*"+i+"="+(3*i));
		}
		
		System.out.println("\n====== 구구단 =======");
		int row=0, col=0;
		while(row++<9) {  // 행
			while(col++<8) {
				String str = (col+1)<9?"\t":"\n";
				System.out.print((col+1)+"*"+row+"="+(col+1)*row+str);        
			}//end of while------------------
			col = 0;
			// row ==> 1
			// row ==> 2
			// row ==> 3
			// ......
			// row ==> 9
		}//end of while------------------
		
		System.out.println("\n====== 구구단(3단과 7단은 제외) =======");
		
		row=0; 
		col=0;
		
		while(row++<9) {
			while(col++<8) {
				if( (col+1) == 3 || (col+1) == 7 )
					continue;
				String str = (col+1)<9?"\t":"\n";
				System.out.print((col+1)+"*"+row+"="+(col+1)*row+str);
			}// end of while---------------
			
			col = 0;
			
		}// end of while-----------------------
		
		

	}

}
