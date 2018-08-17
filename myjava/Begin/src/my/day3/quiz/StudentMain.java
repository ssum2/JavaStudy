package my.day3.quiz;

public class StudentMain {

	public static void main(String[] args) {
		
		Student st1 = new Student("kh001","홍길동", 90, 91, 93);
		Student st2 = new Student("kh002","이미자", 80, 81, 83); 
		
		System.out.println(st1.showInfo());
		System.out.println(st1.showTotal());
		System.out.println(st1.showAvg());
		/*
		   === 홍길동님의 정보 ===
		   1. 학번 : kh001
		   2. 성명 : 홍길동
		   3. 국어 : 90
		   4. 영어 : 91
		   5. 수학 : 93
		   >> 총점 : 274 
		   >> 평균 : 91.33333
		 */

	}

}
