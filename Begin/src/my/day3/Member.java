package my.day3;

public class Member {
	String userid;
	String userpw;
	String name;
	int age;
	
	static int count; // Member클래스로 생성된 객체의 개수를 누적하는 용도로 사용
	
	public Member() {
		count = count + 1;
		//cf. count++; 보통 이렇게 기재
		
	} // 파라미터 있는 생성자 만들 때 반드시 기본생성자 만들어 줘야함
	
	public Member(String userid, String userpw, String name, int age) {
		this.userid = userid;
		this.userpw = userpw;
		this.name = name;
		this.age = age;
		count = count + 1; //위에 count된 1 + 1
		
	}// 파라미터 있는 Member 생성자의 끝

	
	// === 리턴타입(반환타입)이 없는 인스턴스 메소드 생성하기 ===
	public void showInfo() { // void: 리턴타입이 "없다" -> 메소드 안에 있는 내용물만 실행하고 끝냄
		System.out.println("\n === " +name+"님의 정보 ===");
		System.out.println("1. 아 이 디: "+userid);
		System.out.println("2. 패스워드: "+userpw);
		System.out.println("3. 이     름: "+name);
		System.out.println("4. 나     이: "+age);
		System.out.println("5. 생성된 객체수: "+count);
	}
	
	// === 리턴타입(반환타입)이 있는 인스턴스 메소드 생성하기 ===
	// 그 사람의 정보를 문자열 info에 담아 전달하라
	public String returnShowInfo() { //메소드는 반드시 리턴타입이 무엇인지 표기해줘야함
		String info = "\n>>> "+name+" 님의 정보  <<<\n1. 아이디: "+userid+"\n2. 패스워드: "+userpw+"\n3. 이름: "+name+"\n4. 나이: "+age+"";
		
		return info;
		
	}
	
	// === 리턴타입은 없고 매개변수(인자, 파라미터)가 있는 인스턴스 메소드 생성하기 ===
	
	public void changeVal(String userpw, int age) {
		this.userpw = userpw;
		this.age = age;
	}
	
	// === 리턴타입이 있고 매개변수(인자, 파라미터)가 있는 인스턴스 메소드 생성하기 ===
	public String returnChangeVal(String userpw, int age) {
		this.userpw = userpw;
		this.age = age;
		
		// String info = "\n*** "+name+" 님의 정보  ***\n1. 아이디: "+userid+"\n2. 패스워드: "+userpw+"\n3. 이름: "+name+"\n4. 나이: "+age+"";
//		String info = returnShowInfo(); // 위와 동일한 값
		
//		return info;
		
		return returnShowInfo(); // 위에 String ~ return 내용과 동일, 어차피 returnShowInfo()메소드가 String타입으로 되어있어서 이렇게 불러와도 ㅇㅋ
		
	}
	
	// === static 메소드 생성 ===
	public static void showCount() {
		System.out.println("--지금까지 생성된 객체수: "+ count +"--"); //static 메소드 안에는 static 변수만 들어올 수 있다
	}
	
	
	
	
} // Member 클래스의 끝
