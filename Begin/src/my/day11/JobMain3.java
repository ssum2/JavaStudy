package my.day11;

import java.util.Scanner;

import my.util.MyUtil;

// 180820 12:31PM
// 180821_09:20AM 강사님이 하신 내용
// 180821_15:00PM ~ Main2 이후 추가 수정본

public class JobMain3 {

	// 4. Gujikja 객체를 저장하는 배열
	Gujikja[] gujikjaArr = new Gujikja[10];
	
	// 1. 초기메뉴를 보여주는 기능(메소드)
	public static void startMenu() {
		// 구직자 등록, 구인회사 등록, 채용공고 등록, 로그인(구직자/기업)
		// 로그인 주체가 누구냐에 따라서 메뉴가 달라짐
		System.out.println("\n========= 초기 MENU =========");
		System.out.println("1. 구직자 등록");
		System.out.println("2. 기업 등록");
		System.out.println("3. 로그인(구직자)");
		System.out.println("4. 로그인(기업)");
		System.out.println("5. 로그인(관리자)");
		System.out.println("6. 종료");
		System.out.println("===========================");
		
		System.out.print(">>> 메뉴 번호 선택 => ");
	} // end of menu();
	
	// ※구직자 로그인 메뉴 메소드
	public static void gujikjaMenu() {
		// 로그인 주체가 누구냐에 따라서 메뉴가 달라짐
		System.out.println("\n======== 구직자 MENU ========");
		System.out.println("1. 나의 정보 조회");
		System.out.println("2. 나의 정보 변경");
		System.out.println("3. 모든 채용공고 조회");
		System.out.println("4. 구인회사 ID 검색"); // 구인회사의 상세정보 조회
		System.out.println("5. 특정 업종 채용공고 조회");
		System.out.println("6. 로그아웃");
		System.out.println("7. 회원탈퇴"); // 배열에서 지우고 뒤에있는 값을 당겨와야함
		System.out.println("==========================");
		
		System.out.print(">>> 메뉴 번호 선택 => ");
	} // end of menu();
	
	
	// ※관리자 로그인 메뉴 메소드
	public static void adminMenu() { // ID: admin PW: qwer1234$ 로 로그인값은 고정, 따로 클래스 안 만듦
		System.out.println("\n======== 관리자 MENU ========");
		System.out.println("1. 모든 구직자 정보 조회");
		System.out.println("2. 모든 구인회사 정보 조회");
		System.out.println("3. 특정 구직자 삭제");
		System.out.println("4. 특정 구인회사 삭제"); 
		System.out.println("5. 로그아웃");
		System.out.println("==========================");
		
		System.out.print(">>> 메뉴 번호 선택 => ");
	} // end of menu();
		
		
	public boolean loginAdmin(Scanner sc) {
		boolean adminLogin = false;
		String adminid = "admin";
		String adpasswd = "qwer1234$";
		
		do {
			System.out.print("\n>> 아이디 :");
			String adid = sc.nextLine();
			
			System.out.print(">> 암호 : ");
			String adpw = sc.nextLine();
			if(adminid.equals(adid) && adpasswd.equals(adpw)) {
				System.out.println(">> 관리자 로그인 성공 <<");
				return adminLogin = true;
			}
			else {
				System.out.println(">> 관리자 로그인 실패, 다시 입력하세요 <<");
				return adminLogin = false;
			}
		} while (adminLogin);
		
	} // end of loginAdmin()
	
	

