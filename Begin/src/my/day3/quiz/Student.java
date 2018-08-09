package my.day3.quiz;

public class Student {
    
	
	// 인스턴스 멤버변수. 속성값
	String hakbun;
	String name;
	byte kor;
	byte eng;
	byte math;
	// 인스턴스 멤버변수 끝
	
	public void Student() {}
	
	public Student(String hakbun, String name, int kor, int eng, int math) {
		this.hakbun = hakbun;
		this.name = name;
		this.kor = (byte)kor;
		this.eng = (byte)eng;
		this.math = (byte)math;

	}
	
	public String showInfo() {
		
		String info1 = "=== "+name+"님의 정보 ===\n"+"1. 학번: "+hakbun+"\n2. 성명: "+name+"\n3. 국어: "+kor+"\n4. 영어: "+eng+"\n5. 수학: "+math;
		
		return info1;
		
		
	}
	
	public String showTotal() {
		String total1 = ">> 총점: "+(kor+eng+math);
		return total1;
		
	}
	
	public String showAvg() {
		String avg1 = ">> 평균: "+((kor+eng+math)/3.0);
		return avg1;
		
	}
	
} // end of Student class
