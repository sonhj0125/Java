package my.day08.b.array;

public class Main_array_1 {

	public static void main(String[] args) {
		
		/*
		=== 배열(array)이란 ? === 암기!
		  ★동일한 데이터타입★을 가지는 여러개의 데이터를 저장할 수 있는 데이터 타입을 말한다.
		  그리고  ★배열 또한 객체 ★라는 것을 꼭 기억하도록 하자!!!  
		*/

		// 1. == 배열의 선언 ==		
		
		int[] arr_subject;
		// 또는 
		// int arr_subject[];
	
		
		// 2. == 선언되어진 배열을 메모리에 크기 할당을 해준다. ==
		
		arr_subject = new int[7];
		
		/*
		  	-----------------------------
		  	| 0 | 1 | 2 | 3 | 4 | 5 | 6 |
		    -----------------------------
		    위의 숫자는 배열의 인덱스(index)를 가리키는 번호로써 0 부터 시작하여 1씩 증가한다.
		    배열의 인덱스(index)를 "배열의 방번호" 라고 흔히 부른다.
		    
		    배열에 저장된 데이터를 표현할 때는 아래와 같이 배열명[인덱스번호]로 나타낸다.
		    
		    arr_subject[0]
		    arr_subject[1]
		    arr_subject[2]
		    arr_subject[3]
		    arr_subject[4]
		    arr_subject[5]
		    arr_subject[6]
		    
		    arr_subject[7] ==> error. 존재하지 않음.
		    
		    배열로 선언된 변수에는 자동적으로 초기값이 들어간다.
		    정수는 0, 실수는 0.0, char는 ' ', String 을 포함한 객체는 null 이 들어간다.
		*/
		
		// 암기 === 배열의 크기(길이)는 배열명.length 로 알아온다. ===
		System.out.println("배열 arr_subject 의 길이(크기) : " + arr_subject.length);
		// 배열 arr_subject 의 길이(크기) : 7
		
		System.out.println("\n=======================================\n");
		
		for(int i=0; i<arr_subject.length; i++) {
			int val = arr_subject[i];
			System.out.println("arr_subject["+i+"] => " + val);			
		} // end of for-----------------------------
		
	/*	
		System.out.println("======================");
		
		for(int i=0, val=10; i<arr_subject.length; i++, val+=10) {
			arr_subject[i] = val;
			
			System.out.println("arr_subject["+i+"] => " + val);	
					
		} // end of for-----------------------------
<결과>
arr_subject[0] => 10
arr_subject[1] => 20
arr_subject[2] => 30
arr_subject[3] => 40
arr_subject[4] => 50
arr_subject[5] => 60
arr_subject[6] => 70

	*/
		// 3. == 선언되어진 배열에 데이터 값을 넣어주기 ==	
		arr_subject[0] = 100;  // 국어점수
		arr_subject[1] = 90;  // 영어점수
		arr_subject[2] = 95;  // 수학점수
		arr_subject[3] = 70;  // 과학점수
		arr_subject[4] = 98;  // 사회점수
		arr_subject[5] = 100;  // 음악점수
		arr_subject[6] = 90;  // 미술점수
		
		System.out.println("\n======================\n");
		
		for(int i=0; i<arr_subject.length; i++) {		
			System.out.println("arr_subject["+i+"] => " +arr_subject[i] );	
		} // end of for-----------------------------
			
			
		System.out.println("======================");	
			
		
		int sum = 0;
		for(int i=0; i<arr_subject.length; i++) {
			sum += arr_subject[i];
		} // end of for--------------------------
		
		System.out.println("총점 : " + sum);
		// 총점 : 643
		
		double avg = (double)sum / arr_subject.length;
			System.out.println("평균 : " + Math.round(avg*10)/10.0);
		// 평균 : 91.9	
		
		
	} // end of main()-------------------------------------------------

}
