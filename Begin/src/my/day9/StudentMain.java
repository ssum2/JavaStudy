package my.day9;

import java.util.Scanner;

import my.util.MyUtil;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student[] studentArr = new Student[3]; // 배열은 사이즈를 한번 정하면 못 늘리는 단점이 있음
		/*
		 	=========================
		 	|	0	|	1	|	2	|
		 	=========================
		 	2번방에 값이 없어 null 상태 일 때, 여기랑 비교하면 null point 예외오류 뜸
		 
		 */
		
		
		
		
		do { // 학생 입력 시작 -------------------------------------------------------------------
			if(Student.count < studentArr.length) { //객체가 생성된 것보다 배열의 길이가 클 때
				
				// ============= 1. 학번 객체가 생성되기 전에 학번을 검사 ==============
				// 이미 배열 속에 저장되어있는 값과 내가 입력할 sc.nextLine()의 값을 비교해야함
				// => 비교 대상인 배열이 특정되어 있기 때문에 메인 메소드에서 처리 해야함(MyUtil에 메소드로 빼서 쓸 수 없음)
				
				String hakbun = "";
				
				boolean isDuplicateHakbun;
				// 학번의 중복여부를 알려주는 불린형 변수
				// 불린형변수는 일반적으로 기본값을 false로 지정하지만 true로 주고 만들어도 상관X
				
				do {
					
					System.out.print(">> 학번 : ");
					hakbun = sc.nextLine();
					
					isDuplicateHakbun = false;
					// 변수 선언은 do-while문 바깥에서 하고 초기화는 do안에 처음으로 해줘야
					// 중복검사 한번하고 다시 올라왔을 때 재설정 가능!
					
					//------------- 학번 중복 검사 하기 -------------
					 	
					 for(int i=0; i<Student.count; i++){ 
						 // 만들어진 학생과 비교해야 하기 때문에 비교대상이 Student.count가 되어야함
						 // ex. 첫번째 학생은 Student.count ==0이기 때문에 0<0 -> false => 검사 안함
						 
						if(hakbun.equals(studentArr[i].hakbun)) {
							// 입력받은 hakbun변수값과 기존에 존재하는 학번값 객체studentArr[i].hakbun를 비교
							System.out.println(">> 이미 존재하는 학번이므로 새로운 학번을 입력하세요 <<");
							
							isDuplicateHakbun = true; //중복되었을 때 불린 값을 바꿔줌
							break; // 첫번째에서 같다고 나오면 두번째거랑은 비교할 필요가 없어지기 때문에 break로 빠져나가게 함
							
						} // end of if
						 
					 }	// end of for()
					 	
					 // 학번 검사 후 중복이었을 때, 다시 위로 올라가게 해야함 (학번을 다시 입력하도록)
					 // ===> 학번부분 통째로 잡아서 do-while
					 //---------------------------------------
				 
				 
				} while (isDuplicateHakbun); 
					
				// isDuplicateHakbun이 기본값이 false이기 때문에 if 안의 연산을 하지 않았을 때
				// while로 떨어지면 false여서 do-while문을 빠져나가서 아래 암호~ 연산을 시작함
				 
				
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
		
		System.out.println("\n\n====================================");
		// 특정 학번의 학생만 출력하기
		
		//-------------- 학번 검색 ----------------
		
		
		// 1) 내가 한 것 : 그냥 for문 안으로 넣어버림------------------------------
//		for(Student sth : studentArr) { // 개선된 for문 사용 (객체타입과 객체선언(sth) 그리고 배열과의 비교를 동시에)
//			System.out.print(">> 검색하실 학번 => ");
//			String searchHakbun = sc.nextLine();
//			if(sth.hakbun.equals(searchHakbun)) { //sth.hakbun과 유저가 입력할 searchHakbun을 비교
//				sth.showStudentInfo();
//				break;
//				
//			} // end of if
//			else {
//				System.out.println(">> 검색하신 학번과 일치하는 학생정보는 없습니다 <<");
//				continue;
//			}
//			
//		} // end of for
		
		
		// 2) 강사님이 한 것 : 식별자(boolean값 설정)로 표식 만들어서 하기---------------
		
		System.out.print(">> 검색하실 학번 => ");
		String searchHakbun = sc.nextLine();
		
		boolean isSearchHakbun = false; 
		
		for(Student sth : studentArr) { // 개선된 for문 사용 (객체타입과 객체선언(sth) 그리고 배열과의 비교를 동시에)
			
			if(sth.hakbun.equals(searchHakbun)) { //sth.hakbun과 유저가 입력할 searchHakbun을 비교
				sth.showStudentInfo();
				isSearchHakbun = true;
				break;
				
			} // end of if
			
		} // end of for
		
		if(!isSearchHakbun) { //isSearchHakbun이 ture여서 !연산으로 not이 되어 해당 조건과 일치할때 실행
			System.out.println(">> 입력하신 "+searchHakbun+"과 일치하는 학생정보는 없습니다 <<");
		}
		
		
		
		sc.close();
		
	} // end of main()

} // end of class
