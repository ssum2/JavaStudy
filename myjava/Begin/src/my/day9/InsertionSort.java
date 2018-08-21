package my.day9;

import java.util.Arrays;

/*
 삽입 정렬(insertion sort)은 자료 배열의 모든 요소를 앞에서부터 
 차례대로 이미 정렬된 배열 부분과 비교하여, 자신의 위치를 찾아 삽입함으로써 
 정렬을 완성하는 알고리즘이다. 
 이 알고리즘은 특성상, 기준의 왼쪽 값들은 모두 정렬이 되어있다.
 */

public class InsertionSort {

	public static void sortResult(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			if(i==0) 
				System.out.print("["+arr[i]+", ");
			else if(i < arr.length -1) 
				System.out.print(arr[i]+", ");
			else
				System.out.println(arr[i]+"]");
		}
	}
	
	
	public static void main(String[] args) {

		int[] numArr = new int[]{3,7,2,5,1,4};

		for(int i=1; i<numArr.length; i++){ // 1 ~ 5        
		    int standard = numArr[i];  // 기준값
		    int idx = i-1; // 기준값과 비교할 배열의 방번호
		    
		    for(idx=i-1; idx>=0; idx--){ // i-1 ~ 0   idx는 매번 1씩 감소한다.   
		        if(numArr[idx] > standard){ // 기준값과 값을 비교함.
		        	                        // 오름차순 ; numArr[idx] > standard;
		                                    // 기준값 보다 numArr[idx]값이 크면 numArr[idx]값을 오른쪽으로 한칸씩, 큰값을 계속 뒤로
		                                    // 내림차순 ; numArr[idx] < standard; 
		                                    // 기준값보다 numArr[idx]값이 작으면 numArr[idx]값을 오른쪽으로 한칸씩, 작은값을 계속 뒤로 
		            numArr[idx+1] = numArr[idx];                
		        }else{
		            break; //반복문 빠져나감
		        }              
		    }// end of for(내부)-----------------
		    
		    numArr[idx+1] = standard; 
		    // break문이나 for문을 빠져나온 idx는 standard값을 넣을 인덱스에 
		    // idx--가 된 상태이기 때문에 +1을 해준다. 
		    // 예를들어, idx값이 -1 이 될 경우가 있으므로. 
		    // (idx--된후에 조건식을 만나기때문에)
		   
		}// end of for(외부)---------------------
		       
		// 메소드를 만들어서 출력
		InsertionSort.sortResult(numArr);
		
		// 기존에 만들어진 API를 이용하여 배열을 출력
		System.out.println(Arrays.toString(numArr));

	}

}



