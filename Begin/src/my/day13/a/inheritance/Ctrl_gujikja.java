package my.day13.a.inheritance;

//실행하는 방식은 여기서 만듦. Main 메소드를 실행하기 위해

import java.util.Scanner;

public class Ctrl_gujikja extends Ctrl_common {
	

	// == 구직자(Gujikja) 신규 회원가입시 
	// Gujikja 클래스의 field 의 요구사항에 모두 맞으면,
	// Gujikja[] gu_arr 에 저장시켜주는 메소드 생성하기 == //
	
	void register(Scanner sc, Gujikja[] gu_arr) {
		
		if(Gujikja.count < gu_arr.length) { 		// 5명이 넘으면 회원가입 불가, 지금까지 생성된 구직자 회원수가 gu_arr.length(==>정원) 보다 적을 경우에만 신규회원을 받아들인다.
			
			Gujikja gu = new Gujikja();
						
			
			// == 아이디 입력 == //
			outer:
			do {
				System.out.print("1. 아이디 : ");
				String id = sc.nextLine();	
				
				// 중복 아이디 검사하기 시작 //
				for(int i=0; i<Gujikja.count; i++) {
					
					if( id.equals(gu_arr[i].getId()) ) {
						System.out.println(">> 이미 사용중인 아이디이므로 다른 아이디를 입력하세요. <<\n");
						continue outer;
					}
					
				} // end of for--------------------------------
				// 중복 아이디 검사하기 끝 //
								
				gu.setId(id);
				
			} while( !(gu.getId() != null) );
			// end of do_while----------------------------------------------

			
			
		
			// == 비밀번호 입력 == //
			do {
				System.out.print("2. 비밀번호 : ");
				String passwd = sc.nextLine();		
				
				gu.setPasswd(passwd);
				
			} while ( !(gu.getPasswd() != null) ); // null 이 아닌게 아닐동안 돌다가 빠져나가라.
			// end of do_while----------------------------------------------
				
			
			
			// == 성명 입력 == //
			do {
				System.out.print("3. 성명 : ");
				String name = sc.nextLine();			
				
				gu.setName(name);
							
			} while ( !(gu.getName() != null) );
			// end of do_while----------------------------------------------
				
			
							
			// == 주민번호 입력 == //
			do {
				System.out.print("4. 주민번호 : ");
				String jubun = sc.nextLine();		
								
				gu.setJubun(jubun);
									
			} while ( !(gu.getJubun() != null) );
			// end of do_while----------------------------------------------
			
			// 객체 하나를 만들었음.
				
			
				gu_arr[Gujikja.count++] = gu; 	// 만든 객체를 저장소에 넣음
				
				System.out.println(">> 구직자 회원가입 성공 <<\n");				
				
			}			 
					
		else {	// 지금까지 생성된 구직자 회원수가 gu_arr.length(==>정원) 와 같거나 큰 경우에는 신규회원을 받아들이면 안된다.
			System.out.println(">> 정원 "+ gu_arr.length + "명이 꽉차서 구직자 회원가입이 불가합니다. <<\n");
		}
		
	} // end of void register(Scanner sc, Gujikja[] gu_arr)--------------------------------


	
	// == 구직자 모두보기 메소드 == //
	void view_all_info(Gujikja[] gu_arr) {
		
		/*
		  ------------------------------------------------------------------------------
		  아이디	    비밀번호       성명      생년월일      성별    현재나이(만)        가입일자
		  ------------------------------------------------------------------------------
		  eomjh   qWe******		엄정화	961020		여성		 27	     2024-01-31 10:30:40
		  leess   abC*******	이순신	960120		남성		 28		 2024-01-31 10:30:40
		  chaew	  aSd******		차은우	010620		남성		 22		 2024-01-31 10:30:40	
		  ------------------------------------------------------------------------------
		*/
		
		if(Gujikja.count == 0) {
			System.out.println(">> 구직자로 가입된 회원이 존재하지 않습니다. <<\n");			
		}
		else {
			title();			
			StringBuilder sb = new StringBuilder();
			
			for(int i=0; i<Gujikja.count; i++) {
				sb.append(gu_arr[i].getinfo()+"\n");			
			} // end of for---------------------------------
			
			System.out.println(sb.toString());
		
		}
	
	} // end of void view_all_info(Gujikja[] gu_arr)--------------------------------
	
	
	
	
	void title() {
		System.out.println("-".repeat(75) + "\n"
						+ "아이디\t비밀번호\t\t성명\t생년월일\t성별\t현재나이(만)\t가입일자 \n"
						+ "-".repeat(75));
		
	}


