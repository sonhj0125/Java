package my.day13.a.inheritance;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import my.util.MyUtil;

public class CommonMember {

	// == Gujikja 클래스와 Company 클래스에서 공통으로 사용되어지는 field 생성하기 == //
	
	private String id;        			// 아이디
	private String passwd;    			// 비밀번호
	private String name;      			// 성명, 회사이름
	private String register_day;  	  	// 가입일자
	
	
	// Gujikja 및 Company 클래스의 부모클래스인 CommonMember 클래스의 기본생성자
	public CommonMember() {
	//	System.out.println("== 부모클래스인 CommonMember 클래스의 기본생성자 호출 ==");	
		
    	Date now = new Date(); 	// 현재시각
    	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	
    	register_day = df.format(now);
    	// 2024-01-30 15:12:10
    } // end of public CommonMember()--------------------------------------------
		
	
    // 캡슐화 되어진 field 를 메소드를 통해 접근하도록 만들기 //
    public void setId(String id) {		// set 다음 첫글자는 대문자이면서, 필드명이 들어옴
    	
    	if( id == null || id.isBlank() ) {
    		System.out.println("[경고] 아이디는 공백이 아닌 글자로 입력하셔야 합니다.\n");
    	}
    	else {
    		
    		// userid 는 첫글자는 반드시 영문(대,소문자)자로 시작해야 하고 그 나머지 글자는
    		// 영문자 또는 숫자로만 이루어져야 한다.
    		// 그리고 userid 의 길이는 최소 3글자, 최대 10글자로 제한한다.
    		
    		// >> 정규표현식(Regular Expression)이란? <<
    		// ==> 특정한 규칙을 가진 문자열의 집합을 표현하기 위해 쓰이는 형식언어
    		
    		
    		// == 1. 정규표현식(Regular Expression) 패턴을 작성한다. == //
    		Pattern p = Pattern.compile("^[A-Za-z][A-Za-z0-9]{1,9}$");
    		// ^ 은 시작을 의미한다.
    		// $ 는 끝을 의미한다.
    		// [] 는 글자 1개가 들어오는 것을 말한다.
    		// [A-Za-z] 는 글자 1개가 들어오는데 영문자만 가능하다. (대문자 A부터 Z까지, 소문자 a부터 z까지)
    		// [A-Za-z0-9] 는 글자 1개가 들어오는데 영문자 또는 숫자만 가능하다. (숫자는 연속으로 된 0 부터 9 까지)
    		// 연속적인 숫자가 아닐 경우 전부 적어줄것
    		// [A-Za-z0-9]{2, 9} 은 [A-Za-z0-9] 이 최소 2번 반복, 최대 9번 반복해야 한다.
    		
    		
    		// == 2. 문자열이 주어진 정규식 패턴과 일치하는지 판별하는 객체를 생성한다. == //
    		Matcher m = p.matcher(id);
    		
    		
    		// == 3. 판별하도록 한다. == //
    		if( m.matches() ) {
    			this.id = id;		// super 의 뜻은 부모, 즉, 부모 클래스에서 당겨옴
    		/*	// 또는
    			id = userid;
    			// 또는
    			super.id = userid;
    		*/	
    		}
    		else {
    			System.out.println("[경고] 아이디의 첫글자는 영문이어야 하고, 나머지는 영문 또는 숫자로만 이루어진 글자길이는 3~10글자만 가능합니다.\n");
    		}
    	
    	}
     	
    } // end of public void setUserid(String userid)-------------------------------------------------------------------
    
    
    // 캡슐화 되어진 field 메소드 불러오기 //
    public String getId() {	
    	
    	return id;
    	
    } // end of public void getUserid(String userid)-------------------------------------------------------------------
    
    
    // 캡슐화 되어진 field 를 메소드를 통해 접근하도록 만들기 //
    // getter, setter passwd   
    
    public String getPasswd() {
		return passwd;
	}   
    
    public void setPasswd(String passwd) {
		
		// 비밀번호는 영대문자, 영소문자, 숫자, 특수문자가 혼합된 최소 8글자 이상 최대 15글자 이하이어야 한다.
    	
    	if( MyUtil.isCheckPasswd(passwd) ) {
    		this.passwd = passwd;
    	}
    	else {
    		System.out.println("[경고] 비밀번호는 영대문자, 영소문자, 숫자, 특수문자가 혼합된 최소 8글자 이상 최대 15글자 이하이어야 합니다.\n");
    	}
    	
    	
	} // end of public void setPasswd(String passwd)-------------------------------------------------------------------
   
    
    
    // getter, setter name
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		// 성명은 공백이 없는 한글로만 이루어져야 하며 최소 2글자 최대 6글자로만 되어야 합니다.
			
		/*
		 * if( name != null ) { char[] ch_arr = name.toCharArray();
		 * 
		 * boolean isOnly_hangul = true; for( char ch : ch_arr ) { if( !('가' <= ch && ch
		 * <= '힣') ) { isOnly_hangul = false; break; // 한글이 아니면 흔적 남기고 for 문 빠져나가야 함 }
		 * 
		 * } // end of for-------------------------------
		 * 
		 * if(2 <= ch_arr.length && ch_arr.length <= 6 && isOnly_hangul) { this.name =
		 * name; } else {
		 * System.out.println("[경고] 성명은 공백이 없는 한글로만 이루어져야 하며 최소 2글자 최대 6글자로만 되어야 합니다.\n"
		 * ); } }
		 */
		
		// 또는
		
		
		// 성명을 정규표현식으로 검사
		Pattern p = Pattern.compile("^[가-힣]{2,6}$");
		
		Matcher m = p.matcher(name);
		
	   		if( m.matches() ) {
				this.name = name;
			}
			else {
				System.out.println("[경고] 성명은 공백이 없는 한글로만 이루어져야 하며 최소 2글자 최대 6글자로만 되어야 합니다.\\n");
			}
		
		
	} // end of public void setName(String name)------------------------------------------------------------

	
	// getter, setter(앞에 있음) 가입날짜
	public String getRegister_day() {
		return register_day;
	}



	/////////////////////////////////////////////
	String parent_test_1() {
		return "부모클래스에서 만들었어요. 연습이예요!";
	}
	
	
}
