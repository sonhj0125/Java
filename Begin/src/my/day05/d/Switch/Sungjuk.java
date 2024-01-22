package my.day05.d.Switch;

public class Sungjuk {
	
	// === field ===//
	String hakbun;   
	String name;	 
 	byte kor;        
	byte eng;        
	byte math;       	

	
	// === method === //
	boolean check_jumsu(byte jumsu) {
		
		if(0 <= jumsu && jumsu <= 100) {
			return true;       
		}
		else {
			System.out.println("[경고] 입력하시는 점수는 0 이상 100 이하 이어야만 합니다.");
			return false;      
		}
		
	} //end of boolean check_jumsu(byte jumsu)-----------------------------

	
	void sungjuk_print() {
	
		int sum = kor + eng + math;
		double avg = sum/3.0;
		
		char hakjum = ' ';

		// 암기
//	byte key = 0;     (key) 가능
//	short key = 0;    (key) 가능
//  int key = 0;      (key) 가능
//  long key = 0;     (key) 불가
//	char key = ' ';   (key) 가능
//	float key = 0.0f; (key) 불가	
//  double key = 0.0; (key) 불가
//	String key = "";  (key) 가능

	switch ( ((byte)avg) /10 ) { 
				 // switch 에 들어올 비교대상 값은 정수형 중에 long 을 제외한 나머지인 byte, short, int 만 가능
			     // switch 에 들어올 비교대상 값은 char 타입도 가능
	 			 // switch 에 들어올 비교대상 값은 float 타입은 불가
	 			 // switch 에 들어올 비교대상 값은 double 타입은 불가
	 			 // switch 에 들어올 비교대상 값은 String 타입은 가능
				 // == 즉, byte, short, int, char, String 만 가능
	
		case 10:   // 결과물((byte)avg) /10 이 10 또는 9이라면, 학점은 'A' 이다.
		case 9 :   // 90 <= (byte)avg <= 100 switch는 범위는 사용 불가. 같냐 다르냐만 가능
				   // 90, 91, 92, 93, ...., 98, 99 앞자리가 9이면 'A'
				   // 90/10, 91/10, 92/10, ..., 99/10, 100/10
				   //   9      9      9           9      10
			hakjum = 'A';
			break;
			
		case 8:		// 결과물((byte)avg) /10 이 8이라면,
			hakjum = 'B';
			break;
			
		case 7:		// 결과물((byte)avg) /10 이 7이라면,
			hakjum = 'C';
			break;
			
		case 6:  	// 결과물((byte)avg) /10 이 6이라면,
			hakjum = 'D';
			break;	

		default:    // 결과물((byte)avg) /10 이 10,9,8,7,6을 제외한 다른 값인 경우,
			hakjum = 'F';
			break;
		} // end of switch (key)------------------------------------
			
		
/*		
 		if( avg >= 90 ) {
			hakjum = 'A';
		}		
		else if( avg >= 80 ) {
			hakjum = 'B';
		}		
		else if( avg >= 70 ) {
			hakjum = 'C';
		}		
		else if( avg >= 60 ) {
			hakjum = 'D';
		}		
		else {
			hakjum = 'F';
		}
*/
		
		String gift =  "";
		
		switch (hakjum) {
		case 'A':
			gift += "놀이공원이용권, ";  // 할당 연산자, 초기값은 "", gift = gift + "놀이공원이용권"
			
		case 'B':					// break 가 없기 때문에 바로 다음 case 로 내려감
			gift += "치킨, ";   		// gift = gift + "치킨". 즉, 놀이공원이용권, 치킨

		case 'C':					// break 가 없기 때문에 바로 다음 case 로 내려감
			gift += "피자, ";			// 즉, 놀이공원이용권, 치킨, 피자
			
		case 'D':					// break 가 없기 때문에 바로 다음 case 로 내려감
			gift += "아이스크림";		// 즉, 놀이공원이용권, 치킨, 피자, 아이스크림
			break;					// break; 를 만나야만 switch case 문을 빠져나간다.
			
		default:
			gift = "꿀밤3대";
			break;
		}// end of switch (hakjum)-------------------------------
	
		System.out.println("\n=== " + name + "님의 성적 결과 ===\n" +
			   "1. 학번 : " + hakbun + "\n" +
	           "2. 성명 : " + name + "\n" +
			   "3. 국어 : " + kor + "\n" + 
	           "4. 영어 : " + eng + "\n" +
			   "5. 수학 : " + math + "\n" +
	           "6. 총점 : " + sum + "\n" +    
			   "7. 평균 : " + Math.round(avg*10)/10.0 + "\n" + 
	           "8. 학점 : " + hakjum + "\n" +
	           "9. 선물 : "+ gift + "\n");
		
	} // end of void sungjuk_print()---------------------------------
}
