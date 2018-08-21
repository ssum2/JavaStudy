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
		
		StringBuilder sbuilder = new StringBuilder();
		sbuilder.append("안녕");
		System.out.println(sbuilder.hashCode()); // 1028566121
		
		sbuilder.append("하세요");
		System.out.println(sbuilder.hashCode()); // 1028566121
		
		sbuilder.append("행복하세요");
		System.out.println(sbuilder.hashCode()); // 1028566121
		
		System.out.println(sbuilder.toString()); // 안녕하세요행복하세요
		System.out.println("sbuilder 크기 : " + sbuilder.length()); // 10
		
		System.out.println("\r\n====================================\r\n");
				
		StringBuffer sbuffer = new StringBuffer();
		sbuffer.append("안녕");
		System.out.println(sbuffer.hashCode()); // 1118140819
		
		sbuffer.append("하세요");
		System.out.println(sbuffer.hashCode()); // 1118140819
		
		sbuffer.append("행복하세요");
		System.out.println(sbuffer.hashCode()); // 1118140819
		
		System.out.println(sbuffer.toString()); // 안녕하세요행복하세요
		System.out.println("sbuffer 크기 : " + sbuffer.length()); // 10

	}

}
