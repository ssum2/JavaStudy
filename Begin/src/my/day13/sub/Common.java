package my.day13.sub;
// Common.class; 부모클래스


// cf) 모든 클래스의 뿌리인 조상클래스 Object가 있어서 얘는 자동 상속(extends Object가 생략)
public class Common {

	
// 	1. Gujikja와 Company의 공통요소(Common클래스의 속성 추상화 작업)
	static int count; 		// 생성된 Common 객체 수 카운트(Gujikja, Company 객체 모두 들어옴(다형성))
	
	private String id; 		// 아이디
	private String passwd; 	// 암호
	private String name;   	// 구직자 성명 또는 회사명
	private String address; // 주소
	private String tel; 	// 연락처(대표번호)
	
//	2. 생성자 만들기
	public Common() {}
	
	public Common(String id, String passwd, String name, String address, String tel) {
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.address = address;
		this.tel = tel;
		setPasswd(this.passwd);
	}

//	3. Getter Setter 셋팅
	public String getId() {
		return id;
	}
	public void setId(String id) {
		if(id != null)
			this.id = id;
	}

	public String getPasswd() {
// 	   *passwd에 null값이 올 수도 있기 때문에 null이 아닐때의 조건을 걸어서 필터해줘야함
		if(passwd != null) {
			return passwd.substring(0, 4)+"***"+passwd.substring(7);
		}
		else
			return passwd;
	}
	
	public String getRealPasswd() {
//			$wer1234q => qwer1234$
			String first = passwd.substring(0, 1);					// $
			String middle =passwd.substring(1, passwd.length()-1); 	// wer1234
			String last = passwd.substring(passwd.length()-1); 		// q
			passwd = last+middle+first;
			return passwd;
	}
	
	public void setPasswd(String passwd) {
//		*qwer1234$ 입력 -> $wer1234q 로 바꿔서 값 저장(암호화)
		if(passwd != null && !passwd.trim().isEmpty()) {
//			왼->오 방향으로 처리를 하는데 처음 조건에서 null이 잡혀버리면 처리X
//			==> 반드시 첫번째 조건에 null을 검사하는 것을 넣어줘야함
			String first = passwd.substring(0, 1);					// q
			String middle =passwd.substring(1, passwd.length()-1); 	// wer1234
			String last = passwd.substring(passwd.length()-1); 		// $
			this.passwd = last+middle+first;
		}
		else {
			System.out.println(">> 사용할 수 없는 암호입니다 <<");
			this.passwd = passwd; // 어차피 null이 들어올거니까 passwd대신 null 대입해도 상관 없음
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}
	public String getStrTel() {
		if(getTel().length()==10)
			return getTel().substring(0,3)+"-"+getTel().substring(3,6)+"-"+getTel().substring(6);
		else
			return getTel().substring(0,3)+"-"+getTel().substring(3,7)+"-"+getTel().substring(7);
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
//	4. 동일한 기능;메소드 만들기
//	 1) 로그인 기능 (구직자/회사)
	public Common login(String id, String passwd) {
		if(id.equals(id) && passwd.equals(passwd)) { // 등록된 아이디, 패스워드와 입력한 값이 동일할 때
			return this;
		}
		else
			return null;
	}
	
//	2) 구직자/회사 기본정보 출력 메소드
	public String commonInfo() {
		String info = "▷ 아이디: "+id+"\n"+
					  "▷ 암   호: "+getPasswd()+"\n"+
					  "▷ 성   명: "+name+"\n"+
					  "▷ 주   소: "+address+"\n"+
					  "▷ 연락처: "+getStrTel();
		return info;
				
	}
	
}