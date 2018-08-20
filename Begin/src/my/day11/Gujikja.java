package my.day11;
// 180820 10:35AM

import java.text.DecimalFormat;
import java.util.Calendar;

// 구인구직 프로그램 구성하기(1) 구직자 클래스

/*
	>> 객체지향 프로그래밍(Object Oriented Programming; OOP)
		- 구직자 회사 채용 세 가지 부품이 있어야만 시스템 동작 가능 -> 부품을 만들기 위해서는 설계도 필요 ==> "클래스"
		- 이러한 설계도 클래스에 따라 만들어진 부품 ==> "객체"
		- 현실세계에 존재하는 다양한 객체들을 "추상화"시켜 클래스로 옮기는 것을 "객체지향 프로그래밍(OOP)"이라 한다
		
		※ OOP의 4가지 특징 (★필수 암기) --> "상추캡다"로 외우래....
			1. 상 속성
			2. 추 상화(abstraction)
			 	- object에서 주된 특징을 부각시켜 표현, 나머지 부분을 과감히 생략함 <-> 세밀한 부분까지 모두 표현하는 것은 정밀화
				- 어떤 물체를 대표하는 속성(property or field or attribute; 명사, 인스턴스멤버변수)과 기능(동사, 메소드, 함수)을 추출
				- ex) "구직자" 부품
					- 속성(멤버변수): 아이디, 비밀번호, 이름, 연락처, 이메일, 주소, 희망구직직종, 희망연봉, 학력, 경력사항, 포트폴리오
					- 행동양식(메소드): 구직자 로그인기능, 구직자 정보 조회 기능, 정보 변경 기능, ...
			3. 캡 슐화
			4. 다 형성
*/

public class Gujikja {

	// 객체를 몇개 만들었는지 count (생성된 Gujikja 객체 개수 세기)
	static int count; 
	
	// 1. Gujija클래스의 속성 정하기(추상화)
	
	String userid; // 아이디
	String passwd; // 암호
	String name;   // 이름
	String birthday; // 생년월일(19930820)
	int    gender; // 성별 ("남"; 1 / "여"; 2) -> 유추 가능 => 구분지을 때 단순하게 숫자로 받는게 편함 --> ★유추 가능할 때는 "코드화"★
				   // 데이터가 일치하는지의 여부 -> "유효성검사" ---> 데이터 유효성검사를 모두 한 다음에 올바른 데이터를 입력하도록 해야함
				   // 여기에는 반드시 1 또는 2 값만 받아야함
	String address; // 주소
	int	   school; // 학력 ("대졸 이상";1, "초대졸";2, "고졸";3, "고졸미만";4) => 얘도 유추 가능하니까 코드화
	String mobile; // 연락처
	String hopejob; // 희망 직종; 원래 코드화 해야하지만 많으니까.. ("사무직", "생산직", "일용직",...)
	int	   hopemoney; // 희망 연봉

	
	// 2. 기본생성자, 파라미터가 있는 생성자 만들기
	public Gujikja( ) {
		
	}
	
	public Gujikja(String userid, String passwd, String name, String birthday, int gender, String address, int school,
			String mobile, String hopejob, int hopemoney) {
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.address = address;
		this.school = school;
		this.mobile = mobile;
		this.hopejob = hopejob;
		this.hopemoney = hopemoney;
		
		count++;
	}
	
	
	// 3. 기능 만들기(메소드) --------------------------------------------
	// 3-1. 구직자가 로그인 할 수 있는 기능 --> boolean형으로 리턴
	public boolean login(String userid, String passwd) {
		if(userid.equals(this.userid) && passwd.equals(this.passwd)) { // 등록된 아이디, 패스워드와 입력한 값이 동일할 때
			return true;
		}
		else
			return false;
	}
	
	
	
	// 3-2. 구직자의 현재 나이 조회 기능
	public String getAge() {
		Calendar currentdate = Calendar.getInstance(); // 현재날짜와 시간을 얻어온다.
		
		int currentYear = currentdate.get(Calendar.YEAR); // 현재 연도 얻어옴
		
		// 나이: 현재연도 - 출생연도 +1
		int birthYear = Integer.parseInt(birthday.substring(0, 4)); // 지정된 인덱스값 이상 ~ 인덱스값 미만의 문자열 가져오기
		// birthday의 경우 메인메소드에서 숫자만 넣을 수 있게끔 필터 걸 예정
		
		return String.valueOf(currentYear-birthYear+1);
	}
	
	
	// 3-3. a) 구직자의 성별 조회 기능 (일단 내가 해본 것; if)
	public String getGender() {
		String strGen ="";
		if(this.gender==1)
			strGen="남";
		else if(this.gender==2)
			strGen="여";
		
		return strGen;
	}
	
	
	// 3-3. b) 구직자 성별 조회 기능 (강사님이 한것; switch)
	public String getGender1() {
		String result = "";
		
		switch (gender) {
		case 1:
			result = "남자";
			break;

		case 2:
			result = "여자";
			break;
		
		}
		return result;
	}
	
	
	
	// 3-4. 구직자의 최종학력 조회 기능
	public String getSchool() {
		String lastSch ="";
		switch(school) {
		case 1:
			lastSch="대졸 이상";
			break;
		case 2:
			lastSch="초대졸";
			break;
		case 3:
			lastSch="고졸";
			break;
		case 4:
			lastSch="고졸 미만";
			break;
		}
		return lastSch;
	}
	
	
	// 3-5. 희망 급여 조회 기능 (#,###만원)
	public String getHopemoney() {
		DecimalFormat df = new DecimalFormat("#,###");
		return df.format(hopemoney)+"만원";
	}
//	
//	// 3-5 cf) 모바일폰 넘버 포맷 변경
//	public String getMobile() {
//		DecimalFormat df = new DecimalFormat("###-####-####");
//		return df.format(mobile);
//	}
//	
	
	
	
	// 3-6. 구직자 정보 조회 기능
	public String getGujikjaInfo() {
		String info="=== "+name+"님의 프로필 ===\n"+
					"01. 아 이 디: "+userid+"\n"+
					"02. 암	호: "+passwd+"\n"+
					"03. 성	명: "+name+"\n"+
					"04. 현재나이: "+getAge()+"\n"+
					"05. 성	별: "+getGender()+"\n"+
					"06. 주	소: "+address+"\n"+
					"07. 최종학력: "+getSchool()+"\n"+
					"08. 연 락 처: "+mobile+"\n"+
					"09. 희망직종: "+hopejob+"\n"+
					"10. 희망연봉: "+getHopemoney()+"\n";
	
		return info;
	}
	
	// -------------------------------------------------------------끝
	
	
	
} // end of class
