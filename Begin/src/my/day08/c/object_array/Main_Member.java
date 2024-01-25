package my.day08.c.object_array;

import java.util.Scanner;

public class Main_Member {

	public static void main(String[] args) {
		
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
			System.out.println("▶ 선택하세요 => ");			
			str_menu_no =  MyUtil.space_delete(sc.nextLine());
			
		} while ( !("3".equals(str_menu_no)) );   // 입력한 메뉴번호가 3번이라면 반복문을 빠져나와야 한다.
		// end of do_while-------------------------------------
		
			System.out.println("\n>> 프로그램 종료 <<");
		
		
	} // end of main()-------------------------------------------------------

}
