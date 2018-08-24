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
} // end of class
