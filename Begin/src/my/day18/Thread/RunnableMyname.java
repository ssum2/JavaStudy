package my.day18.Thread;

public class RunnableMyname extends Parent implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("저는 Java 입니다...(숙연)");
			super.goodmorning();			// 부모 클래스의 메소드도 끌어옴
							
		}
	}

}
