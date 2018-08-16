package my.day8;


public class MemberMain {

	public static void main(String[] args) {
		
		
		// 정상적으로 회원가입이 되었다면 배열 속에 배치
		
		Member[] memberArr = new Member[5];
		
//		for(int i=0; i<memberArr.length; i++) {
//			System.out.println("memberArr["+i+"] => "+memberArr[i]);
//			
//		}
		// 초기치 null 값으로 일괄 출력
		
		// 1. Member 클래스에서 메소드를 생성해서 검사 및 회원가입 출력하기
		Member mem1 = new Member();
		boolean bool = mem1.makeMember("leess", "abcd1234$", "이순신", "서울시 종로구");
		if(!bool) mem1 = null; // false여서 mem1을 null값으로 초기화하여 객체화를 못하게함
		
		
		System.out.println(mem1.name); 
		// mem1에 들어갈 내용이 틀려서 객체 생성이 안된 null 상태인데
		// 객체처럼 사용되고 있다는 오류 뜸 NullPointerException
		if(mem1 != null) { // null값이 아닌 경우 생성된 객체를 배열에 배치함
			memberArr[0] = mem1;
		}
		
			
		
	} // end of main()

} // end of class
