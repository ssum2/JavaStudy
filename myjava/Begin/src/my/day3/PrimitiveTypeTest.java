/*
     === *** 자료형 *** ===
     
            ※ 자료형의 종류
     1. 원시형 타입(primitive Type)
       1.1 정수형(byte, short, int, long)
          -- byte(8bit == 1byte) : -2^7 ~ 2^7 - 1
                                   -128 ~ 127
                                   
          -- short(16bit == 2byte) : -2^15 ~ 2^15 - 1
                                     -32,768 ~ 32,767
                                     
          -- int(32bit == 4byte) : -2^31 ~ 2^31 - 1
                        기본은 int 이다.        -2,147,483,648 ~ 2,147,483,647 
                       
          -- long(64bit == 8byte) : -2^63 ~ 2^63 - 1
                                   -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
                                   
       1.2 실수형(float, double)
          1. float : 4byte  단정밀도. 소수점이하 7자리 까지 표현.
          2. double : 8byte 배정밀도. 소수점이하 15~16자리 까지 표현.
             자바에서 실수의 기본타입은 double 이다.


       1.3 문자형(char)
       char : 자바는 유니코드 체계를 사용하므로 
                         문자형 타입인 char 은 2byte 이며, 범위는 0~65535 이다.
                         
       UNICODE 표 참조         
       http://www.tamasoft.co.jp/en/general-info/unicode.html           
         
      
       1.4  참(true) 또는 거짓(false)을 담아주는 타입인 boolean 
       -- boolean 타입은 true, false 를 가진다.
                  자바의 논리형인 boolean 은 1, 0 으로 호환되지 않으며
                  형변환도 할 수 없다.         
 */

package my.day3;

public class PrimitiveTypeTest {

