package my.day18.Thread;
/*
	개발자는 run() 메소드를 호출하는 것이 아니라, start() 메소드를 호출함으로써 Thread가 실행되어진다.
	그러면 JVM 이 알아서 Thread의 run()메소드를 호출시켜준다.
	또한 JVM 의 스케줄러(Scheduler)가 알아서 스레드를 실행시켜주므로 어떤 스레드가 먼저 실행될지는 아무도 모른다. 
	오로지 JVM 이 알아서 해줄 뿐이다.
	  
	ThreadWho 클래스와 ThreadMyname 클래스가 스레드로 구현되었기 때문에
	 무한루프로 실행되지만 번갈아 가며 실행이 된다.
	 하지만 각스레드마다 실행되어지는 순서는 JVM의 스케줄러(Scheduler)가 정해주기 때문에
	 어떤 스레드가 먼저 실행되어지고 다음번에 어떤 스레드가 실행되는지 예측할수가 없다. 
	 이것이 스레드의 주요한 특징이다.
*/
public class ThreadMain {

	public static void main(String[] args) {
		
		ThreadWho who = new ThreadWho();
		ThreadMyname myname = new ThreadMyname();

		who.start();
		myname.start();
	
	}

}
