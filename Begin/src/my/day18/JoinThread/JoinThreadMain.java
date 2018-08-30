package my.day18.JoinThread;

public class JoinThreadMain {

	public static void main(String[] args) {
//		1. Runnable을 구현한 클래스 객체를 생성
		Join1 join1 = new Join1();
		join1.setId("leess");
		join1.setPw("qwer1234$");
		
		Join2 join2 = new Join2();
		join2.setName("이순신");
		join2.setEmail("leess@gmail.com");
		
		Join3 join3 = new Join3();
		join3.setTel("010-8888-7777");
		join3.setAddr("서울시 종로구");
		
//		2. Runnable구현된 클래스의 객체를 파라미터로 쓰는 스레드 객체 생성
		Thread thr1 = new Thread(join1);
		Thread thr2 = new Thread(join2);
		Thread thr3 = new Thread(join3);
		
//		thr2.start();
//		thr3.start();
//		thr1.start();
//		2>3>1 순서로 실행하고 싶은데 JVM이 스케쥴에 따라서 임의로 실행하기 때문에 순서가 섞임
//		>> IO 등으로 스레드 작업을 멈추게 하고 그 다음 것을 진행하는 형태로 감 
//		>>>> 순서를 제어하는 메소드 "join()"사용
		
		
		try {
			thr2.start();
			thr2.join();
//			thr2.join() : 스레드 thr2가 종료될 때까지 다른 스레드는 block됨 >> thr2가 종료되면 다른 스레드는 실행 가능해짐
			thr3.start();	// thr3실행
			thr3.join();	// thr3 제외 나머지 스레드 멈춤
			thr1.start();
			thr1.join();
		} catch (InterruptedException e) {
//			Cf) InterruptedException: 스레드가 시스템내부적으로 join하지 못하는 오류가 발생했을 때 >> 운영체제가가 꼬여서 발생한 것
			e.printStackTrace();
		}

	}

}
