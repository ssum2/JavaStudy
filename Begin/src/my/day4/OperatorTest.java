package my.day4;

public class OperatorTest {

	public static void main(String[] args) {
		
		System.out.println("1. 산술연산자: + - * / % << >> >>>");
		
//		+ - */ %(나머지)
//		*	x << n x*(2의n승)의 결과값과 같다. => 이때, x는 실수형은 불가능하고 정수형만 가능
//		*	x >> n x/(2의n승)의 결과값과 같다. => 이때, x는 실수형은 불가능하고 정수형만 가능
//		x >>> n 정수x를 32bit형태의 2진수로 나타낸 후 오른쪽으로 n번 이동시키고 빈 자리는 0으로 채움
		
		int n = 10;
		System.out.println("n+3="+(n+3)); 
		System.out.println("n-3="+(n-3));
		System.out.println("n*3="+(n*3));
		System.out.println("n/3="+(n/3));
		System.out.println("n%3="+(n%3));
//		결과값
//		n+3=13
//		n-3=7
//		n*3=30
//		n/3=3
//		n%3=1
		
		System.out.println("n<<3="+(n<<3)); // 10*(2의3승 = 8) = 80
		System.out.println("n>>3="+(n>>3)); // 10/(2의3승 = 8) = 80
		System.out.println("n>>>3="+(n>>>3)); 
		// 1) 10을 32bit(8byte) 2진수로 표현 
        // 00000000 00000000 00000000 00001010 (8 4 2 1) 
		// => 1*2^3 + 0*2^2 + 1*2^1 + 0*2^0
		//	   1*8	   0*4     1*2	   0*1
		//		8		0		2		0
		// ===> 10
		// 00000000 00000000 00000000 00001010 >>> 3번만큼 이동~~! 빈칸은 0으로 채우기
		// 00000000 00000000 00000000 00000001 >>> 1
		
		System.out.println("\n2. 부호연산자: +(양수) -(음수)");
		byte a = 5;
		short b = -9;
		System.out.println(-b); // 9
		System.out.println(+a); // 5
	
		System.out.println("\n3. 증감연산자: ++ --");
		// 매번 1씩 증가 or 매번 1씩 감소
		int c = 7;
		long d = 3L;
		
		c++; // 변수 뒤에 와서 계산. 후위. c=c+1과 같은 뜻 => 매번 1씩 증가한다
		System.out.println("c => "+c); // 8
		
		d--; // d=d-1
		System.out.println("d => "+d); // 2
		
		++c; // 변수 앞에 와서 계산. 전위. c=c+1이지만 여기부터 적용
		System.out.println("c => "+c); // 9
		
		--d; // d=d-1
		System.out.println("d => "+d); // 1
		
		// 후위증감연산자(c++, d--)는 다른 연산을 다 마친 이후에 1씩 증감시킴
		// 전위증감연산자(++c, --d)는 가장 먼저 1씩 증감시킨 다음에 다른 연산을 함.
		
		System.out.println("c => "+c++); // 9
		// c에 저장되어있는 값 9를 출력하는게 먼저 -> 그다음에 c에 1를 더함 => 그 다음줄부터 적용
		System.out.println("c => "+c); // 10
		
		System.out.println("c => "+ ++c); // 11
		// c에 1증가를 먼저하고 그다음에 출력
		
		System.out.println("\n ----- 퀴즈 ----- \n");
		int x = 10, y = 10; // 타입이 같은 다른 변수를 같이 초기화 가능
		int z = ++x;
		System.out.println("z => "+z); //11
		System.out.println("x => "+x); //11
		
		z=y++;
		System.out.println("z => "+z); //10
		System.out.println("y => "+y); // 11
		
		x=20;
		z=x++;
		System.out.println("z => "+z); //20
		System.out.println("x => "+x); // 21
		
		
		System.out.println("\n4. bit별 not 연산자: ~ "); // ~ = tild
		
		/*
		 * 주어진 정수값을 32bit 형태의 2진수로 바꾸어서 나타내는데
		 * 0은 1로 바꾸고, 1은 0으로 바꾸는 것
		 */
		
		int m = 42;
		System.out.println("~m : "+ ~m); // -43
		// 42 == 00000000 00000000 00000000 00101010
		//~42	 11111111 11111111 11111111 11010101
		
		
		/*
		 * 첫번째 bit는 부호비트
		 * 0은 +(양수)
		 * 1은 -(음수)
		 * **첫번째 bit가 1인 경우 값 구하기**
		 * 똑같은 1이 나오는 것 중에서 마지막 1만 취하고 여기에 그 나머지를 끝까지 취한다
		 * 11111111 11111111 11111111 11 여기 끝의 1만 취하고|  010101 나머지값 붙여주기
		 * ==> 1010101 
		 * 첫번째 값만 -를 붙이고 나머지 값은 +로 연산
		 * 	-1*2^6 + 0*2^5 + 1*2^4 + 0*2^3 + 1*2^2 + 0*2^1 + 1*2^0
		 * 	= -64  +   0   +   16  +   0   +   4   +   0   +   1
		 *  = -43
		 */
		
		
		System.out.println("\n5. 논리 부정 연산자: ! ");
		boolean bool = false;
		System.out.println("bool : "+bool); // false
		
		System.out.println("bool : "+!bool); // true
		
		System.out.println("\n6. bit 연산자: &(AND) |(vertical line)(OR) ");
		/*
		 *  8bit 2진수로 변환해서 연산됨
		 *  &(and 연산자) => 2개 bit 모두 1일 때만 1, 나머지는 0
		 *  |(or 연산자) => 2개 bit 중에서 1개가 1이면 1, 모두 0이면 0
		 *  ^(xor 연산자) => 2개 bit 중에서 서로 달라야 1, 같으면 0
		 *  & | ^ 는 피연산자가 정수일 때만 가능. 실수X
		 */
		
		 int x1 = 3;
		 int y1 = 5;
		 
		 System.out.println("x1 & y1 => "+ (x1&y1)); // 
		 /*
		  * 	3 == 00000011 
		  *   & 5 == 00000101
		  * 	--------------
		  * 		 00000001 => 1
		  */
		 
		 System.out.println("x1 | y1 => "+ (x1|y1)); // 
		 /*
		  * 	3 == 00000011 
		  *   | 5 == 00000101
		  * 	--------------
		  * 		 00000111 => 7
		  */
		 
		 System.out.println("x1 ^ y1 => "+ (x1^y1)); // 
		 /*
		  * 	3 == 00000011 
		  *   ^ 5 == 00000101
		  * 	--------------
		  * 		 00000110 => 6
		  */
		 
		 System.out.println("\n7. 논리 연산자: & |(in oracle = pipe) && ||  ");
		 /*
		  * 논리연산자에 해당하는 대상은 "논리(boolean값)" => T/F
		  * & 는 앞에서 F가 나와도 뒤의 값까지 다 계산해서 도출
		  * &&는 앞에서 F가 나오면 뒤의 값 계산 안하고 바로 F 도출
		  * ||는 앞에서 T가 나오면 뒤의 값 계산 안하고 바로 T 도출
		  * 
		  */
		 int a1 = 50, b1=60;
		 boolean bool2 = (a1 > b1) & (a1 > 0); // false & true => false. &는 앞의 값이 false여도 뒤의 값 도출해서 결과 출력
		 System.out.println(bool2);
		 
		 bool2 = (a1 > b1) | (a1 > 0); // 둘 중 하나만 T면 T 출력
		 System.out.println(bool2);
		 
		 System.out.println("==================================");
		 
		 bool2 = (a1 > b1) && (a1 > 0); // 앞에 F가 나와서 뒤에 있는 연산은 안함
		 System.out.println(bool2);
		 
		 bool2 = (a1 < b1) && (a1 > 0); // 앞에 T가 나왔으니 뒤에있는 것까지 연산해야함
		 System.out.println(bool2);
		 
		 System.out.println("==================================");
		 
		 bool2 = (a1 < b1) || (a1 > 0); // T or 스킵 => T 출력
		 System.out.println(bool2);
		 
		 bool2 = (a1 > b1) || (a1 > 0); // F or T => T출력 
		 System.out.println(bool2);
		 
		 bool2 = (a1 < b1) && (a1 > 0); 
		 System.out.println(bool2);
		 
		 System.out.println("\n============ 퀴 즈1 ==============");
		 
		 int i=1;
		 int j=i++; // 이 줄에서는 j에 i를 대입먼저하고 그 다음에 ++
		 			// i=2
		 			// 루프문 할 때 생각하면됨. 첫 루프에서는 1이었다가 그다음 루프(두번째 실행)부터 ++값이 적용되는 것을 생각하자...
		 if( (i > ++j) & (i++ == j) ) // 2 > 2 (F) & 2 (다음줄부터 3) ==2 (T)
			 i=i+j; // 둘다 f라서 실행안함
		 System.out.println("i=>"+i); 
		 // i=3
		 
		 i=1;
		 j=i++;
		 
		 if( (i>++j) && (i++ == j) ) // F && 스킵
			i=i+j;
		 System.out.println("i=>"+i); 
		// 	i=2
		 
		System.out.println("\n============ 퀴 즈2 ==============");	 
		int m1=0, n1=1;
		if((m1++ == 0) | (n1++ == 2)) // m1 0 ==0 | n1 1 ==2 =>  T | F
			m1=42;
		System.out.println("m1=>"+m1 +", n1=>"+n1);
		// m1=>42, n1=>2
		
		System.out.println("\n============ 퀴 즈3 ==============");
		boolean k1 = false;
		boolean k2 = false;
		boolean k3 = ( (k1==true) | (k2==true) ); // F | F
		System.out.println(k1+", "+k2+", "+k3);
		//false, false, false
		 
		System.out.println("\n==========이해를 해보자===========");
		int uu;
		int aa =1, bb=2, cc=3;
		
		aa = bb++; // aa = 2 , bb=3
		uu = ++cc; // uu = 4 = cc  ===== aa = 2 / bb = 3 / cc =4
		uu = bb+cc; // 3+4 = 7
		uu = aa+bb+cc;// 2 + 3 + 4 = 9 
		System.out.println("aa+bb+cc = "+uu); // 
		
		
		for(i=0; i<5; i++) {
			System.out.println("i = " + i);
		}
		
		
		System.out.println("\n8. 비교연산자: == != > < >= <= ");
		
		System.out.println("\n9. 할당 연산자; 연산 후 대입연산자: += -= *= /= %= 등... ");
		int no = 1;
		no+=3; // 연산 후에 대입해주기 -> no+3을한 값을 no에 대입!
		System.out.println("no => "+no);
		
		no=10;
		no-=3;
		System.out.println("no => "+no); // no-3한 값을 no에 대입 => 10-3 = 7 = no
		
		no*=3;
		System.out.println("no => "+no); // 7*3 = 21 = no
		
		no%=2;
		System.out.println("no => "+no); // 21%2 = 1 = no
		
		no^=5;
		System.out.println("no => "+no); // 1^5 = 4 = no = 0000100
		// 0000001 XOR 00000101 => 00000100
		 
		
		no<<=3;
		System.out.println("no => "+no); // 4*2의3승 =32
		
		
		System.out.println("\n10. 삼항 연산자; if ~ else와 같음: 데이터타입 변수명 = (조건식)? 값1:값2 ");
		/*
		 * 변수를 선언한 다음 초기화를 할 때, 조건에 따라 달라지게 함
		 * 변수선언 = (조건식)? 값1:값2; 
		 * => 이 조건식이 참이라면 ? 다음에 나오는 값1이 변수에 대입, 
		 * => 이 조건식이 거짓이라면 ? 다음 값2가 변수에 대입
		 * 
		 */
		
		int no1 =50, no2=60;
		int result = (no1 > no2)? no1:no2; // no1>no2가 참이면 no1, 거짓이면 no2 ==> 변수초기화 내용을 넣는데에 조건을 걸어둠
		System.out.println("result => "+result);
		
		
		
		// >>>>>>>>> 연산자의 우선순위 <<<<<<<<<<<
		/*
		 * 높음	단항연산자 : +(양수), -(음수), ~(tild), (), ++, --
		 * 		산술연산자 : *, /, %, +(덧셈), -(뺄셈), >>, <<, >>>
		 * 		비교연산자 : <, >, >=, <=, ==, !=
		 * 		논리연산자 : &, |, ^, &&, ||
		 * 		삼항연산자 : ?:
		 * 낮음	대입연산자 : =, +=, -=, *=, /=, %=, >>=, <<=, >>>=
		 */
		
		int num = 10;
		String str = (num>>>3 >=2) && (1>0)? "참입니다.":"거짓입니다.";
		//				1번	  2번     3번 ------------------->4번
		// 1 >=2 (F) && (T, skip) ==> 거짓입니다.
		// 
		
		System.out.println("str => " + str);
		
		
		
		
		
		
	} // end of main()

} // end of OperatorTest class
