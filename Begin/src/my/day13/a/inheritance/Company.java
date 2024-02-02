package my.day13.a.inheritance;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Company extends CommonMember {
// Company 클래스는 CommonMember 클래스에 생성되어진 field 및 method 및 기본생성자를 상속 받아온다.	
// CommonMember 클래스는 부모클래스가 되어지고, Company 클래스는 자식클래스가 된다.	
	
	
	// == field 생성 == //
	// field 의 캡슐화(EnCapsulation == 은닉화)
	
	private String business_number;         // 사업자 등록번호
	private String jop_type; 				// 회사직종타입(제조업, 서비스업, IT...)
	private long seed_money;				// 자본금
	
	static int count;	  		  // Company 객체(인스턴스)의 개수를 알아오려는 용도

	
    // 기본생성자(생략가능 빼도 존재하는 것임)
	// (CommonMember 클래스에 있음)
	// 부모클래스인 CommonMember 클래스의 기본생성자를 호출한다는 것이다.
 /*   public Company() {	
		Date now = new Date(); 	// 현재시각
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		register_day = df.format(now);
		// 2024-01-30 15:12:10
	    } // end of public Gujikja()--------------------------------------------
*/	
	
	
	// getter, setter business_number
	public String getBusiness_number() {
		return business_number;
	}

	public void setBusiness_number(String business_number) {
		
		// 사업자등록번호는 오로지 숫자로만 들어와야 하며
		// 첫글자는 0이 들어올 수 없다.
		// 또한, 사업자 등록번호의 길이는 10글자가 되어야 한다.
		
		Pattern p = Pattern.compile("^[1-9][0-9]{9}$");
		Matcher m = p.matcher(business_number);
		
		if( m.matches() ) {
			this.business_number = business_number;		

		}
		else {
			System.out.println("[경고] 사업자등록번호의 길이는 10자리 숫자만 들어와야 하며, 첫글자는 0이 들어올 수 없습니다.\n");
		}
	} // end of public void setBusiness_number(String business_number)-----------------------------------

	
	
	
	
	// getter, setter jop_type
	public String getJop_type() {
		return jop_type;
	}

	public void setJop_type(String jop_type) {
		
		// null 이나, 공백은 불가
		if(jop_type == null || jop_type.isBlank() ) {	
			System.out.println("[경고] 회사직종군은 공백이 아닌 글자로 입력하셔야 합니다.\n");
		}
		else {		
			
		this.jop_type = jop_type;
		
		}

	} // end of public void setJop_type(String jop_type)-----------------------------
	
	
	
	
	// getter, setter seed_money
	public long getSeed_money() {
		return seed_money;
	}

	public void setSeed_money(long seed_money) {
		// 0보다 커야 함
		if(seed_money <= 0) {			
			System.out.println("[경고] 자본금은 0보다 커야 합니다.\n");
		} else {			
			this.seed_money = seed_money;
		}
	} // end of public void setSeed_money(long seed_money)-------------------------------

	
	
	
	
	// === 구인회사의 정보를 한줄로 출력해주는 메소드 생성하기 === //	
	
	public String getInfo() {
		
	    DecimalFormat df = new DecimalFormat("#,###");				// 3자리 마다 콤마(,)를 찍어준다.
	    
	    //  회사명	   업종		     사업자등록번호		       자본금 \n
	    
			return super.getName() + "\t" + jop_type + "\t" + business_number + "\t" + df.format(seed_money) + "원";
			// 또는 this.getName(); 또는 getName();
			
		
		
		
	} // end of public String getInfo()-------------------------------

	
	

}
