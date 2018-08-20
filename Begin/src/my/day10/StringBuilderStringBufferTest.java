package my.day10;

public class StringBuilderStringBufferTest {

	public static void main(String[] args) {
		
	/*
		 문자열을 변경할때 마다 새로운 객체를 생성하는 String 클래스와는 다르게 문자열 변경시
		 새로운 객체를 생성하지 않고 버퍼에 담겨있는 문자열을 바로 수정한다.
		
		 StringBuilder 클래스와  StringBuffer 클래스의 객체는 객체생성시 크기를 지정하지 않으면
		 기본적으로 16개의 문자열을 담을 수 있는 버퍼의 크기를 가지게 된다. 
		 
		 16개의 문자열을 담을 수 있는 크기를 초과한 문자열을 받으면 16*2 = 32 로 버퍼의 크기가 자동으로 증가되고,
		 32개의 문자열을 담을 수 있는 크기를 초과한 문자열을 받으면 32*2 = 64 로 버퍼의 크기가 자동으로 증가....
		 이런식으로 매번 2배씩 자동으로 증가된다.
		 
		 StringBuilder 클래스와  StringBuffer 클래스의 차이점은 StringBuffer 클래스만 멀티스레드 하에서 
		  동기화 기능을 지원해주는 것이다. 그 외에는 StringBuilder 클래스와  StringBuffer 클래스는 동일하게
		  동작한다.  
	 */
		
		// >> String의 경우 문자열을 변경할 때마다 새로운 객체를 생성해서 메모리가 점점 커짐
		// 	  str에 새로운 문자열값을 누적할 때마다 객체가 할당 받은 메모리의 주소값이 바뀌고 있음
		String str = "";
		System.out.println(str.hashCode()); // 0
		// 객체명.hashCode() ==> 객체가 할당받은 메모리의 주소값(정수)
		
		str += "안녕";
		System.out.println(str.hashCode()); // 1611021
		
		str += "하세요";
		System.out.println(str.hashCode()); // 803356551
		
		str += "행복하세요";
		System.out.println(str.hashCode()); // -280857471
		
		System.out.println(str); // 안녕하세요행복하세요
		System.out.println("str 크기 : " + str.length()); // 10
		
		System.out.println("\r\n====================================\r\n");
		
		// StringBuilder는 비어있는 객체를 하나 만들어서 그 공간 안에 문자열을 담음 >> 메모리주소(해시코드)값은 동일!
		StringBuilder sbuilder = new StringBuilder();
		sbuilder.append("안녕");
		System.out.println(sbuilder.hashCode()); // 2018699554
		
		sbuilder.append("하세요");
		System.out.println(sbuilder.hashCode()); // 2018699554
		
		sbuilder.append("행복하세요");
		System.out.println(sbuilder.hashCode()); // 2018699554
		
		System.out.println(sbuilder.toString()); // 안녕하세요행복하세요
		System.out.println("sbuilder 크기 : " + sbuilder.length()); // 10
		
		System.out.println("\r\n====================================\r\n");
		
		// StringBuffer는 주로 게임에서 권장, 다중접속시스템, 멀티스레드 하에서 움직이는 경우가 많기 때문
		// 웹에서는 싱글스레드를 많이 쓰기 때문에 StringBuilder를 많이 사용 
		StringBuffer sbuffer = new StringBuffer();
		sbuffer.append("안녕");
		System.out.println(sbuffer.hashCode()); // 1311053135
		
		sbuffer.append("하세요");
		System.out.println(sbuffer.hashCode()); // 1311053135
		
		sbuffer.append("행복하세요");
		System.out.println(sbuffer.hashCode()); // 1311053135
		
		System.out.println(sbuffer.toString()); // 안녕하세요행복하세요
		System.out.println("sbuffer 크기 : " + sbuffer.length()); // 10

		
		// 그렇지만 String은 초기에는 메모리 차지하는 공간이 얼마 되지 않기 때문에 보통 String만 쓰는게 낫긴함. 
		// 만약 문자열 값이 계속 바뀌는 경우에는 StringBuffer나 Builder를 쓰는게 맞다!
		
		 
	} // end of main()

} // end of class
