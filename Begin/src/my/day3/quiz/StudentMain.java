package my.day3.quiz;

public class StudentMain {

	public static void main(String[] args) {
		// 생성자로 객체 생성
		Student st1 = new Student("kh001", "홍길동", 90, 91,93);
		Student st2 = new Student("kh002", "이미자", 80, 81,82);
		
		/* >> 원하는 출력결과 <<
		 * 
		 *  === 홍길동님의 정보 ===
		 *  1. 학번: kh001
		 *  2. 성명: 홍길동
		 *  3. 국어: 90
		 *  4. 영어: 91
		 *  5. 수학: 92
		 *  >> 총점: 274
		 *  >> 평균: 91.3333
		 */
		
		// >> 실행 <<
		// println()의 괄호 안에는 String타입이 들어와야함 ==> 인스턴스메소드의 리턴타입이 String타입으로!
		System.out.println(st1.showInfo());
		System.out.println(st1.showTotal());
		System.out.println(st1.showAvg());
		
		
		
		
		
	} // end of main()

} // end of StudentMain class

