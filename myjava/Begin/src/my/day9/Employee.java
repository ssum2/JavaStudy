package my.day9;

import java.text.DecimalFormat;

public class Employee {
	
	String name;
	int[] salary;
	
	public void showEmployeeInfo() {
		System.out.println("1. 사원명 : " + name);
		
		int sum = 0;
		for(int i=0; i<salary.length; i++) {
			sum += salary[i];
		}
		
		DecimalFormat df = new DecimalFormat("#,###");
		
		System.out.println("2. 급여합계 : " + df.format(sum) + "만원");
		System.out.println("3. 1달평균급여 : " + df.format(sum/salary.length) + "만원"); 
	}
	
	public int[] getSalary() {
		return salary;
	}
	
	public void updateSalary(int[] newSalary) {
		salary = newSalary;
	}
	
	
}
