package my.day08.c.object_array;

import java.util.Scanner;

import my.util.MyUtil;

public class Main_Member {

	public static void main(String[] args) {
		
	//	System.out.println("시작"+ MyUtil.space_delete(" 이 순 신 ") + "끝");
		
	//	System.out.println("시작"+ MyUtil.space_delete(null) + "끝");

/*		
		System.out.println("시작" +"       " + "끝");
		System.out.println("시작" +"         ".trim()+ "끝");
		
		
		System.out.println("시작" +"    중    간       " + "끝");
		System.out.println("시작" +"    중    간       ".trim()+ "끝");
		
		
		System.out.println("".isEmpty());            // true
		System.out.println("  하하    ".isEmpty());   // false
		System.out.println("         ".trim().isEmpty());   // true
		System.out.println("   하     ".trim().isEmpty());   // false
		System.out.println("".trim().isEmpty());            // true
		
*/
		
		// int[] arr_subject = new int[7];
		Member[] arr_mbr = new Member[3];
		
	/*	
		for(int i=0; i<arr_mbr.length; i++) {
			System.out.println(arr_mbr[i]);
		} // end of for--------------------------
    */
		
		Scanner sc = new Scanner(System.in);
		
		String choice_num = "";
				
		String str_menu_no = "";
		
		do {		
			System.out.println("\n=============== >> 메뉴 << ====================\n"
							+  "1. 회원가입		2. 모든회원조회			3. 프로그램 종료\n"
							+  "==================================================");
			
			System.out.print("▶ 선택하세요 => ");
			str_menu_no =  MyUtil.space_delete(sc.nextLine()); // 공백제거
			
			switch (str_menu_no) {
			case "1":    // 회원가입
				
				String id = "";
				do {
					System.out.print("\n▶ 아이디 : ");			
					id = sc.nextLine();
				
					if(id.trim().isEmpty()) {
						System.out.println(">>[경고] 아이디 값을 공백이 아닌 다른 값으로 입력하세요.\n");
					}
					else {
						break;
					}
				} while(true);
				
				
				String passwd = "";
				do {
					System.out.print("▶ 비밀번호 : ");   // 최소 8글자 이상 15글자 이하의 영문 소,대,숫,특수문자 혼합
					passwd = sc.nextLine();
					
					if( !MyUtil.isCheckPasswd(passwd) ) {
						System.out.println("\n>>[경고] 비밀번호는 8글자 이상 15글자 이하의 영문 대문자, 소문자, 숫자, 특수기호를 포함하세요.");
					}
					else 
						break;
					
				} while(true);
						
						
				// 공백이 없는 한글로만 되어야 하고 글자길이는 2글자 이상 6글자 이하이어야만 한다.
				
				
				String name = "";
				do {	
					System.out.print("▶ 성명 : ");
					name = sc.nextLine();
					
					if(name.length() < 2 || name.length() < 6) {
						System.out.println(">>[경고] 글자길이는 2글자 이상 6글자 이하로 하세요.");
						continue;
					}
					
					boolean flag_name = false;
					for(int i=0; i<name.length(); i++) {
						if('가' <= name.charAt(i) && name.charAt(i) <= '힣') {
							flag_name = true;
						}
					} // end of for--------------
						
						if(!flag_name) {
							System.out.println(">>[경고] 공백이 없는 한글로만 되어야 합니다.");							
						}
						else 
							break;					
				} while(true);
				// end of do_while--------------------
				
				
				
				Member mbr = new Member();
				mbr.id = id;
				mbr.passwd = passwd;
				mbr.name = name;
								
				break;
			case "2":    // 모든회원조회			
			
				break;
			case "3":    // 프로그램 종료
				
				break;
				
			default:     // 메뉴에 존재하지 않는 값
				System.out.println(">> [경고] 메뉴에 없는 것입니다. <<\n");
				
				break;
			} // end of switch------------------------------------
				
			
			
		} while ( !("3".equals(str_menu_no)) );   // 입력한 메뉴번호가 3번이라면 반복문을 빠져나와야 한다.
		// end of do_while-------------------------------------
		
			System.out.println("\n>> 프로그램 종료 <<");
		
		
	} // end of main()-------------------------------------------------------

}
