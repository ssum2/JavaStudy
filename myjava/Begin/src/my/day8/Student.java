package my.day8;

public class Student {

	static int count;
	
	String hakbun;
	String passwd;
	String name;
	int kor;
	int eng;
	int math;
	
	public Student() {
		count++;
	}
	
	public void showStudentInfo() {
		System.out.println("1. 학번 : " + hakbun);
		System.out.println("2. 암호 : " + passwd);
		System.out.println("3. 성명 : " + name);
		System.out.println("4. 국어 : " + kor);
		System.out.println("5. 영어 : " + eng);
		System.out.println("6. 수학 : " + math);
		System.out.println("7. 총점 : " + (kor+eng+math));
		
		double avg = Math.round((double)(kor+eng+math)/3 * 10)/10.0; 
		
		System.out.println("8. 평균 : " + avg);  
		
		String hakjum = "";
		
		switch ((int)avg/10) {
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
		}
		
		System.out.println("9. 학점 : " + hakjum);
		System.out.println("");
	}
	
	
}
