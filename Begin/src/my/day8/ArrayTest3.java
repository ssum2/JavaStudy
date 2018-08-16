package my.day8;

public class ArrayTest3 {

	public void passwordCheck(String passwd) {
		
		if(passwd.length()<8) {// 문자열이 들어가는 변수.length : 해당 문자열의 길이를 알려줌
			System.out.println(">> 암호의 길이는 8자 이상이어야 사용 가능합니다. <<");
		
		}
		else { // 8글자 이상이면 글자 하나하나 검사하겠다
			char[] chArr = passwd.toCharArray(); // return타입이 char[]
			
			boolean flagAlphabet  = false, flagNumber = false, flagSpecial = false;
			
			for(int i=0; i<chArr.length;i++) {// 입력받은 글자 하나하나를 검사
//				System.out.println("chArr["+i+"] => "+chArr[i]);
				
				if('A' <= chArr[i] && chArr[i] <='Z' ||
				   'a' <= chArr[i] && chArr[i] <='z') {
					flagAlphabet = true;
				}
				else if ('0' <= chArr[i] && chArr[i] <='9')
					flagNumber = true;
				else
					flagSpecial = true;	
			}// end of for
			
			if(flagAlphabet && flagNumber && flagSpecial)
				System.out.println(">> "+passwd+"는 암호로 사용 가능합니다 <<");
			else
				System.out.println(">> 암호는 영문자, 숫자, 특수기호가 혼합되어야 합니다 <<");
			
		}// end for if-else 
	}// end of passwordCheck()
	
	
	
	public static void main(String[] args) {
		
		ArrayTest3 obj = new ArrayTest3();
		
		
		String passwd1 = "qw34$";
		obj.passwordCheck(passwd1);
		System.out.println("\n------------------------");
		
		String passwd2 = "qwer1234";
		obj.passwordCheck(passwd2);
		System.out.println("\n------------------------");
		
		String passwd3 = "qwer1234$";
		obj.passwordCheck(passwd3);
		System.out.println("\n------------------------");
		
		
		// 8자 이상, 영문+숫자+특수문자 혼합 해당될 때만 패스워드로 받을 것임
		// passwd1, passwd2 둘다 조건 충족X

		
	} // end of main()

} // end of class
