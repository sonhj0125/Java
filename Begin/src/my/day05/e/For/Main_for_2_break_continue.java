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
		
		for(int i=0; i<10; i++) {
			if( (i+1)%2 == 0 ) {// 출력하고자 하는 값이 짝수이라면
				continue;		// 반복문에서 continue 를 만나면 실행 순서가 밑으로 내려가지 않고, 가장 가까운 반복문의 증감식으로 이동시켜준다.
			}
			System.out.print( (i+1) + " ");
			// i==>0 (i+1)==>1 ==> 출력
			// i==>1 (i+1)==>2 ==> continue; i++로 이동, 출력하지 않음
			// i==>2 (i+1)==>3 ==> 출력
			// i==>3 (i+1)==>4 ==> continue; i++로 이동, 출력하지 않음
			// 1 3 5 7 9 
			
			
			
		} // end of for----------------------------------------
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // end of public static void main(String[] args)-------------

}
