package my.day05.e.For;

public class Main_for_2_break_continue {

	public static void main(String[] args) {
		
		System.out.println(">> 1. break <<");
		
			for(int i=0; i<10; i++) {
				if(i==5) 				// 명령 1개, {} 생략 가능
					break;				// 암기! 반복문에서 break; 를 만나면 가장 가까운 반복문 for 를 빠져나간다.
				
				System.out.println(i+1);
			} // end of for-------------------------
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
			int cnt = 0;
			
			for(;;) {
				System.out.println(++cnt + "번째 반복");
				if(cnt == 5) 
					break;		
			}
		
		System.out.println("\n>> 프로그램 종료 <<");
		
		/*
		    1번째 반복
			2번째 반복
			3번째 반복
			4번째 반복
			5번째 반복

			>> 프로그램 종료 <<
		*/
		
		System.out.println("\n>> 2. continue <<");
		
		
		
		
	} // end of public static void main(String[] args)-------------

}
