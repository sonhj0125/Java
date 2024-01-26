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
		int mbr_cnt = 0;
		
	/*	
		for(int i=0; i<arr_mbr.length; i++) {
			System.out.println(arr_mbr[i]);
		} // end of for--------------------------
    */
		
		Scanner sc = new Scanner(System.in);
		
		String choice_num = "";
				
		String str_menu_no = "";
		
		do {		
			System.out.println("\n============= >> 메뉴 << =============\n"
							+  "1. 회원가입   2. 모든회원조회   3. 프로그램 종료\n"
							+  "=======================================");
			
			System.out.print("▶ 선택하세요 => ");
			str_menu_no =  MyUtil.space_delete(sc.nextLine()); // 공백제거
			
			
			switch (str_menu_no) {
			
			case "1":    // 회원가입
				
				if(mbr_cnt < arr_mbr.length) {
									
					String id = "";
					
					id_outer:
					do {
						System.out.print("\n▶ 아이디 : ");			
						id = sc.nextLine();
					
						if(id.trim().isEmpty()) {
							System.out.println(">>[경고] 아이디 값을 공백이 아닌 다른 값으로 입력하세요.\n");
						}						
						else {							
							/*
							  // == 입력한 아이디 중복 방지 검사하기 == 
							   
							  // boolean isDuplicate_id = false;
							  
							  for(int i=0; i<mbr_cnt; i++) { 
							  	if(id.equals(arr_mbr[i].id)) {
							  		System.out.println(">> "+id+"는 이미 사용중인 id 이므로 새로운 id값을 입력하세요. <<");
							  isDuplicate_id = true; // 아이디가 중복되었으면 break break; // for 문을 빠져나옴
							   
							   }
							  
							  } // end of for-------------------------------------
							  
							  if(!isDuplicate_id) 
							  // 아이디 중복 false 일 때 break; 
							  // 아이디가 중복되지 않았을 때 do_while 문을 빠져나옴
							 */
							
							//////////////////////////////////////////////////////////////
							
							// == 입력한 아이디 중복 방지 검사하기 2번쨰 방법 == //			
							
							for(int i=0; i<mbr_cnt; i++) {
								if(id.equals(arr_mbr[i].id)) {
									System.out.println(">> "+id+"는 이미 사용중인 id 이므로 새로운 id값을 입력하세요.");
									continue id_outer;	// do_while 문 앞에 id_outer:(조건식)으로 이동					
								} 	
								
							} // end of for-------------------------------------
							
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
					// end of do_while----------------------------------------------------------		
							
					// 공백이 없는 한글로만 되어야 하고 글자길이는 2글자 이상 6글자 이하이어야만 한다.
						
			/*			if(name.length() < 2 || name.length() > 6) {
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
			*/
									
					String name = "";
					do {	
							System.out.print("▶ 성명 : ");
							name = sc.nextLine();
							
						boolean isUseName = true;
						
						if(name.length() < 2 || name.length() > 6 ) {
							isUseName = false;
						}
						else { // 입력한 성명의 길이가 2글자 이상 6글자 이하인 경우
							for(int i=0; i<name.length(); i++) {
								if( !('가' <= name.charAt(i) && name.charAt(i) <= '힣') ) {  // 한글을 뺀 나머지인 경우
									isUseName = false;
									break;
								}
							} // end of for------------------------------------
						}
					
						if(isUseName) {
							break;
						}
						else {
							System.out.println(">>[경고] 성명은 공백이 없는 한글로만 2글자 이상 6글자 이하로 입력하세요.\n");
						}
											
					} while(true);
					// end of do_while-----------------------------------------------------
					
					Member mbr = new Member();
					mbr.id = id;
					mbr.passwd = passwd;
					mbr.name = name;
								
					arr_mbr[mbr_cnt++] = mbr;
					
					System.out.println(">> 회원가입 성공! <<\n");
					
				} // end of if------------------------------
				
				else {
					System.out.println(">> 회원가입 정원이 마감되어 가입이 불가합니다.");
				}
				
				break; // switch 문을 빠져나간다.
				
			case "2":    // 모든회원조회			
			
				if(mbr_cnt == 0) {
					System.out.println(">> 가입된 회원이 없습니다. <<");
				}
				else {
					System.out.println("---------------------------------\n"
							         + "아이디	    비밀번호	   성명\n"
							         + "---------------------------------");
					for(int i=0; i<mbr_cnt; i++) {
					
						System.out.println(arr_mbr[i].view_info());     // Member 파일에 method
						
					} // end of for-------------------------
					
				}			
				
				/*
				   >> 가입된 회원이 없습니다. <<
				*/
				
			
				/*
				   -----------------------
				   아이디	    비밀번호	   성명
				   -----------------------
				   leess  Qwer1234$   이순신
				   eomjh  Abcd1234$   엄정화
				   youks  Qwer1234$	  유관순
				*/
					
				break; // switch 문을 빠져나간다.
			case "3":    // 프로그램 종료
				
				break; // switch 문을 빠져나간다.
				
			default:     // 메뉴에 존재하지 않는 값
				System.out.println(">> [경고] 메뉴에 없는 것입니다. <<\n");
				
				break; // switch 문을 빠져나간다.
			} // end of switch------------------------------------
				
			
			
		} while ( !("3".equals(str_menu_no)) );   // 입력한 메뉴번호가 3번이라면 반복문을 빠져나와야 한다.
		// end of do_while-------------------------------------
		sc.close();
			System.out.println("\n>> 프로그램 종료 <<");
		
		
	} // end of main()-------------------------------------------------------

}
