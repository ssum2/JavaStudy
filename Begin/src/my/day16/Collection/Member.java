package my.day16.Collection;

public class Member {

	private String id;
	private String pw;
	private String name;
	
	
	public Member() {}
	public Member(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	
	
	
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
	
	@Override
	public String toString() {
		return 	"ID: "+id+
				" / PW: "+pw+
				" / NAME: "+name;
	}
	
	public void showInfo() {
		System.out.println("--- "+name+"의 정보 ---");
		System.out.println("1. 아이디: "+id);
		System.out.println("2. 암호: "+pw);
		System.out.println("3. 성명: "+name);
		System.out.println("----------------\n");
	}
	
}
