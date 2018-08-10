package my.day4;

import java.io.IOException;
//import java.util.Scanner;

public class IfTest2 {
	
//		>>>>>>>>>>>>>글자 형태 구분하는 인스턴스 메소드 만드는 방법 1<<<<<<<<<<<<<
	/*public void showInfo(int n) {
		if(65 <= n && n <= 90 ) { //입력받은 값이 영문대문자일 때
			// A   &&    B => A B 둘 다 참일 때 돌아감
			System.out.println("입력하신 "+(char)n+"는 영문대문자 입니다.");
		}
		else if(97<=n && n<=122) { // 소문자일 때
			System.out.println("입력하신 "+(char)n+"는 영문소문자 입니다.");
		}
		else if(48<=n && n<=57) { // 숫자일 때
			System.out.println("입력하신 "+n+"는 숫자 입니다.");
		}
		else { // 특수문자일 때(영문 숫자 제외한 나머지)
			System.out.println("입력하신 "+(char)n+"는 특수문자 입니다.");
		}
	}*/
	
	
	//	>>>>>>>>>>>>>글자 형태 구분하는 인스턴스 메소드 만드는 방법 2<<<<<<<<<<<<<
	public void showInfo(int n) {
		char ch = (char)n; // 여기서 미리 n 형태를 char로 바꿔줌
		// ==> 지역변수 ch로 비교연산 할 경우에는 ''쓰고 값 그대로 써도 됨!
		if('A' <= ch && ch <= 'Z' ) { //입력받은 값이 영문대문자일 때
			// A   &&    B => A B 둘 다 참일 때 돌아감
			System.out.println("입력하신 "+ch+"는 영문대문자 입니다.");
		}
		else if('a'<=ch && ch<='z') { // 소문자일 때
			System.out.println("입력하신 "+ch+"는 영문소문자 입니다.");
		}
		else if('0'<=n && n<='9') { // 숫자일 때
			System.out.println("입력하신 "+ch+"는 숫자 입니다.");
		}
		else { // 특수문자일 때(영문 숫자 제외한 나머지)
			System.out.println("입력하신 "+ch+"는 특수문자 입니다.");
		}
	
	}
	
	
	public static void main(String[] args) 
			throws IOException {
		//입력되는 글자의 형태 구분
//		Scanner sc = new Scanner(System.in);
		
		System.out.print("글자 1개를 입력하세요 => ");
		
		int n = System.in.read(); // 입력될 값이 숫자일지 영문자일지 특수기호일지 모름 
		// IOExeption
		// System.in.read(); : 키보드로부터 입력받은 글자 중 첫번째 글자 1개만 읽어들이는 인스턴스메소드, 리턴타입 int
//		System.out.println(n);
//		글자 1개를 입력하세요 => abcd (입력)
//		(출력 ==>) 97
		
		IfTest2 obj = new IfTest2();
		obj.showInfo(n);
		
		
		
		
	} // end of main()

} // end of class
