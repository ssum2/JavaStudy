package my.day10;

import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {
		
		String str = "안녕하세요? 만나서 반갑습니다. Good Day 되세요~~^^"; 
		
		// char  문자열.charAt(int index)
		// ==> index 위치에 있는 문자(char)를 반환
		System.out.println("=== 1. char  문자열.charAt(int index) ===");  
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		System.out.println("\n#######################\n"); 
		
		// char[]  문자열.toCharArray()  ==> 문자열을 문자(char)배열타입으로 반환 
		System.out.println("=== 2. char[]  문자열.toCharArray() ===");
		char[] charArr = str.toCharArray();
		for(int i=0; i<charArr.length; i++) {
			System.out.println(charArr[i]);
		}
		
		// String  문자열.substring(int beginIndex, int endIndex)
		// ==> 문자열 beginIndex 위치에서 부터 endIndex 위치 앞에 까지 문자열을 반환 
		System.out.println("=== 3. String  문자열.substring(int beginIndex, int endIndex) ===");  
		System.out.println(str.substring(7, 12));
		// 만나서 반
		
		// String  문자열.substring(int beginIndex)
		// ==> 문자열 beginIndex 위치에서 부터 끝까지 문자열을 반환 
		System.out.println("=== 4. String  문자열.substring(int beginIndex) ===");  
		System.out.println(str.substring(7));
		// 만나서 반갑습니다. Good Day 되세요~~^^
		
		// String[]  문자열.split("구분자") 
		// ==> 문자열을 구분자로 잘라서 문자열배열 타입으로 반환
		System.out.println("=== 5. String[]  문자열.split(구분자) ===");
		String food = "골뱅이,치킨,맥주,과일,닭발,소주,피자";
		String[] foodArr = food.split(",");
		for(int i=0; i<foodArr.length; i++) {
			System.out.println(foodArr[i]);
		}
		
		System.out.println("\n$$$$$$$$$$$$$$$$\n");
		
		food = "골뱅이	치킨	맥주	과일	닭발	소주	피자";
		foodArr = food.split("\t");
		for(int i=0; i<foodArr.length; i++) {
			System.out.println(foodArr[i]);
		}
		
		
		System.out.println("\n##################\n");
		
		food = "골뱅이.치킨.맥주.과일.닭발.소주.피자";
	//	foodArr = food.split(".");
		foodArr = food.split("\\."); 
		for(int i=0; i<foodArr.length; i++) {
			System.out.println(foodArr[i]);
		}
		
		System.out.println("\n^^^^^^^^^^^^^^^^^\n");
		
		food = "골뱅이,치킨,맥주,과일,닭발,소주,피자";
		foodArr = food.split("\\,");
		for(int i=0; i<foodArr.length; i++) {
			System.out.println(foodArr[i]);
		}
		
		
		System.out.println("\n%%%%%%%%%%%%%%%%%%%%\n");
		
		food = "골뱅이,치킨.맥주 과일 닭발,소주	피자";
		foodArr = food.split("\\,|\\.|\\ |\\t");
		for(int i=0; i<foodArr.length; i++) {
			System.out.println(foodArr[i]);
		}
		
		System.out.println("\n\n");
		
		// StringTokenizer 클래스  ==> 문자열이 한 종류의 구분자로 연결되어 있을 경우, StringTokenizer 클래스를 사용하면 손쉽게 문자열(토큰:token)을 분리해낼 수 있다. 
		//                          StringTokenizer 객체를 생성할 때 첫 번째 매개값으로 전체 문자열을 주고, 두 번째 매개값으로 구분자를 주면 된다.
        //	                                             만약 구분자를 생략하면 공백(Space)이 기본 구분자가 된다.		                            
	    System.out.println("==== 6. StringTokenizer st = new StringTokenizer(문자열, 구분자) ==== ");
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
		
		System.out.println("");
		
		StringTokenizer st2 = new StringTokenizer(names, "/");
		int length = st2.countTokens();
		//   5
		
		for(int i=0; i<length; i++) {
			String token = st2.nextToken();
			System.out.println(token);
		}
		
		System.out.println("");
		
		String[] nameArr = {"한지민","두지민","세지민","네지민","오지민"}; 
		
		// String  String.join(구분자, 문자열배열) 
		// ==> 문자열배열을 구분자로 합쳐서 한개의 문자열로 반환.
		System.out.println("==== 7. String  String.join(구분자, 문자열배열) ==== ");
		String name = String.join("-", nameArr);
		System.out.println(name);
		// 한지민-두지민-세지민-네지민-오지민
		
		System.out.println("");
		
		// String  문자열.replaceFirst(변경대상문자열, 새로이변경될문자열) 
		// ==> 문자열에서  변경대상문자열중 첫번째만 새로이변경될문자열로 변환 
		System.out.println("==== 8. String  문자열.replaceFirst(변경대상문자열, 새로이변경될문자열) ==== "); 
		name = name.replaceFirst("지민", "JiMin");
		System.out.println(name);
		// 한JiMin-두지민-세지민-네지민-오지민
		
		// String  문자열.replaceAll(변경대상문자열, 새로이변경될문자열) 
		// ==> 문자열에서  변경대상문자열을 모두 새로이변경될문자열로 변환 
		System.out.println("==== 9. String  문자열.replaceAll(변경대상문자열, 새로이변경될문자열) ==== "); 
		name = name.replaceAll("지민", "jimin");
		System.out.println(name);
		// 한JiMin-두jimin-세jimin-네jimin-오jimin
		
		System.out.println("");
		
		System.out.println("=== 10. boolean  문자열.endsWith(문자열) ===");
		String[] fileNameArr = {"안녕.hwp", "GoodMorning.txt", "행복.txt", "안녕하세요.xls"};  
		
		for(int i=0; i<fileNameArr.length; i++) {
			if(fileNameArr[i].endsWith(".txt")) { // .txt 로 끝나는 파일명찾기
				System.out.println(fileNameArr[i]);
			}
		}
		// GoodMorning.txt
		// 행복.txt
		
		System.out.println("");
		
		System.out.println("=== 11. boolean  문자열.startsWith(문자열) ===");
		String[] fileNameArr2 = {"안녕.hwp", "GoodMorning.txt", "행복.txt", "안녕하세요.xls"};  
		
		for(int i=0; i<fileNameArr2.length; i++) {
			if(fileNameArr2[i].startsWith("안녕")) { // 안녕 으로 시작하는 파일명찾기
				System.out.println(fileNameArr2[i]);
			}
		}
		// 안녕.hwp
		// 안녕하세요.xls
		
		System.out.println("");
		
		String str2 = "My Name is Tom";
		System.out.println(str2.toUpperCase()); // 대문자로 변경
		System.out.println(str2.toLowerCase()); // 소문자로 변경
		
		String str3 = "my name IS Tom";
		System.out.println(str2.equals(str3)); // 문자열비교(대소문자구분함) false
		System.out.println(str2.equalsIgnoreCase(str3)); // 문자열비교(대소문자구분하지 않음) true
	}

}
