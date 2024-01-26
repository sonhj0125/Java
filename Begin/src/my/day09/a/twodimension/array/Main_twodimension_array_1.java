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
							  {85, 70, 90},  // 공유
							  {60, 80, 50}   // 아이유
							  };
		
		System.out.println("----------------------------------------------------");
		System.out.println("국어\t영어\t수학\t총점\t평균\t학점\t등수");
		System.out.println("----------------------------------------------------");
		
		
		int[] arr_sum = new int[jumsu_arr.length];
		
			for(int i = 0; i < jumsu_arr.length; i++) {
				
				for(int j = 0; j < jumsu_arr.length; j++) {
					
					//if(<) {
					//	j++;
				//	}
					
					
					
					
				} // end of for-------------------------------
				
			} // end of for-------------------------------
						
		
		
		
		
		
		
		
		
		
		
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
			
			result += sum + "\t" + avg + "\t" + grade + "\n";
			
			System.out.println(result);
			
		} // end of for------------------------------
			
		/*
		   ----------------------------
		    국어  영어  수학  총점   평균  학점
		   ----------------------------
		    90   80   70  240  80.0  B
		    80   85   76  241  80.0  B
		    85   70   90  245  81.0  B
		    60	 80   50  190  63.0	 D  
		   ----------------------------
		*/
		
	} // end of main()-------------------------------------------------

}
