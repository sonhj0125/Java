package my.day13.a.inheritance;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ctrl_company extends Ctrl_common {

	// == 구인회사(Company) 신규 회원가입시 
	// Company 클래스의 field 의 요구사항에 모두 맞으면,
	// Company[] cp_arr 에 저장시켜주는 메소드 생성하기 == //
		
	public void register(Scanner sc, Company[] cp_arr) {
		
		if(Company.count < cp_arr.length) { 		// cp_arr[3], 지금까지 생성된 구인회사 회원수가 cp_arr.length(==>정원) 보다 적을 경우에만 신규회원을 받아들인다.
			
			Company cp = new Company();
						
			
			// == 아이디 입력 == //
			outer:
			do {
				System.out.print("1. 아이디 : ");
				String id = sc.nextLine();	
				
				// 중복 아이디 검사하기 시작 //
				for(int i=0; i<Company.count; i++) {
					
					if( id.equals(cp_arr[i].getId()) ) {
						System.out.println(">> 이미 사용중인 아이디이므로 다른 아이디를 입력하세요. <<\n");
						continue outer;
					}
					
				} // end of for--------------------------------
				// 중복 아이디 검사하기 끝 //
								
				cp.setId(id);
				
			} while( !(cp.getId() != null) );
			// end of do_while----------------------------------------------

			
			
		
			// == 비밀번호 입력 == //
			do {
				System.out.print("2. 비밀번호 : ");
				String passwd = sc.nextLine();		
				
				cp.setPasswd(passwd);
				
			} while ( !(cp.getPasswd() != null) ); // null 이 아닌게 아닐동안 돌다가 빠져나가라.
			// end of do_while----------------------------------------------
				
			
			
			// == 회사명 입력 == //
			// 회사명은 2글자 이상 6글자 이하의 한글로만 되어져야 한다.
			do {
				System.out.print("3. 회사명 : ");
				String name = sc.nextLine();			
				
				cp.setName(name);
							
			} while ( !(cp.getName() != null) );
			// end of do_while----------------------------------------------
				
			
							
			// == 사업자등록번호 입력 == //
			do {
				System.out.print("4. 사업자등록번호 : ");
				String business_number = sc.nextLine();		
								
				cp.setBusiness_number(business_number);				
									
			} while ( !(cp.getBusiness_number() != null) );
			// end of do_while----------------------------------------------
			
			// 객체 하나를 만들었음.
			
			/////////////////////////////////////////////////////////////////
			
				cp_arr[Company.count++] = cp; 	// 만든 객체를 저장소에 넣음
				
				System.out.println(">> 구인회사 회원가입 성공 <<\n");				
				
			}			 
					
		else {	// 지금까지 생성된 구인회사 회원수가 cp_arr.length(==>정원) 와 같거나 큰 경우에는 신규회사을 받아들이면 안된다.
			System.out.println(">> 정원 "+ cp_arr.length + "개가 꽉차서 구인회사 회원가입이 불가합니다. <<\n");
		}
		
		
	} // end of public void register(Scanner sc, Company[] cp_arr)---------------------------------

	
	
	
	// 구인회사 로그인 1 cp.login
	public Company login(Scanner sc, Company[] cp_arr) {
		
		System.out.print("▶ 구인회사 ID : ");
		String id = sc.nextLine();
		
		System.out.print("▶ 비밀번호 : ");
		String passwd = sc.nextLine();
		
		for(int i=0; i<Company.count; i++) {
			
			if(id.equals(cp_arr[i].getId())
				&& passwd.equals(cp_arr[i].getPasswd())) {
				return cp_arr[i]; // 메소드의 종료
			}
		} // end of for----------------------------------------
		
		return null;
		
	} // end of public void register(Scanner sc, Company[] cp_arr)-----------------------------------



	// 구인회사 로그인 2 cp_menu
	public void cp_menu(Scanner sc, Company login_cp, Gujikja[] gu_arr) {
		Ctrl_gujikja ctrl_gu = new Ctrl_gujikja();
			
		String str_menuno = "";
		do {
			System.out.println("\n>>> 구인회사 전용메뉴 <<<\n"
					+ "1. 우리회사정보 보기   2. 우리회사정보 수정   3. 모든구직자 조회   4. 구직자 성별 검색   5. 구직자 연령대 검색   6. 구직자 연령대 및 성별 검색   7. 로그아웃\n");
			System.out.print("▶ 검색메뉴번호 입력 : ");		
			
			str_menuno = sc.nextLine();
			
			switch (str_menuno) {
			case "1":	// 우리회사정보 보기
				view_companyInfo(login_cp);	
				
				break;
				
			case "2":	// 우리회사정보 수정
				update_comInfo(sc, login_cp);
				
				break;	
					
			case "3":	// 모든구직자 조회
				if(Gujikja.count == 0) {
					System.out.println(">> 구직자로 등록된 회원이 존재하지 않습니다.");
				}
				else {						
					ctrl_gu.title();
		
					for(int i=0; i<Gujikja.count; i++) {							
						System.out.println(gu_arr[i].getinfo() + "\n");
					} // end of for-----------------------------------------
						
				}
			
				break;
								
			case "4":	// 구직자 성별 검색
				
				if(Gujikja.count == 0) {
					System.out.println(">> 가입된 구직자가 존재하지 않습니다.");
				}
				else {
					ctrl_gu.search_gender(sc, gu_arr);
				}
				
				
				break;
				
			case "5":	// 구직자 연령대 검색
				
				if(Gujikja.count == 0) {
					System.out.println(">> 가입된 구직자가 존재하지 않습니다.");
				}
				else {
					ctrl_gu.search_ageLine(sc, gu_arr);
				}
				
				break;
				
			case "6":	// 구직자 연령대 및 성별 검색
				
				if(Gujikja.count == 0) {
					System.out.println(">> 가입된 구직자가 존재하지 않습니다.");
				}
				else {
					ctrl_gu.search_ageLine_gender(sc, gu_arr);
				}
				
				break;
				
			case "7":	// 로그아웃
				
				break;
				
			default:
				System.out.println("[경고] 검색메뉴에 존재하는 번호만 입력해주세요.\n");
				break;
			} // end of switch----------------------------------
			
		} while (!"7".equals(str_menuno));			// "7" 선택 시 반복문 빠져나옴
		// end of do_while--------------------------------------
		
		
	} // end of public void cp_menu(Scanner sc, Company login_cp, Gujikja[] gu_arr)-----------------------------------





	// == 1. 우리회사정보 보기 == //
	private void view_companyInfo(Company login_cp) {
		
		DecimalFormat df = new DecimalFormat("#,###");	
		
		System.out.println("\n\t>>> "+login_cp.getName()+" 기업의 정보 <<<");
		System.out.println("-".repeat(85));
		System.out.println("아이디\t비밀번호\t\t회사명\t가입일자\t\t사업자등록번호\t직종타입\t자본금");
		System.out.println("-".repeat(85));
		System.out.println(login_cp.getId() + "\t"
						 + login_cp.getPasswd() + "\t"
						 + login_cp.getName() + "\t"
						 + login_cp.getRegister_day().substring(0,10) +"\t"
						 + login_cp.getBusiness_number() + "\t"
						 + login_cp.getJop_type() + "\t"
						 + df.format(login_cp.getSeed_money()) + "원" );
		
		
		
	} // end of private void view_companyInfo(Company login_cp)------------------------------------------------
	

	
	// == 2. 우리회사정보 수정 == //
	private void update_comInfo(Scanner sc, Company login_cp) {
		
		System.out.println("\n>> [주의사항] 변경하지 않고 예전의 데이터값을 그대로 사용하시려면, Enter(엔터)를 눌러주세요.\n");
	
		boolean exit_pwd = false;
		do {
			System.out.print("1. 비밀번호 : ");
			String new_passwd = sc.nextLine();		
						
			if(!new_passwd.equals("")) {			// 입력한 비밀번호가 엔터가 아닐 경우
													// "\r\n" 이 원래 Enter(엔터)
				if(login_cp.getPasswd().equals(new_passwd)) {		// 입력한 비밀번호가 기존과 동일한 경우
					System.out.println(">> 입력하신 비밀번호는 기존 암호와 동일합니다.\n");
					
				}
				else {	// 기존과 동일하지 않은 경우
					login_cp.setPasswd(new_passwd);
					
					if(new_passwd.equals(login_cp.getPasswd())) {		// 바꿔서 설정된 비밀번호와 내가 변경하고자 입력했던 비밀번호가 동일하면 true 출력
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
			System.out.print("2. 회사명 : ");			
			String new_name = sc.nextLine();		
													
													
			if(!new_name.equals("")) {
				
				if(login_cp.getName().equals(new_name)) {
					System.out.println(">> 입력하신 회사명은 기존과 동일합니다.");
				}
				else {
					login_cp.setName(new_name);
					if(new_name.equals(login_cp.getName())) {
						exit_name = true;
					}
					
				}
				
			}
			else {		// 입력한 이름이 엔터인 경우
				exit_name = true;
			}
		} while(!exit_name);
		// end of do_while-------------------------------------------------
		
		
		
		boolean exit_business_number = false;
		
		do {
			System.out.print("3. 사업자등록번호 : ");
			String new_business_number = sc.nextLine();
			
			if(!new_business_number.equals("")) {
				
				if(login_cp.getBusiness_number().equals(new_business_number)) {
					System.out.println(">> 입력하신 사업자등록번호는 기존과 동일합니다.");
				}
				else {
					login_cp.setBusiness_number(new_business_number);
					if(new_business_number.equals(login_cp.getBusiness_number())) {
						exit_business_number = true;
					}
				}
			}
			else {		// 입력한 사업자등록번호가 엔터인 경우
				exit_business_number = true;
			}
		} while(!exit_business_number);
		// end of do_while-------------------------------------------------
		
	} // end of private void update_comInfo(Scanner sc, Company login_cp)----------------------------------------

	
	
	
	
	
	
		
		
		


	
	
	
	
	
	
	
	
	
	
	
	
}
