package my.day3;

public class InitialBlockTest {
	String userid; //static 없음 => 인스턴스변수 -> 객체가 있어야 사용 가능
	String userpw; // 멤버변수 = 속성(property), 특징; InitialBlockTest라는 클래스가 가지는 속성; InitialBlockTest라는 회원도면이 가지는 속성
	String name = "차은우";
	
	static int point;
	
	/* ============ 인스턴스 변수의 초기화 순서 ============
	 * 1. JVM이 기본값을 부여
	 * 2. 명시적 초기화 (개발자가 직접 부여)
	 * 3. 인스턴스 초기화 블럭에 있는 초기화 내용 적용
	 * 4. 파라미터가 있는 생성자의 초기화 내용 적용
	 */
	
	/* ============ 클래스 초기화 블럭 =============
	 * - 해당 클래스가 처음으로 실행될 때 딱 1번만 자동으로 실행시켜주는 것이다.
	 * - 데이터베이스와 연동시킬 때 사용
	 */
	static { // 클래스 초기화 블럭
		System.out.println("=== InitialBlockTest의 클래스 초기화 블럭 실행 ===");
		// name="화사"; 객체를 만들기 전에 무조건 실행되는 클래스초기화블럭이여서 name이라는 멤버변수가 만들어지기 전에 나와서 오류가 뜸
		point = 10;
	}
	
	/*
	 * =========== 인스턴스 초기화 블럭 ============
	 * - 모든 생성자에서 공통적으로 수행할 코드가 있는 경우, 각 생성자마다 중복해 코딩하지 않고 인스턴스 초기화 블럭에 만들어주면 됨
	 * - 주의: 생성자보다 인스턴스 초기화 블럭이 먼저 수행
	 * - 객체가 생성될 때마다 실행
	 * - { } 이렇게만 쓰면 됨
	 * 
	 */
	
	{
		System.out.println(">>> InitialBlockTest.class 객체 생성 <<<"); //공통
		name = "박보검";
	}
	
	public InitialBlockTest() {
		//기본생성자
		System.out.println("=== 기본생성자 호출 ===");
	}
	
	public InitialBlockTest(String userid, String userpw, String name) { //지역변수
		//파라미터가 있는 생성자
		this.userid = userid;
		this.userpw = userpw;
		this.name = name;
		
	}

	

	public static void main(String[] args) {
		System.out.println("\n--- 메인메소드 실행 ---");
		InitialBlockTest obj1 = new InitialBlockTest();
		
		InitialBlockTest obj2 = new InitialBlockTest();
		
		InitialBlockTest obj3 = new InitialBlockTest("Baesumi", "qwer1234!", "배수미");
	}

}
