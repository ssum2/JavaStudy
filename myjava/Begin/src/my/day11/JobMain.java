package my.day11;

import java.util.Scanner;

import my.util.MyUtil;

public class JobMain {

	// Gujikja 객체를 저장시키는 배열
	Gujikja[] gujikjaArr = new Gujikja[10];
	
	// 초기 메뉴를 보여주는 기능
	public static void startMenu() {
		System.out.println("\n======== 초기 Menu =========");
		System.out.println("1. 구직자등록");
		System.out.println("2. 구인회사등록");
		System.out.println("3. 로그인(구직자)");
		System.out.println("4. 로그인(구인회사)");
		System.out.println("5. 로그인(관리자)");
		System.out.println("6. 종료");
		System.out.println("=======================");
		System.out.print(">>> 메뉴번호 선택 => ");
		
	}// end of startMenu()---------------------------
	

	// 구직자로 로그인 했을시 보여주는 메뉴 메소드
	public static void gujikjaMenu() {
		System.out.println("\n====== >>> 구직자 Menu <<< =====");
		System.out.println("1. 나의 정보 조회");
		System.out.println("2. 나의 정보 변경");
		System.out.println("3. 모든 채용공고 조회");
		System.out.println("4. 구인회사 ID 검색");
		System.out.println("5. 특정 업종 채용공고 조회");
		System.out.println("6. 로그아웃");
		System.out.println("7. 회원탈퇴");
		System.out.println("=======================");
		System.out.print(">>> 메뉴번호 선택 => ");
		
	}// end of gujikjaMenu()---------------------------	
	
	
	// 관리자로 로그인 했을시 보여주는 메뉴 메소드
	public static void adminMenu() {
		System.out.println("\n====== >>> 관리자 Menu <<< =====");
		System.out.println("1. 모든 구직자정보 출력");
		System.out.println("2. 모든 구인회사정보 출력");
		System.out.println("3. 특정 구직자 삭제");
		System.out.println("4. 특정 구인회사 삭제");
		System.out.println("5. 로그아웃");
		System.out.println("=======================");
		System.out.print(">>> 메뉴번호 선택 => ");
		
	}// end of adminMenu()---------------------------
	
	
	
