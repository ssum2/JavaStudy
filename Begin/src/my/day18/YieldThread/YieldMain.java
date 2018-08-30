package my.day18.YieldThread;

public class YieldMain {

	public static void main(String[] args) {
		
//		#Runnable 객체를 배열로 생성
		Yield[] yieldArr = new Yield[5];
		yieldArr[0] = new Yield("leess", "qwer1234$");
		yieldArr[1] = new Yield("guest", "qwer1234$");
		yieldArr[2] = new Yield("eom", "qwer1234$");
		yieldArr[3] = new Yield("chaeunwoo", "qwer1234$");
		
		
//		#Thread 객체를 배열로 생성
		Thread[] threadArr = new Thread[5];
		threadArr[0] = new Thread(yieldArr[0]);
		threadArr[1] = new Thread(yieldArr[1]);
		threadArr[2] = new Thread(yieldArr[2]);
		threadArr[3] = new Thread(yieldArr[3]);
		
//		#우선순위를 설정(*.setPriority())해주지 않았기 때문에 지금 순위는 모두 동급 >> 5
		for(int i=0; i<4; i++) {
			System.out.println("스레드 우선순위: "+threadArr[i].getPriority());
		}
	
		System.out.println("-----------------------");
		
//		#스레드 실행
		for(int i=0; i<4; i++) {
			threadArr[i].start();
		}
	
	}	// end of main()

}	// end of class
