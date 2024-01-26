package my.day09.a.twodimension.array;

public class Main_twodimension_array_1 {

	public static void main(String[] args) {
		
		// === 1차원 배열 === //
		int[] subject_arr = new int[5];      // 1행 5열
	/*
	   		----------------------
	   값 => | 0 | 0 | 0 | 0 | 0 |
	   		----------------------
	index =>  0   1   2   3   4  		  	
	*/
	
		subject_arr[0] = 100;
		subject_arr[1] = 90;
		subject_arr[2] = 95;
		subject_arr[3] = 80;
		subject_arr[4] = 88;
		
		
		// === 2차원 배열 === //
		int[][] point_arr = new int[4][3];    // 4행 3열
	/*
	  
	   값 ==>
	   		 --------------
	         | 0 | 0 | 0 |
	   		 --------------
	         | 0 | 0 | 0 |
	         --------------
	         | 0 | 0 | 0 |
	         --------------
	         | 0 | 0 | 0 |
	   		 --------------
   		 
   	index ==>  
   	         -----------------------------
   	 		 | [0][0] | [0][1] | [0][2] | 	
   	 		 -----------------------------
   	 		 | [1][0] | [1][1] | [1][2] |  	
   	 		 -----------------------------
   	 		 | [2][0] | [2][1] | [2][2] |  	
   	 		 -----------------------------
   	 		 | [3][0] | [3][1] | [3][2] |  	
   	 		 ----------------------------- 	
   	 		  	  	 		  	
	*/		
				
		point_arr[0][0] = 10;
		point_arr[0][1] = 20;
		point_arr[0][2] = 30;
		
		point_arr[1][0] = 40;
		point_arr[1][1] = 50;
		point_arr[1][2] = 60;
		
		point_arr[2][0] = 70;
		point_arr[2][1] = 80;
		point_arr[2][2] = 90;
		
		point_arr[3][0] = 100;
		point_arr[3][1] = 100;
		point_arr[3][2] = 100;
		
		System.out.println("point_arr.length : " +  point_arr.length);    // 행 길이(= 학생 수)
		// point_arr.length : 4
		// 2차원 배열명.length 은 행의 길이가 나온다.

		System.out.println("point_arr[0].length : " +  point_arr[0].length);    // 열의 길이(= 첫번째 학생의 과목점수)
		// point_arr.length : 3
		// 2차원 배열명[행의 인덱스].length 은 그 행에 존재하는 열의 길이(크기)가 나온다.
				
		System.out.println("point_arr[1].length : " +  point_arr[1].length);    // 열의 길이(= 첫번째 학생의 과목점수)
		// point_arr.length : 3
		// 2차원 배열명[행의 인덱스].length 은 그 행에 존재하는 열의 길이(크기)가 나온다.
		
		System.out.println("point_arr[2].length : " +  point_arr[2].length);    // 열의 길이(= 첫번째 학생의 과목점수)
		// point_arr.length : 3
		// 2차원 배열명[행의 인덱스].length 은 그 행에 존재하는 열의 길이(크기)가 나온다.
		
		System.out.println("point_arr[3].length : " +  point_arr[3].length);    // 열의 길이(= 첫번째 학생의 과목점수)
		// point_arr.length : 3
		// 2차원 배열명[행의 인덱스].length 은 그 행에 존재하는 열의 길이(크기)가 나온다.
			
		/*
		    10,  20,  30
		    40,  50,  60
		    70,  80,  90
		   100, 100, 100		  
		*/
					
	System.out.println("\n======================================================================\n");
		
		
		for(int i=0; i<point_arr.length; i++) { // 행
			
			for(int j=0; j<point_arr[i].length; j++) { // 열
				String add = (j<point_arr[i].length-1)?",":"\n";
				System.out.printf("%3d%s", point_arr[i][j], add);				
			} // end of for-----------------------------------
			
		} // end of for-----------------------------------
		
		System.out.println("\n================ 성적결과 ================\n");
		
							// 국어 영어 수학
		int[][] jumsu_arr = { {90, 80, 70},  // 이순신
							  {80, 85, 76},  // 엄정화
							  {80, 85, 76},  // 홍길동, 동점
							  {85, 70, 90},  // 공유
							  {60, 80, 50}   // 아이유
							  };
		
		int[] total_arr = new int[jumsu_arr.length];
		// 각 학생별 총점을 저장시켜두는 곳이다.
		
		String[] result_arr = new String[jumsu_arr.length];
		// 학생별로 등수를 제외한 국어, 영어, 수학, 총점, 평균, 학점까지 성적 결과를 저장시켜두는 장소
				
				
		System.out.println("----------------------------------------------------");
		System.out.println("국어\t영어\t수학\t총점\t평균\t학점\t등수");
		System.out.println("----------------------------------------------------");
		
		
		for(int i=0; i<jumsu_arr.length; i++) {
			
			String result = "";
			int sum = 0;
							
			for(int j=0; j<jumsu_arr[i].length; j++) {
				result += jumsu_arr[i][j] + "\t";
				sum += jumsu_arr[i][j];
				
			} // end of for------------------------------
			
			double avg = Math.round((double)sum/jumsu_arr[i].length*10)/10.0;
			
			char grade = ' ';
			
			switch ((int)avg/10) {
				case 10 :
				case 9 :	
					grade = 'A';	
					break;
				case 8 :	
					grade = 'B';	
					break;
				case 7 :	
					grade = 'C';	
				case 6 :	
					grade = 'D';	
					break;
				default:
					grade = 'F';
					break;			
				
			} // end of switch---------------------------------------
			
			result += sum + "\t" + avg + "\t" + grade + "\t";		
		//	System.out.println(result);
			
			result_arr[i] = result; // 각 학생별 국어, 영어, 수학, 총점, 평균, 등급 까지 결과만을 구해서 배열 result_arr 에 저장시켜 둔다.
			
			total_arr[i] = sum;     // 각 학생별 총점을 구해서 배열 total_arr 에 저장시켜 둔다.		
		} // end of for------------------------------
		
		// >>> 등수를 구해서 성적결과 출력하기 <<< //
		for(int i = 0; i < total_arr.length; i++) {  // total_arr[i] 가 자신의 점수
			
			int rank = 1;
			for(int j = 0; j < total_arr.length; j++) { // total_arr[j] 는 타인의 점수
				
				if(i != j && total_arr[i] < total_arr[j]){
					rank++;
				}
				
			} // end of for----------------------------------------
					
			System.out.println(result_arr[i] += rank);
						
		} // end of for----------------------------------------
		
		
		System.out.println("====================================================\n");
		
		/*
		  int kor_sum = 0, eng_sum = 0, math_sum = 0;
		  
		  for(int i = 0; i < jumsu_arr.length; i++) {
		  
		  kor_sum += jumsu_arr[i][0]; 
		  eng_sum += jumsu_arr[i][1]; 
		  math_sum += jumsu_arr[i][2];
		  
		  } // end of for----------------------------------
		  
		  double avg_kor = Math.round((double)kor_sum/jumsu_arr.length*10)/10.0; 
		  double avg_eng = Math.round((double)eng_sum/jumsu_arr.length*10)/10.0; 
		  double avg_math = Math.round((double)math_sum/jumsu_arr.length*10)/10.0;
		  
		  
		  System.out.println(kor_sum + "\t" + eng_sum + "\t" + math_sum + "\t 과목별 총점"); 
		  System.out.println(avg_kor + "\t" + avg_eng + "\t" + avg_math + "\t 과목별 평균");
		 */
		
		int[] arr_subject_total = new int[jumsu_arr[0].length];
		// 각 과목별 총점을 저장시켜두는 곳
		
		for (int i=0; i<arr_subject_total.length; i++) {
			
			for (int j=0; j<jumsu_arr.length; j++) {
				arr_subject_total[i] += jumsu_arr[j][i];
				
			} // end of for--------------------------------------
			
		/*	
		   arr_subject_total[0] += jumsu_arr[0][0];
		   					   	+= jumsu_arr[1][0];
		   					 	+= jumsu_arr[2][0];
		   					 	+= jumsu_arr[3][0];
		   					 	+= jumsu_arr[4][0];
		   					 	
		   arr_subject_total[1] += jumsu_arr[0][1];
		   					   	+= jumsu_arr[1][1];
		   					 	+= jumsu_arr[2][1];
		   					 	+= jumsu_arr[3][1];
		   					 	+= jumsu_arr[4][1];	
		   					 					 	
		   arr_subject_total[2] += jumsu_arr[0][2];
		   					   	+= jumsu_arr[1][2];
		   					 	+= jumsu_arr[2][2];
		   					 	+= jumsu_arr[3][2];
		   					 	+= jumsu_arr[4][2];					 	
		   					 	
		 */
			
			
						
		} // end of for--------------------------------------
		
		String str_subject_total = "", str_subject_avg = "";
		for(int i=0; i<arr_subject_total.length; i++) {
			str_subject_total += arr_subject_total[i] + "\t";
			str_subject_avg += Math.round((double)arr_subject_total[i] / jumsu_arr.length * 10)/10.0 + "\t";
			
		} // end of for--------------------------------------
		
		System.out.println(str_subject_total);
		System.out.println(str_subject_avg);
		
		
		/*
			   ----------------------------------
			    국어  영어  수학  총점   평균  학점  *등수
			   ----------------------------------
			    90   80   70  240  80.0  B 	   4
			    80   85   76  241  80.0  B	   2
			    80   85   76  241  80.0  B	   2
			    85   70   90  245  81.0  B	   1
			    60	 80   50  190  63.0	 D     5
			   ==================================
			   395   400   362      과목별 총점
			   79.0  80.0  72.4     과목별 평균
		*/
		
		
		System.out.println("\n####################################################\n");
		
		System.out.println(">> 배열 arr_subject_total 에 저장되어진 값을 꺼내오는 첫번째 방법 <<");
		
		for(int i=0; i<arr_subject_total.length; i++) {
			System.out.println(arr_subject_total[i]);
		} // end of for----------------------------------------
		
		/*
		  395 
		  400 
		  362
		*/
		
		System.out.println("\n>> 배열 arr_subject_total 에 저장되어진 값을 꺼내오는 두번째 방법 <<");
		
		// 아래의 for 문을 "확장 for 문" 또는 "개선된 for 문" 이라 부른다.
		for(int subject_total : arr_subject_total) {    // 형태 지역변수명(아무거나) : 반복의 횟수가 되는 배열
			// 반복의 횟수는 arr_subject_total 배열의 길이 만큼 한다.
			// int subject_total = arr_subject_total[0];
			// int subject_total = arr_subject_total[1];
			// int subject_total = arr_subject_total[2];
			
			System.out.println(subject_total);
			
		} // end of for----------------------------------------
		
		/*
		  395 
		  400 
		  362
		*/
		
	
	} // end of main()-------------------------------------------------

}
