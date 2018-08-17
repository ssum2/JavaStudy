package my.day4;

public class RoundTest {

	public static void main(String[] args) {
		
		// 반올림에 대해서 알아본다.
		double db1=93.45678, db2=86.87654;
		
		System.out.println("\n=== 반올림 후 ===\n");
		
		System.out.println("db1="+Math.round(db1) + ", db2="+Math.round(db2));              
		
		System.out.println("\n=== 특정 소수부 자리에서 반올림 후 ===\n"); 
		/*
		     93.45678  을 소수부 2번째 자리에서 반올림을 하려고 한다.
		     93.45678 * 10 ==> 934.5678
		     Math.round(934.5678); ==> 935
		     935/10.0 ==> 93.5
		     
		     
		     86.87654 을 소수부 3번째 자리에서 반올림을 하려고 한다.
		     86.87654 * 100 ==> 8687.654
		     Math.round(8687.654) ==> 8688
		     8688/100.0 ==> 86.88
		     
		     86.88
		 */
		System.out.println("db1=" + Math.round(db1*10)/10.0);
		System.out.println("db2=" + Math.round(db2*100)/100.0);
		
		

	}

}
