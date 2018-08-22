package my.day11;

import java.util.Scanner;

import my.util.MyUtil;

// 180820 12:31PM
//180821_09:20AM 강사님이 하신 내용
// 구직자 정보변경 부분을 get-set으로 각자 변경으로 해본 것

public class GujikjaController {

	// 4. Gujikja 객체를 저장하는 배열
	Gujikja [] gujikjaArr = new Gujikja[10];
	
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
		// 구직자 등록, 구인회사 등록, 채용공고 등록, 로그인(구직자/기업)
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
			
			// 혼자 아이디 중복검사 해본 것
//				for(int i=0; i<Gujikja.count; i++) {
//					if(userid.equals(gujikjaArr[i].userid)) {
//						System.out.println(">> 중복된 아이디는 사용할 수 없습니다 <<");
//						continue outer;
//					}
//					else
//						break outer;
//				}
			
		
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
		
		Gujikja gujikja = null; // Gujikja클래스 객체형태의 지역변수
		
		// 1) 아이디, 비밀번호 입력하기
		System.out.print("\n>> 아이디 :");
		String userid = sc.nextLine();
		
		System.out.print(">> 암호 : ");
		String passwd = sc.nextLine();
		
		// 2) 미리 저장해둔 값을 가져오기 --> gujikjaArr[]
		for(int i=0; i<Gujikja.count; i++) {
			gujikja = gujikjaArr[i].login2(userid, passwd);
			// login2 가 돌아가서 객체가 반환되면 gujikja변수에 들어감
			if(gujikja !=null)  break;
			// 만약 gujikja가 계속 null이라면 if문 실행안하고 계속 for문 반복함
		} // end of for
		
		return gujikja;
	} // end of loginGujikja()
	
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
		System.out.print("희망직종 : ");
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
	
		
	}
	
	

	

	
	public static void main(String[] args) { // 메인메소드 안은 간단하게 정리하고 웬만하면 위에서 메소드로 정리해서 씀
		Scanner sc = new Scanner(System.in);
		String startMenuNo = "";
		
		
		JobMain2 jobapp = new JobMain2(); // 객체 하나 생성
		Gujikja loginGujikja = null; // login된 구직자, 객체생성X
		
	
		
		do {
			// 초기메뉴 출력
			JobMain2.startMenu();
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
						JobMain2.gujikjaMenu(); // 로그아웃할 때 까지 계속 구직자메뉴가 나오고, 로그아웃하면 초기메뉴가 나와야 함
						String gujikjaMenuNo = sc.nextLine();
						
						
						boolean isBreak = false; // do~while을 나가기 위한 표식
						
						switch (gujikjaMenuNo) {
						case "1": // 1. 나의 정보 조회
							System.out.println(loginGujikja.getGujikjaInfo());
							break;
							
						case "2": // 2. 나의 정보 변경
							System.out.println(">>> 변경하실 정보를 선택하세요: ");
							System.out.print("1. 암호 \n2. 성명\n3. 나이\n4. 성별\n5. 주소\n6. 최종학력\n7. 연락처\n8. 희망직종\n9. 희망연봉\n =>");
							String changeInfoNo = sc.nextLine();
							
							
							switch (changeInfoNo) {
							case "1":
								System.out.print(">> 변경하실 암호를 입력하세요: ");
								String changePasswd = sc.nextLine();
								
								loginGujikja.setPasswd(changePasswd);
								System.out.println(">> "+loginGujikja.passwd+"으로 암호가 변경 되었습니다 <<");
								break;
								
							case "2":
								System.out.print(">> 변경하실 성명을 입력하세요: ");
								String changeName = sc.nextLine();
								
								loginGujikja.setPasswd(changeName);
								System.out.println(">> "+loginGujikja.name+"으로 변경 되었습니다 <<");
								break;
								
							case "3":
								System.out.print(">> 변경하실 나이를 생년월일로 입력하세요: ");
								String changeBirth = sc.nextLine();
								
								loginGujikja.setAge(changeBirth);
								System.out.println(">> "+loginGujikja.setAge(changeBirth)+"으로 나이가 변경 되었습니다 <<");
								break;
								
							case "4":
								System.out.print(">> 변경하실 성별을 입력하세요(1.남/2.여): ");
								String changeGender = sc.nextLine();
								
								loginGujikja.setGender1(changeGender);
								System.out.println(">> "+loginGujikja.setGender1(changeGender)+"으로 성별이 변경 되었습니다 <<");
								break;
							case "5":
								System.out.print(">> 변경하실 주소를 입력하세요: ");
								String changeAddr= sc.nextLine();
								
								loginGujikja.setAddress(changeAddr);
								System.out.println(">> "+loginGujikja.address+"으로 주소 변경이 완료 되었습니다 <<");
								break;
							case "6":
								System.out.print(">> 변경하실 최종학력을 입력하세요(1.대졸이상, 2.초대졸, 3.고졸, 4.고졸미만): ");
								int changeSchool = Integer.parseInt(sc.nextLine());
								
								loginGujikja.setSchool(changeSchool);
								System.out.println(">> "+loginGujikja.setSchool(changeSchool)+"으로 최종학력이 변경 되었습니다 <<");
								
								break;
							case "7":
								System.out.print(">> 변경하실 연락처를 입력하세요(ex. 01056781234): ");
								String changeMobile = sc.nextLine();
								
								loginGujikja.setMobile(changeMobile);
								System.out.println(">> "+loginGujikja.setMobile(changeMobile)+"으로 연락처가 변경 되었습니다 <<");
								
								break;
							case "8":
								System.out.print(">> 변경하실 희망직종을 입력하세요: ");
								String changeHopejob = sc.nextLine();
								
								loginGujikja.setHopejob(changeHopejob);
								System.out.println(">> "+loginGujikja.hopejob+"으로 희망직종이 변경 되었습니다 <<");
								
								
								break;
							case "9":
								System.out.print(">> 변경하실 희망연봉을 입력하세요(*만원): ");
								int changeHopemoney = Integer.parseInt(sc.nextLine());
								
								loginGujikja.setHopemoney(changeHopemoney);
								System.out.println(">> "+loginGujikja.setHopemoney(changeHopemoney)+"으로 희망연봉이 변경 되었습니다 <<");
								
								
							break;
	
							
							default:
								break;
							}
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
							
						case "7": // 7. 회원탈퇴
							loginGujikja = null;
							isBreak = true;
							break;
							
						default:
							System.out.println("1~7 숫자만 입력 가능합니다. 다시 입력하세요.");
							continue;
						}
						
//						if("1".equals(gujikjaMenuNo)) {
//							System.out.println(loginGujikja.getGujikjaInfo());
//						}		
//						if("6".equals(gujikjaMenuNo) || "7".equals(gujikjaMenuNo) )
//							break;
						if(isBreak) break; // isbreak가 참일때 do~while 빠져나가기
					} while (true);
					
					
				}// end of if
		
			}	break;
			
			} // end of swtich
			
		} while (!"6".equals(startMenuNo));
		
		System.out.println("========= 프로그램 종료 ========");
		sc.close();
		
	
		
	} // end of main()

} // end of class
