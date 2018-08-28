package my.day16.Exception2;

public class Member {
	private String id;
	private String pw;
	private String name;
	
	public Member() {}
	public Member(String id, String pw, String name) 
			throws UserDefineExceptionID {
		setId(id);
		this.pw = pw;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) 
			throws UserDefineExceptionID {	// 사용자정의 오류가 발생될 수 있다!
		
		if(id == null || id.length() < 5) {
			throw new UserDefineExceptionID();	// 사용자정의 오류 객체 생성(기본생성자)
//			">> ID는 최소 길이가 5자 이상이어야 합니다."
		}
		else if("admin".equals(id) || "superman".equals(id)) {
			throw new UserDefineExceptionID("ID는 admin과 superman으로는 생성할 수 없습니다.");
		}
		else this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) 
			 {
//		if(pw == null || pw.length() < 8) {
//			throw new UserDefineExceptionPW();	// 사용자정의 오류 객체 생성(기본생성자)
////			">> ID는 최소 길이가 5자 이상이어야 합니다."
//		}
//		else if("admin".equals(id) || "superman".equals(id)) {
//			throw new UserDefineExceptionPW("ID는 admin과 superman으로는 생성할 수 없습니다.");
//		}
//		else this.pw = pw;
//		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
}
