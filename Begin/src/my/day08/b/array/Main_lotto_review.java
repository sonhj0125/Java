package my.day08.b.array;

import java.util.Random;

public class Main_lotto_review {

	public static void main(String[] args) {
		
		int[] arr_ball = new int[45];
		int[] arr_temp = new int[5];
		
		
		for(int i=0; i<arr_ball.length; i++) {
			arr_ball[i] = i+1;
		} // end of for----------------------
		
		for(int i=0; i<arr_temp.length; i++) {
			arr_temp[i] = -1;
		} // end of for----------------------
		
		
		Random rnd = new Random();
		String result = "";
		
		
		outer:
			
			for(int i=0; i<6; i++) {
				int idx = rnd.nextInt(44 - 0 + 1) + 0;
			
		
				for(int j=0; j<arr_temp.length; j++) {
					if(idx == arr_temp[j]) {
						i--;
						continue outer;
					}
			} // end of for------------------------
				
				if(i<5) {
					arr_temp[i] = idx;
				}
				
				
				
				
				
				
		} // end of for------------------------		

	}

}
