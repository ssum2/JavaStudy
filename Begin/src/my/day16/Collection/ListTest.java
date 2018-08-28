package my.day16.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/*
 	>> 배열(Array)과 자료구조(Collection)의 차이점
 	1) 배열; 동일한 데이터타입만 들어가는 저장소	> 배열타입이 int일 때 double형 데이터 X
 		- 크기가 한번 정해지면 크기를 변경할 수 없음
 	
 	2) 자료구조; 타입이 달라도 객체이기만 하면 모두 들어갈 수 있는 저장소
 		- 저장되는 크기가 자동으로 증가(무한대로 받을 수 있음)
 		- 형태에 구애받지 않기 때문에 특정 형태의 값만 다시 불러오고 싶을 때 찾기가 힘듦
 		
 	3) 웹에서 사용 빈도 높은 콜렉션타입(interface)
 		- 주 사용처:		웹에서 사용					게임개발에서 사용
 		- 스레드방식:	 (Single Thread)		  (Multi Thread)
 		- List계열: 		ArrayList 				  Vector
 		- Map 계열: 		 HashMap 			 	 Hashtable
 		- 메모리사용:		    가벼움						무거움
 					   >> 멀티스레드 지원/비지원 차이만 있을 뿐 기능 동일	
 */

/*
JDK 1.5 부터 제네릭(Generic)타입이 새로 추가되었는데, 제네릭(Generic)을 이용함으로써 잘못된 타입이
   사용될 수 있는 문제를 컴파일 과정에서 제거할 수 있게 되었다. 
   프로그램 실행시 타입 에러가 발생하여 작동이 멈추는 것보다는 컴파일시에 타입에러가 발생하도록 하여 
   프로그램 실행시 에러를 발생하지 않도록 사전에 방지하는 것이 좋기 때문이다.
   
     ▷ 제네릭(Generic)은 컬렉션(자료구조) 즉, 쉽게 말해서 객체들을 저장(수집)하는 구조적인 성격을 보강하기 위해 제공하는 것이다.
     ▷ 간단히 예를 들자면 컵이라는 특정 객체가 있다고 하자. 
      이 컵은 물만 담을 수 있는 물컵 , 또는 이 컵은 쥬스만 담을 수 있는 쥬스 컵. 이렇게 지정해주도록 하는 것이  제네릭(Generic) 이다.    

     ▷  JDK 1.5 부터 제네릭(Generic)타입이 새로 추가되면서, 특정 컬렉션(자료구조)에 저장되어질 특정한 객체 타입을 명시하여
     실행하기전 컴파일 단계에서 특정한 객체 타입이 아니면 에러를 발생토록 하여 저장이 불가능하도록 만들었다.
     즉, 특정 컬렉션(자료구조)에 저장되어질 객체의 타입을 제한하도록 만든 것이다.

    ▷   제네릭(Generic)타입을 사용하기 이전에는  컬렉션(자료구조)에 저장되어진 객체들을 하나씩 검출하여 객체 타입을 확인할 수 밖에 없었다.
  Object 로 부터 상속받은 객체는 모두 저장이 가능했던 이전의 버전들과는 달리 보다 체계적이라 할 수 있다.
  
    ▷ 제네릭(Generic)타입을 사용함으로써 별도의 형 변환(Casting)이 필요없이 <> 사이에 선언하였던 객체자료형으로 검출되어 편리하다.       

    ▷ 제네릭(Generic)타입에 있어서 1개 글자로 된 영문대문자는 영문대문자 아무것이나 사용해도 무관하다.
 -- 그런데 관습상 객체가 제네릭(Generic)타입으로 사용될때 자료형(Type)이라고 나타내고 싶을때는 <T>라고 쓰고,
           어떠한 요소(Element)이라고 나타내고 싶을때는 <E>라고 쓰고, 
    key값이라고 나타내고 싶을때는 <K>라고 쓰고, Value값이라고 나타내고 싶을때는 <V>라고 쓴다.      
    
*/

public class ListTest {