	// == 검색하기 메뉴를 보여주는 메소드 생성하기 == //
	
	void search_menu(Scanner sc, Gujikja[] gu_arr) {
		
		String str_menuno = "";
		do {
			System.out.println("\n === 검색메뉴 ===\n"
							+ "1. 연령대 검색  2. 성별 검색   3. 연령대 및 성별 검색   4. 메인메뉴\n");
			System.out.print("▶ 검색메뉴번호 선택 : ");		
			
			str_menuno = sc.nextLine();
			
			switch (str_menuno) {
			case "1":	// 연령대 검색
				search_ageLine(sc, gu_arr);			
				break;
				
			case "2":	// 성별 검색
				search_gender(sc, gu_arr);	
				break;	
					
			case "3":	// 연령대 및 성별 검색
				search_ageLine_gender(sc, gu_arr);
				break;
				
			case "4":	// 메인메뉴로 돌아가기
				
				break;

			default:
				System.out.println("[경고] 검색메뉴에 존재하는 번호만 입력해주세요.\n");
				break;
			} // end of switch----------------------------------
			
		} while (!"4".equals(str_menuno));			// "4" 선택 시 반복문 빠져나옴
		// end of do_while--------------------------------------
		
	} // end of void search_menu(Scanner sc, Gujikja[] gu_arr)--------------------------------


	
	
	
	
	// == 1. 연령대 검색해주는 메소드 == // 
	void search_ageLine(Scanner sc, Gujikja[] gu_arr) {
		
		
		if(Gujikja.count == 0) {
			System.out.println(">> 구직자로 가입된 회원이 아무도 없습니다. <<\n");			
		}
		else {		// 구직자가 존재하는 경우
						
			String str_ageLine = "";
			boolean isUse_ageLine = false;
			
			do {		
				System.out.print("▶ 검색하고자 하는 연령대[예: 20] : ");
				str_ageLine = sc.nextLine();		// "0" "10" "20" "30" ... "70" "80" ==> 정상
													// "25" "강아지" "-20"...  ==> 비정상
			
				switch (str_ageLine) {
					case "0"  : 
					case "10" : 
					case "20" : 
					case "30" : 
					case "40" : 
					case "50" : 
					case "60" : 
					case "70" : 
					case "80" :
						isUse_ageLine = true;
						break;

				default:
					System.out.println("[경고] 올바른 연령대를 기입하세요.\n");
					break;
				} // end of switch-----------------------------------
							
			} while (!isUse_ageLine);
			// end of do_while-----------------------------------------
			
			
			// == 입력받은 연령대에 해당하는 구직자 찾기 == //
			StringBuilder sb = new StringBuilder();			
			boolean isSearch = false;
			
			for(int i=0; i<Gujikja.count; i++) {
				int ageLine = gu_arr[i].getAge()/10*10;
				// 					나이/10*10
				//					26/10*10 = 20
				// 					23/10*10 = 20
				
				if( Integer.parseInt(str_ageLine) == ageLine ) {
					isSearch = true;
					sb.append(gu_arr[i].getinfo()+"\n");	
				}
								
			} // end of for-----------------------------
		
			if(isSearch) {
				title();
				System.out.println(sb.toString());
			}
			else {
				System.out.println("[검색결과 연령대 "+str_ageLine+"대인 구직자는 없습니다.]\n");
			}
							
		} // end of if~else----------------------------------		
		
	} // end of void search_ageLine(Scanner sc, Gujikja[] gu_arr)--------------------------------
	
	
	
	
	
