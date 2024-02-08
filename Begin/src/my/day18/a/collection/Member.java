package my.day18.a.collection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import my.util.MyUtil;

public class Member {
	

	private String id;
	private String passwd;
	private String name;
	private String jubun;
	
	
	public Member(String id, String passwd, String name, String jubun) {
		
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.jubun = jubun;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJubun() {
		return jubun;
	}

	public void setJubun(String jubun) {
		this.jubun = jubun;
	}

	public String gender() {
		if(jubun == null) {
			return "";
		}
		else {
			if("1".equals(jubun.substring(6)) ||
			   "3".equals(jubun.substring(6)) ) {
				return "남";
			}
			else {
				return "여";
			}
		}
	} // end of gender()-------------------------------
		
	
	public int age() {
	      
	      Date now = new Date();
	      SimpleDateFormat sdfmt = new SimpleDateFormat("yyyyMMdd");
	      String str_today = sdfmt.format(now);
	      
	      String centry = ( "1".equals(jubun.substring(6)) || "2".equals(jubun.substring(6)) )?"19":"20"; 
	      String str_birthday = centry + jubun.substring(0, jubun.length()-1);
	      //                   "19720910"   "20020320"
	      
	      String str_nowYear_birthday = String.format("%tY", now) + jubun.substring(2, jubun.length()-1);
	       //                                                "2024"+"0910"   "2024"+"0320" 
	      
	      try {
	          Date date_today = sdfmt.parse(str_today);
	          Date date_nowYear_birthday = sdfmt.parse(str_nowYear_birthday);
	          
	          int n_nowYear = Integer.parseInt(String.format("%tY", now)); 
	          int n_birthYear = Integer.parseInt(str_birthday.substring(0, 4));
	          
	          if(date_nowYear_birthday.compareTo(date_today) > 0) {
	             return n_nowYear - n_birthYear - 1;
	          }
	          else {
	             return n_nowYear - n_birthYear;
	          }
	          
	      } catch (ParseException e) {
	         return -1;
	      }
	      
	   }// end of public int age()--------------------------------------
	
	
	
	
	// 메소드의 오버라이딩(재정의) //
	@Override
	public String toString() {
    	System.out.println("=== " + name + "님의 회원정보 ===");
    	System.out.println("1. 아이디 : " + id + "\n" 
    					 + "2. 비밀번호: " + passwd + "\n"
    					 + "3. 성명 : " + name + "\n"
    					 + "4. 주민번호 : " + jubun + "\n"
    					 + "5. 성별 : " + gender() + "\n"
    					 + "6. 만나이 : " + MyUtil.age(jubun) + "세\n");
		return "";
	}
	
	
}
