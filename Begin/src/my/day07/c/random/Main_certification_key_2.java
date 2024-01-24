package my.day07.c.random;

import java.util.Random;

import my.util.MyUtil;

public class Main_certification_key_2 {

	public static void main(String[] args) {
		
		// === 소문자 3개와 숫자 4개로 이루어진 랜덤한 인증키 만들기 === //
		// 예> asa9040	txa2356
				
		String certification_key = "";
		
		Random rnd = new Random();
		// 처음 얼마부터 마지막 얼마까지 랜덤한 정수
		// rnd.nextInt(마지막 수 - 처음 수 + 1) + 처음 수;
		
		for(int i=0; i<7; i++) {
			
			if(i<3) { // 랜덤한 소문자를 발생시킨다.
				char ch = (char)(rnd.nextInt('z' - 'a' + 1) + 'a');
				certification_key += ch;      // 랜덤한 소문자를 쌓아두는 곳
			}
			else {  // 랜덤한 숫자 0 부터 9 까지 발생시킨다.
				int n = (int)(rnd.nextInt(9 - 0 + 1) + 0);
				certification_key += n;
			}
				
		} // end of for-------------------------------
		
		System.out.println("인증키 : " + certification_key);
		// 인증키 : vus3845
		// 인증키 : stm7773
		
	
		System.out.println("\n=======================================\n");

		// my.util 에서 불러오기 방법(매번 코딩하기 어려우므로 따로 저장해서 불러옴)
		
		System.out.println("인증키 : " + MyUtil.certification_key());
		
		
		

	} // end of main()------------------------------------------

}
