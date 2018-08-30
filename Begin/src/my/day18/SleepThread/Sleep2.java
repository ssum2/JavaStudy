package my.day18.SleepThread;

public class Sleep2 implements Runnable, InterSleep {
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
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		showInfo();
	}
	@Override
	public void showInfo() {
		System.out.println("===== Sleep2 =====");
		System.out.println("▷ 이름: "+name+", ▷ 이메일: "+email+"\n\n");
	}

}
