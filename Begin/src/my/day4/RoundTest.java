package my.day4;

public class RoundTest {

	public static void main(String[] args) {
		// Round : 반올림
		double db1=93.45678, db2=86.87654;
		
		System.out.println("\n===== 반올림 후 =====\n");
		System.out.println("db1="+Math.round(db1)+", db2="+Math.round(db2));
		// Math 클래스에 있는 static 메소드 round, 리턴타입은 long 또는 int (정수형) ==> 소수점 이하 자리 안나옴
		
		System.out.println("\n===== 특정 소수부 자리에서 반올림 후 =====\n");
		/*
		 * >>> 특정 소수부에서 반올림해서 실수로 결과출력하는 방법 <<<
		 * 1) 93.45678 에서 소수부 두번째 자리에서 반올림 할 때
		 * 2) 93.45678*10 ==> 소수부가 한칸 앞당겨짐 => 934.5678
		 * 3) Math.round(934.5678); => 소수부 첫째 자리에서 반올림 -> 0.5 반올림해서 935
		 * 4) 935/10.0 ==> 다시 소수점 뒤로 보냄 => 93.5 (정수와 실수의 연산이라 실수로 출력)
		 * 
		 * >>> 예제 1 <<<
		 * 1) 86.87654 에서 소수부 세번째 자리에서 반올림 할 때
		 * 2) 86.87654*100 ==> 소수부가 두칸 앞당겨짐 => 8687.654
		 * 3) Math.round(8687.654); => 소수부 첫째 자리에서 반올림 -> 0.5 반올림해서 8688
		 * 4) 8688/100.0 ==> 다시 소수점 뒤로 보냄 => 86.88 (정수와 실수의 연산이라 실수로 출력)
		 * 
		 */
		
		System.out.println("db1="+Math.round (db1*10)/10.0);
		System.out.println("db2="+Math.round(db2*100)/100.0);
		
		
	} // end of main()

} // end of class
