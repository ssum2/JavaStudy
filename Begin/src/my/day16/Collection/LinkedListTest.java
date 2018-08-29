package my.day16.Collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	/*
    == LinkedList == 
    1. 출력시 저장된 순서대로 나온다.	=> 순서 유지
    2. ★★중복된 데이터를 저장 가능★★
    3. 데이터를 읽어오는 속도는 LinkedList 가 ArrayList 보다 상대적으로 느리다.
    4. 순차적으로 데이터를 추가/삭제하는 경우에는 LinkedList 가 ArrayList 보다 상대적으로 느리다.
    5. 일반적인 데이터 추가/삭제는 데이터 중간 중간마다 발생하므로 이러한 경우에는 LinkedList 가  ArrayList 보다 상대적으로 빠르다.
    6. 결과값은 ArrayList 를 사용하든지 LinkedList 를 사용하든지 동일한 결과값을 가진다.
    7. LinkedList 보다는 ArrayList 를 사용하도록 하자.
	 */
	
	/*
 			------------------ LinkedList(저장소) ---------------------
 	(null)유재석(자신의 메모리주소 1372)++링크++(앞의 값의 메모리주소 1372)엄정화(자신의 메모리주소 3236)++
 	++(앞의 값의 메모리주소 3236)강호동(자신의 메모리주소 1034)++링크++(앞의 값의 메모리주소 1034)이순신(자신의 메모리주소 2340)
 	++(앞의 값의 메모리주소 2340)김태희(자신의 메모리주소 4548)
 	=> 주소를 찾아서 링크를 타고 가야해서 오래 걸림
 	
 	#중간 값을 삭제할 때
 	(null)유재석(자신의 메모리주소 1372)++링크++(앞의 값의 메모리주소 1372를 넘겨주면서 사라짐->>강호동(자신의 메모리주소 1034)++
 	링크++(앞의 값의 메모리주소 1034)이순신(자신의 메모리주소 2340)++(앞의 값의 메모리주소 2340)김태희(자신의 메모리주소 4548)
 	>> 사라지는 값이 가지고있던 앞의 값주소를 뒤에 링크된 값에 넘겨주면서 삭제 => 앞으로 값을 당겨 재배치하는 작업이 없기 때문에 부하가 적음
 	
 	#새로운 데이터를 삽입할 때
 	(null)유재석(자신의 메모리주소 1372)++링크++^삽입(앞의 값의 메모리주소 1372)엄정화(자신의 메모리주소 3236)^++
 	++(앞의 값의 메모리주소 3236)강호동(자신의 메모리주소 1034)++링크++(앞의 값의 메모리주소 1034)이순신(자신의 메모리주소 2340)
 	++(앞의 값의 메모리주소 2340)김태희(자신의 메모리주소 4548)
 	>> 삽입되는 값 앞의 메모리주소를 취하고 동시에 자신의 메모리주소를 뒤의 값에 넘겨주면서 들어감
 	   => 부하 低 => 빠른 처리 가능
	 */
	
	public static void main(String[] args) {
//		1. Member 클래스의 객체를 저장할 수 있는 LinkedList 객체 memberList객체 생성
		List<Member> memberList = new LinkedList<Member>();
		
//		2. Member 클래스의 객체 6개 생성해 memberList저장
		/*
		Member[] memArr = {	new Member("youjs", "qwer1234", "유재석"),
				new Member("eom", "qwer1234", "엄정화"),
				new Member("kanghd", "qwer1234", "강호동"),
				new Member("leess", "qwer1234", "이순신"),
				new Member("kimth", "qwer1234", "김태희"),
				new Member("kangkc", "qwer1234", "강감찬")
				};
		for(int i=0; i<memArr.length; i++) {
			memberList.add(memArr[i]);
		}
		*/
	
		memberList.add(new Member("youjs","qwer1234$","유재석")); 
		memberList.add(new Member("eom","qwer1234$","엄정화"));
		memberList.add(new Member("kanghd","qwer1234$","강호동"));
		memberList.add(new Member("leess","qwer1234$","이순신"));
		memberList.add(new Member("kimth","qwer1234$","김태희"));
		memberList.add(new Member("leess","qwer1234$","이순신"));
		memberList.add(new Member("kangkc","qwer1234$","강감찬")); 
		
		
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
