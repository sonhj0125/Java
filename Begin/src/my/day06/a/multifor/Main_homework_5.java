package my.day06.a.multifor;

public class Main_homework_5 {

	public static void main(String[] args) {
		
	   // 1. 제출할 파일명 :  본인이름_Main_homework_5.java.txt (txt 파일로 제출함)
	   // 2. 메일주소 :  tjdudgkr0959@naver.com
	   // 3. 제출기한 :  1월26일(금) 18:00 까지 
	   // 4. 자바소스 :  for 문 사용하여 만들것.      
	      
	   /*
	       == 숙제 1 == 
	      *
	      **
	      ***
	      ****
	      *****
	             
	             
	      == 숙제 2 ==
	           *
	          **
	         ***
	        ****
	       ***** 


	      == 숙제 3 == 
	      *****   
	      ****    
	      ***    
	      **     
	      *   
	      
	             
	     == 숙제 4 ==
	    
	         *
	        ***
	       ***** 
	      
	             
	     == 숙제 5 ==
	             
	       *****
	        ***
	         *
	      
	                 
	     == 숙제 6 ==
	          
	         *
	        ***
	       *****
	        ***   
	         *      


	   == 입사문제 == 
	           
	   *********1
	   ********2
	   *******3
	   ******4
	   *****5
	   ****6
	   ***7
	   **8
	   *9


	   */   
		
		
		System.out.println("== 숙제 1 ==\n");
		
		for(int i=1; i<=5; i++) {		
			
			for(int j=0; j<i; j++) { 
				
				System.out.print("*");
				
			} // end of for------------------------	
			
			System.out.println();	
			
		} // end of for-------------------------
		
		 /*
		  == 숙제 1 == 
	      *
	      **
	      ***
	      ****
	      *****
		*/
		
		
		
		System.out.println("\n== 숙제 2 ==\n");
		
		for(int i=1; i<6 ; i++) {		

			for(int j=5; j>i; j--) { 
				
				System.out.print(" ");
				
			} // end of for------------------------	
			
			for(int j=0; j<i; j++) {
				
				System.out.print("*");	
			}
			
			System.out.println();
			
		} // end of for-------------------------
		
		/* 
		  == 숙제 2 ==
		           *
		          **
		         ***
		        ****
		       ***** 	
		*/

		System.out.println("\n== 숙제 3 ==\n");
			
		for(int i=5; i>0; i--) {		
			
			for(int j=0; j<i; j++) { 
				
				System.out.print("*");
				
			} // end of for------------------------	
			
			System.out.println();	
			
		} // end of for-------------------------	
			
	
		/*
			  == 숙제 3 == 
		      *****   
		      ****    
		      ***    
		      **     
		      *   	
		*/	
			
		System.out.println("\n== 숙제 4 ==\n");
		
		
		
		/*
			 == 숙제 4 ==
				 *
				***
			   ***** 			 
		 */
	} // end of main()-----------------------------


}