package my.day18.Thread;

public class RunnableMain {

	public static void main(String[] args) {
//		3) main 메소드에서 클래스를 객체 생성한다.
//			>> 여기서 만드는 객체는 parent만 상속받아온 객체여서 스레드가 아님
		RunnableWho runwho = new RunnableWho();
		RunnableMyname runmyname = new RunnableMyname();
		
//		4) Thread 객체를 생성한다. 생성자 인자로 Runnable를 구현한 클래스 객체를 지정한다. 
		Thread thrwho = new Thread(runwho);
		Thread thrmyname = new Thread(runmyname);
		
		/*
		   Thread 객체 생성시 생성자의 파라미터에 Runnable 인터페이스 구현체인 
		   runwho 객체와 runmyname 객체가 들어가도록 되어있다. 
				   
		   Thread 객체 생성시 Runnable 인터페이스 구현체 객체를 파라미터로 받아 생성하는 방법을 많이 사용한다.
		      왜냐하면 Thread 클래스를 직접 상속받아 생성된 스레드는 Thread 클래스 이외의 다른 클래스를 상속받지 못하지만, 
		   Runnable 인터페이스를 구현한 객체를 파라미터로 받아 생성된 Thread 클래스는 스레드 실행시 호출되는 run()메소드 내에서 
		      상속받은 부모 클래스의 멤버변수나 메소드를 사용할 수 있는 확장성이 있기 때문이다.   
		*/

//		5) Thread 객체의 start() 메소드를 호출하여 스레드를 실행시킨다. 
		thrwho.start();
		thrmyname.start();
		
		/*
		        개발자는 run() 메소드를 호출하는 것이 아니라, start() 메소드를 호출함으로써 Thread가 실행되어진다.
			그러면 JVM 이 알아서 Thread의 run()메소드를 호출시켜준다.
		        또한 JVM 의 스케줄러(Scheduler)가 알아서 스레드를 실행시켜주므로 어떤 스레드가 먼저 실행될지는 아무도 모른다. 
			오로지 JVM 이 알아서 해줄 뿐이다.
				    
			RunnableWho 클래스와 RunnableMyname 클래스가 스레드로 구현되었기 때문에
			무한루프로 실행되지만 번갈아 가며 실행이 된다.
			하지만 각스레드마다 실행되어지는 순서는 JVM의 스케줄러(Scheduler)가 정해주기 때문에
			어떤 스레드가 먼저 실행되어지고 다음번에 어떤 스레드가 실행되는지 예측할수가 없다. 
			이것이 스레드의 주요한 특징이다.
		*/

	}

}
