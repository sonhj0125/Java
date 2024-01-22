package my.day05.e.For;

public class Main_for_3_sum_1 {

	public static void main(String[] args) {
		
		int sum = 0;   // sum 은 누적의 합을 저장시키는 변수
		
		for(int i=1; i<=10; i++) {
			sum += i;  // sum = sum + i; 와 같은 뜻
			
		// sum = 0 + 1;  ==> 1번째 반복
		// sum = 1 + 2;  ==> 2번째 반복
		// sum = 1 + 2 + 3;  ==> 3번째 반복
		// sum = 1 + 2 + 3 + 4;  ==> 4번째 반복
		// ...............
		// sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;  => 10번째 반복
			
		}// end of for-------------------------------------
		
		// sum = 1 + 2 + 3 + 4 + ... + 10;
		System.out.println("1 부터 10 까지의 누적의 합계 : " + sum);
		// 1 부터 10 까지의 누적의 합계 : 55
		
		
		sum = 0;     // 초기화, sum 은 누적의 합을 저장시키는 변수
		String str = "";    // str 은 문자열
		
		for(int i=1; i<=10; i++) {
			
			if(i<10)
			str += i+"+";    // str = str + i + "+"; 문자열 결합
						 	 // str = "" + 1 + "+";
							 // str = "1+"+2+"+";
							 // str = "1+2+"+3+"+";
							 // str = "1+2+3+4+5+6+7+8+"+9+"+"
			else {
				str += i;	 // str = "1+2+3+4+5+6+7+8+9+" + 10
							 // 즉, str = "1+2+3+4+5+6+7+8+9+10"
			}
			
			sum += i;
			
		}// end of for-------------------------------------
		
			System.out.println(str + "=" + sum);
		
		//  1+2+3+4+5+6+7+8+9+10=55
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		sum = 0;     	// 초기화
		str = "";		// 초기화
		
		for(int i=1; i<=10; i++) {
			
			String add = (i<10)?"+":"=";
			str += i + add;  	 // 문자열 결합
			sum += i;    		 // 숫자 결합
					
		} // end of for------------------------------------------------
		
		System.out.println(str+sum);
		// 1+2+3+4+5+6+7+8+9+10=55
		

	}

}
