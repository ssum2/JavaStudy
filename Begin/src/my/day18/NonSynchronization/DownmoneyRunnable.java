package my.day18.NonSynchronization;

// #출금할 스레드 객체
public class DownmoneyRunnable implements Runnable {
	
	private NoSyncBankBook bankbook;
	private long downmoney;
	

	public DownmoneyRunnable() {}
	public DownmoneyRunnable(NoSyncBankBook bankbook, long downmoney) {
		this.bankbook = bankbook;
		this.downmoney = downmoney;
	}

	public NoSyncBankBook getBankbook() {
		return bankbook;
	}
	public void setBankbook(NoSyncBankBook bankbook) {
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