	// *** 초기메뉴 메뉴번호1. 구직자를 등록(생성)해주는 기능 ***
	public void registerGujikja(Scanner sc) {
		
		String userid = "";
		String passwd = "";
		String name = "";
		String birthday = "";
		int gender = 0;
		String address = "";
		int school = 0;
		String mobile = "";
		String hopejob = "";
		int hopemoney = 0;
		
		boolean boolUserid = false;
		boolean boolPasswd = false;
		boolean boolBirthday = false;
		boolean boolMobile = false;
		boolean boolHopemoney = false;
		
		do {
			// 1. 아이디값 입력받기
			System.out.print("▷아이디 => ");
			userid = sc.nextLine();
			
			boolUserid = userid.trim().isEmpty();
			// boolUserid 이 참인경우는 userid 가 "" or "     " 이다. 
			
			if(boolUserid)  // "" or "     " 
				System.out.println(">>> 아이디는 공백만으로 사용불가합니다. 다시입력하세요!!"); 
			else // userid가 공백이 아닌 값을 넣은 경우
			{
				int flag = 0;
				// 중복 ID 검사하기
			    for(int i=0; i<Gujikja.count; i++) {
			    	if( gujikjaArr[i].userid.equals(userid) ) {
			    		System.out.println(">>> 이미 사용중이 ID 이므로 새로운 ID를 입력하세요!!"); 
			    		flag = 1;
			    		break;
			    	}
			    }// end of for-----------------
			    
			    if(flag==0) break; // userid가 올바른 경우이라면 do~while을 빠져나간다.
			} // end of if~else---------------
			
		} while (true); // end of while-----------
		
		
		
		
		// 2. 암호 입력받기 
		do {
			System.out.print("▷암호 => ");
			passwd = sc.nextLine();
			boolPasswd = MyUtil.checkPassword(passwd);
			
			if(boolPasswd) 
				break;
		} while (true);
		
		
		// 3. 성명 입력받기
		do {
			System.out.print("▷성명 => ");
			name = sc.nextLine();
			
		} while (name.trim().isEmpty());
		
		// 4. 생년월일 입력받기
		do {
			System.out.print("▷생년월일(예: 19930820) => ");
			birthday = sc.nextLine();
			
			boolBirthday = birthday.length()==8 && MyUtil.checkNumber(birthday);
			
		} while (!boolBirthday);
		
		
		// 5. 성별 입력받기
		do {
			System.out.print("▷성별(1.남자/2.여자)=> "); 
			String strGender = sc.nextLine();
			switch (strGender) {
				case "1":
				case "2":	
					break;
				default:
					continue;
			}// end of switch--------------
			
			if("1".equals(strGender) || "2".equals(strGender) ) {
				gender = Integer.parseInt(strGender);
				break;
			}
			
		} while (true);
		
		
		// 6. 주소 입력받기
		do {
			System.out.print("▷주소 => ");
			address = sc.nextLine();
			
			if(!address.trim().isEmpty())
				break;
		} while (true);
		
		// 7. 학력 입력받기
		do {
			System.out.print("▷학력(1.대졸이상  2.초대졸  3.고졸  4.고졸미만) => "); 
			String strSchool = sc.nextLine();
			switch (strSchool) {
				case "1":
				case "2":
				case "3":
				case "4":
					break;
	
				default:
					continue;
			}// end of switch----------------------
			
			if("1".equals(strSchool) ||
			   "2".equals(strSchool) ||
			   "3".equals(strSchool) || 
			   "4".equals(strSchool) ) {
				school = Integer.parseInt(strSchool);
				break;
			}
			
		} while (true);
		
		
		// 8. 휴대폰 입력받기 
		do {
			System.out.print("▷휴대폰(예: 0105673456) => "); 
			mobile = sc.nextLine();
			int length = mobile.length();
			
			boolMobile = MyUtil.checkNumber(mobile) && (length == 10 || length == 11);
			
		} while (!boolMobile);
		
		
		// 9. 희망직종 입력받기
		do {
			System.out.print("▷희망직종 => ");
			hopejob = sc.nextLine();
			
			if(!hopejob.trim().isEmpty())
				break;
		} while (true);
		
		// 10. 희망연봉 입력하기
		do {
			System.out.print("▷희망연봉 => "); 
			String strMoney = sc.nextLine();
						
			boolHopemoney = MyUtil.checkNumber(strMoney);
			
			if(boolHopemoney) {
				hopemoney = Integer.parseInt(strMoney);
				break;
			}
			
		} while (true);
		
		// 구직자로 회원가입 여부를 물어본다.
		System.out.print(">>> 회원가입여부 확인(1.예 / 2.취소) => ");
		String yn = sc.nextLine();
		
		if(!"1".equals(yn)) {
			System.out.println(">>> 구직자 회원가입을 취소 했습니다. <<<"); 
		}
		else if("1".equals(yn) &&
				Gujikja.count == gujikjaArr.length) {
			System.out.println(">>> 정원이 초과했으므로 구직자 회원가입이 불가합니다.");
		}
		else {
			// Gujikja 객체 생성(회원가입) 
			Gujikja gujikja = new Gujikja(userid, passwd, name, birthday, gender, address, school, mobile, hopejob, hopemoney);    
			gujikjaArr[Gujikja.count - 1] = gujikja;
			System.out.println(">>> 구직자 회원가입 성공!!! <<<");
			System.out.println("["+Gujikja.count+"번째 / 전체 : "+gujikjaArr.length+"명]");
		}
		
	}// end of registerGujikja(Scanner sc)----------
	
	
	// *** 초기메뉴 메뉴번호3. 로그인(구직자)을 해주는 메소드 생성 ***
	public Gujikja loginGujikja(Scanner sc) {
		Gujikja gujikja = null;
		
		System.out.print("\n아이디 => ");
		String userid = sc.nextLine();
		
		System.out.print("암호 => ");
		String passwd = sc.nextLine();
		
		boolean isLogin = false;
		
		for(int i=0; i<Gujikja.count; i++) {
			gujikja = gujikjaArr[i].login(userid, passwd);
		    if(gujikja != null) {
		    	isLogin = true;
		    	break;
		    }
		}// end of for--------------------
		
		if(isLogin)
			System.out.println(">>> 로그인 성공!!");
		else
			System.out.println(">>> 로그인 실패!!");
		
		return gujikja;
	}
	
	
	// *** 구직자메뉴 메뉴번호2. 나의 정보 변경을 해주는 메소드 생성 ***
	public void updateMeGujikja(Scanner sc, Gujikja me) {
		
		System.out.print("▷암호 => ");
		String passwd = sc.nextLine();
		
		System.out.print("▷성명 => ");
		String name = sc.nextLine();
		
		System.out.print("▷생년월일(예: 19930820) => ");
		String birthday = sc.nextLine();
		
		System.out.print("▷주소 => ");
		String address = sc.nextLine();
		
		System.out.print("▷학력(1.대졸이상  2.초대졸  3.고졸  4.고졸미만) => ");
		String strSchool = sc.nextLine();
		int school = Integer.parseInt(strSchool);
		
		System.out.print("▷휴대폰번호 => ");
		String mobile = sc.nextLine();
		
		System.out.print("▷희망직종 => ");
		String hopejob = sc.nextLine();
		
		System.out.print("▷희망급여 => ");
		String strHopeMoney = sc.nextLine();
		int hopemoney = Integer.parseInt(strHopeMoney);
		
		me.passwd = passwd;
		me.name = name;
		me.birthday = birthday;
		me.address = address;
		me.school = school;
		me.mobile = mobile;
		me.hopejob = hopejob;
		me.hopemoney = hopemoney;
		
		for(int i=0; i<Gujikja.count; i++) {
			if( gujikjaArr[i].userid.equals(me.userid) ) {
				gujikjaArr[i] = me;
				break;
			}
		}// end of for--------------------
	};
	
	
	// *** 구직자메뉴 메뉴번호7. 회원탈퇴를 해주는 메소드 생성 ***
	public void deleteMeGujikja(String userid) {
		
		int deleteIndex = 0;
		
		for(int i=0; i<Gujikja.count; i++) {
		  if(gujikjaArr[i].userid.equals(userid)) {
			  deleteIndex = i;
			  break;
		  }
		}// end of for------------------------
		
	/*
	     Gujikja.count 가 5인 배열의 방번호가 0 1 2 3 4 중
	                                    1 2 3 4 null 
	     0번째 방이 삭제된다라면 deleteIndex 는 0 이 되고 방을 옮기는 4번의  작업이 일어나야 한다.
	     1번째 방이 삭제된다라면 deleteIndex 는 1 이 되고 방을 옮기는 3번의  작업이 일어나야 한다.
	     2번째 방이 삭제된다라면 deleteIndex 는 2 이 되고 방을 옮기는 2번의  작업이 일어나야 한다.
	     3번째 방이 삭제된다라면 deleteIndex 는 3 이 되고 방을 옮기는 1번의  작업이 일어나야 한다.
	     4번째 방이 삭제된다라면 deleteIndex 는 4 이 되고 4번째 방은 null 이 들어오는 작업만 일어나면 된다.  
	*/
		if(deleteIndex == Gujikja.count-1) {
			gujikjaArr[deleteIndex] = null;	
		}
		else {
			for(int i=0; i<(Gujikja.count-1-deleteIndex); i++, deleteIndex++) { 
				gujikjaArr[deleteIndex] = gujikjaArr[deleteIndex+1];
				gujikjaArr[deleteIndex+1] = null;
			}
		}
		
		Gujikja.count--; // 구직자 카운트수는 1감소
		System.out.println(">>> 회원탈퇴 성공!!");
	}
	
	
	/////////////////////////////////////////////////
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String startMenuNo = "";
		