	// ※초기메뉴의 1.구직자 등록 메소드 생성※
	public void registerGujikja(Scanner sc) { // 파라미터에 스캐너 값 받아옴
		// 1) 아이디 입력 및 중복검사
		String userid = "";
		boolean boolUserid = false;
		
//		outer:
		do {
			System.out.print("▷아이디 => ");
			userid = sc.nextLine();
			
			// a. userid를 trim했을 때 비어있는가?
			boolUserid = userid.trim().isEmpty();
			if(boolUserid) { 
				System.out.println(">>> 아이디는 공백만으로 사용 불가합니다. 다시 입력하세요");
			}
			else // b. userid가 공백이 아닌 값을 넣은 경우 중복여부
			{
				int flag =0;
				// c. 아이디 중복 검사 로직
				for(int i=0; i<Gujikja.count; i++) {
					if(gujikjaArr[i].userid.equals(userid)) {
						System.out.println(">> 이미 사용중인 아이디 입니다. 다시 입력하세요 <<");
						flag = 1; // 중복인경우 flag의 값을 바꾸고 for문을 빠져나감
						break; // for문을 나가고 do~while 처음으로 돌아감
					}// end of inner if
				} // end of for
				
				if(flag==0)	break; // userid가 공백X, 중복X 인 경우 do-while을 빠져나감
			} // end of outer else
		} while (true); // end of while(userid)
		
		
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

		int gender =0;		
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
		
		
	// ※ 구직자로 회원가입 여부 묻기 ※
		System.out.print(">>> 회원가입여부 확인(1.가입/2.취소) => ");
		String yn= sc.nextLine();
		
		// 여기서 if(yn.equals("1")){} 하게 되면 null값이 들어올 가능성이 있기 때문에 안 돌아갈 수 있음
		// equals앞에 비교대상A부분에 null값을 절대 넣으면 안됨!!!!!!!!!!!!!
		
		
		if(!"1".equals(yn)) {  // 어차피 취소할거니까 이 부분은 배열사이즈 검사할 필요 X
			System.out.println(">> 구직자 회원가입을 취소 했습니다. <<");
		}
		
		// a. 배열 사이즈가 초과 되었는지 아닌지 검사			 
		// b. yn의 답이 1일때 객체 생성 및 배열 삽입
		else if("1".equals(yn) && // "1".equals(yn) && 이부분 안써도 됨(위에서 필터해서)
				Gujikja.count==gujikjaArr.length) { // count값과 배열길이가 같으면 그 이상X
			System.out.println(">> 정원이 초과하여 구직자 회원가입 불가 <<");
		}
		else { // if("1".equals(yn) && //Gujikja.count<gujikjaArr.length) 인 경우 
			// c. Gujikja 객체 생성(회원가입)
			Gujikja gujikja = new Gujikja(userid, passwd, name, birthday, gender, address, school, mobile, hopejob, hopemoney);
			
			// d. 배열에 삽입
			gujikjaArr[Gujikja.count-1] = gujikja; // 객체를 만드는 갯수만큼 배열방번호를 정함.
					//Gujikja.count는 1부터 시작되기 때문에(객체만들어지니까) -1 해줘야함
			
			System.out.println(">> 구직자 회원 가입 성공 <<");
			System.out.println("["+Gujikja.count+"번째 회원/ 전체:"+gujikjaArr.length+"명]");
		}
	} // end of registerGujikja()

	
	
	// 180821_09:20AM 강사님이 해주신 부분 ---------------------
	// ※초기메뉴의 3.로그인(구직자) 메소드 생성※

	public Gujikja loginGujikja(Scanner sc) { // 여기에서 Gujikja.class의 로그인 메소드를 호출할 것
		// 로그인 한 사람이 누군지 알아야만 정보 보기 및 정보 바꾸기가 가능 --> 객체타입으로 반환해야함
		// 성공했을 때 객체를 반환, 실패했을 때는 null 반환
		
		Gujikja gujikja = null; 			// Gujikja클래스 객체형태의 지역변수
		
		// 1) 아이디, 비밀번호 입력하기
		System.out.print("\n>> 아이디 :");
		String userid = sc.nextLine();
		
		System.out.print(">> 암호 : ");
		String passwd = sc.nextLine();
		
		boolean isLogin = false; 			// 로그인 성공/실패 메세지 출력하기 위해 플래그 꽂음
		
		// 2) 미리 저장해둔 값을 가져오기 --> gujikjaArr[]
		for(int i=0; i<Gujikja.count; i++) {
			gujikja = gujikjaArr[i].login2(userid, passwd);
			// login2 가 돌아가서 객체가 반환되면 gujikja변수에 들어감
			if(gujikja !=null) {
				isLogin = true; 			// 객체값이 들어왔을 때 true로 깃발 바꿈
				break;
			}
			// 만약 gujikja가 계속 null이라면 if문 실행안하고 계속 for문 반복함
		} // end of for
		
		if(isLogin)
			System.out.println(">>> 로그인 성공 <<<");
		else
			System.out.println(">>> 로그인  실패 <<<");
		
		return gujikja;
	} // end of loginGujikja()
	
	
	// ※ 구직자메뉴 > 회원정보 변경 기능
	public void updateMeGujikja(Scanner sc, Gujikja me) {
		
		System.out.print("▶암호 : ");
		String passwd =sc.nextLine();
		System.out.print("▶성명 : ");
		String name =sc.nextLine();
		System.out.print("▶생년월일 : ");
		String birthday =sc.nextLine();
		System.out.print("▶주소 : ");
		String address =sc.nextLine();
		System.out.print("▶학력 : ");
		String strSchool =sc.nextLine();
		int school = Integer.parseInt(strSchool);
		
		System.out.print("▶휴대폰번호 : ");
		String mobile =sc.nextLine();
		System.out.print("▶희망직종 : ");
		String hopejob =sc.nextLine();
		System.out.print("▶희망급여 : ");
		String strHopemoney =sc.nextLine();
		int hopemoney = Integer.parseInt(strHopemoney);
		
		me.passwd = passwd;
		me.name = name;
		me.birthday = birthday;
		me.address =address;
		me.school = school;
		me.mobile = mobile;
		me.hopejob = hopejob;
		me.hopemoney = hopemoney;
		
		for(int i=0; i<Gujikja.count; i++) {
			if( gujikjaArr[i].userid.equals(me.userid)) {
				gujikjaArr[i] = me; // me객체의 userid 와 동일한 값을 찾아서 해당 배열에 새롭게 넣을 값을 대입
				break;
			}	
		} // end of for	
	} // end of updateMeGujikja()
	
