package my.day04.b.sungjuk;

public class Sungjuk {
	
	// === field ===//
	String hakbun;   // "091234"
	String name;	 // "이순신"
 	byte kor;        // 0 ~ 100 로 제한(음수 빼기 e)
	byte eng;        // 0 ~ 100 로 제한(음수 빼기 e)
	byte math;       // 0 ~ 100 로 제한(음수 빼기 e)
	
	
	// === method === //
	boolean check_jumsu(byte jumsu) {
		
		if(0 <= jumsu && jumsu <= 100) {
			return true;       // return 을 만나면 해당 메소드가 종료 된다.
		}
		else {
			System.out.println("[경고] 입력하시는 점수는 0 이상 100 이하 이어야만 합니다.");
			return false;      // return 을 만나면 해당 메소드가 종료 된다.
		}
	} //end of boolean check_jumsu(byte jumsu)-----------------------------

}
