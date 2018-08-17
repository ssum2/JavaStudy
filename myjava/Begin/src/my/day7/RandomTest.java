package my.day7;

import java.util.Random;

import my.util.MyUtil;

public class RandomTest {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		System.out.print("1부터 10까지 중 랜덤한 수 : ");
		int rndnum = rnd.nextInt(10) + 1;
		// rnd.nextInt(10) 은 0 부터 9 사이의 랜덤한 수
		// 1부터 10까지 중 랜덤한 수
		System.out.println(rndnum);
		
		System.out.print("\n13부터 18까지 중 랜덤한 수 : ");
		/*
		    min 부터 max 사이의 랜덤한 정수를 얻으려면
		    int rndnum = rnd.nextInt(max-min+1)+min;
		    int rndnum = rnd.nextInt(18-13+1)+13;
		    int rndnum = rnd.nextInt(6)+13;
		                 0 1 2 3 4 5
		              + 13
		              ---------------
		                13 14 15 16 17 18   
		 */
		 rndnum = rnd.nextInt(6) + 13;
		 System.out.println(rndnum);
		 
		 System.out.print("\n1부터 100까지 중 랜덤한 수 : " + MyUtil.random2(1, 100));   
		 
		 System.out.print("\nA부터 Z까지 중 랜덤한 문자 : " + (char)MyUtil.random2('A', 'Z'));  

	}

}
