package my.day17.Collection;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {
	/*
    Properties 는 HashMap의 구버전인 Hashtable을 상속받아 구현한 것으로,
    Hashtable 은 키와 값(Object, Object)의 형태로 저장하는데 비해서
    Properties 는 (String 키, String 밸류값)의 형태로 저장하는 단순화된 컬렉션 클래스이다.
        키는 고유해야 한다. 즉, 중복을 허락하지 않는다. 중복된 값을 넣으면 마지막에 넣은 값으로 덮어씌운다.
        주로 어플리케이션의 환경설정과 관련된 속성(property)을 저장하는데 사용되며, 
        데이터를 파일로 부터 읽고 쓰는 편리한 기능을 제공한다.    
	 */
	
	public static void main(String[] args) {
//		#Properties형태의 저장소
		Properties prop = new Properties();
		
//		#properties.setProperty("key", "value"); 	>> 값을 저장소에 넣음
		prop.setProperty("jdk", "http://www.oracle.com/technetwork/java/javase/downloads/index.html");
		prop.setProperty("eclipse", "http://www.iei.or.kr");
		prop.setProperty("eclipse", "http://www.eclipse.org/downloads/eclipse-packages/");
		prop.setProperty("oracle", "http://www.oracle.com/technetwork/database/database-technologies/express-edition/downloads/index.html");
		
//		#properties.getProperty("key"); 	>> 값을 저장소에서 얻어옴(추출)
		System.out.println("1) key \"eclipse\" 출력");
		String url = prop.getProperty("eclipse");
		System.out.println(url);
		
		System.out.println("\n=========================\n");
		
		Enumeration<String> en = (Enumeration<String>) prop.propertyNames();
//													       저장소.propertyNames(); 키목록 출력
		// 키목록을 Enumeration 형태로 반환시켜줌. 
		
		while(en.hasMoreElements()) {
//			 Enumeration.hasMoreElements();		>> 해당 객체가 있는가 없는가 여부를 boolean타입으로 결과 출력
			
			String key = en.nextElement();
			System.out.print(key);
			System.out.print("=");
			System.out.println(prop.getProperty(key));  // 해당key에 일치하는 밸류값을 리턴시켜줌.
		}	
			
	 /*
		 <출력결과>
		 oracle=http://www.oracle.com/technetwork/database/database-technologies/express-edition/downloads/index.html
		 eclipse=http://www.eclipse.org/downloads/eclipse-packages/
		 jdk=http://www.oracle.com/technetwork/java/javase/downloads/index.html
	 */

	}

}
