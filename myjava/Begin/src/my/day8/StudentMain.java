package my.day8;

import java.util.Scanner;

import my.util.MyUtil;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student[] studentArr = new Student[3];
		/* -------------------
		   |  0  |  1  | null |
		   -------------------
		*/
		
		do {
			if(Student.count < studentArr.length) {
				
				String hakbun = "";
				
				boolean isDuplicateHakbun;
				
				do {
					System.out.print(">> 학번 : ");
					hakbun = sc.nextLine();
					
					isDuplicateHakbun = false;
					
					////////// 학번중복검사하기  /////////
					for(int i=0; i<Student.count; i++) {
						if(hakbun.equals(studentArr[i].hakbun)) {
							System.out.println(">> 기존에 사용하는 학번이므로 새로운 학번을 입력하세요!!");
							isDuplicateHakbun = true; // 학번이 중복된 경우
							break;
						}
					} // end of for-------------------
					/////////////////////////////////
				
				} while (isDuplicateHakbun);
				
				System.out.print(">> 암호 : ");
				String passwd =	sc.nextLine();
				
				System.out.print(">> 성명 : ");
				String name = sc.nextLine();
				
				System.out.print(">> 국어 : ");
				int kor = Integer.parseInt(sc.nextLine());
				
				System.out.print(">> 영어 : ");
				int eng = Integer.parseInt(sc.nextLine());
				
				System.out.print(">> 수학 : ");
				int math = Integer.parseInt(sc.nextLine());
				
				if(MyUtil.checkPassword(passwd)) {
					Student student = new Student();
					student.hakbun = hakbun;
					student.passwd = passwd;
					student.name = name;
					student.kor = kor;
					student.eng = eng;
					student.math = math;
					System.out.println("[학생수 "+Student.count+"명 생성/정원 "+studentArr.length+"명]");
					
					studentArr[Student.count - 1] = student;
				}
				else {
					System.out.println(">>> 학생 생성 실패!!");
				}
				
			}
			else {
				System.out.println(">> 정원에 도달했으므로 더이상 학생정보 입력불가함!!"); 
				break;
			}
			
		} while (true); // 학생입력완료---------------
		
		System.out.println(">>> 입력한 학생 정보 보기1 <<<");
		
		for(int i=0; i<studentArr.length; i++) {
			studentArr[i].showStudentInfo();
		}
		
		System.out.println("=================");
		
		System.out.println(">>> 입력한 학생 정보 보기2 <<<");
		
		for(Student st : studentArr) {
			st.showStudentInfo();
		}
		
		System.out.println("\n\n");
		
		System.out.print(">> 검색하실 학번 => ");
		String searchHakbun = sc.nextLine(); 
		
		boolean isSearchHakbun = false;
		
		for(Student st : studentArr) {
			if(st.hakbun.equals(searchHakbun)) {
				st.showStudentInfo();
				isSearchHakbun = true;
				break;
			}
		}// end of for--------------------
		
		if(!isSearchHakbun) {
			System.out.println(">> 검색하시려는 학번 " + searchHakbun + "는 존재하지 않습니다.!!");    
		}
				
		sc.close();
	}// end of main---------------------------------

}
