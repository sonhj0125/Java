package my.day13.a.inheritance;

import java.util.Scanner;

public class Ctrl_gujikja extends Ctrl_common {
	
	// == 구직자(Gujikja) 신규 회원가입시
	//    Gujikja 클래스의 field 의 요구사항에 모두 맞으면
	//    Gujikja[] gu_arr 에 저장시켜주는 메소드 생성하기 ==
	void register(Scanner sc, Gujikja[] gu_arr) {
		
		if(Gujikja.count < gu_arr.length) { // 지금까지 생성된 구직자 회원수가 gu_arr.length(==>정원) 보다 적을 경우에만 신규회원을 받아들인다.
		    
			Gujikja gu = new Gujikja();
			
			// 아이디는 필수 입력사항이면서 아이디 조건에 맞을때 까지 반복해야 한다.
			outer:
			do {
				System.out.print("1.아이디 : ");
				String id = sc.nextLine();
				
				// == 중복 아이디 검사하기 시작 == //
				for(int i=0; i<Gujikja.count; i++) {
					
					if( id.equals(gu_arr[i].getId()) ) {
						System.out.println(">> 이미 사용중인 아이디 이므로 다른 아이디값을 입력하세요!!\n");
						continue outer;
					}
					
				}// end of for-------------------
				// == 중복 아이디 검사하기 끝 == //
				
				gu.setId(id);
				
			} while(!(gu.getId() != null));
			
			
			// 비밀번호는 필수 입력사항이면서 비밀번호 조건에 맞을때 까지 반복해야 한다.
			do {
				System.out.print("2.비밀번호 : ");
				String passwd = sc.nextLine();
				
				gu.setPasswd(passwd);
				
			} while(!(gu.getPasswd() != null));
			
			
			// 성명은 필수 입력사항이므로 그냥 엔터나 공백만으로 된 것이 아닐때 까지 반복해야 한다.
		    // 성명은 2글자 이상 6글자 이하의 한글로만 되어져야 한다.
			do {
				System.out.print("3.성명 : ");
				String name = sc.nextLine();
				
				gu.setName(name);
				
			} while(!(gu.getName() != null));
			
			
			// 주민번호는 필수 입력사항이면서 주민번호 조건에 맞을때 까지 반복해야 한다.
			do {
				System.out.print("4.주민번호 : ");
				String jubun = sc.nextLine();
				
				gu.setJubun(jubun);
				
			} while(!(gu.getJubun() != null));
			
			////////////////////////////////////////////////
			
			gu_arr[Gujikja.count++] = gu;
			
			System.out.println(">> 구직자 회원가입 성공 !! <<\n");
			
		}
		else { // 지금까지 생성된 구직자 회원수가 gu_arr.length(==>정원) 와 같거나 큰 경우에만 신규회원을 받아들이면 안된다.
			System.out.println(">> 정원 "+ gu_arr.length + "명이 꽉차서 구직자 회원가입이 불가합니다.!! <<\n");
		}
		
	}// end of void register(Scanner sc, Gujikja[] gu_arr)------------


