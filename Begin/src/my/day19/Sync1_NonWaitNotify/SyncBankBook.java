package my.day19.Sync1_NonWaitNotify;
/*	===== 동기화(synchronized) ===== 
	- 공유된 데이터에서 하나의 특정메소드를 여러 스레드들이 순차적으로 줄을서서 실행하는 것 
	- 자바에서는 키워드 synchronized를 통해 해당 작업(입금, 인출)에 lock 을 걸어서
	  먼저 작업 중이던 스레드가 작업을 완전히 마치기 전 까지는 해당 작업(입금, 인출)에 lock 이 걸려져 있으므로  
	  설령 다른 스레드에게 제어권이 넘어간다 하더라도 다른 스레드는 lock 이 걸려진 해당 작업(입금, 인출)에 접근을 할 수 없도록 만든다.
	  먼저 작업 중이던 스레드가 작업이 끝나면 해당 작업(입금, 인출)에 걸려진 lock 은 자동적으로 풀리게 되므로
	  그제서야 다른 스레드는 해당 작업(입금, 인출)을 할 수 있게 된다.  
	
	 여러 스레드가 하나의 데이터를 공유할 수 있다.
	 공유 메커니즘은 성능 및 자원의 효율성에서는 좋지만 데이터 일관성에 있어서는 문제가 발생될 수 있다.
	 여러 스레드가 하나의 데이터를 공유할때 하나의 스레드가 해야하는 작업이 끝날때 까지 
	 그 데이터는 다른 스레드에게 공유되지 않도록 해야 하는데, 
	 이것을 해결하는 방법으로 자바에서는 synchronized 키워드를 사용하여 해결한다.
*/
public class SyncBankBook {
	private String account;		// 계좌번호
	private long balance; 		// 잔고
	
	
	public SyncBankBook() {}
	public SyncBankBook(String account, long balance) {
		this.account = account;
		this.balance = balance;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	
//	#동기화 처리를 한 입금 메소드 생성하기
//	>> BUT 아직 각 스레드간의 순서는 정해지지 않음!
	
//	1. synchronized 접근제한자 사용하기
	public synchronized void deposit(long money) {
		System.out.println("==== 입금 업무 시작 ====");
		balance += money;
		System.out.println("계좌번호: " + account + "\n > 입금액: " + money + ", 입금 후 잔액: "+balance);
		System.out.println("==== 입금 업무 완료 ====\n");
	}
	
//	2.synchronized(공유대상)메소드로 동기화 하기 (부분적 동기화 가능 >> 많이 사용)
//	public void deposit(long money) {
//		System.out.println(">>> 동기화와는 관련 없는 내용(입금) <<<");
//		
//		synchronized(this){
//		System.out.println("==== 입금 업무 시작 ====");
//		balance += money;
//		System.out.println("계좌번호: " + account + "\n > 입금액: " + money + ", 입금 후 잔액: "+balance);
//		System.out.println("==== 입금 업무 완료 ====\n");
//		}
//	}
		
	
//	#동기화 처리를 한 출금 메소드 생성하기
	public synchronized void withdraw(long money) {
		if(balance - money < 0) {	//잔고-출금액이 0원 미만일 때 출금이 되지 않도록 함
			System.out.println(">>> 동기화와는 관련 없는 내용(출금) <<<");
			
			System.out.println("==== 출금 업무 시작 ====");
			System.out.println("계좌번호: " + account + "\n > 잔액부족!, 현재 금액: "+balance+", 출금요청금액 :"+money);
			System.out.println("==== 출금 업무 완료 ====\n");
			return;		// 프로그램 종료
		}
		System.out.println(">>> 동기화와는 관련 없는 내용(출금) <<<");

		System.out.println("==== 출금 업무 시작 ====");
		balance -=money; // if에서 return을 걸었기 때문에 여기로 떨어지는 경우는 잔고가 있을 경우임 >> 잔고에서 출금!
		System.out.println("계좌번호: " + account + "\n > 출금액: " + money + ", 출금 후 잔액: "+balance);
		System.out.println("==== 출금 업무 완료 ====\n");
	}
}
