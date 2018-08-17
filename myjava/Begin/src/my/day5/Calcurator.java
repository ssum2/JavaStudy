package my.day5;

public class Calcurator {

	public String calc(double a, double b, String op) {
		
		double result = 0.0;
		
		switch (op) {
			case "+":
				result = a + b;
				break;
			
			case "-":
				result = a - b;
				break;
			
			case "*":
				result = a * b;
				break;
				
			case "/":
				if(b==0) {
					return "두번째 인자값 b는 0이 될 수 없습니다.";
				}
				else {
					result = a / b;
					break;
				}
				
		}// end of switch----------------------
		
		if(result%(int)result == 0) {
			// 소수부가 .0 인 경우
			return Integer.toString((int)result);
		}
		else {
			// 소수부가 존재하는데 .0 이 아닌경우
			return Double.toString(result);	
		}
		
	}
	
	// 2 + 3 = 5
	// 2.5 + 3.2 = 5.7
	
	// 5 - 2 = 3
	// 5 * 2 = 10
	// 5 / 2 = 2.5
	
}
