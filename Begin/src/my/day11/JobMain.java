package my.day11;

import java.util.Scanner;

import my.util.MyUtil;

// 180820 12:31PM
public class JobMain {

	// 4. Gujikja 객체를 저장하는 배열
	Gujikja[] gujikjaArr = new Gujikja[10];
	
	
	
	// 1. 메뉴를 보여주는 기능(메소드)
	public static void menu() {
		// 구직자 등록, 구인회사 등록, 채용공고 등록, 로그인(구직자/기업)
		
		System.out.println("=========== MENU ===========");
		System.out.println("1. 구직자 등록");
		System.out.println("2. 기업 등록");
		System.out.println("3. 로그인(구직자)");
		System.out.println("4. 로그인(기업)");
		System.out.println("15. 종료");
		System.out.println("============================");
		
		System.out.print(">>> 메뉴 번호 선택 => ");

	} // end of menu();
	
	
	// 2. 구직자 등록(생성) 메소드
	public void registerGujikja(Scanner sc) { // 파라미터에 스캐너 값 받아옴
		// 1) 아이디 입력 및 중복검사
		String userid = "";
		boolean boolUserid = false;
		
		do {
			System.out.print("▷아이디 => ");
			userid = sc.nextLine();
			
			boolUserid = userid.trim().isEmpty();
			if(boolUserid) { // userid를 trim했을 때 비어있는가?
				System.out.println(">>> 아이디는 공백만으로 사용 불가합니다. 다시 입력하세요");
			}
			else
				break;
		
		} while (boolUserid); // end of while(userid)
		
		
		// 2) 패스워드 입력 및 유효성검사
		String passwd = "";
		boolean boolPasswd = false;
		// 영문자 숫자 특문 혼합만 가능 => 유틸리티 사용
		do {
			System.out.print("▷암호 => ");
			passwd = sc.nextLine();
			boolPasswd = MyUtil.checkPassword(passwd);
			
			if(boolPasswd) {
				break;
			}
			
		} while (true); // end of while(passwd)
		
		
		// 3) 이름 입력 및 유효성검사 (공백제거)
		String name = "";
		boolean boolName=false;
		
		do {
			System.out.print("▷이름 => ");
			name=sc.nextLine();
			
			boolName=name.trim().isEmpty();
			if(boolName) {
				System.out.print(">>> 이름에 공백 사용이 불가능합니다. 다시 입력하세요.");
			}
			else
				break;
		}while (name.trim().isEmpty()); // 참일 때 계속 반복(참 == null)
		
	
		// 4) 생년월일 입력받기 --> MyUtil에서 가져오기
		String birthday ="";
		boolean boolBirthday=false;
		do {
			System.out.print("▷생년월일(예: 19930820) => ");
			birthday = sc.nextLine();
			
			boolBirthday = birthday.length() == 8 && MyUtil.checkNumber(birthday); // 리턴타입 boolean, 파라미터 String
							// 입력값의 길이가 8인 것이 참이고, 숫자유효성 검사도 참일 때 true 대입
			
			
		} while (!boolBirthday); //boolBirthday가 참일때 부정 으로 while 멈춤
		
//		// 5-1) 성별 입력받기 ; 나 혼자 해본 것
		int gender =0;
//		boolean boolGender =false;
//		do {
//			System.out.print("▷성별(남: 1, 여: 2) => ");
//			gender = sc.nextInt();
//			
//			if(gender==1 || gender==2)
//				boolGender = true;
//			else
//				System.out.println("1, 2만 입력해주세요.");
//		} while (boolGender);
//		
		
		
		// 5-2) 성별 입력받기; 강사님이 하신 것
		
		do {
			System.out.print("▷성별(1.남 /2.여) => ");
			String strGender = sc.nextLine();
			switch (strGender) {
				case "1":
				case "2":
					break;

				default:
					System.out.println("1, 2만 입력하세요");
					continue;
			} // end of switch
			
			if("1".equals(strGender) || "2".equals(strGender)) {
				gender = Integer.parseInt(strGender);
				break;
			}
		
		} while (true);
		
		
		
		// 6) 주소 입력 받기
		String address = "";
		do {
			System.out.print("▷주소 => ");
			address = sc.nextLine();
			
			if(!address.trim().isEmpty()) // 주소 값이 공백이 아닐 때 break, 공백이면 계속 반복
				break;
			
		} while (true);
		
		
		// 7) 학력 입력 받기 (코드화; 대졸이상 1, 초대졸 2, 고졸 3, 고졸미만 4)
		int school =0;
		do {
			System.out.print("▷학력(1.대졸이상, 2.초대졸, 3.고졸, 4.고졸미만) => ");
			String strSchool = sc.nextLine();
			switch (strSchool) {
				case "1":
				case "2":
				case "3":
				case "4":
					break;
	
				default:
					continue;
			} // end of switch
			
			if("1".equals(strSchool) ||
			   "2".equals(strSchool) ||
			   "3".equals(strSchool) ||
			   "4".equals(strSchool) ) {
				school = Integer.parseInt(strSchool);
				break; // while문을 빠져나감
			}
			
		} while (true);
		
		
		
		// 8) 휴대폰번호 입력 받기 --> 숫자만 받는 걸로
		String mobile = "";
		boolean boolMobile = false;
		
		do {
			System.out.print("▷연락처(ex. 01056781234) => ");
			mobile = sc.nextLine();
			int length = mobile.length();
			boolMobile = MyUtil.checkNumber1(mobile) && (length == 10 || length == 11);
			// boolMobile이 참이려면 -> 숫자로만 이루어져서 true && 길이가 10, 11일때 true
		
		} while (!boolMobile); // boolMobile이 참일 때 빠져나간다
		
		
		
		// 9) 희망 직종 입력
		
		String hopejob ="";
		do {
			System.out.print("▷희망직종 => ");
			hopejob = sc.nextLine();
			
			if(!hopejob.trim().isEmpty()) // 희망직종 입력이 텅비어있지 않다면 빠져나감
				break;
			
		} while (true);
		
		
		
		// 10) 희망 연봉 --> 숫자로만 받게끔함
		int hopemoney = 0;
		boolean boolHopemoney = false;
		
		do {
			System.out.print("▷희망연봉(*만원) => ");
			String strHopemoney = sc.nextLine();
			int length = strHopemoney.length();
			boolHopemoney = MyUtil.checkNumber1(strHopemoney) && (length == 4);
			// boolHopeMoney이 참이려면 -> 숫자로만 이루어져서 true && 길이가 10, 11일때 true
		
			if(boolHopemoney) { // 숫자여서 참이라면 그때 String을 Int로 변환
				hopemoney = Integer.parseInt(strHopemoney);
				break;
			}
		} while (true); //
		
		
		
		
	//3. Gujikja 객체 생성(회원가입)
		Gujikja gujikja = new Gujikja(userid, passwd, name, birthday, gender, address, school, mobile, hopejob, hopemoney);
		
		
	//4. 배열에 삽입
		gujikjaArr[Gujikja.count-1] = gujikja; // 객체를 만드는 갯수만큼 배열방번호를 정함.
				//Gujikja.count는 1부터 시작되기 때문에(객체만들어지니까) -1 해줘야함
		
		System.out.println(">> 카운트 : "+Gujikja.count);
				
	} // end of registerGujikja()
	
	
	public void loginGujikja() {
		Gujikja gujik = new Gujikja();
		Scanner sc = new Scanner(System.in);
		
		String userid = "";
		boolean isDuplicateUserid;
		String passwd = "";
		boolean isDuplicatePasswd;
		String Info = "";
		userid:
		do {
			System.out.print("▶아이디: ");
			userid = sc.nextLine();
			
			isDuplicateUserid = false;
			for(int i=0; i<Gujikja.count; i++) {
				if(userid.equals(gujikjaArr[i].userid)) {
					isDuplicateUserid = true;
					
					break userid;
				}
				else {
					System.out.println(">> 입력하신 아이디와 일치하는 값이 없습니다");
					continue userid;
				}
					
			}
		} while (!isDuplicateUserid);
		
		 
		
		passwd:
		do {
			System.out.print("▶암호: ");
			passwd = sc.nextLine();
			
			isDuplicatePasswd = false;
			for(int i=0; i<Gujikja.count; i++) {
				if(passwd.equals(gujikjaArr[i].passwd)) {
					isDuplicatePasswd = true;
					
					Info = gujikjaArr[i].getGujikjaInfo();
					break passwd;
				}
				else {
					System.out.println(">> 비밀번호가 일치하지 않습니다.");
					continue passwd;
				}
					
			}
		} while (!isDuplicatePasswd);
		
		
		
		System.out.println(">> 로그인 성공! <<");
		System.out.println(Info);
	}
	
	
	
	
	public static void main(String[] args) { // 메인메소드 안은 간단하게 정리하고 웬만하면 위에서 메소드로 정리해서 씀
		Scanner sc = new Scanner(System.in);
		String menuNo = "";
		
		
		JobMain jobapp = new JobMain(); // 객체 하나 생성
		
	
		
		do {
			JobMain.menu();
			menuNo=sc.nextLine();
			
			switch (menuNo) {
			case "1": // 1. 구직자 등록
				jobapp.registerGujikja(sc);
				
				break;
		
			case "3":
				jobapp.loginGujikja();
				
				
				break;

			}
			
		} while (!"15".equals(menuNo));
		
		System.out.println("========= 프로그램 종료 =========");
		sc.close();
		
	
		
	} // end of main()

} // end of class
