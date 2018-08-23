package my.day13.sub;
// 180820 10:35AM
// 180823 09:20AM
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Scanner;

// 구인구직 프로그램 구성하기(1) 구직자 클래스

public class Gujikja extends Common {
	// 1. Gujija클래스의 속성 정하기(추상화)

//	◎구직자와 회사의 공통 요소 (부모 클래스에 있음)
//	String userid; // 아이디
//	String passwd; // 암호
//	String name;   // 이름
//	String address; // 주소
//	String mobile; // 연락처
	
//	◎구직자만 가지고 있는 특수요소	
	private String birthday; // 생년월일(19930820)
	private int    gender; // 성별 ("남"; 1 / "여"; 2) -> 유추 가능 => 구분지을 때 단순하게 숫자로 받는게 편함 --> ★유추 가능할 때는 "코드화"★
				   // 데이터가 일치하는지의 여부 -> "유효성검사" ---> 데이터 유효성검사를 모두 한 다음에 올바른 데이터를 입력하도록 해야함
				   // 여기에는 반드시 1 또는 2 값만 받아야함
	private int	   school; // 학력 ("대졸 이상";1, "초대졸";2, "고졸";3, "고졸미만";4) => 얘도 유추 가능하니까 코드화
	private String hopejob; // 희망 직종; 원래 코드화 해야하지만 많으니까.. ("사무직", "생산직", "일용직",...)
	private int	   hopemoney; // 희망 연봉

	
	// 2. 기본생성자, 파라미터가 있는 생성자 만들기
	public Gujikja( ) { count++; }	// 부모클래스의 static변수를 끌어옴
	public Gujikja(String id, String passwd, String name, String address, String tel, 
					String birthday, int gender, int school, String hopejob, int hopemoney) {
		super(id, passwd, name, address, tel);
		this.birthday = birthday;
		this.gender = gender;
		this.school = school;
		this.hopejob = hopejob;
		this.hopemoney = hopemoney;
		count++;	
	}

	// 3. 기능 만들기(메소드) --------------------------------------------
//	// 3-1. 구직자가 로그인 할 수 있는 기능 --> boolean형으로 리턴
//	public boolean login(String userid, String passwd) {
//		if(userid.equals(this.userid) && passwd.equals(this.passwd)) { // 등록된 아이디, 패스워드와 입력한 값이 동일할 때
//			return true;
//		}
//		else
//			return false;
//	}
//	
//	// 180821_09:20AM 강사님이 해주신 부분 ---------------------
//	// 3-1. 구직자가 로그인 할 수 있는 기능
//		public Gujikja login2(String userid, String passwd) {
//			// 객체타입으로 반환
//			if(this.userid.equals(userid) &&
//			// 그 객체의 아이디와 (this.userid) 내가 입력한 아이디(userid)가 같은가?
//				this.passwd.equals(passwd)) {
//			// 그 객체의 암호와 (this.passwd) 내가 입력한 암호(userpasswd)가 같은가?
////				System.out.println(">> 로그인 성공 <<");
//				return this; // 그 객체를 반환
//			}
//			else {
////				System.out.println(">> 로그인 실패 <<");
//				return null;
//			}
//		
//		} // end of login() -------------------------------
	

	// 3-2. 구직자의 현재 나이 조회 기능
	public String getAge() {
		Calendar currentdate = Calendar.getInstance(); // 현재날짜와 시간을 얻어온다.
		
		int currentYear = currentdate.get(Calendar.YEAR); // 현재 연도 얻어옴
		
		// 나이: 현재연도 - 출생연도 +1
		int birthYear = Integer.parseInt(birthday.substring(0, 4)); // 지정된 인덱스값 이상 ~ 인덱스값 미만의 문자열 가져오기
		// birthday의 경우 메인메소드에서 숫자만 넣을 수 있게끔 필터 걸 예정
		
		return String.valueOf(currentYear-birthYear+1);
	}
	

	public void setGender(int gender) {
		this.gender = gender;
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

		
	// 3-5 cf) 모바일폰 넘버 포맷 변경; 강사님이 한 것
		public String getMobile() {
			// mobile의 길이가 10 일때
			if(getTel().length()==10)
				return getTel().substring(0,3)+"-"+getTel().substring(3,6)+"-"+getTel().substring(6);
			else
				return getTel().substring(0,3)+"-"+getTel().substring(3,7)+"-"+getTel().substring(7);
		}
	
	// 3-6. 구직자 정보 조회 기능
	public String getGujikjaInfo() {
		String info="\n===== "+getName()+"님의 정보 =====\n"+
				  	commonInfo()+"\n"+
				  	"▷ 나이: "+getAge()+"\n"+
				  	"▷ 성별: "+getGender()+"\n"+
				  	"▷ 휴대폰: "+getMobile()+"\n"+
				  	"▷ 최종학력: "+getSchool()+"\n"+
				  	"▷ 희망직종: "+hopejob+"\n"+
				  	"▷ 희망연봉: "+getHopemoney()+"\n";

		return info;
	}

//  getter setter
	
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public String setAge(String birthday) {
		this.birthday = birthday;
		Calendar currentdate = Calendar.getInstance(); // 현재날짜와 시간을 얻어온다.
		
		int currentYear = currentdate.get(Calendar.YEAR); // 현재 연도 얻어옴
		
		// 나이: 현재연도 - 출생연도 +1
		int birthYear = Integer.parseInt(birthday.substring(0, 4)); // 지정된 인덱스값 이상 ~ 인덱스값 미만의 문자열 가져오기
		// birthday의 경우 메인메소드에서 숫자만 넣을 수 있게끔 필터 걸 예정
		
		return String.valueOf(currentYear-birthYear+1);
	}
	
	public String setGender1(String gender) {
		String result = "";
		this.gender = Integer.parseInt(gender);
		switch (gender) {
		case "1":
			result = "남자";
			break;

		case "2":
			result = "여자";
			break;
		}
		return result;
	}

	public String setSchool(int school) {
		String lastSch ="";
		this.school = school;
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
	
	public String setMobile(String mobile) {
		mobile = super.getTel();
		// mobile의 길이가 10 일때
		if(mobile.length()==10)
			return mobile.substring(0,3)+"-"+mobile.substring(3,6)+"-"+mobile.substring(6);
		else
			return mobile.substring(0,3)+"-"+mobile.substring(3,7)+"-"+mobile.substring(7);
	}

	public String getHopejob() {
		return hopejob;
	}
	public void setHopejob(String hopejob) {
		this.hopejob = hopejob;
	}

	public String setHopemoney(int hopemoney) {
		this.hopemoney = hopemoney;
		DecimalFormat df = new DecimalFormat("#,###");
		return df.format(hopemoney)+"만원";
	}
	
} // end of class
