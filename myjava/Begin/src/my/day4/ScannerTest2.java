package my.day4;

import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// System.in ==> 키보드
		
		System.out.print("정수를 입력하세요 => ");
		int n = Integer.parseInt(sc.nextLine()); 
		System.out.println("입력한 정수 : " + n);
		
		System.out.print("문자열 단어를 입력하세요 => ");
		String word = sc.nextLine();
		System.out.println("입력한 단어 : " + word);
		
		System.out.print("문자열을 입력하세요 => ");
		String str = sc.nextLine();
		System.out.println("입력한 문자열 : " + str);
		
		sc.close();
	}

}
