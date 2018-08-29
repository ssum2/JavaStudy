package my.day17.Collection;

public class Employee {
	private String deptNo;		// 부서번호
	private String employeeCode;// 사원코드번호
	private String employeeName;// 사원명
	private String position; 	// 직급
	private int salary;			// 급여
	
	
	public Employee() {}
	public Employee(String deptNo, String employeeCode, String employeeName, String position, int salary) {
		this.deptNo = deptNo;
		this.employeeCode = employeeCode;
		this.employeeName = employeeName;
		this.position = position;
		this.salary = salary;
	}
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public String getEmployee() {
		String info ="▷사원코드번호: "+employeeCode+"\n"+
					 "▷부서번호 : "+deptNo+"\n"+
					 "▷사원명 : "+employeeName+"\n"+
					 "▷직급 : "+position+"\n"+
					 "▷급여 : "+salary+"\n";
		return info;
	}

	@Override
	public String toString() {
		String info ="▶사원코드번호: "+employeeCode+"\n"+
					 "▶부서번호 : "+deptNo+"\n"+
					 "▶사원명 : "+employeeName+"\n"+
					 "▶직급 : "+position+"\n"+
					 "▶급여 : "+salary+"\n";
		return info;
	}
	
	
}
