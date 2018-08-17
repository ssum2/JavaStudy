package my.day5;

import java.io.IOException;

public class SwitchCaseTest1 {

	public static void main(String[] args) 
		throws IOException {
		
		System.out.print("글자 1개를 입력하세요 => ");
		
		int n = System.in.read();
		
		// 영문 대문자 65 ~ 90
		// 영문 소문자 97 ~ 122
		switch (n) {
			case 65:
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
			case 90:	
				System.out.println("입력하신 "+(char)n+"은 대문자 입니다.");
				break;
				
			case 97:
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
			case 122:
				System.out.println("입력하신 "+(char)n+"은 소문자 입니다.");
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
				System.out.println("입력하신 "+(char)n+"은 숫자 입니다.");
				break;
				
			default:
				System.out.println("입력하신 "+(char)n+"은 특수문자 입니다."); 
				break;
		}
		
	}// end of main()----------------------

}
