package my.day18.SleepThread;
/*
	==== Thread.sleep(밀리초) 메소드  ====
	 
	  스레드는 기본적으로 우선순위 방식으로 실행이 되기 때문에 ,
	  우선순위가 낮은 스레드는 만약에 최악의 경우 running 되지 못하고 항상 runnable 상태로 있을수도 있게 된다.
	   >> 기아,굶주림(starvation)상태
	   
	  이러한 최악의 굶주림 상태를 방지하기 위해서 우선순위가 낮은 스레드에게도 실행될 수 있는 기회를 주어야 한다.
	  이런 경우 우선순위가 높은 스레드가 우선순위가 낮은 스레드에게 실행권을 주는 방법
	   >> Thread.sleep(밀리초) 메소드를 사용하여 낮은 스레드에게 실행권 부여
	   
	  인자값에 지정된 밀리초 시간 동안 실행중인 스레드는 block시키고
	  이 밀리초 시간동안 우선순위가 낮은 스레드가 실행하도록 하는 것이다.
	  
	 >> 스레드로 작동할 클래스 생성시 run() 메소드 오버라이딩에서
	 sleep(밀리초)메소드는 일반적으로 항상 기입을 해주는 것을 원칙으로 한다.       
*/
public class Sleep1 implements Runnable, InterSleep {
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
		try {
			Thread.sleep(2000);	// 1000milis = 1s
//			>> 500milis(0.5s)동안 해당 스레드가 멈춤(block)
//			>> 이 스레드가 멈춰 있는 동안 다른 스레드로 Cpu의 사용권이 넘어감!
			
		} catch (InterruptedException e) {
//			>> sleep이 실행되지 않을 수도 있다는 오류
			e.printStackTrace();
		}		
		
		showInfo();
	}
	@Override
	public void showInfo() {
		System.out.println("===== Sleep1 =====");
		System.out.println("▷ 아이디: "+id+", ▷ 패스워드: "+pw+"\n\n");
		
	}

}
