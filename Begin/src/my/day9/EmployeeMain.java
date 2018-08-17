package my.day9;

import java.util.Arrays;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.name ="차은우";
//		emp1.salary = new int[12]; // int타입의 배열 12칸 지정
		emp1.salary = new int [] {100,200,300,400,500,600,700,800,900,1000,1100,1200}; // 배열 객체 생성과 동시에 값 부여
		
		Employee emp2 = new Employee();
		emp2.name ="박보검";
		emp2.salary = new int [] {100,200,300,400,500,600}; // 6개월치 급여

		Employee emp3 = new Employee();
		emp3.name ="서강준";
		emp3.salary = new int [] {100,200,300,400}; // 4개월치 급여
		
		Employee[] empArr = {emp1, emp2, emp3};
		
		emp1.showEmployeeInfo();
		// java.lang.NullPointerException >> Employee.salary 의 경우 배열을 생성자로 객체 생성 안해서 오류
		/*
		 	1. 사원명: 차은우
			2. 급여 합계: 7,800만원
			3. 1개월 평균 급여: 650만원
		 */
		
		// 일반  for문 사용하여 사원 전체 출력하기
		System.out.println("\n\n1) 내가 한 것: 일반 for문 사용하여 사원 전체 출력");
		for(int i=0; i<empArr.length; i++) {
			empArr[i].showEmployeeInfo();
			System.out.println("-------------------------\n");
		}
		
		// 개선된 for문 사용해서 사원 전체 출력하기
		System.out.println("\n2) 강사님이 한 것: 개선된 for문 사용하여 사원 전체 출력");
		for(Employee e: empArr) {
			e.showEmployeeInfo();
			System.out.println("");
		}
		System.out.println("\n=============================================");
		System.out.println(">> 특정 객체의 월급 값 받아오기");
		int[] salArr =emp3.getSalary(); // int[] 타입으로 받아와서 출력하기
		for(int i=0; i<salArr.length; i++) {
			String str = (i<salArr.length-1)? ",":"";
			System.out.print(salArr[i]+str);
		}
		//=> 100, 200, 300, 400 	
		
		System.out.println("\n\n=============================================");
		System.out.println(">> 특정 객체의 월급여 값을 변경했을 때");
		
		// 변경
		int[] newSalary = new int[] {110, 220, 330, 440};
		
		emp3.updateSalary(newSalary);
		
		// 출력
		salArr =emp3.getSalary(); 
		for(int i=0; i<salArr.length; i++) {
			String str = (i<salArr.length-1)? ",":"";
			System.out.print(salArr[i]+str);
		}
		// => 110, 220, 330, 440

	} // end of main()

} // end of class
