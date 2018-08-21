/*
  ===== **** 객체지향 프로그래밍(Object Oriented Programming) 이란? *** ==== 
   
     ※ OOP 의 4가지 특징(!!!!필수암기!!!!)
     --> 1. 상속성
     --> 2. 추상화
     --> 3. 캡슐화   
     --> 4. 다형성
     
     구인구직 어플리케이션 프로그래밍 제작시 
     필요한 요소(부품)가 무엇이 있는지 생각해보자.
   아주 다양하고, 많은 요소들이 필요할 것이다.
   
   예를 들어,
   구직자, 구인회사, 채용.... 등등등 많이 있다.
   이러한 요소(부품)들이 바로 객체인데 이 객체를 만드는 설계도면이 클래스이다.
   
  위와(구인구직 어플리케이션 프로그래밍 제작) 같이 현실세계에 존재하는
  다양한  객체들을 각각 하나하나 추상화 시켜서 클래스로 옮기는 것을
  객체지향 프로그래밍(OOP)이라고 한다.
  
  여기서 추상화(abstraction)란?
  --> 일반적인 의미의 추상화란 어떤 물체(object)에서 주된
      특징을 부각시켜 표현하고, 나머지 부분은 과감하게 생략하는것을 말한다.
      추상화의 반대는 아주 시시콜콜한것(세세한 것)까지 전부 몽땅
      다 묘사하는 것을 말하는데 이것을 정밀화 라고 말한다.
    객체지향 프로그래밍(OOP)에서 사용되는 추상화도 이와 비슷하다.
   어떤 하나의 물체를 대표하는 속성(명사, 멤버변수)과 기능(동사, 메소드)을 추출해내는 것을 
  객체지향 프로그래밍(OOP)에서 "추상화" 라고 한다. 
   
 >>> 예를 들어, 구인구직 어플리케이션 프로그래밍 제작시
     필요한 부품(요소)중 하나인 "구직자" 에 대해서 알아보자.
     "구직자" 가 가지고 있는 속성(명사, 멤버변수)과 행동양식(기능, 동사, 메소드)을 뽑아보자.
   1). 속성(property, attribute, field)은 멤버변수가 되고,
   2). 행동양식(기능)은 메소드가 되는 것이다.
   
   Gujikja(클래스)
      |
      |-- 속성(property, attribute, field) : 아이디, 암호, 성명, 연락처, 이메일, 주소, 학력, 희망구직직종, 희망연봉.....  
      |-- 행동양식(기능, 메소드) : 구직자로 접속(로그인)할수 있는 기능, 구직자정보를 조회해주는 기능, 구직자정보를 변경해주는 기능, ....... 
      
 */

package my.day11;

import java.text.DecimalFormat;
import java.util.Calendar;

public class Gujikja {

	static int count; // 생성된 Gujikja 객체 갯수 카운트용.
	
	// *** Gujikja 클래스의 속성 정하기(추상화작업)
	String userid;    // 아이디
	String passwd;    // 암호
	String name;      // 성명
	String birthday;  // 생년월일(예: 19930820) 
	int    gender;    // 성별 "남"--1, "여"--2  "유추할수 있는 데이터값은 반드시 코드화 해야 한다.!!!!!" 유효성검사   
	String address;   // 주소
	int    school;    // 학력 "대졸이상"-1, "초대졸"-2, "고졸"-3, "고졸미만"-4 
	String mobile;    // 휴대폰번호
	String hopejob;   // 희망직종("사무직", "생산직", "일용직".....)
	int    hopemoney; // 희망급여
	
	public Gujikja() { count++; }
	
	public Gujikja(String userid, String passwd, String name, String birthday, int gender, String address, int school,
			       String mobile, String hopejob, int hopemoney) {
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.address = address;
		this.school = school;
		this.mobile = mobile;
		this.hopejob = hopejob;
		this.hopemoney = hopemoney;
		
		count++;
	}
	

	//구직자가 로그인할 수 있는 기능을 만들기 (메소드) 
	public Gujikja login(String userid, String passwd) {
		if(userid.equals(this.userid) && passwd.equals(this.passwd))  
			return this;
			
		else 
			return null;
	}
	
	// 구직자의 현재 나이를 조회할 수 있는 기능 
	public int getAge() {
		Calendar currentdate = Calendar.getInstance(); // 현재날짜와 시간을 얻어온다.
		int currentYear = currentdate.get(Calendar.YEAR);      //현재년도
		
		// 나이를 구하기 (현재년도-태어난년도+1)
	    int birthYear = Integer.parseInt(birthday.substring(0,4));
	    
	    return currentYear - birthYear + 1;
	}
	
	// 성별을 알아오는 기능
	public String getGender() {
		
		String result = "";
		
		switch (gender) {
			case 1:
				result = "남자";
				break;
			
			case 2:
				result = "여자";
				break;	
		}
		
		return result;
	}
	
	// 학력을 알아오는 기능
	public String getSchool() {
		String result = "";
		
		switch (school) {
			case 1:
				result = "대졸이상";
				break;
			case 2:
				result = "초대졸";
				break;	
			case 3:
				result = "고졸";
				break;	
			case 4:
				result = "고졸미만";
				break;	
		}
		
		return result;
	}
	
	// 휴대폰번호에 - 를 붙여서 보여주는(알아오는) 기능
	public String getMobile() {
		if(mobile.length() == 10)
		   return mobile.substring(0, 3) + "-" + mobile.substring(3, 6) + "-" + mobile.substring(6);
		else
		   return mobile.substring(0, 3) + "-" + mobile.substring(3, 7) + "-" + mobile.substring(7);
	}
	
	
	// 희망급여를 알아오는 기능
	public String getHopemoney() {
		DecimalFormat df = new DecimalFormat("#,###");
		return df.format(hopemoney)+"만원";
	}
	
	//구직자의 정보를 조회할 수 있는 기능 
	public String getGujikjaInfo() {
		String info = "=== "+name+" 님의 프로필 ===\n"+
				      "1.아이디: "+userid+"\n"+
				      "2.암  호: "+passwd+"\n"+
				      "3.성  명: "+name+"\n"+
				      "4.나  이: "+getAge()+"\n"+
				      "5.성 별 : "+getGender()+"\n"+
				      "6.주 소 : "+address+"\n"+
				      "7.학 력 : "+getSchool()+"\n"+
				      "8.휴대폰 : "+getMobile()+"\n"+
				      "9.희망직종 : "+hopejob+"\n"+
				      "10.희망급여 : "+getHopemoney()+"\n";
		
		return info;
	}	
	
}




