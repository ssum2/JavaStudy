package my.day17.Collection;

import java.util.List;
import java.util.Map;

public interface InterEmployee {
	String showDeptInfo(Map<String, List<Employee>> map, String deptNo);
//									저장소				  검색 부서번호
	void changePosition(Map<String, List<Employee>> map, String changeDeptno, String changePosition);

	void changeSalary(Map<String, List<Employee>> map, String changeDeptno, double percent);
	// percent : 임금인상률 ==> 12.5%

	
	
	void changePosition2(Map<String, List<Employee>> map, String changeDeptno, String employeeCode, String changePosition);
	void changeSalary2(Map<String, List<Employee>> map, String changeDeptno, String employeeCode, double percent);
}
