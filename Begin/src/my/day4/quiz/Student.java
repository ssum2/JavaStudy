package my.day4.quiz;

public class Student {
    
	
	// 인스턴스 멤버변수. 속성값
	String hakbun;
	String name;
	byte kor;
	byte eng;
	byte math;

	
	public void Student() {} // 기본생성자 만듦
	
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
	
	// 소수점 첫번째자리까지 살리고 반올림한 값 도출하기
	public String showAvg() {
		String avg1 = ">> 평균: "+ Math.round((double)(kor+eng+math)/3*10)/10.0;
		return avg1;
		
	}
	
	public String showHakjum() {
		
		double avg3 = Math.round((double)(kor+eng+math)/3*10)/10.0;
		String hakjum = "";
		if(90<=avg3) {
			hakjum = "A";
		
		} 
		else if(80<=avg3) {
			hakjum = "B";
		} 
		else if(70<=avg3) {
			hakjum = "C";
		}
		else if (60<=avg3) {
			hakjum = "D";
		}
		else {
			hakjum = "F";
		}
		
		
		return ">> 학점: "+hakjum;
		
		// 내가 따로 해본거
//		double avg2 = Math.round((double)(kor+eng+math)/3*10)/10.0;
//		char hakjum1;
//		if(90<=avg2 && avg2<=100) {
//			return String.valueOf(hakjum1 = 'A');
//			
//		}
	}
	
	
	
} // end of Student class
