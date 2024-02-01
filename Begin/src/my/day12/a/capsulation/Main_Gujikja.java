package my.day12.a.capsulation;

// main 메소드는 실행만 해줄 뿐

import java.util.Scanner;

public class Main_Gujikja {

	public static void main(String[] args) {
		
		Gujikja[] gu_arr = new Gujikja[5];   // 5개 중 3개는 static, 나머지 객체는 마음대로 사용
		
		///////////////////////////////////////////////////
		
		Gujikja gu1 = new Gujikja();
		gu1.setUserid("eomjh");
	    gu1.setPasswd("qWer1234$");
	    gu1.setName("엄정화");
	    gu1.setJubun("8610022");
	    gu_arr[Gujikja.count++] = gu1;
	    
	    Gujikja gu2 = new Gujikja();
	    gu2.setUserid("leess");
	    gu2.setPasswd("abCd12345$");
	    gu2.setName("이순신");
	    gu2.setJubun("9209201");
	    gu_arr[Gujikja.count++] = gu2;
		
	    Gujikja gu3 = new Gujikja();
	    gu3.setUserid("chaew");
	    gu3.setPasswd("aSdf1234$");
	    gu3.setName("차은우");
	    gu3.setJubun("0106203");
	    gu_arr[Gujikja.count++] = gu3;
	    
		
	    ///////////////////////////////////////////////////
	    
	    Scanner sc = new Scanner(System.in);	    
	    Ctrl_gujikja ctrl = new Ctrl_gujikja();			// 구직자를 제어해주는 ctrl
	    
	    String str_menuno = "";
	    do {
	    	ctrl.main_menu();
	    	str_menuno = sc.nextLine();
	    	
	    	switch (str_menuno) {
				case "1":	// 구직자 회원가입
					ctrl.register(sc, gu_arr);			// 올바르게 입력(sc)했으면, 키보드로 입력한 걸 (gu_arr)에 저장					
					break;
					
				case "2":	// 구직자 모두보기
					ctrl.view_all_info(gu_arr);
					break;
					
				case "3":	// 검색하기
					ctrl.search_menu(sc, gu_arr);					
					break;
					
				case "4":	// 프로그램 종료
					
					break;
	
				default:
					System.out.println("[경고] 메뉴에 없는 번호입니다.\n");
					break;
			} // end of switch---------------------------------------
	    	
		} while ( !("4".equals(str_menuno)));			// 키보드에 입력해준 값이 4일 때 반복문 빠져나와서 종료
	    // end of do_while-------------------------------------------------------
	        
	    sc.close();
	    System.out.println("\n>>> 프로그램 종료 <<<");
	    
	    
	} // end of main()----------------------------------------------------------------------------------

}
