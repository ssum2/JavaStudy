package my.day18.JoinThread;

public class Join3 implements Runnable, InterJoin {
// Join3.class는 스레드 객체로 사용
	
	private String tel;
	private String addr;
	

	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public void run() {
		showInfo();
	}
	@Override
	public void showInfo() {
		System.out.println("===== Join3 =====");
		System.out.println("▷ 연락처: "+tel+", ▷ 주소: "+addr+"\n\n");
	}

}
