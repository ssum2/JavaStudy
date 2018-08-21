package my.day9;

import java.util.Arrays;
import java.util.Collections;

/*
	>> 선택 정렬(Selection Sort)은 (오름차순을 기준으로)
	전체 원소 중에서 가장 작은 원소를 찾아서 선택하여 첫 번째 원소와 자리를 교환한다.
	그 다음 두 번째로 작은 원소를 찾아 선택하여 두 번째 원소와 자리를 교환한다.
	그 다음에는 세 번째로 작은 원소를 찾아서 세 번째 원소와 자리를 교환한다.
	이 과정을 반복하면서 정렬을 완성한다.
*/

public class SelectionSort {

	public static void main(String[] args) {

        int[] numArr = {9, 7, 3, 5, 1};
       
        int temp = 0;    // 데이터 Swap용 임시 변수
        int minindex = 0;
        
        for(int i=0; i<numArr.length-1; i++) {
        	minindex = i;
        	for(int j=i; j<numArr.length; j++) {               
            	if(numArr[minindex] > numArr[j]) { //오름차순 ; 큰수를 뒤로
                    minindex = j;    // 제일 적은값을 가지는 장소를 표시하기 위한 용도
                }
            }// end of for(내부)-----------------------
            
        	if(minindex != i) {
        		temp = numArr[i];
        		numArr[i] = numArr[minindex];
        		numArr[minindex] = temp;
        	}
            
        	System.out.print("\r\n"+(i+1) + "번째 비교결과 : ");
        	for(int n=0; n<numArr.length; n++) {
        		if(n==0) 
        			System.out.print("["+numArr[n]+", ");
        		else if(n < numArr.length - 1)
        			System.out.print(numArr[n]+", ");
        		else if(n == numArr.length - 1)
        			System.out.print(numArr[n]+"]");
        	}
        	
        }// end of for(외부)-----------------------
               
        System.out.println("\r\n====== 최종정렬 결과 ======");
        for(int n=0; n<numArr.length; n++) {
    		if(n==0) 
    			System.out.print("["+numArr[n]+", ");
    		else if(n < numArr.length - 1)
    			System.out.print(numArr[n]+", ");
    		else if(n == numArr.length - 1)
    			System.out.print(numArr[n]+"]");
    	}
        
        System.out.println("\r\n====== 이미 만들어진 API를 이용한 최종정렬 결과 ======");
        int[] numArr2 = {9, 7, 3, 5, 1};
        Arrays.sort(numArr2);     
        System.out.println(Arrays.toString(numArr2)); 
        // [1, 3, 5, 7, 9]
        
        String[] nameArr = {"이순신","강감찬","김유신","유관순"};
        Arrays.sort(nameArr);     //이미 만들어진 API를 이용하면 쉽게 정렬할수있음.
        System.out.println(Arrays.toString(nameArr));
        // [강감찬, 김유신, 유관순, 이순신]
        
        Arrays.sort(nameArr, Collections.reverseOrder());
        System.out.println(Arrays.toString(nameArr));
        // [이순신, 유관순, 김유신, 강감찬]
        
	}

}
