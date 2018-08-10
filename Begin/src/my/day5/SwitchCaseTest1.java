package my.day5;

import java.io.IOException;

public class SwitchCaseTest1 {

	public static void main(String[] args) throws IOException {
		
		
		System.out.print("글자 1개를 입력하세요 =>");
		
		int n = System.in.read();
		
		
		// 영문 대문자 65 ~ 90
		// 영문 소문자 97 ~ 122
		// 
		switch (n) { // 얘는 들어간 값이 같으냐 다르냐만 판단. 부등호 X
		// key값은 정수형 문자열만 사용 가능 (cf. JDK 1.7 이후 버전부터 문자열 입력 가능. 그 이전버전은 정수형만)
		// 일일이 n값을 다 설정해줘야 하기 때문에 if문을 자주 사용
			case 65: // OR
			case 66:
			case 67:
			case 68:
			case 69:
			case 70:
			case 71:
			case 72:
			case 73:
			case 74:
			case 75:
			case 76:
			case 77:
			case 78:
			case 79:
			case 80:
			case 81:
			case 82:
			case 83:
			case 84:
			case 85:
			case 86:
			case 87:
			case 88:
			case 89:
			case 90: //OR 범위 끝
				System.out.println("입력하신 "+(char)n+"는 대문자입니다.");
				break;
			
			case 97: // OR 범위 시작
			case 98:
			case 99:
			case 100:
			case 101:
			case 102:
			case 103:
			case 104:
			case 105:
			case 106:
			case 107:
			case 108:
			case 109:
			case 110:
			case 111:
			case 112:
			case 113:
			case 114: 
			case 115:
			case 116:
			case 117:
			case 118:
			case 119:
			case 120:
			case 121:
			case 122: // OR 범위 끝
				System.out.println("입력하신 "+(char)n+"는 소문자입니다.");
				break;
			
			case 48:	
			case 49:	
			case 50:
			case 51:
			case 52:
			case 53:
			case 54:
			case 55:
			case 56:
			case 57:
				System.out.println("입력하신 "+(char)n+"는 숫자입니다.");
				break;
				
			default:
				System.out.println("입력하신 "+(char)n+"는 특수문자입니다.");
				break;
		}
		
		
		
		
		

	} // end of main()

} // end of class
