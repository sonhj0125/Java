package my.day07.b.dowhile;

import java.util.InputMismatchException;
import java.util.Scanner;

// === 소수란? === 
// 소수란? 1과 자기 자신밖에 나누어지지 않는 1 이외의 정수 (2,3,5,7...)
// 예> 1 부터 10까지의 소수를 나타내면 
//       2%2 ==> 0   2 는 소수
//       3%3 ==> 0   3 는 소수
//       4%2 ==> 0   4 는 소수가 아님
//       5%5 ==> 0   5 는 소수
//       6%2 ==> 0   6 는 소수가 아님
//       7%7 ==> 0   7 는 소수
//       8%2 ==> 0   8 는 소수가 아님
//       9%3 ==> 0   9 는 소수가 아님
//      10%2 ==> 0  10 는 소수가 아님    

public class Main_primenumber_3 {

	public static void main(String[] args) {
		
	/*
     >>>>> 실행결과 <<<<<
     
     ▷시작 자연수 : 1엔터
     ▷끝 자연수 : 10엔터 
     1 부터 10 까지의 소수는?
     2,3,5,7
     1부터 10 까지의 소수의 개수? 4개  
     1부터 10 까지의 소수들의 합? 17 
     
     === 프로그램 종료 ===
     
     >>>>> 실행결과 <<<<<
     
     ▷시작 자연수 : 1엔터
     ▷끝 자연수 : 똘똘이엔터 
     >> [경고] 자연수만 입력하세요!! 
     
     ▷시작 자연수 : 1엔터
     ▷끝 자연수 : 20엔터 
     1 부터 20 까지의 소수는?
     2,3,5,7,11,13,17,19
     1부터 20 까지의 소수의 개수? 8개  
     1부터 20 까지의 소수들의 합? 77 
     
     === 프로그램 종료 ===
           
	*/   	
	
		System.out.println(">>>>> 실행결과 <<<<<\n");	
		
		Scanner sc = new Scanner(System.in);		
		
		
		do {
			
			try {
				
				System.out.print("▷ 시작 자연수 : ");
				int start_no = sc.nextInt();    // 1엔터 또는 1.234엔터 또는 똘똘이
				
				System.out.print("▷ 끝 자연수 : ");
				int end_no = sc.nextInt();      // 10엔터 또는 6.2665엔터 또는 똘똘이
				
				break;
				
			} catch(InputMismatchException e) {
				System.out.println(" >> [경고] 자연수만 입력하세요!!\n");
				sc.nextLine();
				
				
			} // end of try_catch--------------------------------------
			
		} while(true);
		// end of do_while--------------------------------------
		
		System.out.println("\n>> 프로그램 종료 <<");
		
		
		
		
		
		
		sc.close();

	} // end of main()-----------------------------------------------------------

}
