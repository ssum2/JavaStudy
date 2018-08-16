package my.day8;

import java.util.Scanner;

import my.util.MyUtil;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student[] studentArr = new Student[3]; // 배열은 사이즈를 한번 정하면 못 늘리는 단점이 있음
		
		
		do { // 학생 입력 시작 -------------------------------------------------------------------
			if(Student.count < studentArr.length) { //객체가 생성된 것보다 배열의 길이가 클 때
				System.out.print(">> 학번 : ");
				String hakbun = sc.nextLine();
				
				System.out.print(">> 암호 : ");
				String passwd = sc.nextLine();
				
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
					
					System.out.println("[학생수 "+Student.count+"명 / 정원 "+studentArr.length+"명]");
					
					studentArr[Student.count-1] = student; // 객체생성된 카운트에서 -1하면 배열의 방번호
				}
				else {
					System.out.println(">>> 학생 생성 실패ㅜㅜ <<<");
				}
				
			} // end of if(Outer)
			
			else { // 배열의 크기보다 카운트가 더 높을 때
				System.out.println("※※ 정원에 도달하여 학생 정보 입력 불가 ※※");
				break;
			}
			
		
		} while (true); // 학생 입력 완료 ------------------------------------------------------------
		
		System.out.println("\n====================================");
		System.out.println(">>> 입력한 학생 정보 보기1: 일반 for문 사용 <<<\n");
		for(int i=0; i<studentArr.length; i++) {
			studentArr[i].showStudentInfo(); // studentArr[] 자체가 하나의 객체이기 때문에 인스턴스메소드 불러올 때 객체처럼 사용
			
		}
		
		System.out.println(">>> 입력한 학생 정보 보기2: 개선된 for문 사용 <<<\n");
		for(Student st : studentArr) { // 배열객체타입 변수 : 배열명
			st.showStudentInfo();
		}
		
		
	} // end of main()

} // end of class
