package my.day04.b.sungjuk;

import java.util.Scanner;

public class Main_sungjuk {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		Sungjuk sj = new Sungjuk();      // 기본생성자
		
		System.out.print("1. 학번 : ");
		sj.hakbun = sc.nextLine();       // "091234"
		
		System.out.print("2. 성명 : ");
		sj.name = sc.nextLine();         // "이순신"
				
		String input_str = "";
		
		try {
			System.out.print("3. 국어 : ");
	
			// === *** 유효성 검사하기(올바른 데이터인지 틀린 데이터인지 검사하는 것) *** === //
			input_str = sc.nextLine();
			byte kor = Byte.parseByte(input_str);       // 90
											            // 101
													    // 2343242
													    // "똘똘이"
			if( !sj.check_jumsu(kor) ) { // 점수가 101 처럼 false 이라면,
				sc.close();
				return;    // return 을 만나면 해당 메소드가 종료.
			}
			else {
				
				sj.kor = kor;
			}
			
			
			System.out.print("4. 영어 : ");
			input_str = sc.nextLine();
			byte eng = Byte.parseByte(input_str);     // 100
													  // -20
													  // 68456456
													  // "호호하하하"
			if( !sj.check_jumsu(eng) ) { 
				sc.close();
				return;    
			}
			else {
				
				sj.eng = eng;
			}
			
			System.out.print("5. 수학 : ");
			input_str = sc.nextLine();		
			byte math = Byte.parseByte(input_str);      // 80
													    // 128
													    // -5946166
													    // "헤헤헤"
			if( !sj.check_jumsu(math) ) { 
				sc.close();
				return;    
			}
			else {
				
				sj.math = math;
			}
			
		} catch(NumberFormatException e) {
			// e.printStackTrace();
			// System.out.println(e.getMessage());
			System.out.println(">> 입력하신 "+input_str+" 는 올바른 데이터가 아닙니다. <<");
		}
		
		sc.close();
	}

}
