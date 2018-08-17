package my.day9;

import java.util.Arrays;

public class BubbleSort {
	/*
		 >> 버블 정렬(Bubble Sort)
		 정렬 대상 리스트(배열)의 항목을 수평방향으로 나열했다고 가정했을 때, 
		 왼쪽 끝에서부터 시작해서 인접하는 두 항목의 값을 비교하여 
		 올바른 순서(오름차순 또는 내림차순)로 되어있지 않으면 서로 위치를 교환하는 정렬방법이다.
		 
		 이렇게 인접하는 항목의 값을 비교해서 위치를 교환하는 과정을 
		 리스트(배열)의 마지막 항목까지 반복해서 제일 큰(또는 작은) 값이 끝에 오도록 한다.
		 
		 각 회전(Pass)과정이 끝날때마다 정렬은 뒤에서부터 하나씩 완료된다. 

	 */

	public static void main(String[] args) {
		
		int[] numArr = {9,7,3,5,1};
		// 2-1. 정렬 전 값 출력하기
		System.out.println("=== 정렬 전 ===");
		for(int i=0; i<numArr.length; i++) {
			String str = (i<numArr.length-1)? ",":"\n"; // 4보다 작을 때 "," 4 넘어가면(배열끝) 줄바꿈
			System.out.print(numArr[i]+str);
		}
		
		// 오름차순 정렬해서 1,3,5,7,9 로 결과 도출하기
		
		// 5개 값을 두고 비교할 때, 4개만 뽑아서 각 값과 비교해도 됨 (마지막 거는 이미 앞에서 다 비교했으니까 굳이 뽑을 필요 x)
		// 추출대상 개수 => Array.length - 1
		
		//1. 비교할 값 뽑기
		for(int i=0; i<numArr.length-1; i++) { // i == 배열 방번호(0~4)
			for(int j=0; j<numArr.length-1-i; j++) { // 비교 대상 갯수: (배열길이-1)부터 1씩 감소
				// 실제 값은 안쪽 for에서 비교
				
				if(numArr[j]>numArr[j+1]) { // numArr[j]가 더 크면 두 자리를 바꿔
					int temp = numArr[j]; // 1) 얘를 옮기기 위해서는 빈 용기 하나에 기억시켜서 numArr[j]에 다른 값 넣어도 되게끔 함
					numArr[j] = numArr[j+1]; // 2) 비워둔 numArr[j]에 옮길 numArr[j+1]을 넣음
					numArr[j+1] = temp; // 3) numArr[j+1]에 기억시켜뒀던 numArr[j]의 본래 값 temp를 넣음
				} // end of if 

				// # i==0 일때, 1회전 ---------------------------------------------------------
				// 1회전: 9^ 7 3 5 1 -> 7 9^ 3 5 1 -> 7 3 9^ 5 1 -> 7 3 5 9^ 1 -> 7 3 5 1 9^
				//	j값:	  	0	4번   ->	1	3번	  ->  2		2번	->   3	   1번 ->	  1회전 완료!
				//	==> i++ -> i==1
				// ------------------------------------------------------------------------
				// # i==1일때, 2회전
				// 2회전: 7 3 5 1 9 -> 3 7^ 5 1 9 -> 3 5 7^ 1 9 -> 3 5 1 7^ 9
				// ==> i++ -> i==2
				// ------------------------------------------------------------------------
				// # i==2일때, 3회전
				// 3회전: 3^ 5 1 7 9 -> 3 1 5^ 7 9 -> 3 1 5 7 9
				// ==> 2번 반복 ==> i++ -> i==3
				// ------------------------------------------------------------------------
				// # i==3일때, 4회전
				// 4회전: 3^ 1 5 7 9 -> 1 3 5 7 9
				// ==> 1번 반복 ==> i++ -> i==4 --> numArr.length-1값과 동일해서 false => 바깥for문 빠져나감
				
			}// end of for(내부): 열(n회전 내에서 비교대상과 비교하는 횟수)
			
		} // end of for(외부): 행(n회전; 메인비교값 뽑는 횟수)
		
		// 2. 정렬한 값 출력하기
		System.out.println("\n=== 정렬 후 ===");
		for(int i=0; i<numArr.length; i++) {
			String str = (i<numArr.length-1)? ",":"\n"; // 4보다 작을 때 "," 4 넘어가면(배열끝) 줄바꿈
			System.out.print(numArr[i]+str);
		}
		// 1, 3, 5, 7, 9
		
		
		
		
		//========= 버블정렬 2 =========
		System.out.println("\n========================");
		int[] numArr2 = {9,7,3,5,1};
		
		System.out.println("=== 정렬 전 ===");
		System.out.println(">> for문을 이용한 버블sort");
		for(int i=0; i<numArr2.length; i++) {
			String str = (i<numArr2.length-1)? ",":"\n";
			System.out.print(numArr2[i]+str);
		}
		
		System.out.println("\n>> Arrays.toString");
		String str2 = Arrays.toString(numArr2); 
		// Arrays.toString(배열명); ==> String값으로 출력 -> [배열 안의 값1, 값2, 3, 4...]
		System.out.println(str2);
		// [9, 7, 3, 5, 1]
		
		System.out.println("\n=== 정렬 후 ===");
		
		
		// >> 위에 쓴 그 for문 가져와야함
		System.out.println("\n>> Arrays.sort -> Arrays.toString");
		Arrays.sort(numArr2); // return타입이 void, 오름차순 정렬
		System.out.println(Arrays.toString(numArr2));
		// [1, 3, 5, 7, 9]
		
		System.out.println(">> for문을 이용한 버블sort");
		for(int i=0; i<numArr2.length; i++) {
			String str = (i<numArr2.length-1)? ",":"\n";
			System.out.print(numArr2[i]+str);
		}
		
		
		
		
		
		
	} // end of main()

} // end of class
