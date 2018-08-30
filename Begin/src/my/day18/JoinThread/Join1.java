package my.day18.JoinThread;

public class Join1 implements Runnable, InterJoin {
// Join1.class는 스레드 객체로 사용
// Runnable, InterJoin 인터페이스 다중 구현
	
	private String id;
	private String pw;
	
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

	@Override
	public void run() {
		showInfo();
	}
	@Override
	public void showInfo() {
		System.out.println("===== Join1 =====");
		System.out.println("▷ 아이디: "+id+", ▷ 패스워드: "+pw+"\n\n");
	}

}
