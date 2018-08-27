package my.day15.Exception;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		String str1 ="25";
		String str2 ="똘똘이";
		
		int a1 = Integer.parseInt(str1);
//		int a2 = Integer.parseInt(str2); // NumberFormatException

		int[] arr = {10,20,30};
		int sum = 0;
		for(int i=0; i<arr.length+1;i++) {
			int su = arr[i]/0;
			sum+=su;
		}
		
		try {
			int no = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*
		 	**RuntimeException; 실행시키기 전까지 오류인지 알 수 없는 것
		 		NumberFormatException
		 		ArrayIndexOutOfBoundsException
		 		ArithmeticException
		 		등...
		 		
		 	*<->Checked Exception; 실행전에 빨간줄이 보여서 오류임을 바로 알 수 있는 것
		 		IOException
		 		
		 	
		 */
	}

}