	// == 2. 성별을 검색해주는 메소드 == //
	void search_gender(Scanner sc, Gujikja[] gu_arr) {
		
		if(Gujikja.count == 0) { // 구직자가 없는 경우
			System.out.println(">> 구직자로 가입된 회원이 아무도 없습니다. <<\n");			
		}
		else {		// 구직자가 존재하는 경우
			
			String input_gender = "";
			boolean isUse_input_gender = false;
			
			do {		
				System.out.print("▶ 검색하고자 하는 성별[남/여] : ");
				input_gender = sc.nextLine();		// "남" "여" "   남" "   여" ... ==> 정상
													// "" "     " "강아지"...  ==> 비정상
			
				switch (input_gender.trim()) {
					case "남" : 
					case "여" : 
					isUse_input_gender = true;
					input_gender = input_gender.trim();
					break;

				default:
					System.out.println("[경고] 올바른 성별을 기입하세요.\n");
					break;
				} // end of switch-----------------------------------
							
			} while (!isUse_input_gender);
			// end of do_while-----------------------------------------
			
			
			// == 입력받은 연령대에 해당하는 구직자 찾기 == //
			StringBuilder sb = new StringBuilder();			
			boolean isSearch = false;
			
			for(int i=0; i<Gujikja.count; i++) {
				
				if( input_gender.equals(gu_arr[i].getGender()) ) {
					isSearch = true;
					sb.append(gu_arr[i].getinfo() + "\n");
				}
						
			} // end of for-----------------------------
		
			if(isSearch) {
				title();
				System.out.println(sb.toString());
			}
			else {
				System.out.println("[검색결과 성별이 "+ input_gender+ "성인 구직자는 없습니다.]\n");
			} // end of if~else-----------------------------------
		
		} 

	} // end of void search_gender(Scanner sc, Gujikja[] gu_arr)-----------------------------------------------------------
	
	
	
	
	
	
	// == 3. 연령대 및 성별 검색하는 메소드 == //
		
	void search_ageLine_gender(Scanner sc, Gujikja[] gu_arr) {		
		
		// 구직자 존재여부 확인
		if(Gujikja.count == 0) {		// 구직자가 없는 경우
			System.out.println(">> 구직자로 가입된 회원이 아무도 없습니다. <<\n");		
			return;
		}
		else {		// 구직자가 존재하는 경우
			
		// 연령대
		String str_ageLine = "";
		boolean isUse_ageLine = false;
		do {		
			System.out.print("▶ 검색하고자 하는 연령대[예: 20] : ");
			str_ageLine = sc.nextLine();		// "0" "10" "20" "30" ... "70" "80" ==> 정상
												// "25" "강아지" "-20"...  ==> 비정상
		
			switch (str_ageLine) {
				case "0"  : 
				case "10" : 
				case "20" : 
				case "30" : 
				case "40" : 
				case "50" : 
				case "60" : 
				case "70" : 
				case "80" :
					isUse_ageLine = true;
					break;

			default:
				System.out.println("[경고] 올바른 연령대를 기입하세요.\n");
				break;
			} // end of switch(str_ageLine)-----------------------------------
						
		} while (!isUse_ageLine);
		// end of do_while-----------------------------------------
		
		
		// 입력받은 연령대에 해당하는 구직자 찾기 //
		boolean is_ageline_search = false;
		
		for(int i=0; i<Gujikja.count; i++) {
			int ageLine = gu_arr[i].getAge()/10*10;
			
			
			if(Integer.parseInt(str_ageLine) == ageLine) {
				is_ageline_search = true;
				break;
			}
					
		} // end of for------------------------------------
		
		if(!is_ageline_search) { // 검색하고자 하는 연령대에 해당하는 구직자가 존재하지 않는 경우
			System.out.println("[검색결과 연령대 "+str_ageLine+"대인 구직자가 없습니다.]\n");
			return;		// 해당 메소드 종료
		}
		else {	// 검색하고자 하는 연령대에 해당하는 구직자가 존재하는 경우
			
			
			
			// 성별 검색 시작			
			String input_gender = "";
			boolean isUse_input_gender = false;
	
			do {		
				System.out.print("▶ 검색하고자 하는 성별[남/여] : ");
				input_gender = sc.nextLine();														
			
				switch (input_gender.trim()) {
					case "남" : 
					case "여" : 
						isUse_input_gender = true;
						input_gender = input_gender.trim();
						break;
	
				default:
					System.out.println("[경고] \"남\" 또는 \"여\" 만 입력하세요.\n");
					break;
				} // end of switch-----------------------------------
						
			} while (!isUse_input_gender);
			// end of do_while-----------------------------------------
		
		
			// 입력받은 연령대 및 성별에 해당하는 구독자 찾기	 //		
			StringBuilder sb = new StringBuilder();
			boolean is_ageline_gender_Search = false;		
			
			for(int i=0; i<Gujikja.count; i++) {
				
				if( Integer.parseInt(str_ageLine) == gu_arr[i].getAge()/10*10
					&& input_gender.equals(gu_arr[i].getGender()) ) {
					
					is_ageline_gender_Search = true;
					sb.append(gu_arr[i].getinfo() + "\n");			
				}
								
			} // end of for-----------------------------
	
		if(is_ageline_gender_Search) {
			title();
			System.out.println(sb.toString());
		}
		else { 
			System.out.println("[검색결과 연령대 "+str_ageLine+"대인 "+ input_gender +"자 구직자는 없습니다.]\n");
		}		
			// 성별 검색 끝 //
		}
		
		} // end of if~else----------------------------------	
		
	} // end of void search_ageLine_gender(Scanner sc, Gujikja[] gu_arr)-----------------------------------------------------------


	
	
