package my.day5;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// 생성자로 객체 생성
		
		Scanner sc = new Scanner(System.in);
		System.out.print("▷학번 : ");
		String hakbun = sc.nextLine();
		
		System.out.print("▷성명 : ");
		String name = sc.nextLine();
		
		System.out.print("▷국어 : ");
		int kor = Integer.parseInt(sc.nextLine()); // 인스턴스메소드에서 int값으로 받아야 하기 때문에 int로 바꿔줌
		
		System.out.print("▷영어 : ");
		int eng = Integer.parseInt(sc.nextLine());
		
		System.out.print("▷수학 : ");
		int math = Integer.parseInt(sc.nextLine());
		
		Student st1 = new Student(hakbun, name, kor, eng, math); // ==> 위에서 변수 선언 해준 것을 그대로 사용
		
		/* >> 원하는 출력결과 <<
		 * 
		 *  === 홍길동님의 정보 ===
		 *  1. 학번: kh001
		 *  2. 성명: 홍길동
		 *  3. 국어: 90
		 *  4. 영어: 91
		 *  5. 수학: 93
		 *  >> 총점: 274
		 *  >> 평균: 91.5
		 *  >> 학점: A
		 *  -- 학점: A
		 *  >> 선물: 놀이공원 이용권, 뷔페 식사권, 치킨, 아이스크림     꿀밤3대
		 *  			A			B	 C		D		F
		 */    
		
		// >> 실행 <<
		// println()의 괄호 안에는 String타입이 들어와야함 ==> 인스턴스메소드의 리턴타입이 String타입으로!
		System.out.println(st1.showInfo());
		System.out.println(st1.showTotal());
		System.out.println(st1.showAvg());
		System.out.println(st1.showHakjum()); // if로 학점 부여
		System.out.println(st1.showHakjum2()); // switch - case로 학점 부여
		System.out.println(st1.getGift());
		
	} // end of main()

} // end of StudentMain class

