package my.day18.Thread;

public class ThreadMyname extends Thread {
	
	@Override
	public void run() {
		while(true) {
			System.out.println("my name is Java!");
		}
	}	
}
