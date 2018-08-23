package my.day13.EX2;

import java.text.DecimalFormat;

import my.util.MyUtil;

public class Student {
	private String hakbun ="";	// 학번
	private String name ="";	// 학생 이름
	private String mobile="";	// 연락처
	// 초기치에 null값 말고 ""으로 비어있는 값을 줘야 nullpointerException이 안뜸!!!
	
	
	// cf) 만약에 돈이라는 값을 받아올 때 int로 받더라도 getter메소드에서는 다른 형태로 변환 출력가능 -
	int money;
	
	public int getMoney() {
		return money;
	}
	public String getStrMoney() {
		DecimalFormat df = new DecimalFormat("#,###");
		return df.format(money)+"원";
	}
	// -----------------------------------------------------------------
	
	
	public String getHakbun() {
		return hakbun;
//		return hakbun.substring(0, 3)+"***"+hakbun.substring(3);
//				이런식으로 getter에도 조건을 걸어 원하는 형태로 출력하게 할 수 있음
	}
	
	public void setHakbun(String hakbun) {
		if(hakbun.trim().isEmpty()) // Empty상태일 때 TRUE
			System.out.println(">> 학번을 공백으로만 쓸 수 없습니다 <<");
		else
			this.hakbun = hakbun;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.trim().isEmpty())
			System.out.println(">> 이름을 공백으로만 쓸 수 없습니다 <<");
		
		else
			this.name = name;
		}

	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		// 내가 한 부분
//		if(mobile.trim().isEmpty())
//			System.out.println(">> 연락처를 공백으로만 쓸 수 없습니다 <<");
//		
//		else if(mobile.length()==10 || mobile.length()==11) {
//			char[] mobileArr = mobile.toCharArray();
//			
//			for(int i=0; i<mobileArr.length; i++) {
//				if(mobileArr[i]>=0||mobileArr[i]<=9) {
//					this.mobile = mobile;
//					break;
//				}
//				else
//					continue;
//			} // end of for	
//		}
		
		// 강사님이 한 부분
		int length = mobile.length();
		if(MyUtil.checkNumber1(mobile) &&  // 모두 숫자 인가
		  (length==10 || length==11)   &&  // 10~11자 제한
		   mobile.startsWith("010"))	   // 010으로 시작하는가
			this.mobile = mobile;
		else
			System.out.println(">> 연락처로 사용할 수 없습니다 <<");
	} // end of setMobile()
	
	
} // end of class
