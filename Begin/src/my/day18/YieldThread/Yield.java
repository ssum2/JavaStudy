package my.day18.YieldThread;
/*
	>> Thread.yield() 메소드
		- 각 스레드의 우선순위가 동등한 경우, 다른 스레드에게 실행 기회를 넘김(양보)
		- UNIX, Linux에서는 잘 되는데 Win OS에서는 잘 안 될 수 있음 (이유는...모름...)
 */
public class Yield implements Runnable {
	private String id;
	private String pw;
	
	
	public Yield() {}
	public Yield(String id, String pw) {
		this.id = id;
		this.pw = pw;
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
	
	@Override
	public void run() {
//		# ID가 "guest"일 때 현재 실행중인 스레드가 block되고, 우선순위가 동등한 다른 스레드에 실행기회 양보
		if("guest".equals(id)) {
			Thread.yield();
			System.out.println("양보했다~~!");
		}
		else
			showInfo();
	}
	public void showInfo() {
		System.out.println("===== Yield =====");
		System.out.println("▷ 아이디: "+id+", ▷ 패스워드: "+pw+"\n\n");
	}
	
}
