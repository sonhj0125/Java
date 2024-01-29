package my.day09.a.twodimension.array;

public class Main_twodimension_array_2 {

	public static void main(String[] args) {
		
		int[][] num_arr = new int[4][];    // 학생수는 4명, 과목은 모름 ==> 4행 null열
		
	/*	
		// 열의 크기를 설정하지 않았으므로, NullPointerException 이 발생함.
		num_arr[0][0] = 10;
		num_arr[0][1] = 20;
		num_arr[0][2] = 30;
		
		num_arr[1][0] = 40;
		num_arr[1][1] = 50;
		num_arr[1][2] = 60;
	*/	
		
		num_arr[0] = new int[3];    // 0번째 학생은 3과목을 봄. 0행은 3열로 설정
		num_arr[1] = new int[2];    // 1번째 학생은 2과목을 봄. 1행은 2열로 설정
		num_arr[2] = new int[4];    // 2번째 학생은 4과목을 봄. 2행은 4열로 설정
		num_arr[3] = new int[3];    // 3번째 학생은 3과목을 봄. 3행은 3열로 설정
		
		// 열을 설정한 후, 값을 넣어줌.
		
		num_arr[0][0] = 10;
		num_arr[0][1] = 20;
		num_arr[0][2] = 30;
		
		num_arr[1][0] = 40;
		num_arr[1][1] = 50;
	//	num_arr[1][2] = 60;  //  java.lang.ArrayIndexOutOfBoundsException 발생
    // 열의 개수가 일치하지 않음. ArrayIndexOutOfBoundsException 이 발생.
		
		num_arr[2][0] = 70;
		num_arr[2][2] = 90;  // 2행 1열은 값을 주지 않았기 때문에 0. ==> 값을 주지 않으면 0으로 나옴
		
		for(int i=0; i<num_arr.length; i++) {   // 행
			
			for(int j=0; j<num_arr[i].length; j++) {    // 열
				String add = (j<num_arr[i].length-1)?",":"\n";
		//		System.out.printf("%2d%s", num_arr[i][j], add);
			} // end of for---------------
			
		} // end of for--------------------------------
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		
		int[][] num_arr_2 = {{10, 20, 30}, 
							 {40, 50},
							 {70, 0, 90, 100},
							 {0, 0, 0}
							 };
		
		for(int i=0; i<num_arr_2.length; i++) {   // 행
			
			for(int j=0; j<num_arr_2[i].length; j++) {    // 열
				String add = (j<num_arr_2[i].length-1)?",":"\n";
	//			System.out.printf("%2d%s", num_arr_2[i][j], add);
			} // end of for---------------
			
		} // end of for--------------------------------
		
	/*	
		10,20,30
		40,50
		70, 0,90,100
 		 0, 0, 0
	*/	
		
		
		
	} // end of main()--------------------------------------------------------------------

}
