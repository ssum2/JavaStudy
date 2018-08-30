package my.day18.Thread;
/*
	#CPU의 속도가 엄청 빠르기 때문에 각 스레드에서 중간에 다른 스레드에 양보하면 동시실행되는 것 처럼 보임(핑퐁핑퐁)
	
	=== *** 스레드를 생성하는 2가지 방법 *** ===
	
	1. java.lang.Thread 클래스를 이용하는 방법
	 - 1) Thread 클래스를 상속받는 클래스를 작성한다.
	 - 2) public void run() 메소드를 오버라이딩(재정의) 한다.
	 - 3) main 메소드에서 클래스를 객체 생성한다.
	 - 4) 해당 객체의 start() 메소드를 호출하여 스레드를 실행시킨다.
	>> 단점: 상속받은 Thread의 run() start()를 일일이 하나하나 써줘야하고 다른 클래스 상속X
	
	2. java.lang.Runnable 인터페이스를 이용하는 방법	>> 사용 빈도 高
	 - 1) Runnable 인터페이스를 구현하는 클래스를 작성한다.
	 - 2) public void run() 메소드를 오버라이딩(재정의) 한다.
	 - 3) main 메소드에서 클래스를 객체 생성한다.
	 - 4) Thread 객체를 생성한다. 생성자 인자로 Runnable를 구현한 클래스 객체를 지정한다. 
	 - 5) Thread 객체의 start() 메소드를 호출하여 스레드를 실행시킨다. 
	 
	 Thread 클래스와 Runnable 인터페이스와의 관계는 
	 Thread 클래스는 Runnable 인터페이스를 미리 구현한 관계이다. 
	 따라서 Thread 클래스는 Runnable 인터페이스의 추상메소드인 run() 메소드가 오버라이딩(재정의) 되어 있다.
	 
	 스레드가 처리해야할 작업의 내용은 run() 메소드에서 구현되면 되고, run()메소드가 끝나면 스레드는 제거된다.
	 스레드를 실행하기 위해서는 반드시 start() 메소드를 이용한다. 
	 start()메소드를 호출하면 내부적으로 Java Virtual Machine이 자동적으로 run()메소드가 호출되도록 
	 되어 있으며 스레드를 실행하도록 되어있기 때문이다.   

*/
public class RunnableWho extends Parent implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("너 누구야...!");
			super.smile();			// 부모 클래스의 메소드도 끌어옴
							
		}
	}

}
