package my.day5;

public class Calcurator {

	
	public double calc(double a, double b, String op) { // 연산자가 무엇이냐에 따라, 실수냐 정수냐에 따라 출력값이 다름 -> String 또는 double 로 받음
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
			result = a/b;
			
			break;
			
		} // end of switch
			
		return result;
		
	} // end of cacl(~~~)
	
	
	
} // end of class
