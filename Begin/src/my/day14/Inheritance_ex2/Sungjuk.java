package my.day14.Inheritance_ex2;

public class Sungjuk {
	private String hakbun;		// 시험 본 학생의 학번(고유값)
//	private Student student;	// 학생의 정보를 전부 가져오고 싶을때, Student형으로 선언해서 객체를 가져옴
	private String yearQuarter;	// 분기별 시험
	private int kor;
	private int eng;
	private int math;
	private int science;
	private int society;
	
	
	public Sungjuk() {}
	public Sungjuk(String hakbun, String yearQuarter, int kor, int eng, int math, int science, int society) {
		this.hakbun = hakbun;
		this.yearQuarter = yearQuarter;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.science = science;
		this.society = society;
	}

	
	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public String getYearQuarter() {
		return yearQuarter;
	}

	public void setYearQuarter(String yearQuarter) {
		this.yearQuarter = yearQuarter;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		if(0<=kor && kor<=100)
			this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getSociety() {
		return society;
	}

	public void setSociety(int society) {
		this.society = society;
	}
	
//	★ 메소드의 오버로딩(OverLoading)
//	 - 메소드의 이름과 파라미터의 타입, 갯수가 같으면 중복된 메소드라고 인식함(중복O)
	
//	 - 파라미터의 갯수는 똑같지만 파라미터의 타입(종류)이 다른 경우 다른 메소드라고 인식(중복X)
//		> 파라미터가 써진 순서대로 타입을 비교함(파라미터의 위치)
//	 - 파라미터의 타입은 동일하지만 파라미터의 갯수가 다른 경우 다른 메소드라고 인식(중복X)
//	 - 리턴타입이 달라도 파라미터 타입과 갯수가 동일하면 중복된 메소드라고 인식 ==> ※리턴타입은 관계없음!
//	 - 메소드의 이름은 파라미터가 다르면 중복사용 가능(파라미터만 다르면 다른 메소드라고 인식)
	
	public void setJumsu(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;	
	}
	
	public void setJumsu(int kor, int eng, int math, int science, int society) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.science = science;
		this.society = society;
	}

} // end of class
