package my.day4;

public class OperatorTest {

	public static void main(String[] args) {
		
		System.out.println("---- 1. 산술연산자 : + - * / % << >> >>> ----"); 
        /*
             + - * / %(나머지)
             x << n   x*(2의n승)의 결과값과 같다. x는 실수형은 불가하고 정수형만 가능함. 
             x >> n   x/(2의n승)의 결과값과 같다. x는 실수형은 불가하고 정수형만 가능함. 
             x >>> n  정수x를 32bit 형태의 2진수로 나타낸후 오른쪽으로  n번 이동시키고 빈자리는 0으로 채운다.        
        */
		int n = 10;
		System.out.println("n+3="+(n+3)); // 13
		System.out.println("n-3="+(n-3)); // 7
		System.out.println("n*3="+(n*3)); // 30
		System.out.println("n/3="+(n/3)); // 3
		System.out.println("n%3="+(n%3)); // 1
		
		System.out.println("n<<3="+(n<<3)); // 10*(2의3승) ==> 80
		System.out.println("n>>3="+(n>>3)); // 10/(2의3승) ==> 1
		System.out.println("n>>>3="+(n>>>3)); // 
		/*
		     10 을 32bit 형태의 2진수로 나타내면
		     00000000 00000000 00000000 00001010
		     => 1*2의3승 + 0*2의2승 + 1*2의1승 + 0*2의0승
		     => 1*8 + 0*4 + 1*2 + 0*1
		     => 8 + 0 + 2 + 0
		     ==> 10
		     
		     00000000000000000000000000001010 -->10진수 10
		     --------------------------------
		     00000000000000000000000000000001 -->10진수 1 
		 */
		
		System.out.println("---- 2. 부호연산자 : + -  ----");
		byte a = 5;
		short b = -9;
		System.out.println(-b); // 9
		System.out.println(+a); // 5
		
		System.out.println("==== 3. 증감연산자 : ++ -- ====");
		int c = 7;
		long d = 3L;
		c++; // c=c+1; 와 같은 뜻이다. 1증가
		System.out.println("c=>"+c);  // c=>8
		
		d--; // d=d-1; 와 같은 뜻이다. 1감소
		System.out.println("d=>"+d);  // d=>2
		
		++c; // c=c+1; 와 같은 뜻이다. 1증가
		System.out.println("c=>"+c); // c=>9
		
		--d; // d=d-1; 와 같은 뜻이다. 1감소
		System.out.println("d=>"+d); // d=>1
		
		// 후위증감연산자(c++, d--)는 다른 연산을 다 마친이후에 1을 증감한다.
		// 전위증감연산자(++c, --d)는 맨먼저 1을 증감을 마친 이후에 다른 연산을 한다.
		System.out.println("c=>"+ c++); // c=>9
		// c에 저장된 값 9를 출력해주고 나서  1증가 한다.
		
		System.out.println("c=>"+ c);   // c=>10 
		
		System.out.println("c=>"+ ++c); // c=>11
		// c에 저장된 값 10을 먼저 1증가를 하고 출력해준다.
		
		System.out.println("c=>"+ c);   // c=>11
		
		System.out.println("\n---- 퀴즈 ----\n");
		int x=10, y=10;
		/*
		    int x=10;
		    int y=10; 와 같다. 
		 */
		int z=++x;  // x=> 11  z=> 11
		System.out.println("z=>"+z); // z=>11
		System.out.println("x=>"+x); // x=>11
		
		z=y++;  // z=> 10  y=> 11
		System.out.println("z=>"+z); // z=>10
		System.out.println("y=>"+y); // y=>11
		
		x=20;
		z=x++; // z=> 20  x=> 21
		System.out.println("z=>"+z); // z=>20
		System.out.println("x=>"+x); // x=>21 
		
		
		System.out.println("==== 4. bit별 not 연산자 : ~ ===="); 
		/*
		     주어진 정수값을 32bit 형태의 2진수로 바꾸어서 나타내는데
		   0 은 1로 바꾸고, 1은 0으로 바꾸어주는 것이다.  
		 */
		int m = 42;  
		System.out.println("~m : " + ~m); // ~m : -43
		// 00000000 00000000 00000000 00101010  <== 42
		// 11111111 11111111 11111111 11010101  <== ~42 
		
		/*
		    첫번째 bit는 부호비트로 사용되어지는데
		    0 은 +임(양수)을 의미하고,
		    1 은 -임(음수)을 의미한다.
		   첫번째 bit가 1인 경우, 즉 음수를 뜻할 경우에는 아래와 같이 구한다.
		   똑같은 1이 나오는 것 중에서 마지막 1만 취하고, 여기에다가 그 나머지를 끝까지 취한다. 
		     
		   1010101
		   첫번째 값만 -를 붙이고 나머지 값은 + 로 연산을 하면 된다.
		    -1*2의6승  + 0*2의5승 + 1*2의4승 + 0*2의3승 + 1*2의2승 + 0*2의1승 + 1*2의0승
		    -64 + 0 + 16 + 0 + 4 + 0 + 1
		    ==> -43 
		*/
		
		System.out.println("==== 5. 논리 부정 연산자 : ! ====");
		boolean bool = false;
		System.out.println("bool : " + bool);
		// bool : false
		
		System.out.println("!bool : " + !bool);
		// bool : true
		
		System.out.println("==== 6. bit 연산자 : & | ^  ===="); 
	    /*
	        & (and 연산자) => 2개 bit 모두 1일때만 1, 나머지는 0 
	        | (or  연산자) => 2개 bit 중에서 적어도 1개가 1이면 1, 모두 0이면 0
	        ^ (xor 연산자) => 2개 bit 중에서 서로 달라야만 1, 같으면 0	
	        
	        & | ^ 연산자는 연산되어지는 대상이 정수일때 만 가능함.
	    */
		
		int x1 = 3;
		int y1 = 5;
		
		System.out.println("x1 & y1 => " + (x1 & y1)); // 1
		/*
		     00000011  <== 3
		   & 00000101  <== 5
		   -----------
		     00000001  ==> 1
		 */
		
		System.out.println("x1 | y1 => " + (x1 | y1)); // 7 
		/*
		     00000011  <== 3
		   | 00000101  <== 5
		   -----------
		     00000111  ==> 7
		 */
		
		System.out.println("x1 ^ y1 => " + (x1 ^ y1)); // 6
		/*
		     00000011  <== 3
		   ^ 00000101  <== 5
		   -----------
		     00000110  ==> 6
		 */
		
		System.out.println("==== 7. 논리 연산자 : & | && ||  ====");
		/*
		    논리 연산자 & | && || 에  대상은 참, 거짓 이다.
		*/
		int a1=50, b1=60;
		
		boolean bool2 = (a1 > b1) & (a1 > 0); 
	                   //   F    and     T
		System.out.println(bool2); // false;
		
		bool2 = (a1 < b1) | (a1 < 0); 
		       //   T    or    F
		System.out.println(bool2); // true;
		
		System.out.println("=============");
		bool2 = (a1 > b1) && (a1 > 0); 
               //   F    and   스킵
		System.out.println(bool2); // false;
		
		bool2 = (a1 < b1) && (a1 > 0); 
               //   T    and   T
	    System.out.println(bool2); // true;
	    
	    System.out.println("=============");
	    
	    bool2 = (a1 < b1) || (a1 > 0); 
               //   T    or   스킵
	    System.out.println(bool2); // true;
	
	    bool2 = (a1 > b1) || (a1 > 0); 
               //   F    or   T
        System.out.println(bool2); // true;
        
        System.out.println("\n==== 퀴즈 1. ====\n");
        int i=1;
        int j=i++; // j=>1  i=>2 
        
        if( (i > ++j) & (i++ == j) ) // (2 > 2) & (2 == 2)   i=>3
        	i=i+j;                   //    F   and   T 
        
        System.out.println("i=" + i); // i=3
        
        i=1;
        j=i++;  // j=>1  i=>2
        
        if ( (i>++j) && (i++ == j) ) // (2 > 2) && 
        	i=i+j;                   //    F    and 
        
        System.out.println("i=" + i); // i=2
        
        System.out.println("\n==== 퀴즈 2. ====\n");
        
        int m1=0, n1=1;
        if ( (m1++ == 0) | (n1++ == 2) ) // (0 == 0) | (1 == 2)     m1=>1  n1=>2
        	m1=42;                       //    T    or    F
        System.out.println("m1=>" + m1 + ", n1=>"+n1); // m1=>42, n1=>2
        // 
        
        System.out.println("\n==== 퀴즈 3. ====\n");
        boolean k1 = false;
        boolean k2 = false;
        boolean k3 = ( (k1==true) | (k2==true) );  //  F or F
        System.out.println(k1+", "+k2+", "+k3); 
        // false, false, false
        
        System.out.println("==== 8. 비교 연산자 : == != > < >= <=  ====");
        
        System.out.println("==== 9. 할당 연산자(연산후 대입연산자) ====");
        int no = 1;
        no+=3; // no=1+3;
        System.out.println("no=>" + no);
        // no=>4
        
        no=10;
        no-=3; // no=10-3;
        System.out.println("no=>" + no);
        // no=>7
        
        no*=3; // no=7*3;
        System.out.println("no=>" + no);
		// no=>21
        
        no%=2; // no=21%2;
        System.out.println("no=>" + no);
        // no=>1
        
        no^=5; // no=1^5;
        /*
              00000001  <= 1
            ^ 00000101  <= 5
            -----------
              00000100  <= 4
         */
        System.out.println("no=>" + no);
        // no=>4
        
        no<<=3; // no=4<<3;   no=4*2의3승;
        System.out.println("no=>" + no);
        // no=>32 
        
        System.out.println("==== 10. 삼항 연산자(if ~ else 와 같음) ====");
        /*
                 변수선언 = (조건식)?값1:값2;
                 변수를 선언하고 나서 값을 부여하고자 할때 사용되어지는데   
                 조건식이 참이라면 변수에 값1이 들어가고,
                 조건식이 거짓이라면 변수에 값2가 들어간다.
        */
        int no1=50, no2=60;
        int result = (no1 > no2)?no1:no2;
        System.out.println("result : " + result);
        // result : 60
        
       // ======= 연산자의 우선순위 ======== //
    /*
            높음              
               단항연산자  +(양수)  -(음수)  ~  ()  ++  -- 
               산술연산자  *  /  %  +(더하기)  -(빼기)  >>  <<  >>>
               비교연산자  <  >  >=  <=  ==  !=         
             논리연산자   &  |  ^  &&  ||
             삼항연산자  ?:
             대입연산자  =  +=  -=  *=  /=  %=  >>=  <<=  >>>=
           낮음
    */
        
       int num = 10;
       String str = (num >>> 3 >= 2) && (1 > 0)?"참입니다.":"거짓입니다."; 
       /*
            00000000 00000000 00000000 00001010  <= 10
            00000000 00000000 00000000 00000001  <= 1
          
            String str = (1 >= 2) && (1 > 0)?"참입니다.":"거짓입니다.";
            str = "거짓입니다.";
        */
       System.out.println(str); // 거짓입니다. 
       
	}// end of main()-----------------------------

}
