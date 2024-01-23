package my.day06.a.multifor;

public class Main_multifor_1 {

	public static void main(String[] args) {
		
		// 단일 for 문으로 아래와 같이 나오도록 한다.
		
		/*
		   abcdefg
		   hijklmn
		   opqrstu
		*/

		
		char ch = 'a';
		for(int i=0; i<'u'-'a'; i++) {
			String add = ( (i+1)%7 == 0) ?"\n":"";    // 7의 배수이라면, 줄바꿈하고 아니면 "" 없다.
			System.out.print(ch++ + add);    // ch = (char)(ch + 1); char 타입에서 + 함으로써 int 로 변환됨
					
		} // end of for--------------------------
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		// 이중 for 문으로 아래와 같이 나오도록 한다.
		
		/*
		   abcdefg     3행 7열
		   hijklmn
		   opqrstu
		*/

		ch = 'a';  // 초기화
		
		for(int i=0; i<3; i++) {  // 암기 : 바깥 for 문이 '행'
			
			for(int j=0; j<7; j++) {  // 암기 : 내부 for 문이 '열'
				System.out.print(ch++);				
			} // end of for--------------------
			
			System.out.print("\n");
		} // end of for---------------------------
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		/*
		   [0,0][0,1][0,2]   [m,n]
		   [1,0][1,1][1,2]
		   [2,0][2,1][2,2]
		   [3,0][3,1][3,2]
		 */
		
		// 단일 for 문을 사용하여 출력해본다.
		
		for(int i=0; i<12; i++) {
			int m = 0, n = 0;
			
			System.out.print("["+m+","+n+"]");
			
			if( (i+1)%3 == 0 ) {
				System.out.print("\n");
			}
		} // end of for------------------------ 일단 스킵. 추후에 다시.

		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		// 이중 for 문을 사용하여 출력해본다.
		
		
		/*
		   [0,0][0,1][0,2]   4행 3열
		   [1,0][1,1][1,2]
		   [2,0][2,1][2,2]
		   [3,0][3,1][3,2]
		*/
		
		for(int i=0; i<4; i++) {  // 4행
			
			for(int j=0; j<3; j++) {  // 3열
				System.out.print("[" + i + "," + j + "]");
			} // end of for- -------------------------
			
			System.out.println("\n");
		} // end of for-----------------
		
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		/*
		   [0,0][0,1][0,2]    4행 3열
		   [1,0][1,1][1,2]
		   [2,0][2,1][2,2] ==> 스킵. 빠져야 함.
		   [3,0][3,1][3,2]
		*/
		
		for(int i=0; i<4; i++) {  // 4행
			
			if(i==2) continue;   // i 가 2가 되면 밑으로 내려가지 않고 위로 올라감
			
			for(int j=0; j<3; j++) {  // 3열
				System.out.print("[" + i + "," + j + "]");
			} // end of for- -------------------------
			
			System.out.println("\n");
		} // end of for-----------------
		
		
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	
		/*		
		  		 스킵	
		   [0,0][0,1][0,2]   4행 3열
		   [1,0][1,1][1,2]
		   [2,0][2,1][2,2] ==> 스킵
		   [3,0][3,1][3,2]
		*/
		
		for(int i=0; i<4; i++) {  // 4행
			
			if(i==2) continue;   // i 가 2가 되면 밑으로 내려가지 않고 위로 올라감
			
			for(int j=0; j<3; j++) {  // 3열
				
				if(j == 1) continue;   // j 가 1이 되면 밑으로 내려가지 말고 위로 다시 갈것
				
				System.out.print("[" + i + "," + j + "]");
			} // end of for- -------------------------
			
			System.out.println("\n");
		} // end of for-----------------
		
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		System.out.println("안녕하세요\t내일\t또 뵐게요.");
		
		/*
		   >> 4호와 4층은 뺄 것. <<
		   501호 	502호	503호	505호
		   301호		302호	303호	304호
		   201호	 	202호	203호	204호
		   101호		102호	103호	102호
		   
		*/
		
		for(int i=5; i>0; i--) {
			
			if(i == 4) continue;
			
			for(int j=1; j<=5; j++) {
				
				if(j == 4) continue;
				
				System.out.print(i + "0" + j + "호\t");
			}
			
			System.out.println();
			
		} // end of for-----------------------------------
		
		
		
		
		
		
	} // end of main()------------------------------------

}
