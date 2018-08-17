package my.day6;

public class MultiForHomework {

	public static void main(String[] args) {
		
	/*
	    문제 1
	            (i,j)
	   *****    (0,0) (0,1) (0,2) (0,3) (0,4)
	   ****     (1,0) (1,1) (1,2) (1,3) (1,4)
	   ***      (2,0) (2,1) (2,2) (2,3) (2,4)
	   **       (3,0) (3,1) (3,2) (3,3) (3,4)
	   *        (4,0) (4,1) (4,2) (4,3) (4,4)

                (0,0) (0,1) (0,2) (0,3) (0,4)
	     	    (1,0) (1,1) (1,2) (1,3)
	     	    (2,0) (2,1) (2,2)
	     	    (3,0) (3,1)
	     	    (4,0)
	     	    
	     	    i+j <= 4 이라면 * 을 출력한다.
	 */
		System.out.println("=== 문제1 == \n");
		
		for(int i=0; i<5; i++) { // 5행
			for(int j=0; j<5; j++) { // 5열
				if(i+j <= 4)
					System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.println("");
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) { // i=>0  j<5
				                       // i=>1  j<4
				                       // i=>2  j<3
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.println("");
		
		for(int i=5; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	/*
	    문제 2
	    
	    *********1
	    ********2
	    *******3
	    ******4
	    *****5
	    ****6
	    ***7
	    **8
	    *9
	      	
	 */
		System.out.println("=== 문제2(입사문제) == \n");	
		
		for(int i=9; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.print((10-i)+"\n");
		}
		
		System.out.println("");
		
	/*
	    문제 3
	            (i,j)
	   *        (0,0) (0,1) (0,2) (0,3) (0,4)
	   **       (1,0) (1,1) (1,2) (1,3) (1,4)
	   ***      (2,0) (2,1) (2,2) (2,3) (2,4)
	   ****     (3,0) (3,1) (3,2) (3,3) (3,4)
	   *****    (4,0) (4,1) (4,2) (4,3) (4,4)

                (0,0) 
	     	    (1,0) (1,1) 
	     	    (2,0) (2,1) (2,2)
	     	    (3,0) (3,1) (3,2) (3,3)
	     	    (4,0) (4,1) (4,2) (4,3) (4,4)
	     	    
	     	    i >= j 이라면 * 을 출력한다.
	 */	
	  System.out.println("=== 문제3 == \n");
	  
	  for(int i=0; i<5; i++) {
		  for(int j=0; j<5; j++) {
			  if(i >= j)
				  System.out.print("*");
		  }
		  System.out.print("\n");
	  }
	  
	  System.out.println("");
	  
	  for(int i=0; i<5; i++) {
		  for(int j=0; j<i+1; j++) {
			  System.out.print("*");
		  }
		  System.out.print("\n");
	  }
	  
	  System.out.println("");
	  
	  for(int i=0; i<5; i++) {
		  for(int j=i+1 ; j>0; j--) {
			  System.out.print("*");
		  }
		  System.out.print("\n");
	  }
	  
	/*
	    문제 4
	            (i,j)
	       *    (0,0) (0,1) (0,2) (0,3) (0,4)
	      **    (1,0) (1,1) (1,2) (1,3) (1,4)
	     ***    (2,0) (2,1) (2,2) (2,3) (2,4)
	    ****    (3,0) (3,1) (3,2) (3,3) (3,4)
	   *****    (4,0) (4,1) (4,2) (4,3) (4,4)
	  
	            " "을 출력해주는 경우
	            (0,0) (0,1) (0,2) (0,3)
	            (1,0) (1,1) (1,2)
                (2,0) (2,1)
                (3,0)
                i+j < 4 일때는 "$"을 출력해주는 경우이다.
                
                "*"을 출력해주는 경우
                                        (0,4)
                                  (1,3) (1,4)
                            (2,2) (2,3) (2,4)
                      (3,1) (3,2) (3,3) (3,4)
                (4,0) (4,1) (4,2) (4,3) (4,4)
                i+j >= 4 일때는 "*"을 출력해주는 경우이다.
	 */	
	  System.out.println("=== 문제4 == \n");	 
	  
	  for(int i=0; i<5; i++) {
		  for(int j=0; j<5; j++) {
			  if(i+j < 4)
				  System.out.print(" ");
			  else
				  System.out.print("*");
		  }
		  System.out.print("\n");
	  }
	  
	  System.out.println("");
	  
	  for(int i=0; i<5; i++) {
		  // " "을 4번 출력
		  // "*"을 1번 출력
		  
		  // " "을 3번 출력
		  // "*"을 2번 출력
		  
		  // " "을 2번 출력
		  // "*"을 3번 출력
		  
		  // " "을 1번 출력
		  // "*"을 4번 출력
		  
		  // " "을 0번 출력
		  // "*"을 5번 출력
		  for(int j=0; j<4-i; j++) {
			  System.out.print(" ");
		  }
		  
		  for(int j=0; j<i+1; j++) {
			  System.out.print("*");
		  }
		  
		  System.out.print("\n");
	  }
	  
	  System.out.println("");
	  
	 /*
	    문제 5
	             (i,j)
	       *     (0,0) (0,1) (0,2) (0,3) (0,4)
	      ***    (1,0) (1,1) (1,2) (1,3) (1,4)
	     *****   (2,0) (2,1) (2,2) (2,3) (2,4)
	    
	             "*"을 출력해주는 경우
	                         (0,2)
	                   (1,1) (1,2) (1,3)
	             (2,0) (2,1) (2,2) (2,3) (2,4)
	             i+j >= 2 && j-i <= 2 "*"을 출력해주는 경우이다.
	            
	             " "을 출력해주는 경우
	             (0,0) (0,1)     (0,3) (0,4)
	             (1,0)                 (1,4)
	             !(i+j >= 2 && j-i <= 2) "*"을 출력해주는 경우이다.
	             i+j < 2 || j-i > 2  "*"을 출력해주는 경우이다.
	              
	 */	
	  System.out.println("=== 문제5 == \n");  
	  
	  for(int i=0; i<3; i++) {
		  for(int j=0; j<5; j++) {
			  if(i+j >= 2 && j-i <= 2)
				  System.out.print("*");
			  else
				  System.out.print(" ");
		  }
		  System.out.print("\n");
	  }
	  
	  System.out.println("");
	  
	  for(int i=1; i<=3; i++) {
		  // " "이 2번
		  // "*"이 1번
		  // " "이 2번
		  
		  // " "이 1번
		  // "*"이 3번
		  // " "이 1번
		  
		  // " "이 0번
		  // "*"이 5번
		  // " "이 0번
		  for(int j=0; j<(5-(i*2-1))/2; j++) {   // j<2   j<1   j<0 
			  System.out.print(" ");
		  }
		  for(int j=0; j<(i*2-1); j++) {         // j<1   j<3   j<5
			  System.out.print("*");
		  }
		  for(int j=0; j<(5-(i*2-1))/2; j++) {   // j<2   j<1   j<0
			  System.out.print(" ");  
		  }
		  System.out.print("\n");
	  }
		
	
	  /*
	     문제 6
	             (i,j)
	     *****   (0,0) (0,1) (0,2) (0,3) (0,4)
	      ***    (1,0) (1,1) (1,2) (1,3) (1,4)
	       *     (2,0) (2,1) (2,2) (2,3) (2,4)
	    
	             "*"을 출력해주는 경우
	             (0,0) (0,1) (0,2) (0,3) (0,4)          
	                   (1,1) (1,2) (1,3)
	                         (2,2)
	             i+j <= 4 &&  j >= i 이라면 "*"을 출력해준다.      
	                         
	             " "을 출력해주는 경우
	             (1,0)                   (1,4)
	             (2,0) (2,1)       (2,3) (2,4) 
	             !(i+j <= 4 &&  j >= i) 이라면 " "을 출력해준다. 
	             i+j > 4 || j < i 이라면 " "을 출력해준다. 
	             
	 */	
	  System.out.println("=== 문제6 == \n");
	  
	  for(int i=0; i<3; i++) {
		  for(int j=0; j<5; j++) {
			  if(i+j <= 4 &&  j >= i)
				  System.out.print("*");
			  else
				  System.out.print(" ");
		  }
		  System.out.print("\n");
	  }
	  
	  System.out.println("");
	  
	  for(int i=3; i>0; i--) {
		  // " "이 0번
		  // "*"이 5번
		  // " "이 0번
		  
		  // " "이 1번
		  // "*"이 3번
		  // " "이 1번
		  
		  // " "이 2번
		  // "*"이 1번
		  // " "이 2번
		  
		  for(int j=(5-(i*2-1))/2; j>0; j--) {   // int j=0   int j=1   int j=2 
			  System.out.print(" ");
		  }
		  for(int j=i*2-1; j>0; j--) {           // int j=5   int j=3   int j=1 
			  System.out.print("*");
		  }
		  for(int j=(5-(i*2-1))/2; j>0; j--) {   // int j=0   int j=1   int j=2  
			  System.out.print(" ");  
		  }
		  System.out.print("\n");
	  }
	
	  
	 /*
	     문제 7
	       *
	      ***       
	     *****   
	      ***    
	       *     
	 */	
	  System.out.println("=== 문제7 == \n");
	  
	  for(int i=1; i<=3; i++) {
		  for(int j=0; j<(5-(i*2-1))/2; j++) {   // j<2   j<1   j<0 
			  System.out.print(" ");
		  }
		  for(int j=0; j<(i*2-1); j++) {         // j<1   j<3   j<5
			  System.out.print("*");
		  }
		  for(int j=0; j<(5-(i*2-1))/2; j++) {   // j<2   j<1   j<0
			  System.out.print(" ");  
		  }
		  System.out.print("\n");
	  }
	  for(int i=3; i>0; i--) {
		  if(i==3) continue;
		  for(int j=(5-(i*2-1))/2; j>0; j--) {   // int j=0   int j=1   int j=2 
			  System.out.print(" ");
		  }
		  for(int j=i*2-1; j>0; j--) {           // int j=5   int j=3   int j=1 
			  System.out.print("*");
		  }
		  for(int j=(5-(i*2-1))/2; j>0; j--) {   // int j=0   int j=1   int j=2  
			  System.out.print(" ");  
		  }
		  System.out.print("\n");
	  }
	  

	}// end of main()---------------------------

}
