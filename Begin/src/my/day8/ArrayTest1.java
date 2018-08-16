package my.day8;

public class ArrayTest1 {
	/*
	    === 배열(Array)이란 ? ===
	        동일한 데이터타입을 가지는 여러개의 데이터를 담을 수 있는 데이터 타입을 말한다.
	        그리고 배열 또한 객체라는 것을 꼭 기억하도록 하자!!!!  
	 */
	
	
	
	public static void main(String[] args) {
		// 시험과목 성적(국어, 영어, 수학, 사회, 과학, 체육, 음악 등...)
		int kor=100, eng=90, math=95, society=70, science=98, physical=100, music=90;
		int total = kor+eng+math+society+science+physical+music;
		
		System.out.println("총점: "+total);
		System.out.println("평균: "+Math.round((double)total/7*10)/10.0 );
		
		/*
		 	>결과값
		 	총점: 643
			평균: 91.9

		 */
		
		// 만약 시험과목이 너무 많다면? -> 데이터타입이 동일할 경우 array
		
		System.out.println("\n============= 배열 =============");
		System.out.println("\n==========첫번째 방법============");
		
		// 1. 배열의 선언 ---------------------------------
		int[] subject; // subject(배열 명)는 int타입을 가지는 배열이다 
		
		// 또는
//		int subject[]; => 상동, 위의 포맷을 자주 사용함

		
		// 2. 메모리에 배열을 할당 ----------------------------
		subject = new int[7]; // 7개를 받음 (배열 길이 설정)
		// 배열도 객체이기 때문에 new 생성자 사용
		
		// 배열로 선언된 변수에는 자동적으로 초기값이 들어가있음 
		// 정수 0, 실수 0.0, char ' ', String을 포함한 객체는 null
		
		/*
		 	>> 배열의 형태 =================================
		 		- 메모리 위 배열의 각 방은 index; 0부터 시작해 1씩 증가함	
		 	---------------------------------
			|Index 0| 1 | 2 | 3	| 4	| 5	| 6	|
		 	---------------------------------
		 	
		 	>> 배열에 저장된 데이터를 표현할 때는 배열명[인덱스번호]로 나타냄 (해당 배열 인덱스값 호출)
		 		- subject[0] subject[1] subject[2] subject[3] subject[4] subject[5] subject[6]
		
		 */
		
		System.out.println("배열 subject의 길이: "+subject.length); // 배열명.length 
		System.out.println("\n----------기본값------------");
		
		for(int i=0; i<subject.length; i++) { // 여기서 변수i는 index
			System.out.println("subject["+i+"] => "+subject[i]);
		}
		/*
		 	subject[0] => 0
			subject[1] => 0
			subject[2] => 0
			subject[3] => 0
			subject[4] => 0
			subject[5] => 0
			subject[6] => 0
		 */
		
		System.out.println("\n---------값 초기화-----------");
		// 3. 데이터의 초기화 --------------------------------
		subject[0] = 100;
		subject[1] = 90;
		subject[2] = 95;
		subject[3] = 70;
		subject[4] = 98;
		subject[5] = 100;
		subject[6] = 90;
		
		for(int i=0; i<subject.length; i++) { // 여기서 변수i는 index
			System.out.println("subject["+i+"] => "+subject[i]);
		}
		
		/*
		 	subject[0] => 100
			subject[1] => 90
			subject[2] => 95
			subject[3] => 70
			subject[4] => 98
			subject[5] => 100
			subject[6] => 90
		 */
		System.out.println("----------누적합계-----------");
		total =0;
		for(int i=0; i<subject.length; i++) {
			total += subject[i]; // 누적합계 구하기
		}
		System.out.println("총점: "+total);
		System.out.println("평균: "+Math.round((double)total/subject.length*10)/10.0 );
		
		
		System.out.println("\n==========두번째 방법============");
		
		
		// 위의  배열 선언과 메모리 할당을 해주는 것을 아래와 같이 동시에 하는 것을 많이 사용
		// 1. 배열 선언, 메모리할당 동시 선언
		int[] guamok = new int[7];
		
		// 데이터의 초기화
		guamok[0]= 100;
		guamok[1]= 90;
		guamok[2]= 95;
		guamok[3]= 70;
		guamok[4]= 98;
		guamok[5]= 100;
		guamok[6]= 90;	
		
		for(int i=0; i<guamok.length; i++) { 
			System.out.println("guamok["+i+"] => "+guamok[i]);
		}
		System.out.println("----------누적합계-----------");
		total =0;
		for(int i=0; i<guamok.length; i++) {
			total += guamok[i]; // 누적합계 구하기
		}
		System.out.println("총점: "+total);
		System.out.println("평균: "+Math.round((double)total/guamok.length*10)/10.0 );
		
		
		
		System.out.println("\n==========세번째 방법============");
		
		// 배열선언, 메모리 할당, 데이터 초기화를 한번에 처리 ==> 빈번하게 사용
	
		int[] course = new int[] {100, 90, 95, 70, 98, 100, 90};
		// 배열 선언(배열명)- 생성자로 메모리 할당 - 데이터 초기화 (데이터값 입력된 갯수대로 배열 길이 정해짐)
		
		for(int i=0; i<course.length; i++) { 
			System.out.println("course["+i+"] => "+course[i]);
		}
		
		System.out.println("----------누적합계-----------");
		total =0;
		for(int i=0; i<course.length; i++) {
			total += course[i]; // 누적합계 구하기
		}
		System.out.println("총점: "+total);
		System.out.println("평균: "+Math.round((double)total/course.length*10)/10.0 );
		
		
		System.out.println("\n==========네번째 방법============");
		// 배열 선언, 메모리 할당, 데이터 초기화 한 번에 하면서 생성자(new int[]) 생략 가능
		// 가장 짧게 쓰는 방법을 많이 씀
		
		int[] course2 = {100, 90, 95, 70, 98, 100, 90};
		
		for(int i=0; i<course2.length; i++) { 
			System.out.println("course2["+i+"] => "+course2[i]);
		}
		
		System.out.println("----------누적합계-----------");
		total =0;
		for(int i=0; i<course2.length; i++) {
			total += course2[i]; // 누적합계 구하기
		}
		System.out.println("총점: "+total);
		System.out.println("평균: "+Math.round((double)total/course2.length*10)/10.0 );
		
		
		System.out.println("\n>> Array or collection에서 사용되는 개선된(확장된) for문");
		// Array or collection에서 사용되는 개선된(확장된) for문
		// for(배열요소데이터타입 변수명: 배열이름 또는 콜렉션이름)
		
		System.out.println("----------누적합계-----------");
		total =0;
		for(int jumsu: course2) { // for(배열요소데이터타입 변수명: 배열이름 또는 콜렉션이름)
								  // 배열의 길이만큼 반복한다는 뜻
								  // 1. int jumsu = course2[0];
								  // 2. jumsu = course2[1];
								  // 3. jumsu = course2[2];
								  // ... 
								  // 7. jumsu = course2[6];
			total += jumsu; // 누적합계 구하기
		}
		System.out.println("총점: "+total);
		System.out.println("평균: "+Math.round((double)total/course2.length*10)/10.0 );
		
		
		
	} // end of main()

} // end of class
