package my.day16.d.INTERFACE;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RecruitApply {
	
	// field
	private Recruit rc;  		 // 채용정보
	private Gujikja gu;  		 // 구직자정보
	private String apply_motive; // 지원동기
	private String register_day; // 등록일자
	
	static int count;			 // RecruitApply 객체(인스턴스)의 개수를 알아오는 용도
	
	// 기본생성자
	public RecruitApply() {
		Date now = new Date();	 // 현재시각
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");		
		register_day = df.format(now);
	}

	
	
	// method
	
	public Recruit getRc() {
		return rc;
	}

	public void setRc(Recruit rc) {
		
		if(rc != null) {
			this.rc = rc;
		}
		else {
			System.out.println("[경고] 채용에 지원하려면, 반드시 채용정보를 입력하세요!!\n");
		}
	}

	public Gujikja getGu() {
		return gu;
	}

	public void setGu(Gujikja gu) {
		
		if(gu != null) {
			this.gu = gu;
		}
		else {
			System.out.println("[경고] 채용에 지원하려면, 반드시 구직자 정보를 입력하세요!!\n");
		}
		
	}

	public String getApply_motive() {
		return apply_motive;
	}

	public void setApply_motive(String apply_motive) {
		
		if(apply_motive != null && !apply_motive.isBlank()) {
			this.apply_motive = apply_motive;
		}
		else {
			System.out.println("[경고] 입사 지원동기를 필수로 입력해야 합니다.\n");
		}	
		
	}

	public String getRegister_day() {
		return register_day;
	}


}