	public static void main(String[] args) {

		byte bt1 = 10;  // byte  -128 ~ 127
	//	byte bt2 = 200; // 표현가능한 범위를 넘었으므로 오류.
		
		short st1 = 20000; // short -32,768 ~ 32,767
	//	short st2 = 40000; // 표현가능한 범위를 넘었으므로 오류.
		
		int it1 = 50000000;       // int  -2,147,483,648 ~ 2,147,483,647
	//	int it2 = 1000000000000;  // 표현가능한 범위를 넘었으므로 오류. 
		
		long ln1 = 1000000000000L; 
		
		////////////////////////////////////////
		
		int a = 9;   // 10진수(0~9)
		System.out.println("10진수 9 => " + a);
		// 10진수 9 => 9
		
		a = 011; // 8진수(0~7) => 정수 맨앞에 접두사로 숫자 0을 붙이면 8진수로 인식한다.
		System.out.println("8진수 011 => " + a);
		// 8진수 011 => 9
		
		a = 0x11; // 16진수(0~9 A B C D E F) => 정수 맨앞에 접두사로 숫자 0x을 붙이면 16진수로 인식한다.
		// 1*16^1 + 1*16^0 = 16 + 1 = 17
		System.out.println("16진수 0x11 => " + a);
		// 16진수 0x11 => 17
		
		System.out.println("--- *** printf 알아보기 *** ---"); 
		int b = 30;
		System.out.printf("10진수 %d, 8진수 %o, 16진수 %x", b, b, b);   
		// 10진수 30, 8진수 36, 16진수 1e
		
		System.out.println("\n-------------------\n");
		a=5;
		b=2;
		
		System.out.println("a/b=" + (a/b) );
		// a/b=2
		// 정수/정수=정수(몫)
		
		double c = 5.0;
		System.out.println("c/b=" + (c/b) );
		// c/b=2.5
		// 실수/정수=실수
		// 정수/실수=실수
		// 실수/실수=실수
		
		System.out.println("a%b="+(a%b));
		// 정수1%정수2 => 정수1을 정수2로 나눈 나머지값
		// 5%2=1
		
		System.out.println("\n===== 실수형 =====\n");
		double db1 = 32.123456789;
		System.out.println("db1 => " + db1);
		// db1 => 32.123456789
		
		float ft1 = 32.1234F;
		// 자바는 실수의 기본타입이 double 이므로
		// float 형태로 나타내기 위해서는 숫자 뒤에 f 나 F 를 붙여야 한다.
		System.out.println("ft1 => " + ft1);
		// ft1 => 32.1234
		
		ft1 = 32.123456789F;
		System.out.println("ft1 => " + ft1);
		// ft1 => 32.123455
		
		System.out.println("\n===== 문자형(char) =====\n");
		char ch = '\u0041';
		System.out.println("ch => " + ch);
		// ch => A
		
		ch = '\u0061';
		System.out.println("ch => " + ch);
		// ch => a
		
		ch = '\u263A';
		System.out.println("ch => " + ch);
		// ch => ☺
		
		ch = '\uC11C';
		System.out.println("ch => " + ch);
		// ch => 서
		
		System.out.println("---------------------");
		ch = 'A';
		System.out.println("ch => " + ch);
		// ch => A
		
		ch = '☺';
		System.out.println("ch => " + ch);
		// ch => ☺
		
		ch = '서';
		System.out.println("ch => " + ch);
		// ch => 서
		
		System.out.println("-------------------");
		ch = 65;
		System.out.println("ch => " + ch);
		// ch => A
		
		ch = 9786;
		System.out.println("ch => " + ch);
		// ch => ☺
		
		ch = 49436;
		System.out.println("ch => " + ch);
		// ch => 서
		
		/*
		   === !!!! 기억합시다 !!!! ===
		   int(4byte) 아래의 크기인
		   byte(1byte), short(2byte), char(2byte) 타입이
		     사칙연산 + - * / 을 만나면 자동적으로 int 타입으로 자동형변환이 일어난다.
		 */
		ch = 'a';
		System.out.println("ch => " + ch);
		// ch => a
		
		System.out.println("ch => " + (ch+1));
		// ch => 98
		
		/*
		    'A' => 65    'a' => 97
		    'B' => 66    'b' => 98
		    'C' => 67    'c' => 99
		     대문자 + 32 => 소문자
		     소문자 - 32 => 대문자
		     '0' => 48
		     '1' => 49
		     '2' => 50
		     '9' => 57
		     ' ' => 32
		 */
		
		System.out.println("---- 퀴즈 ----");
		System.out.println('A'+0);
		// 65
		System.out.println('0'+0);
		// 48
		System.out.println('A'+32);
		// 97
		
		System.out.println((char)('A'+0));
		// (char)65 ==> 'A'
		System.out.println((char)('0'+0));
		// (char)48 ==> '0'
		System.out.println((char)('A'+32));
		// (char)97 ==> 'a'
		
		//    (표현하고자하는데이터형)값 은
		//    값을 표현하고자하는데이터형 으로 변환해라는 뜻이다.
		//    여기서 ()를 "casting 연산자" 라고 부른다.
		
		char ch1 = 'B';  
		System.out.println((char)(ch1+32));
		// b
		
		PrimitiveTypeTest obj = new PrimitiveTypeTest();
		ch1 = obj.changeToLowerCase('D');
		System.out.println("ch1 => " + ch1); 
		// ch1 => d
		
		ch1 = obj.changeToUpperCase('e');
		System.out.println("ch1 => " + ch1); 
		// ch1 => E
		
		System.out.println("\n====== boolean 타입 ======\n");
		
		boolean bool = false;
		System.out.println("bool => " + bool);
		// bool => false
		
		bool = 5 > 2;
		System.out.println("bool => " + bool);
		// bool => true
		
		bool = (2.0 == 5/2);
		System.out.println("bool => " + bool);
		// bool => true
		
		bool = ('A' == 65);
		System.out.println("bool => " + bool);
		// bool => true
		
		bool = ('A' == 'B'-1);
		System.out.println("bool => " + bool);
		// bool => true
		
		bool = ('a' != 97);
		System.out.println("bool => " + bool);
		// bool => false
		
	} // end of main()-------------------------
	
	public char changeToLowerCase(char ch) {
	/*	
		char result = (char)(ch+32);
		return result;
	*/
		return (char)(ch+32);
	}
	
	public char changeToUpperCase(char ch) {
	/*	
		char result = (char)(ch-32);
		return result;
	*/
		return (char)(ch-32);
	}

}
