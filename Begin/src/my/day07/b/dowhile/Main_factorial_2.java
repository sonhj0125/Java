package my.day07.b.dowhile;

import java.util.Scanner;

public class Main_factorial_2 {

	public static void main(String[] args) {
		
		// == 입사문제 == //
		/* 
		   ▣ 알고 싶은 팩토리얼 수 입력 => 5 입력
		   >> 결과 : 5! = 120
		   >> 또 할래?[Y/N] => y
		   
		   예 ) 5! = 5*4*3*2*1
		   
		   팩토리얼은 자연수만 가능.
		   ▣ 알고 싶은 팩토리얼 수 입력 => 0 입력(정수)
		   >> [경고] 자연수만 입력하세요.
		   
		   ▣ 알고 싶은 팩토리얼 수 입력 => -5 입력(음수)
		   >> [경고] 자연수만 입력하세요.
		  
		   ▣ 알고 싶은 팩토리얼 수 입력 => 1.2 입력(실수)
		   >> [경고] 정수만 입력하세요.
		    
		   ▣ 알고 싶은 팩토리얼 수 입력 => 똘똘이 입력(문자)
		   >> [경고] 정수만 입력하세요.  
		   
		   ▣ 알고 싶은 팩토리얼 수 입력 => 4 입력
		   >> 결과 : 4! = 24
		   >> 또 할래?[Y/N] => s 입력
		   >> [경고] Y 또는 N만 입력하세요.
		   >> 또 할래?[Y/N] => n 입력
		   
		   >> 프로그램 종료 <<
		*/
		
		Scanner sc = new Scanner(System.in);
		
		outer:
		do {	
			try {		
				System.out.print("▣ 알고 싶은 팩토리얼 수 입력 => ");
				int num = Integer.parseInt(sc.nextLine());
				
				if(num <= 0) {
					System.out.println(">> [경고] 자연수만 입력하세요.\n");
					continue;
					// continue; 를 만나면 아래로 떨어지지 않고 do~while(조건식); 의 조건식으로 들어간다.
				}
				
				// == 팩토리얼 구하기 시작 == //
				
				int factorial = 1;
				for(int i=num; i>0; i--) {   // 5 입력, 5*4*3*2*1
					factorial *= i;          // factorial = factorial*i; 와 같다.
											 // factorial = 1 * 5
											 // factorial = 5 * 4 
											 // factorial = 5 * 4 * 3
											 // .........................
											 // factorial = 5 * 4 * 3 * 2 * 1
				} // end of for---------------------------------
				
				System.out.println(num+"! = "+ factorial);
			
				// == 팩토리얼 구하기 끝 == //
				
				do {
					System.out.print(">> 또 할래?[Y/N] => ");
					String yn = sc.nextLine();
					
					if("y".equalsIgnoreCase(yn)) {
						break;
					}
					else if("n".equalsIgnoreCase(yn)) {
						sc.close();
						break outer; // 팩토리얼 구하기 종료. 프로그램 종료
					}
					else {
						System.out.println(">> [경고] Y 또는 N만 입력하세요.\n");
					}
	
					} while(true);       // end of do~while----------------------------	
			
				} catch(NumberFormatException e) {
					System.out.println(">> [경고] 정수만 입력하세요.\n");
				} // end of try_catch--------------------
				
			} while(true);
	
		System.out.println("\n>> 프로그램 종료 <<");

	} // end of main()---------------------------------------------

}
