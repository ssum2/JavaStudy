package my.day4;

import java.util.Scanner;

public class IfTest1 {

	public void holJak(int n) {
		// 어떤 값을 2로 나눴을 때 나머지가 0이면 짝수, 1이면 홀수
		if(n%2 == 0) { // 짝수일 경우
			System.out.println("입력하신 숫자 "+n+"은(는) 짝수 입니다.");
		} 
		else { // 짝수가 아닌 경우
			System.out.println("입력하신 숫자 "+n+"은(는) 홀수 입니다.");
		} // if문 끝
		
	} // holJak() 인스턴스 메소드 끝
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 =>");
		int n = Integer.parseInt(sc.nextLine());
		// 입력한 정수가 짝수인지 홀수인지 구분하는 방법
		// 입력하신 숫자 8은(는) 짝수 입니다.
		// 입력하신 숫자 9은(는) 홀수 입니다.	
	
		IfTest1 obj = new IfTest1();
		obj.holJak(n); // 리턴타입 void, 파라미터 int형인 인스턴스 메소드
		
		sc.close();
		
	
	
	} // end of main()

} // end of class
