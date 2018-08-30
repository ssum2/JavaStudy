package my.day18.NonSynchronization;

public class NoSyncBankBookMain {

	public static void main(String[] args) {

//	# 공유 통장 데이터 1개 생성; 초기금액 10000원
		NoSyncBankBook bankbook = new NoSyncBankBook("123-456-789123", 10000);
		
//	#입금 스레드 10개 생성; 공유 통장 데이터 1개에 10명이 동시에 입금한다고 가정
//		1) 입금 클래스 객체를 배열 형태로 생성(10)
		UpmoneyRunnable[] uprunArr = new UpmoneyRunnable[10];
		
//		2) 입금 스레드 배열 형태로 생성
		Thread[] thrupArr = new Thread[10];
		
//		3) 입금
		for(int i=0; i<uprunArr.length; i++) {
			UpmoneyRunnable upRunnable = new UpmoneyRunnable(bankbook, 1000);
//			>> upRunnable객체가 bankbook에 1000원을 입금 * uprunArr.length만큼(10개)
//			>> 매번 new 생성하기 때문에 이름만 같을 뿐이지 개별 객체 10개가 만들어지는 것!
			uprunArr[i] = upRunnable;
//			>> 러너블 구현된 입금클래스객체를 배열에 넣어줌
			
			thrupArr[i] = new Thread(uprunArr[i]);
//			>> 러너블객체를 스레드에 넣어줌
//			>> 매번 new 생성하기 때문에 이름만 같을 뿐이지 개별 스레드 10개가 만들어지는 것!
		}
	
		
//	#출금 스레드 10개 생성; 공유 통장 데이터 1개에 10명이 동시에 출금한다고 가정
//		1) 출금 클래스 객체를 배열 형태로 생성(10)
		DownmoneyRunnable[] downrunArr = new DownmoneyRunnable[10];
		
//		2) 출금 스레드 배열 형태로 생성
		Thread[] thrdownArr = new Thread[10];
		
//		3) 출금
		for(int i=0; i<downrunArr.length; i++) {
			DownmoneyRunnable downRunnable = new DownmoneyRunnable(bankbook, 1000);
			downrunArr[i] = downRunnable;
			thrdownArr[i] = new Thread(downrunArr[i]);
		}
		
		
		for(int i=0; i<thrupArr.length; i++) {
			thrupArr[i].start(); 	// 10개의 입금 스레드를 작동시킴
			thrdownArr[i].start(); 	// 10개의 출금 스레드를 작동시킴
		}
//		>>> 순서가 뒤죽박죽 섞여서 나옴
		
		
		
	}	// end of main()

}	// end of class
