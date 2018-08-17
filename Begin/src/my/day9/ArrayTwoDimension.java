package my.day9;

import java.util.Arrays;

public class ArrayTwoDimension {
	
	/*
	 	================ 2차원 배열 ================
	 	 - table과 같은 모양 (엑셀 표)
	 
	 */
	
	public static void main(String[] args) {
		int[][] pointArr = new int[4][3]; // 4행 3열
		
		pointArr[0][0] = 10;
		pointArr[0][1] = 20;
		pointArr[0][2] = 30;
		
		pointArr[1][0] = 40;
		pointArr[1][1] = 50;
		pointArr[1][2] = 60;
		
		pointArr[2][0] = 70;
		pointArr[2][1] = 80;
		pointArr[2][2] = 90;
		
		pointArr[3][0] = 100;
		pointArr[3][1] = 110;
		pointArr[3][2] = 120;
		
		System.out.println("pointArr.length => "+pointArr.length);
		// pointArr.length => 4 ===> 행의 수 출력
		
		System.out.println("pointArr[0].length => "+pointArr[0].length);
		//pointArr[0].length => 3 ===> 첫번째 행(0행)의 열의 수 출력
		System.out.println("pointArr[1].length => "+pointArr[1].length);
		System.out.println("pointArr[2].length => "+pointArr[2].length);
		System.out.println("pointArr[3].length => "+pointArr[3].length);
		
		//-----------------------pointArr 내용 출력-------------------------
		System.out.println("\n----- pointArr의 내용 출력 -----");
		System.out.println("1) 내가 한 내용: Arrays.toString() 사용");
		for(int i=0; i<pointArr.length; i++) {
			String str1 = Arrays.toString(pointArr[i]);
			System.out.println(str1);
		}
		
		System.out.println("\n2) 강사님 내용: 이중for문 사용");
		for(int i=0; i<pointArr.length; i++) { // 바깥for -> 행
			for(int j=0; j<pointArr[i].length; j++) { // 안쪽for -> 열
						// pointArr[i].length = i행의 열 갯수(길이)
				String str = (j<pointArr[i].length-1)? ", ":"";
				System.out.print(pointArr[i][j]+str);
			}
			System.out.print("\n");
		}
		
		
		//---------------------pointArr 내용 출력2-------------------------
		System.out.println("\n----- pointArr의 내용 출력2 -----");
		System.out.println("1) 내가 한 내용: if-continue 사용 == 강사님 내용과 동일");
		for(int i=0; i<pointArr.length; i++) { // 바깥for -> 행
			if(i==1)
				continue;
			for(int j=0; j<pointArr[i].length; j++) { // 안쪽for -> 열
						// pointArr[i].length = i행의 열 갯수(길이)
				String str = (j<pointArr[i].length-1)? ", ":"";
				System.out.print(pointArr[i][j]+str);
			}
			System.out.print("\n");
		}
		
		System.out.println("\n===============================\n");
		//---------------------열 크기를 부여하지 않았을 때-------------------------
		int[][] jumsuArr=new int[4][]; //2차원 배열, 4행 null열 --> null pointer Exception
		
		// 열에 대한 배열의 크기를 설정하지 않았기 때문에 java.lang.NullPointerException 발생
//		jumsuArr[0][0] = 10; 
//		jumsuArr[0][1] = 20;
//		jumsuArr[0][2] = 30;
//		
//		jumsuArr[1][0] = 40;
//		jumsuArr[1][1] = 50;
//		jumsuArr[1][2] = 60;
//		
//		jumsuArr[2][0] = 70;
//		jumsuArr[2][1] = 80;
//		jumsuArr[2][2] = 90;
//		
//		jumsuArr[3][0] = 100;
//		jumsuArr[3][1] = 110;
//		jumsuArr[3][2] = 120;

		//---------------------행마다 열 크기를 다르게 줄 때-------------------------
		System.out.println("----- 행마다 열 크기를 다르게 줄 때-----");
		jumsuArr[0] = new int[3];
		jumsuArr[1] = new int[2];
		jumsuArr[2] = new int[3];
		jumsuArr[3] = new int[3];
		
		jumsuArr[0][0] = 10; 
		jumsuArr[0][1] = 20;
		jumsuArr[0][2] = 30;
		
		jumsuArr[1][0] = 40;
		jumsuArr[1][1] = 50;
//		jumsuArr[1][2] = 60; // 배열 사이즈 넘침 java.lang.ArrayIndexOutOfBoundsException
		
		jumsuArr[2][0] = 70;
		jumsuArr[2][1] = 80;
		jumsuArr[2][2] = 90;
		
		jumsuArr[3][0] = 100;
		jumsuArr[3][1] = 110;
		jumsuArr[3][2] = 120;
	
		System.out.println("jumsuArr.length => "+jumsuArr.length); // 4
		
		System.out.println("jumsuArr[0].length => "+jumsuArr[0].length); // 3
		System.out.println("jumsuArr[1].length => "+jumsuArr[1].length); // 2
		System.out.println("jumsuArr[2].length => "+jumsuArr[2].length); // 3
		System.out.println("jumsuArr[3].length => "+jumsuArr[3].length); // 3
		
		System.out.println("\n===============================\n");
		
		System.out.println("----- 행마다 열 크기를 다르게 줄 때 2: 축약 표현 -----");
		
		int[][] valArr = {{10,20,30},{40,50},{70,80,90},{100,110,120}}; // {}하나가 행 --> 4행, { ~ } 내용이 열 갯수
		// 0행 3열 , 1행 2열, 2행 3열, 3행 3열
		
		System.out.println("valArr.length => "+valArr.length); // 4
		
		System.out.println("valArr[0].length => "+valArr[0].length); // 3
		System.out.println("valArr[1].length => "+valArr[1].length); // 2
		System.out.println("valArr[2].length => "+valArr[2].length); // 3
		System.out.println("valArr[3].length => "+valArr[3].length); // 3
		
	} // end of main()

} // end of class
