package my.day3.quiz;

public class Student {

	String hakbun;
	String name;
	byte kor;
	byte eng;
	byte math;
	
	public Student() { }
	
	public Student(String hakbun, String name, int kor, int eng, int math) { 
		this.hakbun = hakbun;
		this.name = name;
		this.kor = (byte)kor;
		this.eng = (byte)eng;
		this.math = (byte)math;
	}
	
	public String showInfo() {
		String info = "=== "+name+"님의 정보 ===\n1. 학번 : "+hakbun+"\n2. 성명 : "+name+"\n3. 국어 : "+kor+"\n4. 영어 : "+eng+"\n5. 수학 : "+math+"";         
		return info;
	}
	
	public String showTotal() {
		String result = ">> 총점 : " + (kor+eng+math);
		return result;
	}
	
	public String showAvg() {
		String result = ">> 평균 : " + ( (double)(kor+eng+math)/3 );
		return result;
	}
	
	
	
	
}
