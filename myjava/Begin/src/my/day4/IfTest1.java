package my.day4;

import java.util.Scanner;

public class IfTest1 {

	public void holJak(int n) {
		
		if(n%2 == 0) {
			System.out.println("입력하신 숫자 "+n+"은(는) 짝수 입니다.");
		}
		else {
			System.out.println("입력하신 숫자 "+n+"은(는) 홀수 입니다.");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 => ");
		int n = Integer.parseInt(sc.nextLine());
		
		IfTest1 obj = new IfTest1();
		obj.holJak(n);
		// 입력하신 숫자 8은(는) 짝수 입니다.
		// 입력하신 숫자 9은(는) 홀수 입니다.
		
		sc.close();

	}//end of main()------------------------

}
