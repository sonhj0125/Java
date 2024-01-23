package my.day05.f.For.quiz;

import java.util.Scanner;

public class Main_quiz_3 {

	public static void main(String[] args) {
		  // ▣ 첫번째 정수 : 1
	      // ▣ 두번째 정수 : 10
	      
	      // >> 결과 <<
	      // 1 부터 10 까지의 홀수의 합 : 25
	      // 1 부터 10 까지의 짝수의 합 : 30
	      
	   //   -----------------------------------
	      
	      // ▣ 첫번째 정수 : 2
	      // ▣ 두번째 정수 : 10
	      
	      // >> 결과 <<
	      // 2 부터 10 까지의 홀수의 합 : 24
	      // 2 부터 10 까지의 짝수의 합 : 30
	      
	      
	      // 첫번째 정수 : 2.3453
	      // [경고] 올바른 정수를 입력하세요!!
		
		  // ▣ 첫번째 정수 : 1
	      // 두번째 정수 : 똘똘이
	      // [경고] 올바른 정수를 입력하세요!!
		
		Scanner sc = new Scanner(System.in);
		
				
		for(;;) {
			
			try {
					System.out.println("▣ 첫번째 정수 : ");
					int first_no = Integer.parseInt(sc.nextLine());
										
					
					System.out.println("▣ 두번째 정수 : ");
					int second_no = Integer.parseInt(sc.nextLine());
					
					int sum_holsu = 0;       // 홀수의 누적의 합계를 저장하는 변수
					int sum_jjaksu = 0;      // 짝수의 누적의 합계를 저장하는 변수
					
					int holsu = 0, jjaksu = 0;    // 2씩 증가하는 용도
					
					// first_no  => 1     또는     first_no => 2
					// second_no => 10    또는    second_no => 10
					
					if(first_no % 2 != 0)  { // 첫번째 입력받은 값이 홀수라면
						holsu = first_no;
						jjaksu = first_no+1;
					}
					else { // 첫번째 입력받은 값이 짝수라면
						holsu = first_no+1;
						jjaksu = first_no;
					}
						
					// == 홀수 및 짝수의 합을 구한다. == //					
						for(;;) {
						
							if(holsu <= second_no)
								sum_holsu += holsu;
							
							if(jjaksu <= second_no)
								sum_jjaksu += jjaksu;
							
						//	sum_holsu += holsu+1;      // 홀수가 0으로 시작하므로, +1을 해서 1부터 누적되어 올라감
						//	sum_jjaksu += jjaksu;
							
							holsu += 2;
							jjaksu += 2;
							
							if(holsu > second_no && jjaksu > second_no) {  // 홀수 짝수 둘다 10보다 크면,
							
							// first_no = 1 인 경우	
							// holsu  ( 1 3 5 7 9  11 13)  vs  second_no ( 10 ) 또는 second_no ( 11 )
							// jjaksu ( 2 4 6 8 10 12 14) vs second_no ( 10 ) 또는 second_no ( 11 )
								
								
							// first_no = 2 인 경우	
							// holsu ( 3 5 7 9 11 13)  vs  second_no ( 10 ) 또는 second_no ( 11 )
							// jjaksu ( 2 4 6 8 10 12) vs second_no ( 10 ) 또는 second_no ( 11 )
								break; 
							}
								
						} // end of for-------------------------
					
				
					System.out.println(">> 결과 <<");
					System.out.println(first_no + "부터 " + second_no + "까지의 홀수의 합 : " + sum_holsu + "\n"
					 		+ first_no + "부터 " + second_no + "까지의 짝수의 합 : " + sum_jjaksu);	
					
					sc.close();
					break;
					 
			} catch(NumberFormatException e) {
				System.out.println("[경고] 올바른 정수를 입력하세요!!\n");
			}
						
			 
		} // end of for------------------------
		sc.close();
		System.out.println(">> 프로그램 종료 <<");
		
		
		
	} // end of public static void main(String[] args)---------------

}
