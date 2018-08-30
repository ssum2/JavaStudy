package my.day18.NonSynchronization;

// #입금할 스레드 객체
public class UpmoneyRunnable implements Runnable {

	private NoSyncBankBook bankbook;
	private long upmoney;
	

	public UpmoneyRunnable() {}
	public UpmoneyRunnable(NoSyncBankBook bankbook, long upmoney) {
		this.bankbook = bankbook;
		this.upmoney = upmoney;
	}


	public NoSyncBankBook getBankbook() {
		return bankbook;
	}
	public void setBankbook(NoSyncBankBook bankbook) {
		this.bankbook = bankbook;
	}
	public long getUpmoney() {
		return upmoney;
	}
	public void setUpmoney(long upmoney) {
		this.upmoney = upmoney;
	}


	@Override
	public void run() {
		try {
			Thread.sleep(500);	// 0.5초동안 pause, 이 스레드는 block, 다른 스레드가 실행될 수 있도록함
//			JVM이 임의로 막 실행시키는 와중에 한 템포 쉬는 구간을 주면 데드락을 안 할 확률이 높아짐(아예 안되는건 아닌가봄)
			bankbook.deposit(upmoney);
//			공유하고 있는 특정 계좌 
		} catch (InterruptedException e) {
			e.printStackTrace();
			return;
		}	
		
	}

}
