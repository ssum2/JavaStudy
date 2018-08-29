package my.day17.Collection;

import java.util.*;	// java.util 패키지 내의 class를 모두 import
/*
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
*/

public class HashMapTest {
	/*
    === Map 계열 ===
    1. HashMap 과 Hashtable 이 있다.
    2. Map 계열은 List 계열(Vector, ArrayList)처럼 index 가 사용되어 저장되는 것이 아니라, 
       Map 계열은 key값과 value값을 쌍으로 사용하여 저장하는데  
             데이터 저장시 사용되는 메소드는 put(String key, Object value)메소드를 사용한다.
             이때 key값은 반드시 고유한 값을 가져야 하고, value값은 중복된 값이 와도 괜찮다.
    3. Map 계열에 저장된 key값들은 순서와는 상관없이 저장된다.  
    4. Map 계열에 저장된 value값을 추출하려면 key를 이용해서 가져오는데 
       value 값의 추출은 get(String key) 메소드를 사용한다.
 */
	public static void main(String[] args) {
		HashMap<String, Member> memberMap = new HashMap<String, Member>();
		// key는 String타입, 데이터는 Member타입으로 받음
		
		//				key			date value
		memberMap.put("youjs", new Member("youjs","qwer1234$","유재석"));
		memberMap.put("eom", new Member("eom","qwer1234$","엄정화"));
		memberMap.put("kanghd", new Member("kanghd","qwer1234$","강호동"));
		memberMap.put("leess", new Member("leess","qwer1234$","이순신"));
		
		memberMap.put("kimth", new Member("kimth","qwer1234$","김태희"));
		memberMap.put("kangkc", new Member("kimth","qwer1234$","김태희"));
//		>> value가 같아도 key가 다르면 별개의 객체로 인식  ==> value 중복허용O
		
		memberMap.put("leess", new Member("leess","qwer1234$","Lee SunSin"));
//		>> "leess" 정보가 두개 들어가도 하나만 나옴  ==> key 중복허용X(나중에 넣은 값으로 덮어씌움)
		
		
		System.out.println("\n[ 퀴즈 ] memberMap에 저장된 회원(객체) 중 ID가 \"kimth\"인 사람만 출력");
		// Map에서는 key로 검색하면 되기 때문에 for 돌릴 필요 X  ==> 특정 객체만 찾을 때는 List보다 훨씬 출력속도가 빠름
		Member mem = memberMap.get("kimth");	// key값으로 검색
		mem.showInfo();
		
		
		System.out.println("\n[ 퀴즈2 ] memberMap에 저장된 모든 회원(객체)정보 출력");
		// key값을 모두 알지 못함... > 이 때는 ArrayList가 유리
		/*
		 	memberMap에 저장된 모든 key를 알고 있다면 추출 가능
		 	>> key를 알려주는 메소드: keySet();
		 */
		System.out.println("1) key 출력");
		Set<String> keysets = memberMap.keySet();		
// 		return타입 Set(Collection 중 하나) <String> key값 출력
//		Set: 중복X
		for(String key : keysets ) {
			System.out.println("key : "+key);
		}
		/*
		 	<결과> ===> 입력 순서 유지 X
		 	key : eom
			key : youjs
			key : kimth
			key : kangkc
			key : kanghd
			key : leess
		 */
		
		System.out.println("\n2) keySey()를 이용해 memberMap에 저장된 모든 value(회원객체) 출력하기");
		for(String key:keysets) {
			memberMap.get(key).showInfo();
		}
		
		System.out.println("\n3) values()를 이용해 memberMap에 저장된 모든 value(회원객체) 출력하기(참고용)");
		/*
	 	> HashMap객체명.values()
	 		- 해당 객체에 저장된 value값만 추출하는 메소드
	 		- Collection<V>; 단독 사용 X, "iterator()"메소드로 Iterator타입으로 변경해야 사용 가능
	 		- haseNext(); Iterator형 저장소에서 해당 value가 있는가 없는가 판별(boolean타입 리턴)
	 		- next(); Iterator형 저장소에서 value를 추출
		*/
		
//		원래는 콜렉션 형태를 이터레이터에 담아서 해야하는데.... 근데 그냥 콜렉션 형태로도 밸류 추출이 된다.... 왜죠...?
		Collection<Member> collect = memberMap.values();
		for(Member member : collect) {
			member.showInfo();
		}
		
		System.out.println("\n-----------------------------\n");
		Iterator<Member> itMember = collect.iterator();
		
		while(itMember.hasNext()) {
			Member member = itMember.next();
			member.showInfo();
		}

		System.out.println("\n[ 퀴즈3 ] memberMap에 저장된 key leess 객체를 삭제하기");
		
		memberMap.remove("leess");

		keysets = memberMap.keySet();		
		for(String key:keysets) {
			memberMap.get(key).showInfo();
		}
	
	} // end of main()
} // end of class
