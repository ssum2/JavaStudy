package my.day14.Inheritance_ex2;
// 공통 클래스(Member)
public class Common {

//	1. 추상화
	static int count;
	private String id;
	private String pw;
	private String name;
	private String email;

//	2. 생성자
	public Common() {count++;}
	public Common(String id, String pw, String name, String email) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		count++;
	}

//	3. getter setter
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
//	4. 공통 메소드 만들기
//	1) 로그인
//		cf) 리턴타입이 있는 메소드에서 조건을 걸었으면 조건마다 return값을 설정...
//			outer if의 true에서는 inner if의 if/else 두개의 리턴값이 있고
//			outer else에서 리턴값 1개 ==> 총 3개의 리턴값!
	public Common login(String id, String pw) {
		if(this.id != null && this.pw != null) {
			if(this.id.equals(id) && this.pw.equals(pw)) {
				System.out.println(">> "+name+"님 환영합니다! <<");
				return this;
			}
			else {
				System.out.println(">> 로그인 실패! <<");
				return null;
			}		
		}
		else {
			System.out.println(">> 등록된 회원이 아닙니다. 회원가입을 진행하세요. <<");
			return null;
		}
	} // end of login()
	
	
	public void showInfo() {
		System.out.println("***** 공통 "+name+"님의 정보 *****");
		System.out.println("01. 성     명	: "+name);
		System.out.println("02. 이 메 일 	: "+email);
		System.out.println("");
		
	}
	
} // end of class
