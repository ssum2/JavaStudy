package my.day5.ex;

public class Calcurator {

	
	public String calc(double a, double b, String op) { // 연산자가 무엇이냐에 따라, 실수냐 정수냐에 따라 출력값이 다름 -> String 또는 double 로 받음
		// 처음엔 double로 사용했지만 인자값 b가 0이 될 수 없다는 예외를 넣으려고 String으로 바꿔줌
		double result = 0.0;
		
		switch (op) {
		case "+":
			result = a+b;
			
			break;
		case "-":
			result = a-b;
			
			break;
		case "*":
			result = a*b;
			
			break;
		case "/":
			// 분모로 0이 왔을 때 무한소수가 나오기 때문에 이러한 오류를 없애려먼 exception 해줘야함
			if(b==0) {
				return "두번째 인자값은 b는 0이 될 수 없다.";
			}
			else {
				result = a/b; 
				break;
				
			}
//			실패..!
//			try {
//				result = a/b; 
//				break;
//				
//			} catch (ArithmeticException e) { // ArithmeticException은 어떤 숫자를 0으로 나누었을 때 발생하는 오류
//				
//				return "두번째 인자값은 b는 0이 될 수 없다."; // 0이 들어갔을 때 그냥 return 으로 호출한 곳으로 가서 도출된 값 반환하고 끝냄
//			
//			}
			
		} // end of switch
		
		if(result%(int)result == 0 ) {
			// 소수점 이하 자리가 0인경우
			return Integer.toString((int)result); // int타입을 string타입으로 바꿔준다
			
		
		}
		else {
			// 소수점 이하 자리가 0이 아닌 경우
			return Double.toString(result);
		}
//		return Double.toString(result);  ?
				
	} // end of cacl(~~~)
	
	
	
} // end of class
