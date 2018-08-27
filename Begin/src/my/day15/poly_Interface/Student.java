package my.day15.poly_Interface;

import java.util.Scanner;

public class Student implements Inter1, Inter2, Inter3 {

	private String hakbun;
	private String name;
	private int point;
	private String hakjum;
	private String comment;
	
	
	public Student() {}
	public Student(String hakbun, String name, int point) {
		super();
		this.hakbun = hakbun;
		this.name = name;
		setPoint(point); 	// point, hakjum 둘다 값을 초기화해주는 메소드 호출
	}
	public Student(String hakbun, String name, int point, String hakjum, String comment) {
		super();
		this.hakbun = hakbun;
		this.name = name;
		this.point = point;
		this.hakjum = hakjum;
		this.comment = comment;
	}

	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		if(hakbun != null && !hakbun.trim().isEmpty())
			this.hakbun = hakbun;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		if(point<0)
			this.point=0;	// point에 음수가 들어왔을 때 기본값 설정
		else if(point > 100)
			this.point=100;	// point에 100초과되는 값이 들어왔을 때 기본값 설정
		else
			this.point = point;
	
		switch (this.point/10) {	// 위에서 걸러준 this.point로 판별해야함
			case 10:
			case 9:
				hakjum = "A";
				break;
			case 8:
				hakjum = "B";
				break;
			case 7:
				hakjum = "C";
				break;
			case 6:
				hakjum = "D";
				break;
			default:
				hakjum = "F";
				break;
			}
	}

	public String getHakjum() {		// setHakjum은 빼야함(point에 따라서 달라져야하기 때문)
		return hakjum;
	}


	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public void printInfo() {
		System.out.println("1. 학번: "+hakbun);
		System.out.println("2. 이름: "+name);
		System.out.println("3. 점수: "+point);
		System.out.println("4. 학점: "+hakjum);
		System.out.print("5. 총평: ");
		System.out.println(comment+"\n");
	}
	
	
	
	@Override
	public Student search(String hakbun) {
		Student student = null;
		if(hakbun !=null && hakbun.equals(this.hakbun))
			student = this;	// this는 Student 객체
		
		return student;
	}
	
	@Override
	public void comment(String hakbun, Scanner sc) {
		Student student = search(hakbun);	
	//	위의 메소드를 호출 -> student 객체를 넘겨받음 -> point를 조회할 수 있음
		
		if(student != null) {
			System.out.println("1. 이름: "+student.name);
			System.out.println("2. 점수: "+student.point);
//			student.printInfo(); 이렇게 해도 되지 않을까?
			
			System.out.println(">> 총평을 입력하세요(입력종료; 엔터 후 exit을 입력하세요) <<");
			System.out.print(">> ");
			StringBuilder sb = new StringBuilder();		// 얼만큼 입력할지 모르기 때문에...
			String str="";
			
			do {
				str = sc.nextLine();
			
				if("exit".equalsIgnoreCase(str.trim()))	// exit의 대소문자 구분X, 좌우공백은 자동삭제
					break;
				else
					sb.append(str+"\n");
//					StringBuilder에 str에 들어오는 것들을 쌓아두는 메소드
			} while (true);
			
			student.comment = sb.toString();	
//			StringBuilder에 쌓인 것을 String타입으로 변환해서 student객체의 comment에 저장
		}
		else {
			System.out.println(">> 존재하지 않는 학생입니다. 총평을 입력할 수 없습니다. <<");
		}
		
	}
	

	

}
