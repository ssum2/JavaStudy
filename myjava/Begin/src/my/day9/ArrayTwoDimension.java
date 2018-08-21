/*
     === 2차원 배열 === 
 */
package my.day9;

public class ArrayTwoDimension {

	public static void main(String[] args) {
		
		int[][] pointArr = new int[4][3]; // 4행3열 
		
		pointArr[0][0] = 10;
		pointArr[0][1] = 20;
		pointArr[0][2] = 30;
		
		pointArr[1][0] = 40;
		pointArr[1][1] = 50;
	//	pointArr[1][2] = 60;
		
		pointArr[2][0] = 70;
		pointArr[2][1] = 80;
		pointArr[2][2] = 90;
		
		pointArr[3][0] = 100;
		pointArr[3][1] = 110;
		pointArr[3][2] = 120;
		
		System.out.println("pointArr.length => " + pointArr.length);
		// pointArr.length => 4
		
		System.out.println("pointArr[0].length => " + pointArr[0].length);
		// pointArr[0].length => 3
		
		System.out.println("pointArr[1].length => " + pointArr[1].length);
		// pointArr[1].length => 3
		
		System.out.println("\n------------------\n");
		
		for(int i=0; i<pointArr.length; i++) {
			for(int j=0; j<pointArr[i].length; j++) {
				String str = (j < pointArr[i].length-1)?",":"";   
				System.out.print(pointArr[i][j]+str);
			}
			System.out.print("\n");
		}
		/*
		    10,20,30
		    40,50,0
		    70,80,90
		    100,110,120
		 */
		
		System.out.println("");
		
		for(int i=0; i<pointArr.length; i++) {
			if(i==1) continue;
			for(int j=0; j<pointArr[i].length; j++) {
				String str = (j < pointArr[i].length-1)?",":"";   
				System.out.print(pointArr[i][j]+str);
			}
			System.out.print("\n");
		}
		
		/*
		    10,20,30
		    70,80,90
		    100,110,120
		 */
		
		System.out.println("\n########################\n"); 
		
		int[][] jumsuArr = new int[4][];  // 4행null열
		/*
		    jumsuArr[0][0] = 10; // 열에 대한 배열의 크기를 설정하지 않았으므로 java.lang.NullPointerException 이 발생한다. 
			jumsuArr[0][1] = 20;
			jumsuArr[0][2] = 30;
			
			jumsuArr[1][0] = 40;
			jumsuArr[1][1] = 50;
		//	jumsuArr[1][2] = 60;
			
			jumsuArr[2][0] = 70;
			jumsuArr[2][1] = 80;
			jumsuArr[2][2] = 90;
			
			jumsuArr[3][0] = 100;
			jumsuArr[3][1] = 110;
			jumsuArr[3][2] = 120;  
		*/
		
		jumsuArr[0] = new int[3];
		jumsuArr[1] = new int[2];
		jumsuArr[2] = new int[3];
		jumsuArr[3] = new int[3];
		
		jumsuArr[0][0] = 10;  
		jumsuArr[0][1] = 20;
		jumsuArr[0][2] = 30;
		
		jumsuArr[1][0] = 40;
		jumsuArr[1][1] = 50;
	//	jumsuArr[1][2] = 60; // java.lang.ArrayIndexOutOfBoundsException    
		
		jumsuArr[2][0] = 70;
		jumsuArr[2][1] = 80;
		jumsuArr[2][2] = 90;
		
		jumsuArr[3][0] = 100;
		jumsuArr[3][1] = 110;
		jumsuArr[3][2] = 120;
		
		System.out.println("jumsuArr.length => " + jumsuArr.length);
		// jumsuArr.length => 4
		
		System.out.println("jumsuArr[0].length => " + jumsuArr[0].length);
		// jumsuArr[0].length => 3
		
		System.out.println("jumsuArr[1].length => " + jumsuArr[1].length);
		// jumsuArr[1].length => 2
		
		System.out.println("\n########################\n"); 
		
		int[][] valArr = {{10,20,30},{40,50},{70,80,90},{100,110,120} }; 
		// 4행
		// 0행3열  1행2열  2행3열  3행3열
		
		System.out.println("valArr.length => " + valArr.length);
		// valArr.length => 4
		
		System.out.println("valArr[0].length => " + valArr[0].length);
		// valArr[0].length => 3
		
		System.out.println("valArr[1].length => " + valArr[1].length);
		// valArr[1].length => 2
		

	}// end of main()-----------------------------

}
