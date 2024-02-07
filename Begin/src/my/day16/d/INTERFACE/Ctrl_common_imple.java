package my.day16.d.INTERFACE;

import java.util.Scanner;

public class Ctrl_common_imple implements Ctrl_common {

	// == 시작화면(메인 메뉴)를 보여주는 메소드 생성하기 == //
	@Override
	public void main_menu() {
		System.out.println("\n === 메인메뉴 ===\n"
				         + "1.구직자 회원가입   2.구인회사 회원가입   3.구직자 로그인   4.구인회사 로그인\n"
				         + "5.프로그램 종료\n");  
		System.out.print("▷ 메뉴번호 선택 : ");
	}// end of void main_menu()--------------------------- 

	
	
	// == 구직자 및 구인회사 로그인 메소드 생성하기 == //
	@Override
	public CommonMember login(Scanner sc, CommonMember[] cmbr_arr, int type) {
		
		System.out.print("▶ ID : ");
		String id = sc.nextLine();
		
		System.out.print("▶ 비밀번호 : ");
		String passwd = sc.nextLine();
		
		for(int i=0; i<CommonMember.count; i++) {
			
			if(cmbr_arr[i].getType() == type &&
				cmbr_arr[i].getId().equals(id) &&
				cmbr_arr[i].getPasswd().equals(passwd)) {
					return cmbr_arr[i];
				}
			
		} // end of for-----------------------------------------
		
		return null;
		
	}
	
}
