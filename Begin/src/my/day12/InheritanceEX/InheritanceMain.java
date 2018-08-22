package my.day12.InheritanceEX;

public class InheritanceMain {

	public static void main(String[] args) {
		Man man1 = new Man();
		man1.name = "이순신";
		man1.height = 182.5f;
		man1.weight = 75;
		man1.goArmyDay = "1592-09-25";
		
		Woman woman1 = new Woman();
		woman1.name = "박보영";
		woman1.height = 165.4f;
		woman1.weight = 55;
		woman1.dateEmployee = "2018-10-02";
		
		// Man, Woman class에 기본생성자가 생략되어 있을 경우 부모클래스의 기본생성자를 호출
		// >> Human의 기본 생성자를 호출! << 이 출력됨

		Man man2 = new Man("슈퍼맨", 198.5f, 97, "2018-10-20");
		Woman woman2 = new Woman("원더우먼", 175.7f, 54, "2018-12-15");
		
		System.out.println("\n----------개별 요소 출력하기------------");
		
		man1.showGoArmyDay(); // 이순신
		man2.showGoArmyDay(); // 슈퍼맨
		
		System.out.println("");
		
		woman1.showDateEmployee(); // 박보영
		woman2.showDateEmployee(); // 원더우먼
		
		System.out.println("\n----------공통 요소 출력하기-------------");
		man1.showInfo();
		woman2.showInfo();
		
		System.out.println("");
		// 자식클래스에 부모클래스와 동일하거나 오버라이드한 메소드가 있으면 그것만 사용, 없을 때만 부모클래스의 메소드를 호출
		// ex) man1.showInfo() 했을 때 Man클래스의 것만 호출 가능
		
		
	}// end of main()

} // end of class
