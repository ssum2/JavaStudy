package my.day13.sub;

public class Recruit {

/*
 	1. Recruit.class 추상화 
 		- 구인회사
 		- 채용 대상 성별 (1.남/2.여/3.성별무관)
 		- 채용 최소 나이
 		- 채용 최대 나이
 		- 채용 학력 제한(1.대졸이상/2.초대졸/3.고졸/4.학력무관)
 		
 */
	private Company company;
	private String genderLimit;
	private int agemin;
	private int agemax;
	private String schoolLimit;
	
	public static int count;	// Recruit 객체 생성 카운트
	
//	2. 생성자 만들기
	public Recruit() { count++; }
		
	public Recruit(Company company, String gender, int agemin, int agemax, String school) {
		this.company = company;
		this.genderLimit = gender;
		this.agemin = agemin;
		this.agemax = agemax;
		this.schoolLimit = school;
		
		count++;
	}


//	3. getter setter 만들기
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public String getGenderlimit() {
		return genderLimit;
	}
	public void setGenderlimit(String genderlimit) {
		this.genderLimit = genderlimit;
	}
	public int getAgemin() {
		return agemin;
	}
	public void setAgemin(int agemin) {
		this.agemin = agemin;
	}
	public int getAgemax() {
		return agemax;
	}
	public void setAgemax(int agemax) {
		this.agemax = agemax;
	}
	public String getSchoollimit() {
		return schoolLimit;
	}
	public void setSchoollimit(String schoollimit) {
		this.schoolLimit = schoollimit;
	}
	
	
//	4. 메소드 만들기
//	1) 채용공고의 정보를 보여주는 기능
	public String getRecruitInfo() {
		String strSchoolLimit = "";
		switch (schoolLimit) {
		case "1":
			strSchoolLimit = "대졸 이상";
			break;
		case "2":
			strSchoolLimit = "초대졸";
			break;
		case "3":
			strSchoolLimit = "고졸";
			break;
		case "4":
			strSchoolLimit = "학력무관";
			break;

		default:
			break;
		}
		String info = 	"===== ["+company.getName()+"] 기업 채용 공고 ====="+"\n"+
						"01. 기업명	: "+company.getName()+"\n"+
						"02. 대표자명	: "+company.getCeo()+"\n"+
						"03. 자본금	: "+company.getSeedmoney()+"\n"+
						"04. 업종		: "+company.getJobtype()+"\n"+
						"05. 주소		: "+company.getAddress()+"\n"+
						"06. 대표번호	: "+company.getStrTel()+"\n"+
						"07. 채용성별	: "+genderLimit+"\n"+
						"08. 채용연령대	: "+agemin+"세 ~"+agemax+"세"+"\n"+
						"09. 채용학력	: "+strSchoolLimit+"\n";
		return info;
	}
	
	
	
	
	
} // end of class