	// == 구직자 로그인 메소드 생성하기 == //
	public Gujikja login(Scanner sc, Gujikja[] gu_arr) {
		
		System.out.print("▶ 구직자 ID : ");
		String id = sc.nextLine();
		
		System.out.print("▶ 비밀번호 : ");
		String passwd = sc.nextLine();
		
		for(int i=0; i<Gujikja.count; i++) {
			if(id.equals(gu_arr[i].getId()) &&
			   passwd.equals(gu_arr[i].getPasswd())) {
				
				return gu_arr[i];			
			}						
		} // end of for--------------------------------------
		
		return null;
		
	} // end of public void login(Scanner sc, Gujikja[] gu_arr)-------------------------------------------------------------------

	
	
	

	// == 구직자 전용메뉴 메소드 생성하기 == //
	public void gu_menu(Scanner sc, Gujikja login_gu, Company[] cp_arr) {

		String str_menuno;
		do {
			System.out.println("\n === 구직자 전용메뉴("+login_gu.getName()+"님 로그인중) ===\n"
					+ "1. 내정보 보기   2. 내정보 수정   3. 모든 구인회사 조회  4. 구인회사 검색 5. 로그아웃\n");
			System.out.print("▶ 메뉴번호 선택 : ");		
			
			str_menuno = sc.nextLine();
			
			switch (str_menuno) {
			case "1":	// 내정보 보기
				view_myInfo(login_gu);
				
				break;
				
			case "2":	// 내정보 수정
				update_myInfo(sc, login_gu);
						
				break;
				
			case "3":	// 모든 구인회사 조회
				view_all_company_Info(cp_arr);
				
				break;
				
			case "4":	// 구인회사 검색
				search_company(sc, cp_arr);
				
				break;
				
			case "5":	// 로그아웃
				
				break;

			default:
				System.out.println(">>[경고] 선택하신 번호는 메뉴에 없습니다. <<\n");
				break;
			} // end of switch----------------------------------
			
		} while(!"5".equals(str_menuno));
		// end of do_while-----------------------------------
		
			System.out.println(">> 로그아웃 되었습니다. <<\n");
		
	} // end of public void gu_menu(Scanner sc, Gujikja login_gu, Company[] cp_arr)-------------------------------------------------------------------



