/*
 >> 버블 정렬(Bubble Sort)은 
 정렬 대상 리스트(배열)의 항목을 수평방향으로 나열했다고 가정했을 때, 
 왼쪽 끝에서부터 시작해서 인접하는 두 항목의 값을 비교하여 
 올바른 순서(오름차순 또는 내림차순)로 되어있지 않으면 서로 위치를 교환하는 정렬방법이다.
 
 이렇게 인접하는 항목의 값을 비교해서 위치를 교환하는 과정을 
 리스트(배열)의 마지막 항목까지 반복해서 제일 큰(또는 작은) 값이 끝에 오도록 한다.
 
 각 회전(Pass)과정이 끝날때마다 정렬은 뒤에서부터 하나씩 완료된다. 
*/

package my.day9;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] numArr = {9,7,3,5,1};
		
		System.out.println("=== 정렬전 ====");
		for(int i=0; i<numArr.length; i++) {
			String str = (i<numArr.length-1)?",":"\n";
			System.out.print(numArr[i]+str);
		}
		
		for(int i=0; i<numArr.length-1; i++) { // 추출대상 갯수 ==> 배열길이 - 1
			
			for(int j=0; j<numArr.length-1-i; j++) { // 비교대상 갯수 ==> (배열길이 - 1) 부터 1씩 감소                   
				if(numArr[j] > numArr[j+1]) {
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
				}
			// ---------------------------------
			// 	7 3 5 1 9   ==> i=> 0 
			//  3 5 1 7 9   ==> i=> 1
			//  3 1 5 7 9   ==> i=> 2
			// 	1 3 5 7 9   ==> i=> 3
			// ---------------------------------	
				
			}// end of for(내부)---------------
			
		}// end of for(외부)--------------------
		
		System.out.println("\n=== 정렬후 ====");
		for(int i=0; i<numArr.length; i++) {
			String str = (i<numArr.length-1)?",":"\n";
			System.out.print(numArr[i]+str);
		}
		// 1,3,5,7,9
		
		System.out.println("\n------------------\n");
		
		int[] numArr2 = {9,7,3,5,1};
		
		System.out.println("=== 정렬전 ====");
		for(int i=0; i<numArr2.length; i++) {
			String str = (i<numArr2.length-1)?",":"\n";
			System.out.print(numArr2[i]+str);
		}
		// 9,7,3,5,1
				
		Arrays.sort(numArr2); // 오름차순 정렬
		
		System.out.println("=== 정렬후 ====");
		for(int i=0; i<numArr2.length; i++) {
			String str = (i<numArr2.length-1)?",":"\n";
			System.out.print(numArr2[i]+str);
		}
		// 1,3,5,7,9
		
		System.out.println("");
		
		System.out.println(Arrays.toString(numArr2));
		// [1, 3, 5, 7, 9]
		
		
		
		
	}// end of main()----------------------------

}
