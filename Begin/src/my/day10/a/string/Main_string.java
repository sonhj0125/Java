package my.day10.a.string;

import java.text.DecimalFormat;

import my.util.MyUtil;

public class Main_string {

	public static void main(String[] args) {
		
		
		// === 1. "문자열".charAt(int index) === 	
	    //        "안녕하세요".charAt(2) ==> '하' 
	    // index => 01234
	      
	     char ch = "안녕하세요".charAt(2);
	     System.out.println("ch => " + ch);
	    // ch => 하
	      
	     String str = "안녕하세요";
	    //    index =>  01234

	     String result = "";
	     for(int i=str.length()-1; i>=0; i--) {
	    	 result += str.charAt(i);
	     } // end of for------------------------------
	     System.out.println(result);
	     // 요세하녕안
	     
	     
	      // === 2. "문자열".toCharArray() ===	     
	      // "안녕하세요".toCharArray()  ==> char 타입의 배열로 만들어준다.
	      // ------------------------
	      // |'안'|'녕'|'하'|'세'|'요'|
	      // ------------------------
	      //   0    1    2   3    4   <== index
	     
	     char[] ch_arr = str.toCharArray();
	     result = "";
	     
	     for(int i = ch_arr.length-1; i>=0; i--) {
	    	 result += ch_arr[i];	    	 
	     } // end of for----------------------------------
	     
	     System.out.println(result);
		 // 요세하녕안
	     
	      // === 3. "문자열".substring(int 시작인덱스, int 끝인덱스) ===
	      // "안녕하세요".substring(1, 4); 
	      // ==> "안녕하세요" 에서 시작인덱스가 1인 글자("녕") 부터
	      //     "안녕하세요" 에서 끝인덱스 4인 글자("요") 앞(인덱스 3)에까지("세")만 뽑아온다.
	     
	     
	     str = "안녕하세요".substring(1, 4);
	     System.out.println(str);
	     // 녕하세
	     
	     str = "안녕하세요 오늘도 행복하시고 좋은 하루 되세요~~^^";	     
	     str = str.substring(2, str.length());
	     System.out.println(str);
	     // 하세요 오늘도 행복하시고 좋은 하루 되세요~~^^
	     
	     
	     // === 4. "문자열".substring(int 시작인덱스) ===
	     // "안녕하세요".substring(2); 
	     // ==> "안녕하세요" 에서 시작인덱스가 2인 글자("하") 부터 끝까지 뽑아온다.
	     
	     str = "안녕하세요".substring(2);
	     System.out.println(str);
	     // 하세요
	     
	     
	     // === 5. "문자열".indexOf("찾을문자열") ====
	     //        "문자열" 에서 최초로 나오는 "찾을문자열"의 인덱스(int)를 알려준다.
	     
	     int index = "시작하라 안녕하세요 건강하세요".indexOf("하");
	     			//012
	     System.out.println(index);   // 2
	     
	     index = "시작하라 안녕하세요 건강하세요".indexOf("하세요");
	     	   // 01234567
	     System.out.println(index);   // 7
	     
	     index = "시작하라 안녕하세요 건강하세요".indexOf("A");
	     System.out.println(index);	  // -1(존재하지 않는 값), 찾고자 하는 문자열이 없으면 -1이 나온다.
	     
	     
	  // ==== [퀴즈] ==== //
	     System.out.println("\n~~~~~~~~~~~~~~~~~~~\n");
	      
	     String[] pathFileNameArr = {"C:/mydocument/resume/나의이력서.hwp",
	                                "D:/mymusic.mp3",
	                                "C:/photo/내얼굴.jpg"};
	     
	     for(int i=0; i<pathFileNameArr.length; i++) {
	    	 System.out.println(pathFileNameArr[i]);
	     } // end of for-----------------------------------------------
	  /*   
	     C:/mydocument/resume/나의이력서.hwp
	     D:/mymusic.mp3
	     C:/photo/내얼굴.jpg
	  */   
	     
	     
	     System.out.println("\n=== 파일명만 뽑아온 결과물 ===\n");
	     
	    
	     // pathFileNameArr의 내용 글자 거꾸로 저장하기
	     
	     for(int i=0; i<pathFileNameArr.length; i++) {		 
	    	 char[] chArr = pathFileNameArr[i].toCharArray();	
	    	 
	    	 String str_reverse = "";    	 
	    	 for(int j=chArr.length-1; j>=0; j--) {
	    		 				
				str_reverse += chArr[j];	    
				
	    	 } // end of for------------------------------
	    	 
	    //	 System.out.println(str_reverse);
	     
	     
	/*   pwh.서력이의나/emuser/tnemucodym/:C
	     3pm.cisumym/:D
	     gpj.굴얼내/otohp/:C
	*/     
	     
	     // str_reverse 에서 처음부터 최조로 "/" 가 나오는 앞까지만 추출하면 된다.
	  //  str_reverse.substring(0, idx);
	     // idx 는 str_reverse 에서 최초로 "/" 가 나오는 인덱스 값이다.
	     
	     int idx = str_reverse.indexOf("/");
	     
	     if(idx != -1) {
	    	 str_reverse = str_reverse.substring(0, idx);
	   //	 System.out.println(str_reverse);
	   /* 	 
	    	 pwh.서력이의나
	    	 3pm.cisumym
	    	 gpj.굴얼내
	   */
	    	 
	    	 chArr = str_reverse.toCharArray();
	    	 String str_result = "";
	    	 for(int j=chArr.length-1; j>=0; j--) {
	    		 str_result += chArr[j];
	    	 } // end of for-------------------
	    	 
	    	 System.out.println(str_result);
	    	 
	     	} // end of if----------------------------
	     
	     } // end of for------------------------------
     
	     System.out.println();
     
	  /*   
	     나의이력서.hwp
	     mymusic.mp3
	     내얼굴.jpg
	  */   	     
	 
	     
	  // === 6. "문자열".lastIndexOf("찾을문자열") ====
	  //        "문자열" 에서 마지막으로 나오는 "찾을문자열"의 인덱스(int)를 알려준다.   
	     	     
	    index = "시작하라 안녕하세요 건강하세요".lastIndexOf("하");
			
		System.out.println(index);   // 13
		
		index = "시작하라 안녕하세요 건강하세요".lastIndexOf("하세요");
			   
		System.out.println(index);   // 13
		
		index = "시작하라 안녕하세요 건강하세요".lastIndexOf("A");
		System.out.println(index);	  // -1(존재하지 않는 값)
			     
	     
		// ==== [퀴즈] ==== //
	    
	    System.out.println("\n=== 파일명만 뽑아온 결과물 ===\n");
	/*      
	    String[] pathFileNameArr = {"C:/mydocument/resume/나의이력서.hwp",
					                "D:/mymusic.mp3",
					                "C:/photo/내얼굴.jpg"};
	*/    
	    for(int i=0; i<pathFileNameArr.length; i++) {
	    	int idx = pathFileNameArr[i].lastIndexOf("/");
	    	if(idx != -1) {
	    		System.out.println(pathFileNameArr[i].substring(idx+1));	 
	    		
	 //  pathFileNameArr[i].substring(idx+1) 은 마지막으로 나오는 "/" 의 인덱스 그 다음부터 끝까지 뽑아낸다.	
	    		
	    	} // end of if---------------------------
	    	
	    } // end of for------------------------------------
	    
	/*     
	    나의이력서.hwp
	    mymusic.mp3
	    내얼굴.jpg
	*/
     
	    
	    
	    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	    
	    String money_1 = "$2,000,000";
	    String money_2 = "$500,000";
	    // 두 money 문자열을 합쳐서 $2,500,000을 만들고자 함.
	    
	    
	    long sum_money = MyUtil.delete_character(money_1) + MyUtil.delete_character(money_2);
	    // 2000000 + 500000
	    // 달러와 콤마를 일단 제거
	    
	  
	    System.out.println(sum_money);
	    // 2500000
	    

	    System.out.println("$" + MyUtil.append_comma(sum_money));			// $2,500,000
	    //	       500	   	  500 		글자 길이 3글자(3의 배수)			콤마의 개수는 3/3 == 1 ==> 1-1
	    //     500,000	   500000 		글자 길이 6글자(3의 배수)			콤마의 개수는 6/3 == 2 ==> 2-1
	    //   2,500,000	  2500000		글자 길이 7글자(3의 배수가 아님)	콤마의 개수는 7/3 == 2 ==> 2
	    // 892,500,000	892500000		글자 길이 9글자(3의 배수)			콤마의 개수는 9/3 == 3 ==> 3-1
	  
	 ///////////////////////////////////////////////////////////////////////////////////////////
	    
	    // (실제로 사용)
	    money_1 = "$2,000,000";
	    money_2 = "$500,000";
	    
	    sum_money = MyUtil.delete_character(money_1) + MyUtil.delete_character(money_2);
	    System.out.println(sum_money);
	    // 2500000
	    
	    DecimalFormat df = new DecimalFormat("#,###");				// 3자리 마다 콤마(,)를 찍어준다.
	    System.out.println("$" + df.format(sum_money)); 
	    // $2,500,000
	    
	    
	    
	    
	} // end of main()-----------------------------------------------

}