	// == 구직자 로그인 메소드 생성하기 == // 
	public Gujikja login(Scanner sc, Gujikja[] gu_arr) {
		
		System.out.print("▷ 구직자 ID : ");
		String id = sc.nextLine();
		
		System.out.print("▷ 비밀번호 : ");
		String passwd = sc.nextLine();
		
		for(int i=0; i<Gujikja.count; i++) {
			
			if(id.equals(gu_arr[i].getId()) &&
			   passwd.equals(gu_arr[i].getPasswd()) ) {
				  return gu_arr[i];
			}
			
		}// end of for----------------------
		
		return null;
	}// end of public Gujikja login(Scanner sc, Gujikja[] gu_arr)------------


	
	// == 구직자 전용메뉴 메소드 생성하기 == //
	public void gu_menu(Scanner sc, Gujikja login_gu, Company[] cp_arr) {
		
		String str_menuno;
		do {
			System.out.println("\n === 구직자 전용메뉴("+ login_gu.getName() +"님 로그인중) ===\n"
			                 + "1.내정보 보기   2.내정보 수정   3.모든구인회사 조회    4.구인회사검색하기    5.로그아웃\n");  
			System.out.print("▷ 메뉴번호 선택 : ");
			str_menuno = sc.nextLine();
			
			switch (str_menuno) {
				case "1": // 내정보 보기
					view_myInfo(login_gu);
					break;
					
				case "2": // 내정보 수정
					update_myInfo(sc, login_gu);
					break;	
					
				case "3": // 모든구인회사 조회
					view_all_company_info(cp_arr);
					break;	
					
				case "4": // 구인회사검색하기
					search_company(sc, cp_arr);
					break;
					
				case "5": // 로그아웃
					login_gu = null;
					break;					
	
				default:
					System.out.println(">> [경고] 선택하신 번호는 메뉴에 없습니다. <<\n");
					break;
			}// end of switch (str_menuno)-----------------------
			
		} while(!"5".equals(str_menuno));
		// end of do~while-----------------------------
		
		System.out.println(">> 로그아웃 되었습니다. <<\n");
		
	}// end of public void gu_menu(Scanner sc, Gujikja login_gu, Company[] cp_arr)--------------

	
	// 내정보 보기
	private void view_myInfo(Gujikja login_gu) {
	/*
	     
	     >>> 엄정화님의 정보 <<<
	     -------------------------------------
	       아이디    비밀번호      성명    주민번호  
	     -------------------------------------  
	       eomjh   qWer1234$   엄정화   8610202
	*/
		
		System.out.println(">>> "+ login_gu.getName() +"님의 정보 <<<");
		System.out.println("-".repeat(50));
		System.out.println("  아이디    비밀번호      성명    주민번호 ");
		System.out.println("-".repeat(50));
		System.out.println(login_gu.getId()+"\t"+
				           login_gu.getPasswd()+"\t"+
				           login_gu.getName()+"\t"+
				           login_gu.getJubun());
		
	}// end of private void view_myInfo(Gujikja login_gu)-----------------
	
	
	// 내정보 수정
	private void update_myInfo(Scanner sc, Gujikja login_gu) {
	
		view_myInfo(login_gu);
		
		System.out.println("\n>> [주의사항] 변경하지 않고 예전의 데이터값을 그대로 사용하시려면 그냥 엔터하세요!!\n");
		
		boolean exit_ok = false;
		do {
			//////////////////////////////////////////////////////////////
			System.out.print("1.비밀번호 : ");
			String new_passwd = sc.nextLine();  // 기존비밀번호인 qWer1234$ 을 qWer0070$ 으로 변경하려고 한다.
			                                    // 기존비밀번호인 qWer1234$ 을 qWer1234$ 으로 변경하려고 하려면 기존암호와 동일하므로 변경이 불가합니다. 
			                                    // 기존비밀번호인 qWer1234$ 을 변경하기 싫다. 
			                                    // 기존비밀번호인 qWer1234$ 을 abcd 로 변경하고자 할때는 비밀정책에 맞지 않으므로 안된다.!! 
			
			if(!new_passwd.equals("")) { // 입력한 비밀번호가 엔터가 아닐 경우 
				
				if(login_gu.getPasswd().equals(new_passwd) ) { // 입력한 비밀번호가 기존 비밀번호와 같을 경우 
					System.out.println(">> 기존암호와 동일하므로 변경이 불가합니다.!!");
				}
				else {
					login_gu.setPasswd(new_passwd);
					
					if(login_gu.getPasswd().equals(new_passwd)) {
						exit_ok = true;
					}
				}
				
			}
			
			else { // 입력한 비밀번호가 엔터일 경우
				exit_ok = true;
			}
		  //////////////////////////////////////////////////////////////
		} while(!exit_ok);
		// end of do~while-------------------------------------------
		
		
		exit_ok = false;
		do {
			////////////////////////////////////////////////////////////////////
			System.out.print("2.성명 : ");
			String new_name = sc.nextLine(); // 기존성명인 엄정화 를 엄화정 으로 변경하려고 한다.
	                                         // 기존성명인 엄정화 를 엄정화로 변경하려고 하려면 기존성명과 동일하므로 변경이 불가합니다. 
	                                         // 기존성명인 엄정화 을 변경하기 싫다. 
	                                         // 기존성명인 엄정화를 엄JungHwa 로 변경하고자 할때는 성명정책에 맞지 않으므로 안된다.!!
			
			if(!new_name.equals("")) { // 입력한 성명이 엔터가 아닐 경우 
				
				if(login_gu.getName().equals(new_name) ) { // 입력한 성명이 기존 성명과 같을 경우 
					System.out.println(">> 기존성명과 동일하므로 변경이 불가합니다.!!");
				}
				else {
					login_gu.setName(new_name);
					
					if(login_gu.getName().equals(new_name)) {
						exit_ok = true;
					}
				}
				
			}
			
			else { // 입력한 성명이 엔터일 경우
				exit_ok = true;
			}
          ////////////////////////////////////////////////////////////////////
		} while(!exit_ok);
        
		
		
		exit_ok = false;
		do {
			////////////////////////////////////////////////////////////////////
			System.out.print("3.주민번호 : ");
			
			String new_jubun = sc.nextLine(); 
	
			if(!new_jubun.equals("")) {  
	
				if(login_gu.getJubun().equals(new_jubun) ) {  
					System.out.println(">> 기존주민번호와 동일하므로 변경이 불가합니다.!!");
				}
				else {
					login_gu.setJubun(new_jubun);
					
					if(login_gu.getJubun().equals(new_jubun)) {
						exit_ok = true;
					}
				}
	
			}
			
			else { // 입력한 주민번호가 엔터일 경우
				exit_ok = true;
			}
			/////////////////////////////////////////////////////////////////	
		} while(!exit_ok);
		
		
	}// end of private void update_myInfo(Scanner sc, Gujikja login_gu)------	
	
	
	// 모든구인회사 조회
	private void view_all_company_info(Company[] cp_arr) {
		
		if(Company.count == 0) {
			System.out.println(">> 구인회사로 등록된 회사가 한개도 없습니다. << \n");
		}
		
		else {
			title_company();
			
			StringBuilder sb = new StringBuilder();
			
			for(int i=0; i<Company.count; i++) {
				sb.append(cp_arr[i].getInfo()+"\n"); 
			}// end of for--------------
			
			System.out.println(sb.toString());
		}
		
	}// end of private void view_all_company_info(Company[] cp_arr)------