	// ※ 구직자 메뉴 > 회원탈퇴 기능
	public void deleteMeGujikja(String userid) {
		
		int deleteIndex = 0;
		
		for(int i=0; i<Gujikja.count; i++) {
			// 1) 저장된 장소(배열)에서 고유값 userid를 비교해서 찾음
			if(gujikjaArr[i].userid.equals(userid)) {
				deleteIndex = i; // 배열 방번호를 기억시킴
				break;
			} // end of if
		}// end of for
		
		/*
	 	Gujikja.count가 5인 경우(0 1 2 3 4)
	 	- 0번째 방이 삭제 => deleteIndex는 0이 되고 방을 옮기는 4번의 작업 필요
	 	- 1번째 방이 삭제 => deleteIndex는 1이 되고 방을 옮기는 3번의 작업 필요
	 	- 2번째 방이 삭제 => deleteIndex는 2이 되고 방을 옮기는 2번의 작업 필요
	 	- 3번째 방이 삭제 => deleteIndex는 3이 되고 방을 옮기는 1번의 작업 필요
	 	- 4번째 방이 삭제 => deleteIndex는 4이 되고 방을 옮기는 0번의 작업 필요 => null이 들어오는 작업만 하면 됨
		*/
		if(deleteIndex == Gujikja.count-1) { // Gujikja.count가 1부터라서 -1 해줘야 인덱스값이랑 맞출 수 있음
			gujikjaArr[deleteIndex] =null; // null값으로 초기화 
		}
		
		else {
			for(int i=0; i<(Gujikja.count-1-deleteIndex); i++) { // deleteIndex를 후위증가 시켜서 뒤의 방을 바꿔줄 대상으로
				gujikjaArr[deleteIndex+i] = gujikjaArr[deleteIndex+i]; // 지워질 방에 있는 배열 바로 뒤(+1)의 값을 지워질 방에 넣어줌
				gujikjaArr[deleteIndex+i] = null; // 뒤에서 옮긴 방은 null로 초기화
			}
		}
		 
		Gujikja.count--;
		// 구직자 카운트 수는 1 감소 (객체 하나 지웠으니까)
		System.out.println(">> 회원 탈퇴 성공 <<");	
	} // end of deleteMeGujikja()

	
	// 관리자- 특정 회원 삭제 하기
	public void deleteItGujikja(String userid) {
		int deleteIndex = 0;
		
		for(int i=0; i<Gujikja.count; i++) {
			if(gujikjaArr[i].userid.equals(userid)) {
				deleteIndex=i;
				break;
			}
		}
		if(deleteIndex == Gujikja.count-1) {
			gujikjaArr[deleteIndex] =null;
		}
		else {
			for(int i=0; i<(Gujikja.count-1-deleteIndex); i++) { 
				gujikjaArr[deleteIndex+i] = gujikjaArr[deleteIndex+i+1]; 
				gujikjaArr[deleteIndex+i+1] = null; 
			}
		}	 
		Gujikja.count--;
		System.out.println(">> 회원 삭제 성공 <<");
	}
	
	
	
