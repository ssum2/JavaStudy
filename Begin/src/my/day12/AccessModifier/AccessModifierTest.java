package my.day12.AccessModifier;
/*
	> 캡슐화(은닉화)
		- 접근제한자(접근지정자, accessmodifier)
		 												다른 패키지에 있는
						현재 클래스 내부	동일 패키지에 있는 타 클래스	하위(자식)클래스		그 외의 영역
			public			O				O				O				O
			protected		O				O				O				X
			default			O				O				X				X
			private			O				X				X				X	
		
		- private와 public을 가장 많이 사용 
		  - private로 변수 선언해서 public 메소드로 개발자의 의도대로 활용할 수 있게 함
*/
public class AccessModifierTest {
// 현재 클래스 내부
	
	public String userid = "superman";
	protected String passwd = "qwer1234$";
	String name = "이순신";
	private String address = "서울시 종로구";

}
