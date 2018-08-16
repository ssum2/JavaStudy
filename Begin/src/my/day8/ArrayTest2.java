package my.day8;

import java.util.Scanner;

import my.util.MyUtil;

public class ArrayTest2 {

	public static void main(String[] args) {
		String[] cheapFoodArr = {"돈까스", "김치볶음밥", "카레라이스", "라면", "순두부찌개"};
		String[] royalFoodArr = {"추어탕", "삼계탕", "고기국수", "스테이크"};
		
		System.out.println("******** 점심메뉴 고르기 *********");
		
		Scanner sc = new Scanner(System.in);
		for(;;) {
		System.out.print("\n>>> 오늘의 점심메뉴? (1. 저렴한 음식  2.고급 음식) =>");
		int index1 = MyUtil.random2(0, 4);
		int index2 = MyUtil.random2(0, 3);
		String select = sc.nextLine();
		
		if("1".equals(select) ) {
			System.out.println("오늘의 점심메뉴는 "+cheapFoodArr[index1]+"입니다.");
			break;
		}
		else if("2".equals(select)) {
			System.out.println("오늘의 점심메뉴는 "+royalFoodArr[index2]+"입니다.");
			break;
		}
		else {
			System.out.println("\n>> 1, 2만 입력하세요 <<");
			continue;
		}
		
		}
		
		
	} // end of main()

} // end of class