	public static void main(String[] args) {
		
		Vector vt = new Vector(5,3);	// 벡터는 웹에서 자주 사용X
//							용량 5, 증가치 3 (꽉 차면 3씩 공간 증가)
		
		System.out.println("벡터 vt의 용량: "+vt.capacity());
//		벡터 vt의 용량: 5
		System.out.println("벡터 vt의 저장된 현재 크기: "+vt.size());
//		벡터 vt의 저장된 현재 크기: 0

		System.out.println("");
		
//		배열생성
		String[] strArr = {"일순신", "이순신", "삼순신", "사순신", "오순신"};
		Member[] memArr = {	new Member("hongkd", "qwer1234", "홍길동"),
							new Member("leekd", "qwer1234", "이길동"),
							new Member("kimkd", "qwer1234", "김길동"),
							new Member("parkkd", "qwer1234", "박길동")
							};
		
//		생성된 배열객체(요소; element)를 vt에 저장
//		Vector객체명.add(넣어줄 객체명);
		vt.add(strArr[0]);
		
		for(int i=1; i<strArr.length; i++) {
			vt.add(strArr[i]);
		}
		System.out.println("벡터 vt의 용량: "+vt.capacity());
//		벡터 vt의 용량: 5
		System.out.println("벡터 vt의 저장된 현재 크기: "+vt.size());
//		벡터 vt의 저장된 현재 크기: 5
		
		System.out.println("\n----------용량 초과시 증가하는 양상-----------");
		
		vt.add(memArr[0]);
		System.out.println("벡터 vt의 용량: "+vt.capacity());
//		벡터 vt의 용량: 8
		System.out.println("벡터 vt의 저장된 현재 크기: "+vt.size());
//		벡터 vt의 저장된 현재 크기: 6
		
		System.out.println("");
		for(int i=1; i<memArr.length; i++) {
			vt.add(memArr[i]);
		}
		System.out.println("벡터 vt의 용량: "+vt.capacity());
//		벡터 vt의 용량: 11
		System.out.println("벡터 vt의 저장된 현재 크기: "+vt.size());
//		벡터 vt의 저장된 현재 크기: 9
		
		
		System.out.println("\n==========객체 형태 제한 없이 리스트에 값 저장==========\n");
		
//		#부모클래스 또는 구현할 인터페이스 형태로 받아서 만들어도 됨
//		ArrayList list = new ArrayList();	// 생성할 객체의 본인클래스형태로 생성
		List list = new ArrayList();		// 생성할 객체의 인터페이스형태로 생성
		
//		i) list에 값 저장 전; ArrayList list의 현재 크기: 0
		System.out.println("ArrayList list의 현재 크기: "+list.size());
		
//		ii) list에 strArr값 저장 후; ArrayList list의 현재 크기: 5
		for(int i=0; i<strArr.length; i++) {
			list.add(strArr[i]);
		}
		System.out.println("ArrayList list의 현재 크기: "+list.size());
		
//		iii) list에 memArr값까지 저장 후; ArrayList list의 현재 크기: 9
		for(int i=0; i<memArr.length; i++) {
			list.add(memArr[i]);
		}
		System.out.println("ArrayList list의 현재 크기: "+list.size());
		
//		#wrapper class 형태의 배열 생성
		Integer[] intArr = {new Integer(10),
							new Integer(20),
							new Integer(30)};
		
//		iv) list에 intArr값까지 저장 후; ArrayList list의 현재 크기: 12
		for(int i=0; i<intArr.length; i++) {
			list.add(intArr[i]);
		}
		System.out.println("ArrayList list의 현재 크기: "+list.size());
		
//		#데이터 꺼내오기
		System.out.println("\n----------- 데이터 꺼내오기 -------------");
		for(int i=0; i<list.size(); i++) {				 // list에 저장된 값들의 현재 크기만큼 돌림
			
//			a) 각 객체 타입에 맞춰서 꺼내오기(instanceof 연산자 + casting)
//				> 객체로 넣어줬기 때문에 꺼내올 때도 객체
			if(list.get(i) instanceof String) {
				System.out.println(i+". "+(String)list.get(i)); 
			}
			else if(list.get(i) instanceof Member) {
				System.out.println(i+". "+(Member)list.get(i));
//				System.out.println(i+". "+((Member)list.get(i)).toString());
//				>> 이렇게 해야하는데 toString 생략가능, toString을 Member에서 override해줘서 기능을 바꿔줌
			}
			else if(list.get(i) instanceof Integer) {
				System.out.println(i+". "+(Integer)list.get(i));
			}
			else
				System.out.println(list.get(i));
							
		}
	
//		# <E>: Generic, JDK 1.5ver 이후부터 사용 / E; Element(요소), 클래스명이 들어옴
//		형태 제한 없이 값을 넣으면 나중에 특정 형태의 값만 꺼내오기 불편하기 때문에 제네릭으로 배열처럼 사용할 수 있게 함
		System.out.println("\n==========객체 형태 제한 두고 리스트에 값 저장==========\n");
		
//		# String형태만 들어가는 콜렉션
		List<String> nameList = new ArrayList<String>();
//		인터페이스<요소 형태>	리스트명  = 생성	리스트구현받은 클래스명<요소 형태>();
//		>>> 배열처럼 쓰면서 저장 할 수 있는 공간은 무한대 ===> 배열과 자료구조의 장점만 모음
//		>>> nameList에 저장되는 객체는 <String>형태만 가능함!
		for(int i=0; i<strArr.length; i++) {
			nameList.add(strArr[i]);
		}
		System.out.println("nameList list의 현재 크기: "+nameList.size());

//		# Member형태만 들어갈 수 있는 무한한 배열(콜렉션)
		List<Member> memberList = new ArrayList<Member>();
		for(int i=0; i<memArr.length; i++) {
			memberList.add(memArr[i]);
		}
		System.out.println("memberList list의 현재 크기: "+memberList.size());
		
//		# Integer형태만 들어갈 수 있는 콜렉션
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(new Integer(90));//	>> 원칙
		intList.add(85);		   	 //	>> 가능; JVM이 자동으로 new Integer(85)로 바꿔줌 => "Auto Boxing"
		System.out.println("intList list의 현재 크기: "+intList.size());
		
//		#데이터 꺼내오기
		System.out.println("\n----------- 데이터 꺼내오기 -------------");
		System.out.println("i) String");

		for(int i=0; i<nameList.size(); i++) {
			System.out.println(nameList.get(i));
		}
		System.out.println("\nii) Member");

		for(Member mem : memberList) {	// 콜렉션에 저장되어 있는 사이즈만큼 반복
			System.out.println(mem);
		}
		
		System.out.println("\niii) Integer");
		for(Integer intlist : intList) {
			System.out.println(intlist);
		}
		
		System.out.println("* * * OR * * *");
		for(int intlist : intList) {	
//		 >> 객체인 Integer를 JVM이 자동적으로 원시형타입 int로 바꿔줌 => "Auto UnBoxing"
			System.out.println(intlist);
		}
		
	} // end of main()
} // end of class
