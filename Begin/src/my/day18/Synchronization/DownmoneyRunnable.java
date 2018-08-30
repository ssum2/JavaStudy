package my.day18.Synchronization;

// #출금할 스레드 객체
public class DownmoneyRunnable implements Runnable {
	
	private SyncBankBook bankbook;
	private long downmoney;
	

	public DownmoneyRunnable() {}
	public DownmoneyRunnable(SyncBankBook bankbook, long downmoney) {
		this.bankbook = bankbook;
		this.downmoney = downmoney;
	}

	public SyncBankBook getBankbook() {
		return bankbook;
	}
	public void setBankbook(SyncBankBook bankbook) {
		this.bankbook = bankbook;
	}
	public long getDownmoney() {
		return downmoney;
	}
	public void setDownmoney(long downmoney) {
		this.downmoney = downmoney;
	}




	@Override
	public void run() {
		try {
			Thread.sleep(500);	
			bankbook.withdraw(downmoney);

		} catch (InterruptedException e) {
			e.printStackTrace();
			return;
		}	
	}

}