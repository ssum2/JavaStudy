package my.day17.Collection;

import java.util.*;

public class EmployeeMain implements InterEmployee {
// ※List와 Map의 혼합형태 (가장 많이 사용)
	@Override
	public String showDeptInfo(Map<String, List<Employee>> map, String deptNo) {
		String info="";
		
		List<Employee> empList = map.get(deptNo);
		if(empList!=null) {
			StringBuilder sb =new StringBuilder();
			for(Employee emp :empList) {
				sb.append(emp.getEmployee()+"\n");
			}
			info = sb.toString();
		}
		else{
			info=">> 검색하신 부서번호 "+deptNo+"은 존재하지 않습니다";
		}
	
		return info;
		
		/* 내가 한 부분
		List<Employee> empList = map.get(deptNo);

		System.out.println("1) 개선된 for문으로 출력하기");
		if(empList!=null) {
			for(Employee em : empList) {
				System.out.println(em.getEmployee());
			}
		}else
			System.out.println(">> 검색하신 부서번호 "+deptNo+"은 존재하지 않습니다");
		*/
	}
	
	@Override
	public void changePosition(Map<String, List<Employee>> map, String changeDeptno, String changePosition) {
		List<Employee> changeEmpList = map.get(changeDeptno);
//		↑ map.get(변경할 부서번호)에 담겨있는 Employee형태의 List를 changeEmpList에 담아줌
		
		if(changeEmpList!=null) {
//			↓ changeEmpList 안에 있는 Employee형의 객체 각각에서 position멤버변수 내용을 바꿔줌(setPosition())
			for(Employee em:changeEmpList) {
				em.setPosition(changePosition);
			}
			System.out.println("\n>> 직급 변경 완료!");
		}
		else {
			System.out.println("\n>> 검색하신 부서번호 "+changeDeptno+"은 존재하지 않습니다");
		}
		System.out.println("\n*** 아래와 같이 변경 되었습니다 ***");
		System.out.println(showDeptInfo(map, changeDeptno));
	}
	
	@Override
	public void changeSalary(Map<String, List<Employee>> map, String changeDeptno, double percent) {
		List<Employee> changeEmpList = map.get(changeDeptno);
		
		if(changeEmpList!=null) {
			for(Employee em:changeEmpList) {
				em.setSalary((int)(em.getSalary()+em.getSalary()*percent*0.01));
			}
			System.out.println("\n>> 급여 변경 완료!");
		}
		else
			System.out.println("\n>> 검색하신 부서번호 "+changeDeptno+"은 존재하지 않습니다");
		System.out.println("\n*** 아래와 같이 변경 되었습니다 ***");
		System.out.println(showDeptInfo(map, changeDeptno));
	}

	@Override
	public void changePosition2(Map<String, List<Employee>> map, String changeDeptno, String employeeCode,
			String changePosition) {
		List<Employee> cgEmpList = map.get(changeDeptno);
		
		if(cgEmpList!=null) {
			for(Employee em:cgEmpList) {
				if(employeeCode.equals(em.getEmployeeCode())) {
					em.setPosition(changePosition);
					System.out.println("\n>> 직급 변경 완료!");
					System.out.println(em.getEmployee());
					break;
				}
				else {
					System.out.println("\n#### 검색하신 사원번호와 일치하는 사원이 없습니다ㅜㅜ");
					break;
				}		
			}
		}
		else {
			System.out.println("\n>> 검색하신 부서번호 "+changeDeptno+"은 존재하지 않습니다");
		}	
	}
	
	public void changePosition3(Map<String, List<Employee>> map, String employeeCode, String changePosition) {
		Set<String> keysets = map.keySet();
		boolean flag = false;
		String realKey = "";
		
		for(String key : keysets) {
			List<Employee> empList=map.get(key);
			for(Employee emp : empList) {
				if(emp.getEmployeeCode().equals(employeeCode)) {
					emp.setPosition(changePosition);
					realKey = key;
					flag=true;
					break;
				}
			} // end of inner for
			if(flag) {
				System.out.println(">> 직급 변경이 완료 되었습니다! <<");
				System.out.println(showDeptInfo(map, realKey));
				break;
			}
		} // end of outer for
	} // end of method
	
	
	@Override
	public void changeSalary2(Map<String, List<Employee>> map, String changeDeptno, String employeeCode,
			double percent) {
		List<Employee> changeEmpList = map.get(changeDeptno);
		if(changeEmpList!=null) {
			for(Employee em:changeEmpList) {
				if(employeeCode.equals(em.getEmployeeCode())) {
					em.setSalary((int)(em.getSalary()+em.getSalary()*percent*0.01));
					System.out.println("\n>> 급여 변경 완료!");
					System.out.println(em.getEmployee());
					break;
				}
				else {
					System.out.println(">> 검색하신 사원번호와 일치하는 사원이 없습니다.");
					break;
				}
				
			} // end of for
			
		}
		else
			System.out.println("\n>> 검색하신 부서번호 "+changeDeptno+"은 존재하지 않습니다");
	}

