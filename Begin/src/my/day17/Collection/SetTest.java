package my.day17.Collection;

import java.util.*;

public class SetTest {
	/*
	※ Set은 iterator() 
	
    == HashSet == 
    1. 출력시 저장된 순서가 유지X
    2. 중복된 데이터를 저장X
              그러므로 Collection 내의 중복된 요소들을 저장하지 않고자 할때 많이 사용된다.
              
    == LinkedHashSet ==
    1. 출력시 저장된 순서가 유지O
    2. 중복된 데이터를 저장X
              그러므로 Collection 내의 중복된 요소들을 저장하지 않고자 할때 많이 사용된다.        
	 */
	public static void main(String[] args) {
		
		System.out.println("\n1. HashSet ======================== \n");
		
//		1. Member 클래스의 객체를 저장할 수 있는 HashSet타입 객체 memberHashSet1 생성
		Set<Member> memberHashSet1 = new HashSet<Member>();
	
//		2. Member 클래스의 객체 6개 생성해 memberHashSet1저장
		memberHashSet1.add(new Member("youjs","qwer1234$","유재석")); 
		memberHashSet1.add(new Member("eom","qwer1234$","엄정화"));
		memberHashSet1.add(new Member("kanghd","qwer1234$","강호동"));
		memberHashSet1.add(new Member("leess","qwer1234$","이순신"));
		memberHashSet1.add(new Member("kimth","qwer1234$","김태희"));
		memberHashSet1.add(new Member("kangkc","qwer1234$","강감찬")); 
		
//		4. 중복된 내용의 객체를 넣었을 때
		memberHashSet1.add(new Member("leess","qwer1234$","이순신"));
//		>> new Member로 각자 객체를 만든 것이기 때문에 서로 다른 객체라고 인식 >> 중복인식X
//		ex) 객체 2개를 생성해서 같은 파라미터를 줬을 때
		Member mem1 = new Member("suji", "qwer1234$", "수지");
		Member mem2 = new Member("suji", "qwer1234$", "수지");
		memberHashSet1.add(mem1);
		memberHashSet1.add(mem2);	
//		>> 두 객체 모두 출력O
		
		
//		5. 객체 2개를 만들어서 한 객체에 다른 객체를 대입했을 때(객체1=객체2)
		Member mem3 = new Member("cha", "qwer1234$", "차은우");
		Member mem4 = new Member("gold", "qwer1234$", "차금우");
		mem4=mem3;
		memberHashSet1.add(mem3);
		memberHashSet1.add(mem4);
//		>> 객체 1개만 출력(mem3의 값만 나옴)
		
		
//		3. memberHashSet1에 저장된 모든 회원 출력
		System.out.println("1) memberHashSet1의 모든 회원 출력");
		Iterator<Member> it = memberHashSet1.iterator();
//		>> Iterator는 값을 추출하기위해 임시 보관하는 temporary임
		
		while(it.hasNext()) {
			it.next().showInfo();
		}
		
//		6. memberHashSet1에 저장된 회원 중 ID가 kimth인 회원 출력하기
		it = memberHashSet1.iterator();
//		Iterator를 위에서 만들어서 next를 했으면 이미 그 안은 텅 빈 상태이기 때문에 또다시 하려면 새롭게 iterator값을 넣어줘야함
		
		System.out.println("2) memberHashSet1 중 Id가 kimth인 회원 출력");

		while(it.hasNext()) {
			Member mem = it.next();	// 변수를 만들어서 그 안에 원하는 값을 특정해줘야 if문 안에서 잘 돌아감...
			if("kimth".equals(mem.getId())) {
				mem.showInfo();
				break;
			}
		}
		
		
//		7. memberHashSet1에 저장된 회원 중 ID가 kimth인 회원 삭제하기
		it = memberHashSet1.iterator();		// 데이터 추출했으니까 다시 넣어줌
	
		System.out.println("3) memberHashSet1 중 Id가 kimth인 회원 삭제");
		while(it.hasNext()) {
			Member mem = it.next();	// 변수를 만들어서 그 안에 원하는 값을 특정해줘야 if문 안에서 잘 돌아감...
			if("kimth".equals(mem.getId())) {
				memberHashSet1.remove(mem);		// hashSet.remove(지울 객체);
				break;
			}
		}	
		it = memberHashSet1.iterator();		// 추출했으니까 다시 채워넣어줌
		while(it.hasNext()) {
			it.next().showInfo();
		}
		
//		8. memberHashSet1에 저장된 회원 중 ID가 suji인 회원 삭제하기
		it = memberHashSet1.iterator();		// 데이터 추출했으니까 다시 넣어줌
	
		System.out.println("4) memberHashSet1 중 Id가 suji인 회원 삭제");
		while(it.hasNext()) {
			Member mem = it.next();	
			if("suji".equals(mem.getId())) {
				memberHashSet1.remove(mem);	
				break;
			}
		}	
		
		it = memberHashSet1.iterator();		// 추출했으니까 다시 채워넣어줌
		while(it.hasNext()) {
			it.next().showInfo();
		}
//		>> suji 하나만 없어짐...
		
		

		System.out.println("\n2. LinkedHashSet ======================== \n");
//		※HashSet과의 차이점! ==> 저장된 순서 유지
//		>> 나머지 다 똑같음
		
//		1. Member 클래스의 객체를 저장할 수 있는 LinkedHashSet타입 객체 memberLinkedHashSet 생성
		Set<Member> memberLinkedHashSet = new LinkedHashSet<Member>();
	
//		2. Member 클래스의 객체 6개 생성해 memberHashSet1저장
		memberLinkedHashSet.add(new Member("youjs","qwer1234$","유재석")); 
		memberLinkedHashSet.add(new Member("eom","qwer1234$","엄정화"));
		memberLinkedHashSet.add(new Member("kanghd","qwer1234$","강호동"));
		memberLinkedHashSet.add(new Member("leess","qwer1234$","이순신"));
		memberLinkedHashSet.add(new Member("kimth","qwer1234$","김태희"));
		memberLinkedHashSet.add(new Member("kangkc","qwer1234$","강감찬")); 
		
//		4. 중복된 내용의 객체를 넣었을 때
		memberLinkedHashSet.add(new Member("leess","qwer1234$","이순신"));
//		>> new Member로 각자 객체를 만든 것이기 때문에 서로 다른 객체라고 인식 >> 중복인식X
//		ex) 객체 2개를 생성해서 같은 파라미터를 줬을 때
		Member mem5 = new Member("suji", "qwer1234$", "수지");
		Member mem6 = new Member("suji", "qwer1234$", "수지");
		memberLinkedHashSet.add(mem1);
		memberLinkedHashSet.add(mem2);	
//		>> 두 객체 모두 출력O
		
		
//		5. 객체 2개를 만들어서 한 객체에 다른 객체를 대입했을 때(객체1=객체2)
		Member mem7 = new Member("cha", "qwer1234$", "차은우");
		Member mem8 = new Member("gold", "qwer1234$", "차금우");
		mem8=mem7;
		memberLinkedHashSet.add(mem7);
		memberLinkedHashSet.add(mem8);
//		>> 객체 1개만 출력(mem3의 값만 나옴)
		
		
//		3. memberLinkedHashSet에 저장된 모든 회원 출력
		System.out.println("1) memberLinkedHashSet의 모든 회원 출력");
		Iterator<Member> it1 = memberLinkedHashSet.iterator();
		
		while(it1.hasNext()) {
			it1.next().showInfo();
		}
		
//		6. memberLinkedHashSet에 저장된 회원 중 ID가 kimth인 회원 출력하기
		it1 = memberLinkedHashSet.iterator();		
		System.out.println("2) memberLinkedHashSet 중 Id가 kimth인 회원 출력");

		while(it1.hasNext()) {
			Member mem = it1.next();	
			if("kimth".equals(mem.getId())) {
				mem.showInfo();
				break;
			}
		}
		
//		7. memberLinkedHashSet에 저장된 회원 중 ID가 kimth인 회원 삭제하기
		it1 = memberLinkedHashSet.iterator();
	
		System.out.println("3) memberLinkedHashSet 중 Id가 kimth인 회원 삭제");
		while(it1.hasNext()) {
			Member mem = it1.next();
			if("kimth".equals(mem.getId())) {
				memberLinkedHashSet.remove(mem);
				break;
			}
		}	
		it1 = memberLinkedHashSet.iterator();
		while(it1.hasNext()) {
			it1.next().showInfo();
		}
		
//		8. memberLinkedHashSet에 저장된 회원 중 ID가 suji인 회원 삭제하기
		it1 = memberLinkedHashSet.iterator();
	
		System.out.println("4) memberLinkedHashSet 중 Id가 suji인 회원 삭제");
		while(it1.hasNext()) {
			Member mem = it1.next();	
			if("suji".equals(mem.getId())) {
				memberLinkedHashSet.remove(mem);	
				break;
			}
		}	
		
		it1 = memberLinkedHashSet.iterator();
		while(it1.hasNext()) {
			it1.next().showInfo();
		}
		
	}

}
