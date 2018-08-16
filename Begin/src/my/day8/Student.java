package my.day8;

public class Student {

	static int count;
	
	String hakbun;
	String passwd;
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	String hakjum;
	
	public Student() {
		count++; // 이 값은 배열의 사이즈를 over할 수 없음
		
	}
	
	
	public void showStudentInfo() {
		sum = kor+eng+math;
		avg = Math.round((double)(sum/3.0)*10)/10.0;
		if(avg>=90) {
			hakjum ="A";
		}
		else if(avg>=80) {
			hakjum ="B";
			
		}
		else if(avg>=70) {
			hakjum ="C";
		}
		else if(avg>=60) {
			hakjum ="D";
		}
		else {
			hakjum="F";
		}
				
		System.out.println("-------- 학생 정보 --------");
		System.out.println("1. 학번: "+hakbun);
		System.out.println("2. 암호: "+passwd);
		System.out.println("3. 성명: "+name);
		System.out.println("4. 국어: "+kor);
		System.out.println("5. 영어: "+eng);
		System.out.println("6. 수학: "+math);
		System.out.println("7. 총점: "+sum);
		System.out.println("8. 평균: "+avg);
		System.out.println("9. 학점: "+hakjum);
		System.out.println("-----------------------\n");
	
	
	}
	
	
} // end of class
