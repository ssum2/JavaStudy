package my.day3;

public class InitialBlockTest {

	String userid;           // 속성(property)
	String pwd;              // 속성(property)
	String name = "한석규";   // 속성(property)
	
	static int point;
	
	/*
	    == 인스턴스 변수의 초기화 순서 ==
	     1.JVM 기본값 --> 2.명시적 초기화 --> 3.인스턴스 초기화 블럭 --> 4.파라미터가 있는 생성자   
	 */
	
	/* == 클래스 초기화 블럭 ==
	      클래스 초기화 블럭은 해당 클래스가 처음으로 실행될때 딱 1번만
	      자동으로 실행시켜주는 것이다.     
    */
	static {  // 클래스 초기화 블럭 
		System.out.println("== InitialBlockTest 의 클래스초기화 블럭 실행함 ==");
		point = 10;
	}
	
	/*
	   == 인스턴스 초기화 블럭 ==
	      모든 생성자에서  공통적으로 수행되어져야할 코드가 있는 경우라면
	      각각의 생성자마다 중복되게 만들지(코딩하지)말고
	      인스턴스 초기화 블럭에 만들어주면(코딩하면)된다.
	      주의할 점은 생성자 보다  인스턴스 초기화 블럭이 먼저 수행된다는 점을 기억하자.
	      그리고 인스턴스 초기화 블럭은 객체가 생성되어질때 마다 실행된다는 것이다.
	 */
	{
		System.out.println(">> InitialBlockTest 클래스 객체 생성함 <<");
		name = "두석규";
	}
	
	// 기본생성자에 내용 입력하기
	public InitialBlockTest() {
		System.out.println("== 기본생성자 호출함. ==");
	}
	
	// 파라미터가 있는 생성자 생성
	public InitialBlockTest(String userid, String pwd, String name) {
		this.userid = userid;
		this.pwd = pwd;
		this.name = name;
	}

	public static void main(String[] args) {
		
		System.out.println("== main 메소드 시작함 ==");
		
		InitialBlockTest obj1 = new InitialBlockTest();
		
		InitialBlockTest obj2 = new InitialBlockTest();
		
		InitialBlockTest obj3 = new InitialBlockTest("irin","qwer1234$","아이린"); 

	}

}
