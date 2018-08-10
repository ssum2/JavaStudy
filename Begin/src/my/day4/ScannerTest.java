package my.day4;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// 유저가 키보드로 입력하는 어떤 내용을 콘솔창에서 받아서 출력
		
		Scanner sc = new Scanner(System.in); // => 키보드에서 받은 글자를 sc라는 변수에 모두 저장
		// System.in : 키보드 / System.out : 콘솔화면, 모니터
		
		System.out.println("정수를 입력하세요 => ");
		int n = sc.nextInt(); // sc.nextInt() : Scanner라는 클래스에 있는 인스턴스메소드, 리턴타입은 int
		System.out.println("입력한 정수: "+n);

//		정수를 입력하세요 => 
//		87 (입력)
//		입력한 정수: 87 (출력)
		
		System.out.println("문자열 단어를 입력하세요 => ");
		String word = sc.next(); // sc.next() : Scanner라는 클래스에 있는 인스턴스메소드, 리턴타입은 String. 공백으로 구분되는 단어만 읽어오기 때문에 공백 뒤의 글자X
		System.out.println("입력한 단어 : "+word);

//		정수를 입력하세요 => 
//		97
//		입력한 정수: 97
//		문자열 단어를 입력하세요 => 
//		서울시 강남구 도곡동
//		입력한 단어 : 서울시
		
		
		System.out.println("\n======================\n");
		System.out.println("문자열을 입력하세요 => ");
		String str = sc.nextLine(); // sc.nextLine() : 리턴타입 String, 엔터로 구분되는 문자열 전체 읽음
		System.out.println("입력한 문자열 : "+str);
	
		// 처음 nextInt에서 숫자치고 엔터 -> 숫자만 출력되고 엔터 사라짐 (정수형이기 때문에)
		// 두번째 next에서 공백으로 단어 구분해서 문자열 입력하고 엔터 -> 공백 전 단어 1개만 출력하고, 뒤에 공백, 단어들, 엔터는 남아있음(string타입이어서)
		// 세번째 nextLine은 엔터까지 받아옴 -> 앞에서 입력하고 남은 공백,남은 단어들을 엔터까지 출력 
		// 이렇게 되면 nextLine에서는 원하는 값을 입력할 수 없기 때문에 nextLine()만 사용한다
		
		sc.close();
		// 스캐너 종료
		//프로그램을 쓰지 않을 것이라면 키보드로 입력할 것이 없다고 해야 위쪽 sc객체에 노란줄 없어짐. 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // end of main()

} // end of class
