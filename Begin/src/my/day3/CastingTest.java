package my.day3;

/*
==== **** 데이터형 변환하기 **** ====
1. 묵시적 형변환(자동 형변환)
   --> 크기가 작은 것에서 크기가 큰쪽으로는 자동적으로 형변환이 일어난다.

2. 강제형변환(casting)
   --> 크기가 큰 것에서 작은 쪽으로는 자동적으로 형변환이 불가능하므로
                크기가 큰 데이터 타입을 크기가 작은 데이터타입으로 강제적으로 형을 변경해 주는것을 말한다.
                이때 사용하는 것이 () 라는 casting 연산자 이다.

          ==================================================================> 자동형변환 O.K
            byte   --> short  -->  int   --> long   --> float   -->  double
           (1byte)    (2byte)    (4byte)    (8byte)    (4byte)       (8byte)
            
                       char
                      (2byte)
자동형변환 N.O  <==================================================================                          
*/

public class CastingTest {

	public static void main(String[] args) {
		
		byte bt1 = 10;
		int a1 = bt1;
		
		int a2 = 300000; 
		byte bt2 = (byte)a2; // ==> byte<int이기 때문에 강제형변환 필요
		// 실행하면 오류 -> byte타입은 -128~127까지만 표현할 수 있기 때문
		
		long ln1 = 4789413578131354541L;
		float ft1= ln1; // long < float (표현범위)
		
		float ft2 = 12.3F;
		System.out.println(ft2); // 12.3
		long ln2 = (long)ft2; // 강제형변환 필요
		System.out.println(ln2); //소수점 이하를 다 떼고 정수값만 나옴 -> 12
		
		double db1 = 123.4567891234;
		double db2 = 123.6567891234; 
		System.out.println(db1); // 123.4567891234
		System.out.println((int)db1); // 정수형으로 바뀌면서 소수점 이하 제거 => 123
		
		System.out.println(db2); // 123.6567891234
		System.out.println((int)db2); // 123 ==> 반올림 안하고 무조건 버림(절삭)
		//반올림 하는 메소드가 따로 존재
		
			
		
	} // end of main()

} // end of class
