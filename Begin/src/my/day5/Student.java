package my.day5;

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
	} // end of showHakjum()
	
	
	
	public String showHakjum2() {
		double avg4 = Math.round((double)(kor+eng+math)/3*10)/10.0;
		
		// avg4가 90 이상이라면 =>  9
		// avg4가 90 미만 80 이상이라면 => 8
		// avg4가 80 미만 70 이상이라면 => 7
		// avg4가 70 미만 60 이상이라면 => 6
		
//		 (int)avg4 인 경우에는 소수점이하를 절삭 => (int)95.8 => 95
//		 (int)avg4/10 => 92/10 93/10 95/10 ==> 9
//		 (int)avg4/10 => 100/10 ===> 10
		
		String hakjum = "";
		
		switch ((int)avg4/10) { // key값은 정수형(byte, short, int), char 또는 문자열만 가능
						// JDK 1.7 이후 버전 부터 key값은 문자열 사용이 가능
			case 10:
			case 9:
				hakjum = "A";
				break;

			case 8:
				hakjum = "B";
				break;	
				
			case 7:
				hakjum = "C";
				break;	
				
			case 6:
				hakjum = "D";
				break;	
				
			default:
				hakjum = "F";
				break;
				
		} // end of switch case
		
		return "-- 학점: "+hakjum;
	
	} // end of showHakjum2()
	
	
//	public String getGift() {
//		//놀이공원 이용권, 뷔페 식사권, 치킨, 아이스크림     꿀밤3대
//		
//		double avg = Math.round((double)(kor+eng+math)/3*10)/10.0;
//		String gift = "";
//		
//		switch ((int)avg/10) { // key값은 정수형 또는 문자열만 가능
//						// JDK 1.7 이후 버전 부터 key값은 문자열 사용이 가능
//			case 10:
//			case 9:
//				gift = "놀이공원 이용권, ";

//			case 8:
//				gift = "뷔페 식사권, ";

//			case 7:
//				gift = "치킨, ";

//			case 6:
//				gift = "아이스크림";
//				break;	
//				
//			default:
//				gift = "꿀밤 3대";
//				break;
//			
//		} // end of switch case
//		
//		return ">> 선물: "+gift;
//		
//	}
	public String getHakjum() {
		
		double avg = Math.round((double)(kor+eng+math)/3*10)/10.0;
		
		String hakjum = "";
		
		switch ((int)avg/10) { // 소수점 이하 절삭하고 10으로 나눔 => 10 9 8 7 ----
		case 10:
		case 9:
			hakjum = "A";
			break;
			
		case 8:
			hakjum = "B";
			break;
			
		case 7:
			hakjum = "C";
			break;	
			
		case 6:
			hakjum = "D";
			break;
			
			
		default:
			hakjum = "F";
			break;
		} // end of switch case
		return hakjum;
	} // end of getHakjum() 
	
	
	public String getGift() {
		
		String gift = "";
		
		
		switch (getHakjum()) {
		case "A":
			gift += "놀이공원 이용권, ";
			// gift = gift(아무것도 없음) + "놀이공원 이용권, ";
		case "B":
			gift += "뷔페 식사권, ";
			// gift = 앞 연산으로 들어간 gif값 "놀이공원 이용권, " + "뷔페 식사권, ";
		case "C":
			gift += "치킨, ";
		case "D":
			gift += "아이스크림";		
			break;
		default:
			gift = "꿀밤 3대";
			break;
		} // end of switch
		
		
		return ">> 선물: "+gift;
		
		
	} // end of getGift()
	
	
	
} // end of Student class
