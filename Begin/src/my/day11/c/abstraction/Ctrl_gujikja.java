package my.day11.c.abstraction;

//실행하는 방식은 여기서 만듦. Main 메소드를 실행하기 위해

import java.util.Scanner;

import my.util.MyUtil;


public class Ctrl_gujikja {
	
	// == 메인 메뉴를 보여주는 메소드 생성하기 == //
	
	void main_menu() {
		System.out.println("\n === 메인메뉴 ===\n"
						+ "1. 구직자 회원가입   2. 구직자 모두보기   3. 검색하기   4. 프로그램 종료\n");
		System.out.print("▶ 메뉴번호 선택 : ");		
	} // end of void main_menu()----------------------------------------------------------

	
	
	// == 구직자(Gujikja) 신규 회원가입시 
	// Gujikja 클래스의 field 의 요구사항에 모두 맞으면,
	// Gujikja[] gu_arr 에 저장시켜주는 메소드 생성하기 == //
	
	void register(Scanner sc, Gujikja[] gu_arr) {
		
		if(Gujikja.count < gu_arr.length) { 		// 5명이 넘으면 회원가입 불가, 지금까지 생성된 구직자 회원수가 gu_arr.length(==>정원) 보다 적을 경우에만 신규회원을 받아들인다.
			
			String userid;
			String passwd;
			String name;
			String jubun;
			
			boolean isUse_userid;
			
				do {
					isUse_userid = true;				// 초기화
					System.out.print("1. 아이디 : ");
					userid = sc.nextLine();		// 사용중인 아이디 "eomjh", "leess", "chaew" 입력 불가하므로 중복 방지 필요
														// 또는 "" 이거나 " "(공백) 인 경우 입력 불가
					
					
					
					
					// == 가입된 회원들에 대해 중복아이디 검사하기 == //
			
					// if(userid.trim().isEmpty()) {} => jdk 1.8
					if(userid.isBlank()) { // jdk 11
						System.out.println(">> 아이디는 필수 입력사항 입니다. <<\n");
						isUse_userid = false;
					}
					else {
						
						for(int i=0; i<Gujikja.count; i++) {
							if( userid.equals(gu_arr[i].userid) ) {
								System.out.println(">> 이미 사용중인 아이디 입니다. <<\n");
								isUse_userid = false;
								break;
							}
							
						} // end of for---------------------------------
			
					}
	
				} while(!isUse_userid);
				// end of do_while---------------------------------------------
				
				
				
				
				
				// 비밀번호는 필수 입력사항이면서 비밀번호 조건에 맞을 때 까지 반복해야 한다.
				boolean isUse_passwd;
				do {
					isUse_passwd = true;
					System.out.print("2. 비밀번호 : ");
					passwd = sc.nextLine();			// "Qw12$"  "Qwer1234sdfsdfdsfsfsdf$"  "qwer1234$"  "qWer1234$"
					
					if ( !MyUtil.isCheckPasswd(passwd) ) {
						System.out.println("[경고] 비밀번호는 8글자 이상 15글자 이하의 대,소문자,숫자,특수기호가 혼합되어야만 합니다.\n");
						isUse_passwd = false;
					}
										
				} while (!isUse_passwd);
				// end of do_while----------------------------------------------
				
				
				
				
				
				// 성명은 필수 입력사항이므로 그냥 엔터나 공백만으로 된 것이 아닐때 까지 반복해야 한다.
				// 성명은 2글자 이상 6글자 이하의 한글로만 되어져야 한다.
				
				
				boolean isUse_name;
				do {
					isUse_name = true;
					System.out.print("3. 성명 : ");
					name = sc.nextLine();			
					
					if(name.isBlank()) {
						isUse_name = false;
					}
					else {
						char[] ch_arr = name.toCharArray();
						
						if(2 <= ch_arr.length && ch_arr.length <= 6) {
							
							for(int i=0; i<ch_arr.length; i++) {
								if ( !('가' <= ch_arr[i] && ch_arr[i] <= '힣') ) {
									isUse_name = false;
									break;
								}
								
							} // end of for---------------------------------------
							// 한글이라면 for 문에 걸리지 않고 빠져나옴
							
						}
						else {
							isUse_name = false;						
						}
					}
	
					if(!isUse_name) {
						System.out.println("[경고] 성명은 공백 없이 한글로만 2글자 이상 6글자 이하이어야 합니다.");
					}
														
				} while (!isUse_name);
				// end of do_while----------------------------------------------
				
				
				
				
				
				// 주민번호는 필수 입력사항이면서 주민번호 조건에 맞을때까지 반복해야 한다.
				
				boolean isUse_jubun;
				do {
					isUse_jubun = true;
					System.out.print("4. 주민번호 : ");
					jubun = sc.nextLine();		
					
					/*
					 * if ( !MyUtil.isCheckJubun(jubun) ) {
					 * System.out.println("[경고] 올바른 주민번호를 입력해주세요. \n"); isUse_jubun = false; }
					 */
										
				} while (!isUse_jubun);
				// end of do_while----------------------------------------------
				
				
				Gujikja gu = new Gujikja();
				gu.userid = userid;
				gu.passwd = passwd;
				gu.name = name;
				gu.jubun = jubun;
								
				gu_arr[Gujikja.count++] = gu; 
				
				System.out.println(">> 구직자 회원가입 성공 <<\n");
				
				
			}	
		 
					
		else {	// 지금까지 생성된 구직자 회원수가 gu_arr.length(==>정원) 와 같거나 큰 경우에는 신규회원을 받아들이면 안된다.
			System.out.println(">> 정원 "+ gu_arr.length + "명이 꽉차서 구직자 회원가입이 불가합니다. <<\n");
		}
		
	} // end of void register(Scanner sc, Gujikja[] gu_arr)--------------------------------
	

}