	// == 내정보 보기 == //
	private void view_myInfo(Gujikja login_gu) {
	
		System.out.println("\n\t>>> "+login_gu.getName()+"님의 정보 <<<");
		System.out.println(" --------------------------------------");
		System.out.println(" 아이디\t비밀번호\t\t성명\t주민번호");
		System.out.println(" --------------------------------------");
		System.out.println(login_gu.getId() + "\t"
						 + login_gu.getPasswd() + "\t"
						 + login_gu.getName() + "\t"
						 + login_gu.getJubun() + "\t");
		
	} // end of private void view_myInfo(Gujikja login_gu)-------------------------------------------------------------------

/*
    >>> 엄정화님의 정보 <<<
   --------------------------------------
   아이디    	비밀번호    	성명    	주민번호
   -------------------------------------
   eomjh	qWer1234$	엄정화	8610022
 
*/
	
	
	// == 내정보 수정 == //
	private void update_myInfo(Scanner sc, Gujikja login_gu) {
		
		view_myInfo(login_gu);
		
		System.out.println("\n>> [주의사항] 변경하지 않고 예전의 데이터값을 그대로 사용하시려면, Enter(엔터)를 눌러주세요.\n");
	
		boolean exit_pwd = false;
		do {
			System.out.print("1. 비밀번호 : ");
			String new_passwd = sc.nextLine();		// 기존 비밀번호인 qWer1234$ 을 qWer0070$ 으로 변경하려한다.
													// 기존 비밀번호인 qWer1234$ 을 qWer1234$ 으로 동일하게 변경하려한다. ==> 기존 암호와 동일하므로 변경이 불가하다.
													// 기존 비밀번호를 변경하지 않는다.
													// 기존 비밀번호인 qWer1234$ 을 abcd 으로 변경하고자 할 때는 비밀번호 규칙에 맞지 않으므로, 변경 불가.
			
			if(!new_passwd.equals("")) {			// 입력한 비밀번호가 엔터가 아닐 경우
													// "\r\n" 이 원래 Enter(엔터)
				if(login_gu.getPasswd().equals(new_passwd)) {		// 입력한 비밀번호가 기존과 동일한 경우
					System.out.println(">> 입력하신 비밀번호는 기존 암호와 동일합니다.\n");
					
				}
				else {	// 기존과 동일하지 않은 경우
					login_gu.setPasswd(new_passwd);
					
					if(new_passwd.equals(login_gu.getPasswd())) {		// 바꿔서 설정된 비밀번호와 내가 변경하고자 입력했던 비밀번호가 동일하면 true 출력
						exit_pwd = true;
					}
					
				}
				
			}
			else {		// 입력한 비밀번호가 엔터인 경우
				exit_pwd = true;
			}
			
		} while(!exit_pwd);
		// end of do_while-------------------------------------------------
		
		
		boolean exit_name = false;
		
		do {
			System.out.print("2. 성명 : ");			// 기존 성명인 엄정화를 엄화정으로 변경하려한다.
			String new_name = sc.nextLine();		// 기존 성명인 엄정화를 엄정화로 동일하게 변경하려한다. ==> 기존 성명과 동일하므로 변경이 불가하다.
													// 기존 성명를 변경하지 않는다.
													// 기존 성명인 엄정화을 엄jungHwa로 변경하고자 할 때는 비밀번호 규칙에 맞지 않으므로, 변경 불가.
			if(!new_name.equals("")) {
				
				if(login_gu.getName().equals(new_name)) {
					System.out.println(">> 입력하신 성명은 기존과 동일합니다.");
				}
				else {
					login_gu.setName(new_name);
					if(new_name.equals(login_gu.getName())) {
						exit_name = true;
					}
					
				}
				
			}
			else {		// 입력한 이름이 엔터인 경우
				exit_pwd = true;
			}
		} while(!exit_name);
		// end of do_while-------------------------------------------------
		
		
		
		boolean exit_jubun = false;
		
		do {
			System.out.print("3. 주민번호 : ");
			String new_jubun = sc.nextLine();
			
			if(!new_jubun.equals("")) {
				
				if(login_gu.getJubun().equals(new_jubun)) {
					System.out.println(">> 입력하신 주민번호는 기존과 동일합니다.");
				}
				else {
					login_gu.setJubun(new_jubun);
					if(new_jubun.equals(login_gu.getJubun())) {
						exit_jubun = true;
					}
				}
			}
			else {		// 입력한 주민번호가 엔터인 경우
				exit_jubun = true;
			}
		} while(!exit_jubun);
		// end of do_while-------------------------------------------------
			
	} // end of private void update_myInfo(Scanner sc, Gujikja login_gu)-------------------------------------------------------------------

		
	
	// == 모든 구인회사 조회 == //
	private void view_all_company_Info(Company[] cp_arr) {
		
		if(Company.count == 0) {
			System.out.println(">> 구인회사로 등록된 회사가 존재하지 않습니다.");
		}
		else {
			title_company();
			
			StringBuilder sb = new StringBuilder();
			
			for(int i=0; i<Company.count; i++) {
				sb.append(cp_arr[i].getInfo() + "\n");
			} // end of for-----------------------------------------
			
			System.out.println(sb.toString());
		}
		
		
	} // end of private void view_all_company_Info(Company[] cp_arr)-----------------------------------------------------------------------


