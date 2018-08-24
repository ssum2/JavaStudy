package my.day14.Inheritance_ex2;
// 보호자(모부)클래스
public class Guardian extends Common{ // 1. 상속

//	2. 추상화
	private String jobtype;			// 학부모의 직업군
	private String officeTelephone;	// 학부모 전화번호
	
//	3. 생성자
	public Guardian() {}
	
	public Guardian(String id, String pw, String name, String email, 
					String jobtype, String officeTelephone) {
		super(id, pw, name, email);
		this.jobtype = jobtype;
		this.officeTelephone = officeTelephone;
	}
	
//	4. getter setter
	public String getJobtype() {
		return jobtype;
	}

	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	}

	public String getOfficeTelephone() {
		return officeTelephone;
	}

	public void setOfficeTelephone(String officeTelephone) {
		this.officeTelephone = officeTelephone;
	}

//	5. 메소드 만들기
//	1) 학부모 정보 출력하기
	@Override
	public void showInfo() {
		System.out.println("======= 학부모회원 "+getName()+"님의 정보 =======");
		System.out.println("01. 성     명	: "+getName());
		System.out.println("02. 이 메 일 	: "+getEmail());
		System.out.println("03. 직     업	: "+jobtype);
		System.out.println("04. 근무지연락처	: "+officeTelephone);
		System.out.println("");
		
	}
	

} // end of class