		JobMain jobapp = new JobMain();
		Gujikja loginGujikja = null;
		
		do {
			JobMain.startMenu();
			startMenuNo = sc.nextLine();
			
			switch (startMenuNo) {
				case "1": // 구직자 등록(생성)
					jobapp.registerGujikja(sc); 
					break;
					
				case "3": // 로그인(구직자)
				{	
					loginGujikja = jobapp.loginGujikja(sc); // 로그인 검사 시도  
				    
					if(loginGujikja != null) { // 로그인 성공 했으면
						do { // 구직자 메뉴 보여주기 
							JobMain.gujikjaMenu();
							String gujikjaMenuno = sc.nextLine();
							boolean isBreak = false;
							
							switch (gujikjaMenuno) {
								case "1":  // 나의 정보 조회
									System.out.println(loginGujikja.getGujikjaInfo()); 
									break;
								
								case "2":  // 나의 정보 변경
									jobapp.updateMeGujikja(sc, loginGujikja); 
									break;
									
								case "3":  // 모든 채용공고 조회
									
									break;	
									
								case "4":  // 구인회사 ID 검색
									
									break;	
									
								case "5":  // 특정 업종 채용공고 조회
									
									break;
									
								case "6":  // 로그아웃
									isBreak = true;
									break;
									
								case "7":  // 회원탈퇴(구직자배열 gujikjaArr에서  자신의 객체를 null 로 만든다)
									jobapp.deleteMeGujikja(loginGujikja.userid); 
									isBreak = true;
									break;	
									
								default:
									
									break;
							}// end of switch--------------------
							
							if(isBreak)	break;
							
						} while (true);// end of do~while--------
						
					}// end of if-----------------
				}
					break;	
					
				case "5": // 로그인(관리자)
				{
					System.out.print("\n▷아이디 : ");
					String adminId = sc.nextLine();
					
					System.out.print("▷암호 : ");
					String passwd = sc.nextLine();
					
					if("admin".equals(adminId) && "qwer1234$".equals(passwd)) {
						// 관리자로 로그인 성공했다라면 
						
						// 관리자가 로그아웃 하기전까지 계속해서 관리자메뉴를 보여준다.
						String adminMenuNo = "";
						do {
							JobMain.adminMenu();
							adminMenuNo = sc.nextLine();
							switch (adminMenuNo) {
								case "1": // 모든 구직자정보 출력
									for(int i=0; i<Gujikja.count; i++) {
										System.out.println(jobapp.gujikjaArr[i].getGujikjaInfo()); 
										System.out.println();
									}
								break;
	
								case "2": // 모든 구인회사정보 출력
									
									break;	
									
								case "3": // 특정 구직자 삭제 
									
									break;	
								
								case "4": // 특정 구인회사 삭제    
									
									break;	
									
								case "5": // 로그아웃     
									
									break;	
									
								default:
									break;
							}// end of switch-------------
							
						} while (!"5".equals(adminMenuNo)); // end of while---------- 
					}// end of if------------------
				}
					break;
	
				default:
					break;
			}// end of switch----------------
			
		} while (!"6".equals(startMenuNo));// end of do~while---------------
		
		System.out.println("\n=== 프로그램 종료!!! ====");
		sc.close();

	}// end of main()---------------------------

}// end of class JobMain ////////////////////////
