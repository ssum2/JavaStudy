package my.day3;
	/*
		=== *** wrapper 클래스 *** ===
		
		------------------------------
		    기본자료형(원시형)      클래스형
		------------------------------
		   byte               Byte
		   short              Short
		   char               Character
		   int                Integer
		   long               Long
		   float              Float
		   double             Double
		   boolean            Boolean
		-------------------------------  
			첫글자만 대문자로 바꿔준 격임
		
		   기본자료형(원시형)은 데이터 저장 및 단순히 4칙연산에서만 사용하는 것이고,
		   클래스형은  데이터 저장 및  4칙연산 뿐만 아니라
		   아주 다양한 기능의 메소드가 있어서 다방면으로 사용되어진다. 
		   
		=== !!!! 반드시 꼭 기억합시다. !!! ===
		   웹사이트 에서 입력되어지는 모든 데이터는 그 타입이 무조건!!!!
		String(문자열) 타입이다.
		
		   로그인시 아이디 입력란 : superman  ==> String(문자열)
		   회원가입시 나이 입력란 : 26        ==> String(문자열)
		   배송일자 입력란 : 2018-01-26     ==> String(문자열)
		   
		   그런데 웹사이트에서 숫자모양을 띄는 문자열을 받아서 4칙연산을 하고자 한다.
		   예> 26 + 1 => 27   "26" + 1 => 261 ==> 문자열 결합연산으로 261이 나오는 것
		    26 - 1 => 25    "26" - 1 => error
		   
		해결책> 문자열로 되어진 "26"을 숫자(int)형태로 바꾸어 주어야 한다.
		
		      
		      
		 오토박싱으로 int를 써도 Integer로 바뀜
		 
	*/

public class WrapperTest {

	public static void main(String[] args) {
		char ch ='a';
		System.out.println("ch: "+ch+"\n");
		//ch: a
		
		Character chr = 'a';
		System.out.println("chr: "+chr+"\n");
		// chr: a
		
		System.out.println("----------소문자일때 참 아니면 거짓---------");
		boolean bool = Character.isLowerCase(ch); // 클래스이기 때문에 static 메소드들을 쓸 수 있음
		//Character.isLowerCase(char ch)는 boolean형으로 출력되는데, 이는 ch에 영문 소문자가 들어왔을 때 T/F를 판별하는 것
		//Character.isLowerCase(int codepoint)는 boolean형으로 출력되는데, 이는 int값으로 영문 소문자(ASCII코드) 들어왔을 때 T/F를 판별하는 것
		System.out.println("bool: "+bool);
		//bool: true
		bool = Character.isLowerCase('A');
		System.out.println("bool: "+bool);
		//소문자가 아니기 때문에 false
		bool = Character.isLowerCase(67); // 'C'
		System.out.println("bool: "+bool);
		// bool: false
		
		System.out.println("--------대문자일 때 참 아니면 거짓--------");
		// 대문자가 왔을 때 T, 아니면 F
		bool = Character.isUpperCase('B');
		System.out.println("bool: "+bool);
		bool = Character.isUpperCase(98); // 소문자 b => false
		System.out.println("bool: "+bool); 
		
		System.out.println("-----문자열 내용이 숫자면 참 아니면 거짓------");
		bool = Character.isDigit('3'); // 문자열 내용이 숫자면 참, 아님 거짓
		System.out.println("bool: "+bool); //true
		bool = Character.isDigit('d'); // 문자열 내용이 숫자면 참, 아님 거짓
		System.out.println("bool: "+bool); //false
		
		System.out.println("--------알파벳이면 참 아니면 거짓---------");
		bool = Character.isAlphabetic('5'); // 알파벳이면 참 아니면 거짓
		System.out.println("bool: "+bool); //false
		bool = Character.isAlphabetic('f'); // 알파벳이면 참 아니면 거짓
		System.out.println("bool: "+bool); //true
		
		
		System.out.println("\n===========정수형 타입으로 변환============");
		
		String age = "26";
		int n = 1;
		System.out.println("문자열결합: age + n => "+age+n); // 문자열 결합 ==> 261
		//문자열로 되어진 숫자(정수)를 실제 숫자(정수)로 변경하고 싶을 때
		// 결과가 age+n => 27이 되도록
	
		System.out.println("int로 출력: age + n => "+(Integer.parseInt(age)+n)); // "26"을 26으로 바꾸고 +1 해줌 => 27
		//Integer.parseInt(String s) => 숫자로 되어진 문자열을 받으면 리턴값은 int값으로 출력한다 --> 문자열 '26'을 int 26으로 출력
		//사용빈도 높음!
		
		System.out.println("byte로 출력: age + n => "+(Byte.parseByte(age)+n));
		System.out.println("short로 출력: age + n => "+(Short.parseShort(age)+n));
		System.out.println("long으로 출력: age + n => "+(Long.parseLong(age)+n));
		
		
		System.out.println("\n===========실수형 타입으로 변환============");
		String su = "367.356789";
		//원하는 결과물: su + 10 => 377.356789
		
		System.out.println("문자열 결합: su + 10 => "+su+10);
		System.out.println("float로 출력: su + 10 => "+(Float.parseFloat(su)+10));
		System.out.println("double로 출력: su + 10 => "+(Double.parseDouble(su)+10));
		
		
		System.out.println("\n===========숫자->문자열타입 변환============");
		// 숫자(정수)로 된 데이터를 문자열로 변경할 때
		int point = 98;
		System.out.println("숫자연산출력: point + 2 => "+(point+2));
		System.out.println("문자열 변환 출력: point + 2 => "+(Integer.toString(point)+2)); // point가 "98"로 변환 => 문자열 변환 => 982
		// Integer.toString(int타입 값) => String타입으로 변환 출력
		
		
		String.valueOf(point);
		//String.valueOf(객체/char/boolean/double 등등 모든값) => String타입으로 출력 
		// ==> int값 String으로 바꾸는건 Integer.toString()과 동일
		System.out.println("문자열 변환 출력: point + 2 => "+(String.valueOf(point)+2));
		
	} // end of main()

} // end of class
