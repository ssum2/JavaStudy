package my.day3;

public class ReferenceTypeTest {

	public static void main(String[] args) {
		
		/* === ReferenceType(참조형타입) === */
		
		Heowon me = new Heowon();
		me.userid = "suji";
		me.passwd = "qwer1234$";
		me.name = "수지";
		me.age = 23;
		me.addr = "서울시 강남구";
		
		System.out.println("me => " + me);
		// me => my.day3.Heowon@7852e922
		
		Heowon you = new Heowon();
		you.userid = "suji";
		you.passwd = "qwer1234$";
		you.name = "수지";
		you.age = 23;
		you.addr = "서울시 강남구";
		
		System.out.println("you => " + you);
		// you => my.day3.Heowon@4e25154f
		
		boolean bool = (me == you);
		System.out.println("bool => " + bool);
		// bool => false
		
		System.out.println("\n>>> 데이터 변경전 <<<");
	 	me.showInfo();
		you.showInfo();
		
		System.out.println("\n>>> 데이터 변경후 <<<");
		me.setUserid("seoyh");
		me.setPasswd("abcd0070");
		me.setName("서영학");
		me.setAge(33);
		me.setAddr("경기도 군포시");
		
		me.showInfo();
		you.showInfo();
		
		System.out.println("################");
		
		me = you;
		bool = (me == you);
		System.out.println("bool => " + bool);
		// bool => true
		
		you.setUserid("leess");
		you.setPasswd("abcd0070");
		you.setName("이순신");
		you.setAge(45);
		you.setAddr("인천광역시 송도구");
		
		me.showInfo();
		you.showInfo();
        
	}

}