	private void title_company() {
		
		System.out.println("=".repeat(70));
		System.out.println(" 회사명   업종   사업자등록번호   자본금");
		System.out.println("=".repeat(70));
		
	}// end of private void title_company()-------------------------------
	
	
	// 구인회사검색하기
	private void search_company(Scanner sc, Company[] cp_arr) {
		
		String str_menuno = "";		
		
		do {
			///////////////////////////////////////////////////////////////////
			System.out.println(">>> 구인회사 검색메뉴 <<<\n"
					         + "1. 업종검색    2.자본금검색    3.구직자메뉴로 돌아가기"); 
			System.out.print("▷ 검색메뉴번호 입력 : ");
			str_menuno = sc.nextLine();
			
			switch (str_menuno) {
				case "1": // 업종검색
					search_jobtype_company(sc, cp_arr);
					break;
					
				case "2": // 자본금검색
					search_seedmoney_company(sc, cp_arr);
					break;
					
				case "3": // 구직자메뉴로 돌아가기
					
					break;				
		
				default:
					System.out.println(">>[경고] 구인회사 검색메뉴없는 번호 입니다.<<\n");
					break;
			}// end of switch(str_menuno)-------------------------------
	        ///////////////////////////////////////////////////////////////////
		} while(!"3".equals(str_menuno));
		
	}// end of private void search_company(Scanner sc, Company[] cp_arr)----------	

	
	// 업종검색
	private void search_jobtype_company(Scanner sc, Company[] cp_arr) {
		
		System.out.print("▷ 업종명 : ");
		String job_type_name = sc.nextLine().toLowerCase();
		
		StringBuilder sb = new StringBuilder();
		boolean is_existence = false;
		for(int i=0; i<Company.count; i++) {
			if(cp_arr[i].getJob_type().toLowerCase().contains(String.join("", job_type_name.split("\\ ")))) {
				is_existence = true;
				sb.append(cp_arr[i].getInfo()+"\n");
			}
		}// end of for----------------------------
		
		if(is_existence) {
			title_company();
			System.out.println(sb.toString());
		}
		else {
			System.out.println(">> 검색하시려는 "+ job_type_name +"업종에 해당하는 회사는 없습니다.!!\n");
		}
		
	}// end of private void search_jobtype_company(Company[] cp_arr)------

	
	// 자본금검색
	private void search_seedmoney_company(Scanner sc, Company[] cp_arr) {
		
		System.out.print("▷ 자본금 : ");
		String str_search_seed_money = sc.nextLine();
		
		try {
			long search_seed_money = Long.parseLong(str_search_seed_money);
			
			StringBuilder sb = new StringBuilder();
			boolean is_existence = false;
			
			for(int i=0; i<Company.count; i++) {
				if( search_seed_money <= cp_arr[i].getSeed_money() ) {
					is_existence = true;
					sb.append(cp_arr[i].getInfo()+"\n");
				}
			}// end of for----------------------------
			
			if(is_existence) {
				title_company();
				System.out.println(sb.toString());
			}
			else {
				System.out.println(">> 검색하시려는 자본금이 "+ str_search_seed_money +"원 이상인 회사는 없습니다.!!\n");
			}
			
		} catch(NumberFormatException e) {
			System.out.println(">>[경고] 자본금은 정수로만 입력하세요!!<< \n");
		}
		
	}// end of private void search_seedmoney_company(Company[] cp_arr)------

	
	
}
