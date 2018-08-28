package my.day16.Exception2;

public class MemberMain {

	public static void main(String[] args)  {
		Member mem = new Member();
		try {
//			mem.setId("admin");
			mem.setId("hongkd");
			mem.setPw("qwer234$");
			mem.setName("홍길동");
		} catch (UserDefineExceptionID e) {
//			e.printStackTrace(); 		>> 어디서 잘못됐는지 위치 찾을 때
			System.out.println("오류: "+e.getMessage());	// 단순 오류 내용 출력
		}
		
		Member mem2 = null;
		try {
//			mem2 = new Member("abcd", "qwer1234$", "이순신");
//			mem2 = new Member("superman", "qwer1234$", "이순신");
			mem2 = new Member("leess", "qwer1234$", "이순신");
		} catch (UserDefineExceptionID e) {
			e.printStackTrace();

		}
	
	}

}
