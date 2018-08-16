package my.day8;

import java.util.Random;

import my.util.MyUtil;

public class RandomTest {

	public static void main(String[] args) {
		
		Random rnd = new Random(); // Math.Random()은 보안상 좋지 않아서 이 메소드를 더 많이 씀
		
		System.out.print("1부터 10까지 중 랜덤한 수: ");
		int rndnum = rnd.nextInt(10)+1; // Random.nextInt()는 0부터 bound에 들어가는 수-1 까지의 랜덤한 수를 출력함
		// rnd.nextInt(10) => 0~9 사이의 랜덤한 수
		System.out.println(rndnum);

		
		System.out.print("\n13부터 18까지 중 랜덤한 수: ");
		
		/*
		 	min ~ max 사이 랜덤한 정수를 얻으려면
		 	int rndnum = rnd.nextInt(max-min+1)+min;
		 	
		 	ex) 13~18 사이 랜덤한 수
		 	int rudnum - rnd.nextInt(18-13+1)+13;
		 	int rudnum - rnd.nextInt(6)+13;
		 	
		 */
		rndnum = rnd.nextInt(6)+13;
		System.out.println(rndnum);
		
		System.out.print("\n1부터 100까지 중 랜덤한 수: "+MyUtil.random2(1, 100));
		
		System.out.print("\nA부터 Z까지 중 랜덤한 문자: "+(char)MyUtil.random2('A','Z')); // char 타입은 int 호환 가능
	
	} // end of main()

} // end of class
