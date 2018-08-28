package my.day16.Exception2;
/*
 	>> 사용자 정의 예외(오류)절 만들기; 자바는 오류라고 생각 안하는데 사용자가 오류라고 생각할 경우
 		1. Exception 클래스 상속 받음; extends Exception
 		2. 생성자를 구성 > 예외메세지(오류메세지)를 등록
 */
public class UserDefineExceptionPW extends Exception {
//	기본생성자
	public UserDefineExceptionPW() {
		super(">> PW는 최소 8자 이상으로 영문자, 숫자, 특수문자가 혼합되어야 합니다.");
	}
//	파라미터가 있는 생성자
	public UserDefineExceptionPW(String errorMsg) {
		super(errorMsg);	// 파라미터에 입력받은 것을 출력
	}
	

}
