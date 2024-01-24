package my.day07.c.random;

import java.util.Random;
import java.util.Scanner;

/*
============= 메뉴 ==============
1.가위 2.바위 3.보 4.게임종료
================================
>> 선택하세요 => 5엔터
[경고] 메뉴에 존재하지 않는 번호입니다!!

>> 선택하세요 => 똘똘이엔터
[경고] 정수로만 입력하세요!!

>> 선택하세요 => 2
>> 사용자님이 이겼습니다!!^^   이긴경우
>> 사용자님이 졌습니다ㅜㅜ     진경우
>> 비겼습니다~~             비긴경우

============= 메뉴 ==============
1.가위 2.바위 3.보 4.게임종료
================================
>> 선택하세요 => 4

>> 프로그램 종료 <<
*/

public class Main_gawibawibo_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		Random rnd = new Random();
		
		int choice_num = 0;
		
		do {
			System.out.println("============= 메뉴 ==============\n"
					+ "1. 가위\t2.바위\t3.보\t4.게임종료\n"
					+ "=================================n");
			System.out.print(">> 선택하세요 => ");
			
			try {				
				choice_num = Integer.parseInt(sc.nextLine());      // 5, 똘똘이, 1~4
		
				if(!(1 <= choice_num && choice_num <= 4)) {
					System.out.println("[경고] 메뉴에 존재하지 않는 번호입니다!!\n");
					
					continue;  // 5,6,7.. 같은 번호인 경우, 밑으로 내려가지 않으면서 while 문을 빠져나가지 못함. 그래서 다시 메뉴로 이동
					
				}
				
				if(choice_num != 4) { 
					// 메뉴에 있는 1 ~ 3번 중 하나를 선택한 경우 (4번 선택시에는 프로그램 종료로 이동해야함)
					
					/*
					  	PC 도 1 또는 2 또는 3 중에 하나를 랜덤하게 내야 한다.
					  	처음 얼마부터 마지막 얼마까지 랜덤한 정수
					 	rnd.nextInt(마지막 수 - 처음 수 + 1) + 처음 수;		
					*/
					int pc_num = rnd.nextInt(3 - 1 + 1) + 1;
					
					String msg = "";
					
					// 사용자가 이긴 경우
					if((choice_num == 1 && pc_num == 3) || 
					   (choice_num == 2 && pc_num == 1) ||
					   (choice_num == 3 && pc_num == 2)) {
						msg = ">> 사용자님이 이겼습니다!!^^\n";						
					}
					// 사용자가 진 경우
					else if((choice_num == 1 && pc_num == 2) || 
							(choice_num == 2 && pc_num == 3) ||
							(choice_num == 3 && pc_num == 1)) {
								msg = ">> 사용자님이 졌습니다ㅜㅜ\n";
					}
					// 사용자와 PC가 비긴 경우
					else {
						msg = ">> 비겼습니다~~\n";
					}
								
					System.out.println(msg);				
					
				}
			
			} catch(NumberFormatException e) {
				System.out.println("[경고] 정수로만 입력하세요!!\n");
			}
			
		} while (!(choice_num == 4));
		// end of do~while-------------------------------
		
		sc.close();
		System.out.println("\n>> 프로그램 종료 <<");
	
	} // end of main()------------------------------------------------

}
