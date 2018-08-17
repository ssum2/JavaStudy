package my.day9;

import java.util.StringTokenizer;

public class StringTest {
	// 다음주에 배울 내용인데 미리 보기!
	// 유용한 클래스 소개
	

	public static void main(String[] args) {
		String str = "안녕하세요? 만나서 반갑습니다. Goog Day 되세요~~^^";
		
		// 문자열.charAt(int index) ---> return type == char
		// ==> index 위치에  있는 문자(char)를 반환
		System.out.println("\n===============================\n");
		System.out.println("=== 1. 문자열.charAt(int index) ===");
	
		for(int i=0; i<str.length(); i++) {// 문자열이 들어가있는 변수.length(); ==> 문자열의 길이
			System.out.println(str.charAt(i)); // str문자열의 i번째 char(문자)를 반환
	
		}
		
		
		System.out.println("\n=== 2. 문자열.toCharArray() ===");
		// 문자열.toCharArray() ==> 문자열을 문자(char)배열 타입으로 반환 ---> return type == char[]
		char[] charArr = str.toCharArray();
		
		for(int i=0; i<charArr.length; i++) {
			System.out.println(charArr[i]);
		}
		
		
		System.out.println("\n=== 3. 문자열.substring(int beginIndex, int endIndex) ===");
		// 문자열.substring(int beginIndex, int endIndex) ---> return type == String
		// 어떤 문장(문자열)에서 일부분의 문자열을 가지고 올 때 사용
		// beginIndex에서 부터 endIndex 미만까지의 문자열을 반환 (endIndex의 값은 포함X)
		System.out.println(str.substring(7, 12)); // 7부터 12앞까지 -==> 만나서 반 까지
		
		
		System.out.println("\n=== 4. 문자열.substring(int beginIndex) ===");
		// 문자열.substring(int beginIndex) ---> return type == String
		// beginIndex에서 부터 끝까지 읽어옴
		System.out.println(str.substring(7)); // 7부터 끝까지 ==> 만나서 ~ ^^ 까지
		
		
		System.out.println("\n=== 5. 문자열.split(\"구분자\") ===");
		// 문자열.split("구분자") ---> return type == String[]
		// 문자열을 구분자를 기준으로 잘라서 문자열배열 타입으로 반환
		String food = "골뱅이,치킨,맥주,과일,닭발,소주,피자";
		String[] foodArr = food.split(","); 
		
		for(int i=0; i<foodArr.length; i++) {
			System.out.println(foodArr[i]);
		}
		
		System.out.println("\n--------------------------------\n");
		
		
		food = "골뱅이	치킨	맥주	과일	닭발	소주	피자";
		foodArr = food.split("\t"); 
		
		for(int i=0; i<foodArr.length; i++) {
			System.out.println(foodArr[i]);
		}
		
		System.out.println("\n--------------------------------\n");
		
		// < 정규표현식 > 
		// "."은 불특정 글자 1개를 말하기 때문에 그냥 "."으로 구분자 쓸 수 없음 ==> \\. 으로 써야함
		
		food = "골뱅이.치킨.맥주.과일.닭발.소주.피자";
		foodArr = food.split("\\."); 
		
		for(int i=0; i<foodArr.length; i++) {
			System.out.println(foodArr[i]);
		}
		
		System.out.println("\n--------------------------------\n");
		
		food = "골뱅이,치킨,맥주,과일,닭발,소주,피자";
		foodArr = food.split("\\,"); 
		
		for(int i=0; i<foodArr.length; i++) {
			System.out.println(foodArr[i]);
		}
		
		System.out.println("\n--------------------------------\n");
		
		// 구분자를 여러가지로 썼을 때 -> |(OR)로 이어 써줌
		
		food = "골뱅이,치킨.맥주 과일 닭발,소주	피자";
		foodArr = food.split("\\,|\\.|\\ |\\t"); 
		
		for(int i=0; i<foodArr.length; i++) {
			System.out.println(foodArr[i]);
		}
		
		System.out.println("\n\n");

		
		// StringTokenizer 클래스  ==> 문자열이 한 종류의 구분자로 연결되어 있을 경우, StringTokenizer 클래스를 사용하면 손쉽게 문자열(토큰:token)을 분리해낼 수 있다. 
		//                          StringTokenizer 객체를 생성할 때 첫 번째 매개값으로 전체 문자열을 주고, 두 번째 매개값으로 구분자를 주면 된다.
        //							만약 구분자를 생략하면 공백(Space)이 기본 구분자가 된다.		       
		// StringTokenizer st = new StringTokenizer("문자열", "구분자")
		
	    System.out.println("=== 6. StringTokenizer st = new StringTokenizer(\"문자열\", \"구분자\") ===");
	    String names = "일지매/이지매/삼지매/사지매/오지매";
	    StringTokenizer st1 = new StringTokenizer(names, "/");
	    /*
	          int        st1.countTokens()   ==>  꺼내지 않고 남아 있는 토큰의 수
	          boolean    st1.hasMoreTokens() ==>  남아 있는 토큰이 있는지 여부
	          String     st1.nextToken()     ==>  토큰을 하나씩 꺼내옴  
	          
	          nextToken() 메소드로 토큰을 하나 꺼내오면 StringTokenizer 객체에는 해당 토큰이 없어진다.
	                  만약 StringTokenizer 객체에서 더 이상 가져올 토큰이 없다면 nextToken() 메소드는
	          java.util.NoSuchElementException 예외를 발생시킨다.
	                  그래서 nextToken() 메소드를 사용하기 전에 hasMoreTokens() 메소드로 꺼내올 토큰이 있는지
	                  조사한 후  nextToken() 메소드를 호출하는 것이 좋은 코딩이다.    
	    */
	    
	    while(st1.hasMoreTokens()) {
	    	String token = st1.nextToken();
	    	System.out.println(token);
	    }
	    
	    System.out.println("\n--------------------------------\n");
	    StringTokenizer st2 = new StringTokenizer(names, "/");
	    int length = st2.countTokens();
	    System.out.println(">토큰을 꺼내기 전 토큰 수: "+length+"\n");
	    
	    for(int i=0; i<length; i++) {
	    	String token = st2.nextToken();
	    	System.out.println(token);
	    }
	    System.out.println(">토큰을 꺼낸 후 토큰 수: "+st2.countTokens());
	    
	    
	    
	    System.out.println("\n=== 7. String  String.join(\"구분자\", 문자열배열) ===");
	    String[] nameArr = {"한지민","두지민","세지민","네지민","오지민"};
	    // String  String.join("구분자", 문자열배열) 
	    // ==> 문자열배열을 구분자로 합쳐서 한 개의 문자열로 반환
	    String name = String.join("-", nameArr);
	    
	    System.out.println(name);
	    //한지민-두지민-세지민-네지민-오지민
	    
	    
	    System.out.println("\n=== 8. 문자열.replaceFirst(변경 대상 문자열, 새로 변경될 문자열) ===");
	    // String	문자열.replaceFirst(변경 대상 문자열, 새로 변경될 문자열)
	    // ==> 문자열에서 변경하고 싶은 특정 문자열 중 첫번째만 새로 변경될 문자열로 변환
	    
	    name = name.replaceFirst("지민", "JiMin");
	    System.out.println(name);
	    //한JiMin-두지민-세지민-네지민-오지민
	    
	    
	    System.out.println("\n=== 9. 문자열.replaceAll(변경 대상 문자열, 새로 변경될 문자열) ===");
	    // String	문자열.replaceAll(변경 대상 문자열, 새로 변경될 문자열)
	    // ==> 문자열에서 변경하고 싶은 특정 문자열을 모두 다 새로 변경될 문자열로 변환
	    
	    name = name.replaceAll("지민", "jimin");
	    System.out.println(name);
	    //한JiMin-두jimin-세jimin-네jimin-오jimin

	    
	    System.out.println("\n=== 10. 문자열.endsWith(문자열) ===");
	    // boolean	문자열.endWith(문자열) -> boolean형으로 나옴
	    // ==> (문자열)의 내용처럼 끝나는 글자를 찾아주는 것
	    
	    String[] fileNameArr = {"안녕.hwp", "GoodMorning.txt", "행복.txt", "안녕하세요.xls"};
	    
	    // 여기서 .txt 확장자만 찾고 싶을 때,
	    for(int i=0; i<fileNameArr.length; i++) {
	    	if(fileNameArr[i].endsWith(".txt")) {
	    		System.out.println(fileNameArr[i]);
	    	}
	    }
	    
	    
	    System.out.println("\n=== 11. 문자열.startsWith(문자열) ===");
	    // boolean	문자열.startsWith(문자열) -> boolean형으로 나옴
	    // ==> (문자열)의 내용처럼 시작하는 글자를 찾아주는 것
	    
	    String[] fileNameArr2 = {"안녕.hwp", "GoodMorning.txt", "행복.txt", "안녕하세요.xls"};
	    
	    // 여기서 안녕으로 시작하는 것만 찾고 싶을 때,
	    for(int i=0; i<fileNameArr.length; i++) {
	    	if(fileNameArr2[i].startsWith("안녕")) {
	    		System.out.println(fileNameArr2[i]);
	    	}
	    }
	    
	    System.out.println("\n=== 12. 문자열.toUpperCase(문자열), 문자열.toLowerCase(문자열) ===");
	    String str2 = "My name is Tom";
	    System.out.println(str2.toUpperCase());// 모두 대문자로 변경
	    System.out.println(str2.toLowerCase()); // 모두 소문자로 변경
	    
	    
	    System.out.println("\n=== 13. 문자열.equals(문자열), 문자열.equalsIgnoreCase(문자열) ===");
	    // boolean형 값으로 반환
	    String str3 = "my name IS Tom";
	    System.out.println(str2.equals(str3));// 문자열비교(대소문자 구분O)
	    System.out.println(str2.equalsIgnoreCase(str3));// 문자열비교(대소문자 구분X)
	    
	   
	    
	} // end of main()

} // end of class
