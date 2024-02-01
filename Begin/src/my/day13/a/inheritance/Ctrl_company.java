package my.day13.a.inheritance;

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
		
		
		
		
		
	} // end of public void register(Scanner sc, Company[] cp_arr)
	

}
