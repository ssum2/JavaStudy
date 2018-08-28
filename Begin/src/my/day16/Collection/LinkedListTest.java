package my.day16.Collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	/*
    == LinkedList == 
    1. 출력시 저장된 순서대로 나온다.
    2. 중복된 데이터를 저장할 수 있다.
    3. 데이터를 읽어오는 속도는 LinkedList 가 ArrayList 보다 상대적으로 느리다.
    4. 순차적으로 데이터를 추가/삭제하는 경우에는 LinkedList 가 ArrayList 보다 상대적으로 느리다.
    5. 일반적인 데이터 추가/삭제는 데이터 중간 중간마다 발생하므로 이러한 경우에는 LinkedList 가  ArrayList 보다 상대적으로 빠르다.
    6. 결과값은 ArrayList 를 사용하든지 LinkedList 를 사용하든지 동일한 결과값을 가진다.
    7. LinkedList 보다는 ArrayList 를 사용하도록 하자.
	 */
	
	public static void main(String[] args) {
//		1. Member 클래스의 객체를 저장할 수 있는 LinkedList 객체 memberList객체 생성
		List<Member> memberList = new LinkedList<Member>();
		
//		2. Member 클래스의 객체 6개 생성해 memberList저장
		Member[] memArr = {	new Member("youjs", "qwer1234", "유재석"),
				new Member("eom", "qwer1234", "강정화"),
				new Member("kanghd", "qwer1234", "강호동"),
				new Member("leess", "qwer1234", "이순신"),
				new Member("kimth", "qwer1234", "김태희"),
				new Member("kangkc", "qwer1234", "강감찬")
				};
		for(int i=0; i<memArr.length; i++) {
			memberList.add(memArr[i]);
		}
	
//		3. memberList에 저장된 모든 회원 출력
		for(int i=0; i<memberList.size(); i++) {
			memberList.get(i).showInfo();
		}
		System.out.println("* * * * * OR * * * * *\n");
		for(Member mem : memberList) {
			mem.showInfo();
		}

		
		System.out.println("\n[ 퀴즈 ] memberList에 저장된 회원(객체) 중 성이 \"강\"씨인 사람만 출력");
		
		for(Member mem : memberList) {
			
			if( mem.getName().startsWith("강") ) {
				mem.showInfo();
			}
		}
		System.out.println("* * * * * OR * * * * *\n");

		for(int i=0; i<memberList.size(); i++) {
			if(memberList.get(i).getName().startsWith("강"))
				memberList.get(i).showInfo();
		}
		
		System.out.println("=========================================\n");
		
//		#memberList에 새로운 Member객체 추가
		memberList.add(new Member("seolh","qwer1234$","설현"));
		
//		#memberList에 새로운 Member객체를 특정 인덱스에 추가
		memberList.add(3, new Member("Irin","asdf1234$","아이린"));
//		collection.add(index값, element);
//		>> 해당 인덱스에 값이 들어가면 원래있던 값들은 뒤로 밀려남(replace X)
	
		System.out.println("=== 새로운 객체 추가시 출력 화면 ===\n");
		for(int i=0; i<memberList.size(); i++) {
			System.out.println(">> index: "+i);
			memberList.get(i).showInfo();
		}
		
		
//		#memberList에서 특정 객체 삭제하기
		memberList.remove(3);
//		collection.remove(특정 index number);
//		>> 특정 객체를 삭제하면 비어있는 공간에 자동으로 뒤의 값들이 들어감(배열과 다름)
		
		System.out.println("=== 특정 객체 삭제시 출력 화면 ===\n");
		for(int i=0; i<memberList.size(); i++) {
			System.out.println(">> index: "+i);
			memberList.get(i).showInfo();
		}
		
//		#특정 객체를 삭제한 후 새로운 객체로 대체하기
		memberList.set(3, new Member("suji","asdf1234$","수지"));
//		collection.set(index, element);
		
		System.out.println("=== 특정 객체 삭제후 새로운 객체로 대체시 출력 화면 ===\n");
		for(int i=0; i<memberList.size(); i++) {
			System.out.println(">> index: "+i);
			memberList.get(i).showInfo();
		}
		
		
		
		System.out.println("\n[ 퀴즈2 ] memberList에 저장된 회원(객체) 중 성이 \"강\"씨인 사람만 삭제");
		for(int i=0; i<memberList.size(); i++) {
			
			if(memberList.get(i).getName().startsWith("강")) {
				memberList.remove(i);
				continue;
			}
			System.out.println(">> index: "+i);
			memberList.get(i).showInfo();
		}

		
//		#memberList 안의 모든 객체 삭제하기
		memberList.clear();
//	cf) memberList = null; 은 아예 memberList 자체를 없애버리는 것
		
		System.out.println("=== 콜렉션에 저장된 모든 객체 삭제 후 출력 화면 ===\n");
		for(int i=0; i<memberList.size(); i++) {
			System.out.println(">> index: "+i);
			memberList.get(i).showInfo();
		}
	}

}
