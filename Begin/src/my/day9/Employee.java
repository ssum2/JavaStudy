package my.day9;

import java.text.DecimalFormat;

public class Employee {
	String name;
	int[] salary; // 월마다의 월급 12개를 배열로 받아옴
	
	public void showEmployeeInfo() {
		System.out.println("--------- 사원 정보 ---------");
		System.out.println("1. 사원명: "+name);
		
		// 2. 급여 합계
		int sum =0;
		for(int j=0; j<salary.length; j++) {
			sum += salary[j];
		}
		
		//3. 급여 평균
//		double avg = Math.round((double)sum/12*10)/10.0;
		int avg = sum/salary.length;
		
		// >> 출력
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println("2. 급여 합계: "+df.format(sum)+"만원");
		System.out.println("3. 1개월 평균 급여: "+avg +"만원");
		
//		System.out.println("cf) 2018년도 월 급여");
//		for(int i=0; i<salary.length; i++) {
//			System.out.println(" - "+(i+1)+"월 급여: "+df.format(salary[i])+"만원");
//		}
		
	}// end of showEmployeeInfo()

	
	// 입력한 급여 값 받아오기
	public int[] getSalary() {
		return salary;
	}
	
	// 급여 값 변경하기
	public void updateSalary(int[] newSalary) {
		salary = newSalary;
	}
	
	
} // end of class
