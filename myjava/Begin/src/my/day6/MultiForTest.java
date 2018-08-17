package my.day6;

public class MultiForTest {

	public static void main(String[] args) {
		
	// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 	
		for(int i=0; i<20; i++) {
			System.out.print(i+1+" ");
		}
		
		System.out.println("\n\n");
		
	/*
	    1 2 3 4 5
	    6 7 8 9 10
	    11 12 13 14 15
	    16 17 18 19 20
	 */
		for(int i=0; i<20; i++) {
			String str = (i+1)%5==0?"\n":" ";
			System.out.print(i+1+str);
		}
		
		System.out.println("\n==================\n");
		
		/*
		 === !!! 필수 암기 !!! ===
		    외부 loop ==> 행의 갯수
		    내부 loop ==> 열의 갯수
		
		   1 2 3 4 5
		   6 7 8 9 10
		   11 12 13 14 15
		   16 17 18 19 20
		*/
		int n=0;
		for(int i=0; i<4; i++) { // 4행
			for(int j=0; j<5; j++) { // 5열
				System.out.print(++n+" ");
				// 1 2 3 4 5 
				// 6 7 8 9 10
				// 11 12 13 14 15
				// 16 17 18 19 20
			}
			System.out.print("\n");
		}
		
		System.out.println("\n----------------\n");
		
	/*	
		*****
		*****
		*****
		*****
		*****
	*/	
		for(int i=0; i<5; i++) { // 5행
			for(int j=0; j<5; j++) { // 5열
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.println("\n----------------\n");
	/*
	    ***
	    ***
	    ***
	    *** 	
	 */
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.println("\n----------------\n");
		
		for(int i=0; i<12; i++) {
			String str = (i+1)%3==0?"\n":"";
			System.out.print("*"+str);
		}
		
	}

}
