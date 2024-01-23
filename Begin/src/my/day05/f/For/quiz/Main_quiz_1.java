package my.day05.f.For.quiz;

public class Main_quiz_1 {

	public static void main(String[] args) {
		
		String word = "Abz3한a0#$T";
		//   		   0123456789
		
		System.out.println(word + " 문자열의 길이(글자수) : " + word.length());
		// Abz3Sa0#$T 문자열의 길이(글자수) : 10
		
		System.out.println(word.charAt(0));  // 'A'
		System.out.println(word.charAt(2));  // 'z'
		System.out.println(word.charAt(7));  // '#'
		System.out.println(word.charAt(4));  // '한'
		
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		
		
		int upper_cnt = 0, lower_cnt = 0, number_cnt = 0, hangul_cnt = 0, special_cnt = 0;
		
		for(int i=0; i<word.length(); i++) {
			
			char ch = word.charAt(i);				
			
			if(Character.isUpperCase(ch))			// 대문자인지 검사
				upper_cnt++;						// 대문자 개수 하나씩 증가
			else if(Character.isLowerCase(ch))		// 소문자인지 검사
				lower_cnt++;						// 소문자 개수 하나씩 증가
			else if(Character.isDigit(ch))			// 숫자인지 검사
				number_cnt++;						// 숫자 개수 하나씩 증가
			else if('가' <= ch && ch <= '힣')			// 한글인지 검사
				hangul_cnt++;						// 한글 개수 하나씩 증가
			else 									// 나머지 특수문자 개수 하나씩 증가
				special_cnt++;			
			
		} // end of for----------------------------------------
				
		System.out.println(word + "\n"
						+ "대문자 개수 : " + upper_cnt + "\n"
						+ "소문자 개수 : " + lower_cnt + "\n"
						+ "숫자 개수 : " + number_cnt + "\n"
						+ "한글 개수 : " + hangul_cnt + "\n"
						+ "특수문자 개수 : " + special_cnt + "\n");

		/*
		  Abz3한a0#$T 
		  대문자 개수 : 2 
		  소문자 개수 : 3 
		  숫자 개수 : 2 
		  한글 개수 : 1 
		  특수문자 개수 : 2
		*/
	
	}

}
