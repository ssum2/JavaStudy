package my.day14.Inheritance_ex2;

public class Main {

//	------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		
		Common[] commonArr = new Common[10];		// 학생과 학부모의 값을 넣어줄 공통클래스 Common의 배열 생성
		commonArr[0] = new Common("comm01", "qwer1234$", "공공인", "gong@gmail.com");
		
		commonArr[1] = new Student("stu01", "qwer1234$", "김상원", "kimsw@gmail.com", 	// Common의 요소
								   "hak001", "kim@naver.com", "수상경력 아주 많음");			// Student만 있는 요소
		
		
		commonArr[2] = new Guardian("guard001", "qwer1234$", "상원아빠", "kim@naver.com",
										"회사원", "02-345-4545");
		
		for(int i=0; i<Common.count; i++) {
			if(commonArr[i] instanceof Student) {
				((Student)commonArr[i]).showInfo();
			}
			else if(commonArr[i] instanceof Guardian) {
				((Guardian)commonArr[i]).showInfo();
			}
		}
		
		System.out.println("------------------------------------------");
		
		for(int i=0; i<Common.count; i++) {
			commonArr[i].showInfo(); 	
			// 부모클래스와 자식클래스가 동일한 껍데기의 메소드가 있으면 자식클래스의 것이 오버라이딩됨(덮어쓰기)
			// 메소드명이 다르면 새로운 메소드라 인식하기 때문에 >> 메소드 윗줄에 @Override 표기해주면 메소드오타를 발견해줌
		}
		
		System.out.println("------------------------------------------");
//		스캐너에서 입력받았다 치고 값 대입
//		> 학생로그인 입력값
		String studentid = "stu01";
		String studentpw = "qwer1234$";
		
//		로그인 검사
		for(int i=0; i<Common.count; i++) {
			commonArr[i].login(studentid, studentpw);
		}
		
		System.out.println("\n\t***\n");
		
//		학생 로그인 검사
		for(int i=0; i<Common.count; i++) {
			if(commonArr[i] instanceof Student) {
				Common common = ((Student)commonArr[i]).login(studentid, studentpw);
				Student stud = (Student)common;
				stud.showInfo();
				
				System.out.println("-------이렇게도 됨 ----------");
//				이미 오버라이딩 되어 있기 때문에 형변환 안해줘도 student에 썼던 메소드대로 나옴
				Common common1 = commonArr[i].login(studentid, studentpw);
				common1.showInfo();
				
				System.out.println("--------이거 될까? 되네---------");
				Student student = (Student)commonArr[i].login(studentid, studentpw);
				student.showInfo();
			}
		}
		
		System.out.println("\n\t***\n");
		for(int i=0; i<Common.count; i++) {
			if(commonArr[i] instanceof Student) {
				commonArr[i].login(studentid, studentpw);
				
			}
		}
		
		
	} // end of main()

} // end of class
