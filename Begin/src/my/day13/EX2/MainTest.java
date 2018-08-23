package my.day13.EX2;

public class MainTest {

	public static void main(String[] args) {
		
		Sungjuk[] sungjukArr = new Sungjuk[3];
		
//		1. 쓰고싶은 변수가 들어있는 클래스의 객체를 생성한다 (성적클래스를 뽑고싶은데 거기에 student형 값이 있기 때문에 얘부터 해야함)
		Student st1 = new Student(); // 생략되어있는 기본생성자가 public이니까 메인에서 생성 가능
//		2. 해당 객체 안에 있는 set메소드를 이용해 변수값을 설정해준다
		st1.setHakbun("kh001");
		st1.setName("한석규");
		st1.setMobile("01077771111");
		
//		1. 쓰고싶은 변수가 들어있는 클래스의 객체를 생성한다		
		Sungjuk sj1 = new Sungjuk(); // 생략되어있는 기본생성자가 public이니까 메인에서 생성 가능
//		2. 해당 객체 안에 있는 set메소드를 이용해 변수값을 설정해준다
		sj1.setStudent(st1);
		sj1.setKor(90);
		sj1.setEng(91);
		sj1.setMath(93);
		
// 		※student에 들어갈 값들이 잘못되어서 null값일 경우에 아예 배열에도 들어가지 않도록 조건을 걸어줌
		if(sj1.getStudent() != null) 
			sungjukArr[0] = sj1; // 궁극적으로 출력하고자 하는 것이 성적 배열에 넣을 Sungjuk클래스 형태의 값!
		
		
		Student st2 = new Student();
		st2.setHakbun(""); 
		st2.setName("    ");
		st2.setMobile("01077772222");
			
		Sungjuk sj2 = new Sungjuk(); 
		sj2.setStudent(st2);
		sj2.setKor(80);
		sj2.setEng(81);
		sj2.setMath(83);
		
//		> student에 들어간 값이 null이더라도 sj2 객체가 생성되었기 때문에 배열 안에 들어가긴 함 => 그래서 조건 걸어야함
		if(sj2.getStudent() != null)
			sungjukArr[1] = sj2; // 위에 공백, 비어있는 값 때문에 student가 null이어서 배열에 안 들어감
		
		
		System.out.println(sungjukArr[0].getHakjum()); // A
//		System.out.println(sungjukArr[1].getHakjum()); NullpointerEx~~!
		
		System.out.println("------------------");
		
		System.out.println(sungjukArr[0].getStudent().getName());
//		System.out.println(sungjukArr[1].getStudent().getName());
//		>> 이 경우에는 studnet가 null 상태이기 때문에 NullPointerException 뜸
		
//		-------------------------------			
		Student st3 = new Student();
		st3.setHakbun("kh003"); 
		st3.setName("세석규");
		st3.setMobile("01077773333");
			
		Sungjuk sj3 = new Sungjuk(); 
		sj3.setStudent(st3);
		sj3.setKor(80);
		sj3.setEng(81);
		sj3.setMath(83);
		
		if(sj3.getStudent() != null)
			sungjukArr[1] = sj3;
//		-------------------------------		
		Student st4 = new Student();
		st4.setHakbun("kh004"); 
		st4.setName("네석규");
		st4.setMobile("01077774444");
			
		Sungjuk sj4 = new Sungjuk(); 
		sj4.setStudent(st4);
		sj4.setKor(70);
		sj4.setEng(71);
		sj4.setMath(73);
		
		if(sj4.getStudent() != null)
			sungjukArr[2] = sj4;
//		-------------------------------	과제
		/*
	 	한석규	90	91	93	평균	A
	 	세석규	80	81	83		B
	 	네석규	70	71	84		C
		*/
		
		System.out.println("\n>> 학생 성적 입력 완료! <<");
		
		System.out.println("\n----------------------------------------------------");
		System.out.println("학생명	국어	영어	수학	총점	평균	학점");
		System.out.println("----------------------------------------------------");
		System.out.println(sungjukArr[0].getStudent().getName()+"\t"
						  +sungjukArr[0].getKor()+"\t"
						  +sungjukArr[0].getEng()+"\t"
						  +sungjukArr[0].getMath()+"\t"
						  +sungjukArr[0].getTotal()+"\t"
						  +sungjukArr[0].getAvg()+"\t"
						  +sungjukArr[0].getHakjum());
		System.out.println(sungjukArr[1].getStudent().getName()+"\t"
						  +sungjukArr[1].getKor()+"\t"
						  +sungjukArr[1].getEng()+"\t"
						  +sungjukArr[1].getMath()+"\t"
						  +sungjukArr[1].getTotal()+"\t"
						  +sungjukArr[1].getAvg()+"\t"
						  +sungjukArr[1].getHakjum());
		System.out.println(sungjukArr[2].getStudent().getName()+"\t"
						  +sungjukArr[2].getKor()+"\t"
						  +sungjukArr[2].getEng()+"\t"
						  +sungjukArr[2].getMath()+"\t"
						  +sungjukArr[2].getTotal()+"\t"
						  +sungjukArr[2].getAvg()+"\t"
						  +sungjukArr[2].getHakjum());
		System.out.println("----------------------------------------------------\n");
		
//		과제: 강사님이 해주신 부분; 개선된 for문 사용!
		for(Sungjuk sj : sungjukArr) {
			String info = sj.getStudent().getName()+"\t"+
			sj.getKor()+"\t"+
		    sj.getEng()+"\t"+
			sj.getMath()+"\t"+
		    sj.getTotal()+"\t"+
			sj.getAvg()+"\t"+
		    sj.getHakjum()+"\t";
			System.out.println(info);
		}
		
	} // end of main()

} // end of class
