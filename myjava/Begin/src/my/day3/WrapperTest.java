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
       예> 26 + 1 => 27   "26" + 1 => 261
       26 - 1 => 25    "26" - 1 => error
       
    해결책> 문자열로 되어진 "26"을 숫자(int)형태로 바꾸어 주어야 한다.      
 */

package my.day3;

public class WrapperTest {

	public static void main(String[] args) {
		
		char ch = 'a';
		System.out.println("ch : " + ch + "\n");
		// ch : a
				
		Character chr = 'a';
		System.out.println("chr : " + chr + "\n");
		// chr : a
		
		System.out.println("");
		
		boolean bool = Character.isLowerCase(ch);
		System.out.println(bool);
		// true
		
		bool = Character.isLowerCase('A');
		System.out.println(bool);
		// false
		
		bool = Character.isLowerCase(67);
		System.out.println(bool);
		// false
		
		bool = Character.isUpperCase('B');
		System.out.println(bool);
		// true
		
		bool = Character.isUpperCase(98);
		System.out.println(bool);
		// false
		
		bool = Character.isDigit('3');
		System.out.println(bool);
		// true
		
		bool = Character.isDigit('d');
		System.out.println(bool);
		// false
		
		bool = Character.isAlphabetic('5');
		System.out.println(bool);
		// false
		
		bool = Character.isAlphabetic('f');
		System.out.println(bool);
		// true
		
		System.out.println("==================");
		
		String age = "26";
		int n = 1;
		
		System.out.println("age + n => " + (age+n));
		// age + n => 261
		
		// 문자열로 되어진 숫자(정수)를 실제 숫자(정수)로 변경한다.
		System.out.println("age + n => " + (Integer.parseInt(age)+n));       
		// age + n => 27
		
		System.out.println("age + n => " + (Byte.parseByte(age)+n));
		// age + n => 27
		
		System.out.println("age + n => " + (Short.parseShort(age)+n));
		// age + n => 27
		
		System.out.println("age + n => " + (Long.parseLong(age)+n));
		// age + n => 27
		
		String su = "367.356789";
		System.out.println("su + 10 => " + (su+10) );
		// su + 10 => 367.35678910
		
		System.out.println("su + 10 => " + (Float.parseFloat(su)+10) );
		// su + 10 => 377.35678
		
		System.out.println("su + 10 => " + (Double.parseDouble(su)+10) );
		// su + 10 => 377.356789
		
		
		// === 숫자(정수)로 되어진 데이터를 문자열로 변경한다.
		int point = 98;
		System.out.println("point + 2 => " + (point+2));
		// point + 2 => 100
		
		System.out.println("point + 2 => " + (Integer.toString(point)+2));
		// point + 2 => 982
		
		System.out.println("point + 2 => " + (String.valueOf(point)+2));
		// point + 2 => 982

	}

}
