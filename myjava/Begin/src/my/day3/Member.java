package my.day3;

public class Member {

	String userid;
	String pwd;
	String name;
	int age;
	
	static int count;  
	// count는 Member 클래스로 생성되어진 객체의 갯수를 누적시키는 용도로 써본다.
	
	public Member() {
		count = count + 1;
	}
	
	public Member(String userid, String pwd, String name, int age) {
		this.userid = userid;
		this.pwd = pwd;
		this.name = name;
		this.age = age;
		
		count = count + 1;
	}

	// == 리턴타입(반환타입)이 없는 인스턴스 메소드 생성하기 == //
	public void showInfo() {
		System.out.println("\n=== "+name+"님의 정보 ===");
		System.out.println("1. 아이디 : " + userid);
		System.out.println("2. 암  호 : " + pwd);
		System.out.println("3. 성  명 : " + name);
		System.out.println("4. 나  이 : " + age);
		System.out.println("5. 생성된 객체수 : " + count);
	}
	
	
	// == 리턴타입(반환타입)이 있는 인스턴스 메소드 생성하기 == //
	public String returnShowInfo() {
		
		String info = "\n>>> "+name+"님의 정보 <<<\n1.아이디: "+userid+"\n2.암호: "+pwd+"\n3.성명: "+name+"\n4.나이: "+age+"";                           
		
		return info;
	}
	
	// == 리턴타입(반환타입)은 없고 매개변수(인자, 파라미터)가 있는 인스턴스 메소드 생성 하기 == 
	public void chageVal(String pwd, int age) {
		this.pwd = pwd;
		this.age = age;
	}
	
	
	// == 리턴타입(반환타입)도 있고 매개변수(인자, 파라미터)도 있는 인스턴스 메소드 생성 하기 ==
	public String returnChangeVal(String pwd, int age) {
		
		this.pwd = pwd;
		this.age = age;
		
	//	String info = "\n*** "+name+"님의 정보 ***\n1.아이디: "+userid+"\n2.암호: "+pwd+"\n3.성명: "+name+"\n4.나이: "+age+"";
	//	String info = returnShowInfo();
		
	//	return info;
		
		return returnShowInfo();
	}
	
	
	// == static 메소드 생성하기 == //
	public static void showCount() {
		System.out.println("-- 지금까지 생성된 객체수 : " + count + " --"); 
	}
	
}
