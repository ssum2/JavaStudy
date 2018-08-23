package my.day13.EX2;

public class Sungjuk {
	
	private Student student; // Student클래스형태의 st객체를 만들어 줌
	private int kor = -1;
	private int eng = -1;
	private int math = -1;
	// 0점은 존재할 수 있는 점수이기 때문에 오류 확인하기가 힘들어서 없는 점수인 -1로 초기화
	

	public Student getStudent() {
		return student;
	}
	public void setStudent(Student st) {
		
		if(st != null &&  				// 객체가 null 값이 될 수 없기 때문에 null이 아니라는 조건을 반드시 넣어줘야함
		   !st.getHakbun().isEmpty() && 
		   !st.getName().isEmpty() &&
		   !st.getMobile().isEmpty()) 
			this.student = st;
		else
			System.out.println(">> 입력하신 정보는 학생으로 사용불가능합니다 <<");
	}
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		if(kor>=0 && kor<=100)
			this.kor = kor;
		else
			System.out.println(">> 0~100사이의 점수만 입력 가능 합니다 <<");
	}
	
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		if(eng>=0 && eng<=100)
			this.eng = eng;
		else
			System.out.println(">> 0~100사이의 점수만 입력 가능 합니다 <<");
	}
	
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		if(math>=0 && math<=100)
			this.math = math;
		else
			System.out.println(">> 0~100사이의 점수만 입력 가능 합니다 <<");
	}
	
	public int getTotal() {
		return kor+eng+math;
		
	}
	
	public double getAvg(){
//		avg = Math.round((kor+eng+math/3.0)*10)/10.0;
//		return avg;
		// 강사님이 하신 것
		return Math.round((double)getTotal()/3*10)/10.0;
	}
	
	public String getHakjum() {
//		if(avg>=90 && avg<=100)
//			return "A";
//		
//		else if(avg>=80 && avg<=90)
//			return "B";
//		else if(avg>=70 && avg<=80)
//			return "C";
//		else if(avg>=60 && avg<=70)
//			return "D";
//		else
//			return "F";	
//		강사님이 하신 부분
		String hakjum="";
		switch ((int)getAvg()/10) {
			case 10:
			case 9:
				hakjum ="A";
				break;
			case 8:
				hakjum ="B";
				break;
			case 7:
				hakjum ="C";
				break;
			case 6:
				hakjum ="D";
				break;
			default:
				hakjum ="F";
				break;
		}// end of switch
		
		return hakjum;
	}
	
	
} // end of class
