package my.day5;

public class A {

	public static void main(String[] args) {
		
		try {
			System.out.println(5/0.0);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		}
		

	}

}
