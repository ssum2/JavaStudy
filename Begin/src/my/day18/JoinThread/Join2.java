package my.day18.JoinThread;

public class Join2 implements Runnable, InterJoin {
// Join2.class는 스레드 객체로 사용
	
	private String name;
	private String email;

	
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

	@Override
	public void run() {
		showInfo();
	}
	@Override
	public void showInfo() {
		System.out.println("===== Join2 =====");
		System.out.println("▷ 이름: "+name+", ▷ 이메일: "+email+"\n\n");		
	}

}
