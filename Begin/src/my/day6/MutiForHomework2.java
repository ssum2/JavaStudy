package my.day6;

public class MutiForHomework2 {
// 2018-08-13 15:13PM
	
	public static void main(String[] args) {
		System.out.println("\n=========== 문제 7 ==========\n");
		/*
	 	<문제 7>
	 		  *
	 		 ***			
	 		*****		
	 		 ***		
	 	   	  *		
	 			 		
		 */
		
		for(int i=1; i<=3; i++) {
			if(i==3) continue;
			for(int j=0; j<(5-(i*2-1))/2 ; j++) { // j< 2, 1, 0
				// i==1 -> 1*2-1 = 1 ==> 5-1==4 ==> 4/2 ===> 2
				System.out.print(" ");
			}
			for(int j=0; j<(i*2-1); j++) { // i값을 1로 초기화, j< 1, 3, 5
				System.out.print("*");
			}
			for(int j=0; j<(5-(i*2-1))/2 ; j++) { // j< 2, 1, 0
				System.out.print(" ");
			}
			
			System.out.print("\n");
		}
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<5; j++) {
				if(i+j<=4 &&  i<=j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}

	} // end of main()

} // end of class
