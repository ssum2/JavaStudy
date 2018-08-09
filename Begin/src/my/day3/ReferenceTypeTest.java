package my.day3;

public class ReferenceTypeTest {

	public static void main(String[] args) {
		
		// Reference Type(참조형 타입)
		// 만들어진 객체를 참조하여 값을 바꿔 출력
		
		Heowon me = new Heowon(); // me는 하나의 객체변수
		me.userid ="suji";
		me.userpw ="asdf1234!";
		me.name ="수지";
		me.age = 26;
		me.addr = "서울시 강남구";
		
		System.out.println("me => "+me); 
		// me => my.day3.Heowon@7852e922
		// >> my.day3 경로에 있는 Heowon 클래스를 가지고 생성된 객체me의 메모리 상 올라가 있는 주소값 @7852e922

		
		Heowon you = new Heowon();
		you.userid ="suji";
		you.userpw ="asdf1234!";
		you.name ="수지";
		you.age = 26;
		you.addr = "서울시 강남구";
		
		System.out.println("you => "+you);
		// you => my.day3.Heowon@4e25154f
		// >> my.day3 경로에 있는 Heowon 클래스를 가지고 생성된 객체you의 메모리 상 올라가 있는 주소값 @4e25154f
		
		boolean bool = (me == you); // 객체가 다르고 점유하고있는 메모리의 주소값이 다르기 때문에 false
		System.out.println("bool => " +bool);
		
		
		// 데이터를 바꿨을 때 어떻게 나올까
		System.out.println("\n===== 데이터 변경 전 =====");
		me.showInfo();
		you.showInfo();
		
		System.out.println("\n===== 데이터 변경 후 =====");
		//대입해주는 값이 없기 때문에 return타입이 없음 -> 파라미터에 있는 정보만 가져가서 출력해주면됨
		me.setUserid("sumi");
		me.setPasswd("abcd0070");
		me.setName("배수미");
		me.setAge(27);
		me.setAddr("경기도 부천시");
		
		me.showInfo();
		you.showInfo();
		
		System.out.println("\n+++++++++++++++++++++++++++++++++++\n");
		// me == you 일 때 데이터 변경 결과
		
		me = you; // you의 my.day3.Heowon@4e25154f 값을 me에 넣는다
		bool = (me == you); 
		System.out.println("bool => " +bool); // you 값을 me에 넣어서 you == me 됨
		System.out.println("me주소값: "+me);
		System.out.println("you주소값: "+you);
		System.out.println("");
		
		you.setUserid("leess");
		you.setPasswd("zxcv0070");
		you.setName("이순신");
		you.setAge(48);
		you.setAddr("전라남도 해남시");
		
		me.showInfo();
		you.showInfo();
		
		// me와 you가 동일한 내용이 출력됨
		
		//cf) me값과 you값을 다시 분리하고 싶을 때, me는 초반의 주소와 같아질까?
		me = new Heowon();
		System.out.println("me의 새로운 주소" + me); // 새로운 주소값이 부여됨 ==> 결론: 달라짐!
		me.showInfo();
		
	} // end of main()

} // end of class
