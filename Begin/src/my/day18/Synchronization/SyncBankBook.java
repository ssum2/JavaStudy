/*
	===== 동기화(synchronized) - 하나의 특정메소드를 여러 스레드들이 순차적으로 줄을서서 실행하는 것 =====
	
	 여러 스레드가 하나의 데이터를 공유할 수 있다.
	 공유 메커니즘은 성능 및 자원의 효율성에서는 좋지만 데이터 일관성에 있어서는 문제가 발생될 수 있다.(데이터가 멋대로 변할 수 있음)
	 여러 스레드가 하나의 데이터를 공유할때 하나의 스레드가 해야하는 작업이 끝날때 까지 
	 그 데이터는 다른 스레드에게 공유되지 않도록 해야함
	 >> synchronized 키워드를 사용하여 해결
	 
	==== >>> 동기화(synchronized)를 처리하는 2가지 방법 <<< ====
	
	1. 동기화 메소드를 사용하는 방법
	   
	   접근지정자  synchronized  리턴타입  메소드명() {
	    .......
	    .......
	  }
	 
	  --> 메소드 선언시 synchronized 키워드를 지정하는 방법이다. 
	    이 방법은 메소드내의 모든 코드가 동기화된다.
	    따라서 특정 스레드가 이 메소드의 모든 내용을 모두 수행할 때까지 다른 스레드는 block 된다.
	  
	  
	2. 동기화 블럭을 사용하는 방법 (추천)
	   
	   접근지정자  리턴타입  메소드명() {
	      .......
	    synchronized(공유객체) {
	      .......
	    }
	      .......
	  } 
	   
	 --> 메소드내에서 synchronized 키워드 블럭을 사용하는 것이다. 
	         이 방법은 메소드내의 모든 코드가 아닌 synchronized 블럭만 동기화 된다. 
	         따라서 전체 메소드를 동기화하는 방법보다 더 효율적이다.
	 
	동일한 클래스의 같은 메소드를 동시에 여러 스레드가 호출해도 
	synchronized(동기화)에 의하여 순차적으로 스레드들이 실행된다.
	예를 들어, 동일한 통장계좌에 잔액이 100만원이 있을때 
	A와 B가 동시에 입금하는 스레드와 출금하는 스레드를 여러번 동시에 실행시켰을 경우
	통장계좌에 입금과 출금 처리가 순차적으로 실행을 해서 기록을 해야 되는데, 
	그렇지 않은 경우 입출금 스레드의 실행순서를 우리가 알수가 없으므로
	통장계좌에 입금과 출금 처리가 이상하게 기록 될 수 있게 된다.             
*/
package my.day18.Synchronization;

// #공유데이터 클래스; 공유 통장
public class SyncBankBook {
//	입금 > 출금 > 입금 > 출금 ... 순서로 고정
	private String account;		// 계좌번호
	private long balance; 		// 잔고
	
	private boolean boolDeposit = true;	// 입금을 먼저 하기 위해 true로 초기화
//	>> boolDeposit이 true일 때만 deposit(money)메소드가 실행되도록 함
	private boolean boolWithdraw = false; // 입금이 된 이후에 하기 위해 false로 초기화
//	>> boolWithdraw이 true일 때만 withdraw(money)메소드가 실행되도록 함	
	
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
	
	
//	#동기화 처리한 입금 메소드
//	>> synchronized를 써줌
	public synchronized void deposit(long money) {
		while(boolDeposit==false) 
	    { // boolDeposit 의 값이 true 이어야만 입금메소드 deposit(long money)이 정상작동 하도록 한다.
	      // boolDeposit 의 값이 false 이면 입금메소드 deposit(long money)는 계속해서 wait() 상태로 빠지게 만든다. 	
		   try{
		     	 wait(); // void java.lang.Object.wait() throws InterruptedException
			     /* wait()가 호출되면 스레드는 수행 권한을 포기한다.
			          이때 모니터 락을 반납한다. 그런 뒤 대기상태(waiting Pool)로 들어가는데 
			          다른 스레드가 notify(); 해줄때까지 대기상태(waiting Pool)로 들어간다. */
		      }catch(InterruptedException e){}
	    }// end of while----------------------------------

		
		balance += money;
		System.out.println("계좌번호: " + account + "\n > 입금액: " + money + ", 입금 후 잔액: "+balance+"\n");
		boolDeposit = false;	// 입금 완료 후 입금기능을 멈추게 하려고 false로 바꿈 > while문 안의 wait 실행
		boolWithdraw = true;	// 입금 후 출금을 진행하기 위해 true로!
		notify();				// 대기실(waiting pool)에서 대기하고 있는 스레드 아무거나 하나 골라서 깨움 
								// -> 깨운 스레드를 runnable상태로 전환
	}
	
//	#동기화 처리한 출금 메소드
	public synchronized void withdraw(long money) {
		while(boolWithdraw==false) 
	    { // boolWithdraw 의 값이 true 이어야만 출금메소드 withdraw(long money)이 정상작동 하도록 한다.
	      // boolWithdraw 의 값이 false 이면 출금메소드 withdraw(long money)는 계속해서 wait() 상태로 빠지게 만든다. 	
		   try{
		     	 wait(); // void java.lang.Object.wait() throws InterruptedException
			     /* wait()가 호출되면 스레드는 수행 권한을 포기한다.
			          이때 모니터 락을 반납한다. 그런 뒤 대기상태(waiting Pool)로 들어가는데 
			          다른 스레드가 notify(); 해줄때까지 대기상태(waiting Pool)로 들어간다. */
		      }catch(InterruptedException e){}
	    }// end of while----------------------------------
		
//		> boolWithdraw == true;
		if(balance - money < 0) {	//잔고-출금액이 0원 미만일 때 출금이 되지 않도록 함
			System.out.println("계좌번호: " + account + "\n > 잔액부족!, 현재 금액: "+balance+", 출금요청금액 :"+money+"\n");
			
			boolWithdraw = false;	// 출금block
			boolDeposit = true;		// 입금OK
			notify();				// waiting pool에 있는 불특정 입금스레드 하나를 깨움
			return;		// 프로그램 종료
		}
		balance -=money; // if에서 return을 걸었기 때문에 여기로 떨어지는 경우는 잔고가 있을 경우임 >> 잔고에서 출금!
		System.out.println("계좌번호: " + account + "\n > 출금액: " + money + ", 출금 후 잔액: "+balance+"\n");
		boolWithdraw = false;
		boolDeposit = true;
		notify();
		
	}
	

}