	private void title_company() {
		
		System.out.println("=".repeat(55));
		System.out.println("회사명	업종	사업자등록번호	자본금");
		System.out.println("=".repeat(55));
		
	} // end of private void title_company()------------------------------------------------------------------------------------------------
	
	
	
	
	
	// == 구인회사 검색하기 == //
	private void search_company(Scanner sc, Company[] cp_arr) {
		
		String str_menuno = "";
		do {
			System.out.println("\n>>> 구인회사 검색메뉴 <<<\n"
					+ "1. 업종 검색   2. 자본금 검색   3. 구직자메뉴로 이동\n");
			System.out.print("▶ 검색메뉴번호 입력 : ");		
			
			str_menuno = sc.nextLine();
			
			switch (str_menuno) {
			case "1":	// 업종 검색
				search_jop_type(sc, cp_arr);			
				break;
				
			case "2":	// 자본금 검색
				search_seed_money(sc, cp_arr);	
				break;	
					
			case "3":	// 구직자메뉴로 이동
				
				break;
								
			default:
				System.out.println("[경고] 검색메뉴에 존재하는 번호만 입력해주세요.\n");
				break;
			} // end of switch----------------------------------
			
		} while (!"3".equals(str_menuno));			// "3" 선택 시 반복문 빠져나옴
		// end of do_while--------------------------------------
	
	} // end of private void search_company(Scanner sc, Company[] cp_arr)------------------------------------------------------------------------------------------------



	// == 업종 검색해주는 메소드 == //
	private void search_jop_type(Scanner sc, Company[] cp_arr) {
		
		System.out.print("▶ 업종명 : ");
		String job_type_name = sc.nextLine().toLowerCase();		// toLowerCase(), 입력한 문자와 저장되어있는 문자를 대, 소문자 관계없이 소문자로 통일해서 보기
			
			StringBuilder sb = new StringBuilder();
			boolean is_existence = false;	
			
			for(int i=0; i<Company.count; i++) {
				
				if(cp_arr[i].getJop_type().toLowerCase().contains(String.join("", job_type_name.split("\\ ")))) {								
					// arr에 저장되어있던 jop_type을 불러오는데 소문자로 바꿔서 불러옴. 이후 소문자에 contains 안에 있는 내용이 포함되어져 있는지 확인
					// 공백이 있다면, 공백을 없애기 위해 공백으로 배열을 나눠서(split) String 타입으로 합치기(join)
					is_existence = true;
					sb.append(cp_arr[i].getInfo() + "\n");
				}
				
			} // end of for-----------------------------------------
			
				if(is_existence) {
					title_company();
					System.out.println(sb.toString());
				}
				else {
					System.out.println(">> 검색하시려는 "+ job_type_name +"업종에 해당하는 회사는 없습니다.\n");
					
				} // end of if~else-----------------------------------
	
	} // end of private void search_jop_type(Scanner sc, Company[] cp_arr)------------------------------------------------------------------------------------------------

	
	
	
	
	// == 자본금 검색해주는 메소드 == //
	private void search_seed_money(Scanner sc, Company[] cp_arr) {
		
		System.out.println("▶ 자본금 : ");
		String str_search_seed_money = sc.nextLine();
		
		try {
			long search_seed_money = Long.parseLong(str_search_seed_money);
			
			StringBuilder sb = new StringBuilder();
			boolean is_existence = false;
			
			for(int i=0; i<Company.count; i++) {
				if( search_seed_money <= cp_arr[i].getSeed_money() ) {
					is_existence = true;
					sb.append(cp_arr[i].getInfo() + "\n");
				}
			} // end of for-------------------------------------------
			
			if(is_existence) {
				title_company();
				System.out.println(sb.toString());
			}
			else {
				System.out.println(">> 검색하시려는 자본금이 " + str_search_seed_money +"원 이상인 회사는 없습니다.\n");
			}
			
		} catch(NumberFormatException e) {
			System.out.println(">>[경고] 자본금은 정수로만 입력하세요.\n");
		} // end of try_catch----------------------------------------
		
	} // end of private void search_seed_money(Scanner sc, Company[] cp_arr)-----------------------------------------------------------------------------------------------


	
	
	
	
	
	
}
