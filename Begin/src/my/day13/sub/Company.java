package my.day13.sub;

import java.text.DecimalFormat;

public class Company extends Common {
	
//	1. Company클래스의 특정 요소 추상화
	private String ceo;		// 대표자명
	private long seedmoney;	// 회사 자본금
	private String jobtype;	// 업종
	
//	2. 생성자 만들기	
	public Company() { super.count++; }	// 부모클래스에서 가져온 static 멤버변수
	public Company(String id, String passwd, String name, String address, 
				   String tel, String ceo, long seedmoney, String jobtype) {
		super(id, passwd, name, address, tel);	// 파라미터가 있는 super를 쓰면 super()는 삭제됨
		this.ceo = ceo;
		this.seedmoney = seedmoney;
		this.jobtype = jobtype;
		
		Common.count++;
	}

//	3. Getter Setter 셋팅
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	
	public long getSeedmoney() {
		return seedmoney;
	}
	public String getStrSeedmoney() {
		DecimalFormat df = new DecimalFormat("#,###");
		return df.format(seedmoney)+"만원";
	}
	public void setSeedmoney(long seedmoney) {
		this.seedmoney = seedmoney;
	}
	
	public String getJobtype() {
		return jobtype;
	}
	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	}
	
//	4. 메소드 만들기
//	1) 구인회사 정보 출력하기
	public String getCompanyInfo() {
		String info = "\n===== 회사명 "+getName()+"의 정보 =====\n"+
					  commonInfo().replaceAll("성   명", "회사명")+"\n"+	// 성명부분을 회사명으로 문자열 바꿔줌
					  "▷ 대표명: "+ceo+"\n"+
					  "▷ 자본금: "+getStrSeedmoney()+"\n"+
					  "▷ 업   종: "+jobtype;
		return info;
	}

} // end of class