	public static void main(String[] args) {
		/*
		 	ex) 조회할 부서번호: 10 Enter
		 		> 10번 부서에 근무하는 사원들만 출력해줘야함
		 		
		 	ex2) 조회할 부서번호: 20 Enter
		 		> 20번 부서에 근무하는 사원들만 출력해줘야함	
		 */
		
		Map<String, List<Employee>> map = new HashMap<String, List<Employee>>();
//		Map<key type, value(List<Employee type>~~)> = new HashMap<key, values>();
//		key값을 주면 Employee가 저장된 저장소를 value로...
		
		
		List<Employee> list_10=new ArrayList<Employee>();
		List<Employee> list_20=new ArrayList<Employee>();
		List<Employee> list_30=new ArrayList<Employee>();
		
		
		list_10.add(new Employee("10", "kh10001", "강동원", "부장", 1000));
		list_10.add(new Employee("10", "kh10002", "박보검", "과장", 1500));
		list_10.add(new Employee("10", "kh10003", "서강준", "대리", 2000));
		
		list_20.add(new Employee("20", "kh20001", "김무열", "부장", 5000));
		list_20.add(new Employee("20", "kh20002", "조정석", "과장", 4000));
		list_20.add(new Employee("20", "kh20003", "박서준", "대리", 3000));
		list_20.add(new Employee("20", "kh20004", "차은우", "사원", 2000));
		
		list_30.add(new Employee("30", "kh30001", "조우진", "부장", 6000));
		list_30.add(new Employee("30", "kh30002", "임시완", "과장", 5500));

		map.put("10", list_10);
		map.put("20", list_20);
		map.put("30", list_30);
		
		EmployeeMain empMain = new EmployeeMain();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print(">> 조회할 부서번호: ");
		String searchDeptno = sc.nextLine();
		
//		>> 내가 메소드 만들어서 한 부분
//		StringBuilder str = new StringBuilder();
//		str.append(empMain.showDeptInfo(map, searchDeptno));
		
//		>> 강사님이 해주신 부분
		System.out.println(empMain.showDeptInfo(map, searchDeptno));
		
////		#map에 넣어준 값 출력하기
////		List에 해당 map의 키 값과 일치하는 것만 넣어줌
//		List<Employee> empList = map.get(searchDeptno);
//
////		위에서 만든 리스트를 출력
//		System.out.println("1) 개선된 for문으로 출력하기");
//		if(empList!=null) {
//			for(Employee em : empList) {
//				System.out.println(em.getEmployee());
//	//			System.out.println(em);		>> toString을 override했기 때문에 객체만 써도 포맷대로 나옴
//			}
//		}else
//			System.out.println(">> 검색하신 부서번호 "+searchDeptno+"은 존재하지 않습니다");
//		
//		
//		System.out.println("\n2) 일반 for문으로 출력하기");
//		if(empList!=null) {
//			for(int i=0; i<empList.size(); i++) {
//				System.out.println(empList.get(i).getEmployee());
//			}
//		}else
//			System.out.println(">> 검색하신 부서번호 "+searchDeptno+"은 존재하지 않습니다");
		
		
		System.out.println("\n----------------------------------------\n");
		System.out.print(">> 직급을 변경하려는 부서번호: ");
		String changeDeptno = sc.nextLine();

		System.out.print(">> 변경할 직급: ");
		String changePosition = sc.nextLine();
		
		empMain.changePosition(map, changeDeptno, changePosition);
		
		/* 메소드화 하기 전
		List<Employee> changeEmpList = map.get(changeDeptno);
		
		if(changeEmpList!=null) {
			for(Employee em:changeEmpList) {
				em.setPosition(changePosition);
			}
		}
		else {
			System.out.println(">> 검색하신 부서번호 "+changeDeptno+"은 존재하지 않습니다");
		}
			
		System.out.println("\n*** 아래와 같이 변경 되었습니다 ***");
		System.out.println(empMain.showDeptInfo(map, changeDeptno));
		*/
		
	
//		System.out.println("\n*** 아래와 같이 변경 되었습니다 ***");
//		System.out.println(empMain.showDeptInfo(map, changeDeptno));

//		#과제1: 부서 전체 급여 변경
		System.out.print(">> 급여를 변경하려는 부서번호: ");
		changeDeptno = sc.nextLine();
		System.out.print(">> 반영할 급여인상률(실수로 입력): ");
		double percent = Double.parseDouble(sc.nextLine());
		empMain.changeSalary(map, changeDeptno, percent);
		
		
		System.out.println("-------------------------------------");

		System.out.print(">> 사원번호: ");
		String employeeCode = sc.nextLine();
		
		System.out.print(">> 변경할 직급: ");
		changePosition = sc.nextLine();
		empMain.changePosition3(map, employeeCode, changePosition);
		
		
//		#혼자해보는 것 >> depth를 더 넣어서 부서 > 직원 > 변경
		System.out.print(">> 직급을 변경하려는 직원의 부서번호: ");
		String changeDeptno1 = sc.nextLine();
		
		System.out.print(">> 사원번호: ");
		employeeCode = sc.nextLine();
		
		System.out.print(">> 변경할 직급: ");
		String changePosition1 = sc.nextLine();
		
		empMain.changePosition2(map, changeDeptno1, employeeCode, changePosition1);
		
		
		System.out.print(">> 급여를 변경하려는 직원의 부서번호: ");
		changeDeptno = sc.nextLine();
		
		System.out.print(">> 사원번호: ");
		employeeCode = sc.nextLine();
		
		System.out.print(">> 반영할 급여인상률(실수로 입력): ");
		percent = Double.parseDouble(sc.nextLine());
		
		empMain.changeSalary2(map, changeDeptno, employeeCode, percent);

	} // end of main()

} // end of class
