package my.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class MyUtil {
	
	// === 현재시각을 출력해주는 static 메소드를 생성한다. === //
	
	// public void current_time_print()   -> instance
	public static void current_time_print() {
		
		Date now = new Date(); // 현재시각
		
		SimpleDateFormat sdfmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  // 연월일, 시분초 String 타입으로 나오게 함.
		
		System.out.println("== 현재시각 : " + sdfmt.format(now));
		
	} // end of current_time_print()----------------------	
		
	
	
	
	
	// === certification key 를 만들어주는 static 메소드를 생성한다. === //
		
	public static String certification_key() {	
		
		Random rnd = new Random(); // 랜덤한 정수
		
		String certification_key = "";
				
		for(int i=0; i<7; i++) {
			if(i<3) {
				char ch = (char)(rnd.nextInt('z' - 'a' + 1) + 'a');
				certification_key += ch;				
			}
			else {
				int n = (int)(rnd.nextInt(9 - 0 + 1) + 0);
				certification_key += n;
			}
			
		} // end of for----------------------------------
		
		return certification_key;
	
	} // end of certification_key()-----------------------------




	// === 입력받은 문자열에서 공백을 제거해주는 메소드를 생성한다. === //
	
	public static String space_delete(String input_str) {
		
		String result = null;
		
		if(input_str != null) {
			result ="";   // null 이 없게끔 초기화시킨 후 진행
			for(int i=0; i<input_str.length(); i++) {
				char ch = input_str.charAt(i);
				if(ch != ' ') {
					result += ch;
				}
				
			} // end of for------------------------
		}
		
		return result;	
		
	} // end of space_delete()	
		
	 
	// === 비밀번호가 규칙에 맞는지 틀리는지 알려주는 static 메소드 생성하기 === //
	/*
	  비밀번호 규칙
	  1. 길이는 8글자 이상 15글자 이하
	  2. 비밀번호는 영문 대문자, 영문 소문자, 숫자, 특수기호가 혼합	
	  3. 규칙에 맞으면 true 리턴, 아니면 false 리턴
	*/
	
	public static boolean isCheckPasswd(String passwd) {
		
		if(passwd == null) 
			return false;
		
		// 예를 들어서, 입력받은 passwd가 C5d# 이라면
		// ejfodjf#$#@#QWEdwadawgbege 이라면
		int length = passwd.length();
		if(length < 8 || length > 15) {
			return false;
		}
		
		// 이제부터는 입력받은 passwd 의 글자수가 8글자 이상 15글자 이하인 경우이다.
		// 예를 들어서, 입력받은 passwd가 C5d#하호하하 이라면 false
		// C5d#하하s@! 이라면 false
		// 또는 
		// 입력받은 passwd가 C5dawxab 이라면 c5dawxab# 이라면
		// 입력받은 passwd가 C5dawxab@ 이라면 c5dawxab#G 이라면
		
		boolean flag_upper = false; // 영문 대문자 표식을 위한 용도
		boolean flag_lower = false; // 영문 소문자 표식을 위한 용도
		boolean flag_number = false; // 숫자 표식을 위한 용도
		boolean flag_special = false; // 특수문자 표식을 위한 용도
		
		
		for(int i=0; i<length; i++) {
			// 암호에 한글이 들어가 있는지 알아본다.
			char ch = passwd.charAt(i);
			if('가' <= ch && ch <= '힣') {
				return false;
			}
			
			if(Character.isUpperCase(ch))  		// 영문 대문자일 경우
				flag_upper = true;
			else if(Character.isLowerCase(ch)) // 영문 소문자일 경우
				flag_lower = true;
			else if(Character.isDigit(ch)) 		// 숫자일 경우
				flag_number = true;
			else								// 특수문자일 경우
				flag_special = true; 
				
			} // end of for-------------------------
		
		return flag_upper && flag_lower && flag_number && flag_special;

	

	} // end of isCheckPasswd(String passwd)------------------------------------


	
	// == Main_string 문자열 합쳐서 $2,500,000 만들기 == //
	
	public static long delete_character(String money) {
		
		// money => // "$2,000,000"
		// money => // "2,000,000$"		
		// money => // "$2,000,000$"
		// money => // "$$2,000,000$"			// $를 기준으로 잘라서 합치기를 반복하면 $를 전부 없앨 수 있음.
		// money => // "2,$000,$000$"
												// "2," + "000,$000$" => "2,000,$000$" => "2,000," + "000$" => "2,000,000$" => "2,000,000"+"" => "2,000,000"
		// money => // "2,000,000"
		// money => // "$500"
		// money => // "500"
		
		do {
			
			int dollor_index = money.indexOf("$");
			
			if(dollor_index == -1)
				break;		
			
			money = money.substring(0, dollor_index) + money.substring(dollor_index + 1);
			
		} while (true);
		
		// System.out.println(money);
		// "2,000,000"
		
		do {
			
			int comma_index = money.indexOf(",");
			
			if(comma_index == -1)
				break;		
			
			money = money.substring(0, comma_index) + money.substring(comma_index + 1);
			
		} while (true);
		
		// System.out.println(money);
		// "2000000"
		
		
		return Long.parseLong(money);
		// 20000000
	} // end of public static long delete_character(String str)------------------------------------------


	
	// === 숫자에 3자리 마다 , 를 추가해서 문자열로 리턴시켜주는 메소드 생성하기 === //
	
	public static String append_comma(long num) {
		
		// 숫자를 문자열로 변경시켜주는 메소드
		// Integer.toString(12345); ==> "12345"
		// Long.toString(12345678901234567890L); ==> "12345678901234567890"
		
		// String.valueOf(12345);  // int 타입을 String 타입인 "12345" 바꿈
		// String.valueOf(12345678901234567890L); ==> "12345678901234567890" int 를 long 타입으로 바꿈
		
		String temp = String.valueOf(num);
		// num 이 2500000 이라면 temp 는 "2500000"
	    // num 이 892500000 이라면 temp 는 "892500000"
		
		char[] origin_arr = temp.toCharArray();
		
		/*
		  ---------------				-------------------
		  |2|5|0|0|0|0|0|				|8|9|2|5|0|0|0|0|0|
		  ---------------				-------------------
		   글자길이 7/3 = 2				   글자길이 9/3-1=2
		*/
		
		// 콤마개수 (글자길이에 맞춰 콤마가 들어감)
		int comma_len = (origin_arr.length%3 == 0)?(origin_arr.length/3)-1:(origin_arr.length/3);
		char[] result_arr = new char[origin_arr.length + comma_len];
		
		/*
		  -------------------				-----------------------
		  |2|,|5|0|0|,|0|0|0|				|8|9|2|,|5|0|0|,|0|0|0|
		  -------------------				-----------------------
		  
		*/
		// 콤마가 들어가는 자리는 4, 8... 4의 배수자리, 뒤에서부터 콤마찍기
		for(int i = origin_arr.length-1, j = result_arr.length-1, count = 1; i>=0; i--, j--, count++) {	
			if(count%4 != 0) {
				result_arr[j] = origin_arr[i];	
			}	
			else {
				result_arr[j] = ',';
			// i?? 콤마를 중간에 끼웠기 때문에 i 가 감소해서는 안됨
				i++;
			}
			
		// |'2'|','|'5'|'0'|'0'|','|'0'|'0'|'0'|
						
		} // end of for---------------------------------------------
	
		return String.valueOf(result_arr);
		
	} // end of public static String append_comma(long num)----------------------------------------



	// === 주민번호 7자리를 입력받아서 올바른 데이터인지 검사해주는 메소드 생성 === //
	public static boolean isCheckJubun(String jubun) {
		
		// jubun 의 길이는 7자리 이면서 마지막 7번째에 들어오는 문자는 "1" "2" "3" "4" 중에 하나이어야 한다.
		if(jubun.length() != 7) {
			return false;
		}
		else if( !("1".equals(jubun.substring(6)) || "2".equals(jubun.substring(6)) || 
				   "3".equals(jubun.substring(6)) || "4".equals(jubun.substring(6))) ) {  // 1,2,3,4가 모두 아닌경우
			return false;
		}
		else {
			String str_birthday = "";
			if( "1".equals(jubun.substring(6)) || "2".equals(jubun.substring(6)) ) {
				str_birthday = "19" + jubun.substring(0, 6);
			}
			else {
				str_birthday = "20" + jubun.substring(0, 6);
			}
				
			SimpleDateFormat sdformat = new SimpleDateFormat("yyyyMMdd");
			sdformat.setLenient(false);
			// false 로 해주어야만 입력한 값을 날짜 타입으로 변경할때 날짜로 되지 못하는 값일 경우 오류가 발생한다.
			// 날짜로 파싱될 때 허술하게 하지 말고 엄격하게 하라고 설정해주는 것이라고 생각하면 된다. 
			
			
			// === 문자열을 날짜 형태로 변환하기 === //
			
			try {
				Date birthday = sdformat.parse(str_birthday); 
				
				// 현재날짜(연월일)와 회원의 생일 날짜를 비교해서 회원의 생일 날짜가 현재날짜보다 이후라면 안된다.
				Date now = new Date(); 		// 현재날짜시각
				String str_now = sdformat.format(now);		// 20240131
				now = sdformat.parse(str_now);
				
			     if(birthday.compareTo(now) > 0) {			// 생년월일이 현재일 보다 미래인 경우
				        return false;
				     }
				     else {									// 생년월일이 현재일이거나 또는 생년월일이 현재일 보다 과거인 경우
				    	 return true;
				     }
				
			} catch (ParseException e) {				
				return false;
				
			} // end of try_catch----------------------------------------	
			
		}
		
	} // end of public static boolean isCheckJubun(String jubun)----------------------------------------
		

	
	
	// === 입력받은 주민번호(7자리)를 가지고 만나이 구해주는 메소드 === //
	public static int age(String jubun) {
	      
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
	
	
	
	
	
}
	