	public static void main(String[] args) { // 메인메소드 안은 간단하게 정리하고 웬만하면 위에서 메소드로 정리해서 씀
		Scanner sc = new Scanner(System.in);
		String startMenuNo = "";
	
		JobMain3 jobapp = new JobMain3(); // 객체 하나 생성
		Gujikja loginGujikja = null; // login된 구직자, 객체생성X
	
		do {
			// 초기메뉴 출력
			JobMain3.startMenu();
			startMenuNo = sc.nextLine();
			
			switch (startMenuNo) {
			case "1": // 1. 구직자 등록
				jobapp.registerGujikja(sc);
				break;
		
			case "3": // 3. 로그인(구직자)
			{
				loginGujikja = jobapp.loginGujikja(sc);
				
				if(loginGujikja != null) { // loginGujikja에 객체값이 들어왔을 때(!null, 로그인 성공)
					do { // ◎구직자 메뉴 보여주기
						JobMain3.gujikjaMenu(); // 로그아웃할 때 까지 계속 구직자메뉴가 나오고, 로그아웃하면 초기메뉴가 나와야 함
						String gujikjaMenuNo = sc.nextLine();
						
						boolean isBreak = false; // do~while을 나가기 위한 표식
						
						switch (gujikjaMenuNo) {
						case "1": // 1. 나의 정보 조회
							System.out.println(loginGujikja.getGujikjaInfo());
							break;
							
						case "2": // 2. 나의 정보 변경
							jobapp.updateMeGujikja(sc, loginGujikja);
							break;
							
						case "3": // 3. 모든 채용공고 조회
							
							break;
							
						case "4": // 4. 구인회사 ID 검색
							
							break;
							
						case "5": // 5. 특정 업종 채용공고 조회
							
							break;
							
						case "6": // 6. 로그아웃
							isBreak = true;
							break;
							
						case "7": // 7. 회원탈퇴(구직자 배열 gujikjaArr에서 자신의 객체를 null로 만듦)
							/*
							 	배열에 회원정보가 순차적으로 들어가있을 때
							 	회원탈퇴를 한다면 해당 배열자리를 null로 초기화 
							 	==> 배열 중간에 null이 생기면 Gujikja.count값이 하나 줄어들고, null.get~했을 때 nullpoiner오류
							 	==> 삭제된 배열의 뒷배열을 앞으로 당겨줘야함
							 */
							
							jobapp.deleteMeGujikja(loginGujikja.userid);
							
							isBreak = true;
							break;
							
						default:
							System.out.println("1~7 숫자만 입력 가능합니다. 다시 입력하세요.");
							continue;
						}
						
						if(isBreak) break; // isbreak가 참일때 do~while 빠져나가기
					} while (true);	
				}// end of if
		
			}	break;
		
			
			
// JobMain2 랑 다른 부분 >>> 관리자 로그인 기능 구현 =================================
			case "5": // 5. 로그인(관리자)
			{
				System.out.print("\n◆아이디: ");
				String adminId = sc.nextLine();
				
				System.out.print("\n◆암호: ");
				String adminPw = sc.nextLine();
				String adminMenuNo ="";
				if("admin".equals(adminId) && "qwer1234$".equals(adminPw)) { // 관리자 로그인 성공
					while(!"5".equals(adminMenuNo)) {
						JobMain2.adminMenu();
						adminMenuNo = sc.nextLine();
						
						switch (adminMenuNo) {
							case "1": // 모든 구직자 정보 조회
								for(int i=0; i<Gujikja.count; i++) {
									System.out.println(jobapp.gujikjaArr[i].getGujikjaInfo());
														// JobMain3의 객체 jobapp.배열[i].호출할 메소드()
									System.out.println("");
								}
								break;
							
							case "2": // 모든 구직회사 정보 조회
							
								break;
							
							case "3": // 특정 구직자 삭제
								/*
								 	특정 구직자 삭제 기능 구현 **과제**
								 	>> 
								 */
								System.out.print(">> 삭제할 아이디를 입력하세요: ");
								String deletedId = sc.nextLine();
								
								jobapp.deleteItGujikja(deletedId);
								
								break;
	
							case "4": // 특정 구인회사 삭제
	
								break;
	
							case "5": // 로그아웃
	
								break;
	

						default:
							break;
						} // end of switch
					}// end of while
				}
			}// end of case "5"
								
				break;
		
			} // end of swtich
			
		} while (!"6".equals(startMenuNo));
		
		System.out.println("========= 프로그램 종료 ========");
		sc.close();
		
	
		
	} // end of main()

} // end of class
