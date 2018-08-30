package my.day18.SleepThread;

public class SleepThreadMain {

	public static void main(String[] args) {
		Sleep1 sleep1 = new Sleep1();
		sleep1.setId("leess");
		sleep1.setPw("qwer");
		Sleep2 sleep2 = new Sleep2();
		sleep2.setName("이순신");
		sleep2.setEmail("leess@gmail.com");
		
		
		Thread thr1 = new Thread(sleep1);
		Thread thr2 = new Thread(sleep2);
		
//		#우선순위 출력하기
		System.out.println("스레드 thr1의 우선순위: "+thr1.getPriority());
//		스레드 thr1의 우선순위: 5
		System.out.println("스레드 thr2의 우선순위: "+thr2.getPriority());
//		스레드 thr2의 우선순위: 5
		
//		#우선순위 재정의
		thr1.setPriority(7);
		thr2.setPriority(3);
		System.out.println("스레드 thr1의 우선순위: "+thr1.getPriority());
//		스레드 thr1의 우선순위: 7
		System.out.println("스레드 thr2의 우선순위: "+thr2.getPriority());
//		스레드 thr2의 우선순위: 3
		
		System.out.println("\n-----------------------------------------\n");
		
//		#스레드 실행
		thr1.start();
		thr2.start();

	}	// end of main()

}	// end of class
