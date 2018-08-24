package my.day14.Inheritance_ex2;
// 학생 클래스
public class Student extends Common{ // 1. 상속

//	2. 추상화(Common클래스와 차별화 된 요소)
	private String hakbun;			// 학번
	private String guardEmail;		// 학부모 이메일주소(고유한 값)
	private String awardsCareer;	// 수상경력
	
//	3. 생성자
	public Student() {}		// super()가 자동 호출되기 때문에 count++ 연산 해줄 필요 X(super에 이미 되어있음)
	public Student(String id, String pw, String name, String email, 
				   String hakbun, String guardEmail, String awardsCareer) {
		super(id, pw, name, email);
		this.hakbun = hakbun;
		this.guardEmail = guardEmail;
		this.awardsCareer = awardsCareer;
	}
	
//	4. getter setter -> 메인메소드에서 활용하기 위한 수단
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getGuardEmail() {
		return guardEmail;
	}
	public void setGuardEmail(String guardEmail) {
		this.guardEmail = guardEmail;
	}
	public String getAwardsCareer() {
		return awardsCareer;
	}
	public void setAwardsCareer(String awardsCareer) {
		this.awardsCareer = awardsCareer;
	}
	
//	5. 메소드 만들기
	
//	1) 학생 정보 출력하기
	@Override	
// 	메소드의 오버라이딩(부모클래스의 메소드를 자식클래스에서 재정의 -> 덮어쓰기)
// 	오버라이딩 할때 접근제한자를 자식클래스가 부모클래스의 범위보다 작게 쓸 수 없음 (publil > protected > default > private)
//	대부분은 접근제한자를 통일시킴!
	public void showInfo() {
		System.out.println("======= 학생회원 "+getName()+"님의 정보 =======");
		System.out.println("01. 학     번	: "+hakbun);
		System.out.println("02. 성     명	: "+getName());
		System.out.println("03. 이 메 일 	: "+getEmail());
		System.out.println("04. 수상경력	: "+awardsCareer);
		System.out.println("");
		
	}
	
//	2) 학생 로그인 기능
	@Override
	public Common login(String id, String pw) {
		if(getId() != null && getPw() != null) {
			if(getId().equals(id) && getPw().equals(pw)) {
				System.out.println(">> 학생회원 "+getName()+"님 환영합니다! <<");
				return this;
			}
			else {
				System.out.println(">> 로그인 실패! <<");
				return null;
			}		
		}
		else {
			System.out.println(">> 등록된 회원이 아닙니다. 회원가입을 진행하세요. <<");
			return null;
		}
			
	} // end of login()
} // end of class
