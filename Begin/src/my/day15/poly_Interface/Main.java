package my.day15.poly_Interface;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student[] studentArr = new Student[3];
		
		studentArr[0] = new Student("kh001", "한석규", 93);	// 학점, 총평은 변수의 직접변경X
		studentArr[1] = new Student("kh002", "두석규", 73);
		studentArr[2] = new Student("kh003", "세석규", 86);
		
//		1. 총평입력
		Scanner sc = new Scanner(System.in);
		for( Student st : studentArr) {
			st.comment(st.getHakbun(), sc);
		}
		
//		2. 총평 입력 후 결과물 출력
		for(Student st : studentArr) {
			st.printInfo();
		}
		
		System.out.println("-------------------------------------");
//		3. 학번 검색 후 정보출력; 내가 한 부분
//		System.out.print(">> 검색하실 학번: ");
//		String searchHakbun = sc.nextLine();
//		for(int i=0; i<studentArr.length; i++) {
//			if(studentArr[i].search(searchHakbun)!=null) {
//				studentArr[i].search(searchHakbun).printInfo();
//				break;
//			}
//		}
		
//		3. 학번 검색 후 정보출력; 강사님이 하신 부분
		System.out.print("▷ 검색하실 학번: ");
		String searchHakbun2 = sc.nextLine();
		Student searchStudent = null;
		for( Student st : studentArr ) {
			searchStudent = st.search(searchHakbun2);
			if(searchStudent!=null) {
				searchStudent.printInfo();
				break;
			}
		}
		if(searchStudent==null)
			System.out.println(">> 검색하신 학번 "+searchHakbun2+"은 존재하지 않습니다. <<");

		sc.close();
	} // end of main()

} // end of class
