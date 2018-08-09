
package my.day3;
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
     1. float : 4byte  단정밀도(정밀도가 비교적  낮음). 소수점이하 7자리 까지 표현. 
     2. double : 8byte 배정밀도(정밀도가 비교적 높음). 소수점이하 15~16자리 까지 표현.
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
public class PrimitiveTypeTest {

	public char changeToLowerCase(char ch) {
//		char result = (char)(ch+32);
//		return result;
		return (char)(ch+32);
	}
	
	public char changeToUpperCase(char ch) {
//		char result = (char)(ch-32);
//		return result;
		return (char)(ch-32);
	}

	public static void main(String[] args) {
		
		byte bt1 = 10; // -128 ~ 127 표현
//		byte bt2 = 200; -> 표현가능한 범위를 초과해서 오류
		short st1 = 20000; // -32,768 ~ 32,767
//		short st2 = 40000; -> 표현가능한 범위를 초과해서 오류
		int it1 = 50000000; // 약 -21억 ~ 21억까지
//		int it2 = 10000000000;-> 표현가능한 범위를 초과해서 오류 
		long lg1 = 1000000000000L;// -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		
		// ================= 진법 ====================
		
		int a = 9; //10진수(0~9)
		System.out.println("10진수 9 => "+a);
		
		//얘네 거의 안씀
		a = 011; //8진수(0~7) = 정수 맨 앞에 접두사로 숫자 0을 붙이면 8진수로 인식함
		System.out.println("8진수 011 => "+a); // 9
		
		a=0x11; //16진수(0~9 A B C D E F) = 정수 맨 앞에 접두사로 숫자 0x을 붙이면 16진수로 인식함
		// 1*16^1 + 1*16^0 = 16 + 1= 17
		System.out.println("16진수 0x11 => "+a);
		//얘네 거의 안씀
		
		System.out.println("\n--- *** printf 알아보기 *** ---");
		int b = 30;
		System.out.printf("10진수 %d, 8진수 %o, 16진수 %x", b, b, b); // printf: format을 바꿔서 출력하라
		//출력결과: 10진수 30, 8진수 36, 16진수 1e
		
		
		// =================== 연산 및 실수 활용 ===================
		System.out.println("\n----------------------------");
		a = 5;
		b = 2;
		
		System.out.println("a/b = " + (a/b)); //문자열 결합과 숫자연산식 중에서 문자열 결합이 우선되기 때문에 숫자연산식에 괄호 붙여야함 (우선순위)
		// 정수/정수 = 정수(몫만 출력)
		
		
		// 실수
		double c = 5.0;
		
		System.out.println("c/b = " + (c/b)); //문자열 결합과 숫자연산식 중에서 문자열 결합이 우선되기 때문에 숫자연산식에 괄호 붙여야함 (우선순위)
		// 실수/정수 = 실수
		// 정수/실수 = 실수
		// 실수/실수 = 실수
		//실수가 하나라도 포함되어 있다면 결과는 실수로 출력
		
		System.out.println("a%b="+(a%b)); // 5%2 = 1
		// 정수1%정수2 => 정수1을 정수2로 나눈 나머지값을 출력하라
		
		System.out.println("\n ======= 실수형 =======\n");
		double db1 = 32.123456789;  //8byte
		System.out.println("db1=>" + db1);
		
		float ft1 = 32.1234F; // 실수 기본타입이 double이기 때문에 float형으로 형변환 필수 => ~~float숫자~~F 
		System.out.println("ft1 =>"+ft1);
		
		ft1 = 32.123456789F; // float는 소수점 7자리까지만 나옴 -> 끝까지 안나옴
		System.out.println("ft1 =>"+ft1);
		
		System.out.println("\n ======= 문자형(char) =======\n");
		char ch = '\u0041'; //유니코드 입력, 유니코드는 16진법으로 표현, 좌표값 = 가로값+세로값
		System.out.println("ch=> "+ch);
		//ch= A
		
		ch = '\u0061';
		System.out.println("ch=> "+ch);
//		ch=> a
		ch = '\u263A';
		System.out.println("ch=> "+ch);
//		ch=> ☺
		ch = '\uBC30';
		System.out.println("ch=> "+ch);
//		ch=> 배
		
		System.out.println("-------------------------------------");
		ch = 'A';
		System.out.println("ch=> "+ch);
		//ch= A

		ch = '☺';
		System.out.println("ch=> "+ch);
//		ch=> ☺

		ch = '배';
		System.out.println("ch=> "+ch);
//		ch=> 배

		//굳이 유니코드 계산해서 넣지 말고 걍 그냥 값  넣어주면 됨...
		
		System.out.println("-------------------------------------");
		//ASCII코드에서 A = 65 / a = 97 / 0 = 48 / 공백  = 32 **암기하기**
		ch = 65; // char에 숫자를 넣으면 ASCII코드로 입력되어 문자로 출력 (범위가 0~65535)
		System.out.println("ch=> "+ch);
		
		ch = 9786; // 유니코드의 16진수롤 10진수로 바꾼 값
		System.out.println("ch=> "+ch);
		
		ch = 49436;
		System.out.println("ch=> "+ch);
		
		
		/*
		 * ===== !!!!! 기억합시다 !!!!! =====
		 * int(4byte) 아래의 크기인 byte(1byte), short(2byte), char(2byte) 타입이
		 * 사칙연산( +, -, *, /)을 만나면 자동적으로 int형으로 자동형변환됨.
		 */
		
		ch = 'a';
		System.out.println("ch=> "+ch);
		// ch=> a
		
		System.out.println("ch=> "+(ch+1)); // char+int = int
		// ch=> 98
		
		/*********필수암기**********
		 * 'A' => 65 'B' => 66 'C' => 67
		 * 'a' => 97 'b' => 98 'c' => 99
		 * 대문자 + 32 = 소문자
		 * 소문자 - 32 = 대문자
		 * 
		 * '0' => 48
		 * '1' => 49
		 * '2' => 50
		 * '9' => 57
		 * ' ' => 32 (공백)
		 * 
		 */
		System.out.println("---------퀴즈---------");
		System.out.println('A'+0); //65
		System.out.println('0'+0); //48
		System.out.println('A'+32); //97
		
		System.out.println((char)('A'+0)); //(char)65 -> 65를 char타입으로 바꿔라 -> 'A'
		System.out.println((char)('0'+0)); //(char)48 -> 문자형 '0'
		System.out.println((char)('A'+32)); //(char)97 -> 'a'
		
		// *(표현하려는 데이터형)(값)은  이 값을 표현하고자 하는 데이터형으로 강제형변환
		// 여기서 이 괄호()를 "casting 연산자"라고 함
	
		char ch1 = 'B';
		System.out.println((char)(ch1+32));
		//결과물로 b출력
	
		PrimitiveTypeTest obj = new PrimitiveTypeTest();
		
		ch1 = obj.changeToLowerCase('D'); // 어떤 값을 대입하고 있음 => 리턴값 있음, char타입 파라미터 있음
		System.out.println("ch1 =>" +ch1);
		// ch1 = d
		
		ch1 = obj.changeToUpperCase('e');
		System.out.println("ch1 =>" +ch1);
		// ch1 = E
		
		System.out.println("\n========== boolean type ===========\n");
		boolean bool = false;
		System.out.println("bool => "+bool);
		// bool => false
		
		bool = 5 > 2; // boolean형 변수 bool에 5 > 2 의 값을 초기화
		System.out.println("bool => "+bool);
		// bool => true
		
		bool = (2.0 == 5/2); // 2.0 == 2 (정수형이라 몫만 출력)
		System.out.println("bool => "+bool);
		// bool => true
		
		bool = ('A' == 65);
		System.out.println("bool => "+bool);
		// bool => true
		
		bool = ('A' == ('B'-1));
		System.out.println("bool => "+bool);
		// bool => true
		
		bool = ('a' != 97); // !=는 같지않다, ==는 같다
		System.out.println("bool => "+bool);
		// bool => false
		
		ch = 32;
		System.out.println("ch =>"+ch+"여기까지");
		
		
	} // end of main()

}
