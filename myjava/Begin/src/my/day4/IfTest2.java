package my.day4;

import java.io.IOException;


public class IfTest2 {
	
	/*public void showInfo(int n) {
		
		if(65<=n && n<=90) { // 영문대문자
			System.out.println("입력하신 "+(char)n+"글자는 영문대문자 입니다.");
		}
		else if(97<=n && n<=122) { // 영문소문자
			System.out.println("입력하신 "+(char)n+"글자는 영문소문자 입니다."); 
		}
		else if(48<=n && n<=57) { // 숫자
			System.out.println("입력하신 "+(char)n+"글자는 숫자 입니다.");
		}
		else { // 영문자,숫자를 제외한 나머지
			System.out.println("입력하신 "+(char)n+"글자는 특수문자 입니다.");
		}
		
	}*/

	public void showInfo(int n) {
		
		char ch = (char)n;
		
		if('A'<=ch && ch<='Z') { // 영문대문자
			System.out.println("입력하신 "+ch+"글자는 영문대문자 입니다.");
		}
		else if('a'<=ch && ch<='z') { // 영문소문자
			System.out.println("입력하신 "+ch+"글자는 영문소문자 입니다."); 
		}
		else if('0'<=ch && ch<='9') { // 숫자
			System.out.println("입력하신 "+ch+"글자는 숫자 입니다.");
		}
		else { // 영문자,숫자를 제외한 나머지
			System.out.println("입력하신 "+ch+"글자는 특수문자 입니다.");
		}
		
	}
	
	public static void main(String[] args) 
		throws IOException {
		
		System.out.print("글자 1개를 입력하세요 => ");
		
		int n = System.in.read();
		// System.in 은 키보드
		// System.in.read() 은 키보드로 부터 입력받은 글자중
		// 첫번째 글자 1개만 읽어들이는 것이다.
		// 리턴타입은 int 타입이다.
		
		IfTest2 obj = new IfTest2();
		obj.showInfo(n);
		
	}

}
