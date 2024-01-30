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
	    
	    
	    
	    
	   	    
	    // === 7. "문자열".split("구분자") ====  ★★★웹에서 많이 사용★★★
	    //        "문자열"을 "구분자"로 잘라서 String 타입의 배열로 돌려주는 것이다. 
	    
	    
	    System.out.println("\n 1.====================================================== \n");
	    
	    String food = "제육볶음,볶음밥,닭가슴살,함박스테이크,소고기덮밥";
	    
	    String[] food_arr = food.split(",");
	    // {"제육볶음","볶음밥","닭가슴살","함박스테이크","소고기덮밥"}
	    
	    for(int i=0; i<food_arr.length; i++) {
	    	System.out.println((i+1) +"."+ food_arr[i]);
	    } // end of for-----------------------------------------
	/*    
	    1.제육볶음
	    2.볶음밥
	    3.닭가슴살
	    4.함박스테이크
	    5.소고기덮밥
	*/    
	    
	    System.out.println("--------------------------------------------");
	    
	    for(String fd : food_arr) {
	    	System.out.println(fd);
	    } // end of for-----------------------------------------
	/*    
	    제육볶음
	    볶음밥
	    닭가슴살
	    함박스테이크
	    소고기덮밥
	*/    
	    
	    
	    System.out.println("\n 2.====================================================== \n");
	    
	    food = "제육볶음	볶음밥	닭가슴살	함박스테이크	소고기덮밥";
	    
	    food_arr = food.split("\t");
	    // {"제육볶음","볶음밥","닭가슴살","함박스테이크","소고기덮밥"}
	    
	    for(int i=0; i<food_arr.length; i++) {
	    	System.out.println((i+1) +"."+ food_arr[i]);
	    } // end of for-----------------------------------------
	/*    
	    1.제육볶음
	    2.볶음밥
	    3.닭가슴살
	    4.함박스테이크
	    5.소고기덮밥
	*/     
	    
	    
	    System.out.println("\n 3.=== split 사용시 구분자로 . | / 등의 특수문자를 사용하려고 하는 경우 === \n");
	    
	    food = "제육볶음.볶음밥.닭가슴살.함박스테이크.소고기덮밥";
	    
	    food_arr = food.split(".");
	    System.out.println("food_arr.length => " + food_arr.length);
	    // food_arr.length => 0 잘못된 것. 쪼개지 못함
	    //  ==> 0 이 나옴. 즉, .단독만으로는 구분자로 인식을 못함. ( , 나 \t 은 인식함)
        // split 사용시 구분자로 . | / 등 특수문자를 사용하려고 할 경우에는 구분자로 인식을 못할 경우가 많으므로
        // 구분자 앞에 \\ 를 붙이거나 구분자를 [] 로 씌워주면 된다.
        // ★★★ 즉, \\구분자  이거나  [구분자] 이렇게 해야 한다.
	    
	    
	    food_arr = food.split("\\.");    	    
	    // {"제육볶음","볶음밥","닭가슴살","함박스테이크","소고기덮밥"}
	    
	    // 또는
	    
	    food_arr = food.split("[.]");    	    
	    // {"제육볶음","볶음밥","닭가슴살","함박스테이크","소고기덮밥"}
	    
	    
	    for(int i=0; i<food_arr.length; i++) {
	    	System.out.println((i+1) +"."+ food_arr[i]);
	    } // end of for-----------------------------------------
	    
	/*    
	    1.제육볶음
	    2.볶음밥
	    3.닭가슴살
	    4.함박스테이크
	    5.소고기덮밥
	*/       
	    
	    
	    
	    System.out.println("\n 4.=== split 사용시 구분자로 . | / 등의 특수문자를 사용하려고 하는 경우 === \n");
	    
	    food = "제육볶음,볶음밥.닭가슴살|함박스테이크,소고기덮밥	라면";
	    
	    food_arr = food.split("\\,|\\.|\\||\\\t");
	    // {"제육볶음","볶음밥","닭가슴살","함박스테이크","소고기덮밥","라면"} 
	    
	    for(int i=0; i<food_arr.length; i++) {
	    	System.out.println((i+1) +"."+ food_arr[i]);
	    } // end of for-----------------------------------------
	
	/*    
	    1.제육볶음
	    2.볶음밥
	    3.닭가슴살
	    4.함박스테이크
	    5.소고기덮밥
	    6.라면
	*/       
	    	    
	    
	    
	    
	    
	    System.out.println("\n 5.=== split 사용시 구분자로 . | / 등의 특수문자를 사용하려고 하는 경우 === \n");
	    
	    food = "제육볶음,볶음밥.닭가슴살|함박스테이크,소고기덮밥	라면";
	    
	    food_arr = food.split("[, . | \t]");
	    // {"제육볶음","볶음밥","닭가슴살","함박스테이크","소고기덮밥","라면"} 
	    
	    for(int i=0; i<food_arr.length; i++) {
	    	System.out.println((i+1) +"."+ food_arr[i]);
	    } // end of for-----------------------------------------
	
	/*    
	    1.제육볶음
	    2.볶음밥
	    3.닭가슴살
	    4.함박스테이크
	    5.소고기덮밥
	    6.라면
	*/       
	    
	    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	    
	    // === [참고] \ 역슬래쉬를 escape 문자라고 부른다. === //
	    System.out.println("나의 이름은 \"이순신\"입니다.");
	    // 나의 이름은 "이순신"입니다.
	    
	    System.out.println("C:\\NCS\\workspace_java");
	    // 역슬래쉬는 2개를 적어야 1개로 인식
	    // C:\NCS\workspace_java
	    
	    
	    
	    
	    
	    // === 8. String.join("합칠구분자", 문자열배열명) ====
	    //        문자열배열을 "합칠구분자"로 합쳐서 String 타입으로 돌려주는 것이다.
	    
	    String[] name_arr = {"한석규","두석규","세석규","네석규","오석규"};
	    String names = String.join("-", name_arr);
	    System.out.println(names);
	    // 한석규-두석규-세석규-네석규-오석규
	    
	    String str_1 = "시작하세요 안녕하세요 건강하세요";	    
	    str_1  = String.join("", str_1.split("하세요"));  // {"시작","안녕","건강"}	    
	    System.out.println(str_1);
	    // "시작 안녕 건강"
	    
	    String bank_book_no = "103-465-8594-20";
	    bank_book_no = String.join("", bank_book_no.split("[-]"));	    // {"103","465","8594","20"}
	    System.out.println(bank_book_no);
	    // 103456859420
	    
	    
	    System.out.println("\n===========================================\n");
	    
	    
	    money_1 = "$2,000,000";
	    money_2 = "$500,000";
	    
	    money_1 = String.join("", money_1.split("[$]"));  	// {"2,000,000"}
	    // "2,000, 000"
	    
	    money_1 = String.join("", money_1.split("[,]"));  	// {"2',"000","000"}
	    // "2000000"
	    
	    money_2 = String.join("", money_2.split("[$]"));	// {"500,000"}
	    // "500,000"
	    
	    money_2 = String.join("", money_2.split("[,]"));	// {"500","000"}
	    // "500000"
	    
	    sum_money = Integer.parseInt(money_1) + Integer.parseInt(money_2);
	        
	    
	    System.out.println(sum_money);
	    // 2500000
	    
	    df = new DecimalFormat("#,###");				// 3자리 마다 콤마(,)를 찍어준다.
	    System.out.println("$" + df.format(sum_money)); 
	    // $2,500,000
	    
	    
	    String input_str = "       안녕   하세요  내일  은  수요일   입니다.";	    
	    input_str = String.join("", input_str.split("\\ "));	// {"안녕","하세요","내일","은","수요일","입니다."}
	    System.out.println(input_str);
	    // 안녕하세요내일은수요일입니다.
	    
	    
	    
	    
	    // === 9. "문자열".replaceAll("변경대상문자열", "새로이변경될문자열") ====
	    //        "문자열" 에서 "변경대상문자열" 을 모두 "새로이변경될문자열" 로 교체해서 반환.
	    
	    System.out.println(names);		
	    // 한석규-두석규-세석규-네석규-오석규
	    
	    names = names.replaceAll("석규", "SK");
	    System.out.println(names);
	    // 한SK-두SK-세SK-네SK-오SK
	    
	    
	    
	    
		// === 10. "문자열".replaceFirst("변경대상문자열", "새로이변경될문자열") ====
	    //        "문자열" 에서 "변경대상문자열" 을 첫번째만 "새로이변경될문자열" 로 교체해서 반환.
	    
	    names = names.replaceFirst("SK", "석규");
	    System.out.println(names);
	    // 한석규-두SK-세SK-네SK-오SK
	    
	    names = "한SK-두SK-세SK-네SK-오SK";	    
	    // replaceFirst 를 사용하여 첫번째, 두번째, 세번째 "SK" 를 "석규" 로 변환해보기
	    
	    for(int i=0; i<3; i++) {
	    	names = names.replaceFirst("SK", "석규");
	    } // end of for--------------------------------------
	    
	    System.out.println(names);
	    // 한석규-두석규-세석규-네SK-오SK
	    
	    
	    names = "한SK-두SK-세SK-네SK-오SK";
	    // 홀수번째 나오는 것만 "SK" 를 "석규" 로 변환해보기
	    
	    String[] irum_arr = names.split("[-]");  // { "한SK","두SK","세SK","네SK","오SK" }
	    
	    for(int i=0; i<irum_arr.length; i++) {
	    	if( (i+1)%2 != 0 ) {
	    		irum_arr[i] = irum_arr[i].replaceAll("SK", "석규");
	    	}
	    } // end of for--------------------------------------
	      // { "한석규","두SK","세석규","네SK","오석규" }
	    
	    names = String.join("-", irum_arr);
    
	    System.out.println(names);
	    // 한석규-두SK-세석규-네SK-오석규	
	    	
	    
	    
	    System.out.println("\n ==== 퀴즈 ==== \n");
	    
	    String[] contents = {"호호안녕하세요","건강하세요","행복하세요 또봐요","즐겁고 건강한 하루되세요"}; 	    
	    // "건강" 이라는 단어가 포함된 것을 출력하세요.	    
	    /* <결과값>
	       건강하세요
	       즐겁고 건강한 하루되세요	      
	    */
	       
	    for(int i=0; i<contents.length; i++) {	    	
	    	int quiz1 = contents[i].indexOf("건강");
	    	if( quiz1 == -1 ) {
	    		continue;
	    	}
	    	else {
	    		System.out.println(contents[i]);	
	    	}    	 
	    } // end of for----------------------------
	    
	    System.out.println("===================================");
	    
	    // "건강" 이라는 단어로 시작하는 것만 출력하세요.
	    // <결과값>
	    // 건강하세요
	    
	    for(int i=0; i<contents.length; i++) {
	    	int quiz2 = contents[i].lastIndexOf("건강");
	    	if(quiz2 == 0) {
	    		System.out.println(contents[i]);	 
	    	}
	    } // end of for---------------------------
	    
	    
	    
	    System.out.println("===================================");
	    
	    String strr = "안녕하세요 java를 배우는 중입니다. Java is Programming Language!! JAVA를 배우는 중입니다.";
	    // str2 에서 대, 소문자를 구분치 않고 java 라는 글자가 몇변 나오는지 그 횟수를 구하세요.
	    
	    // 1. strr 의 글자를 모두 소문자로 변경
	    char[] chr_arr = strr.toCharArray();
	    for(int i=0; i<chr_arr.length; i++) {
	    	if('A' <= chr_arr[i] && chr_arr[i] <= 'Z') {
	    		chr_arr[i] = (char)(chr_arr[i]+32);	    		
	    	}
	    } // end of for-----------------------------
	    
	    
	    strr = String.valueOf(chr_arr);
	    System.out.println(strr);
	    // 안녕하세요 java를 배우는 중입니다. java is programming language!! java를 배우는 중입니다.

	    
	    // 2. java 개수 구하기
	    
	    int cnt = (strr.indexOf("java") != -1)?strr.split("java").length-1:0;
	    // strr.split("java") 은 { "안녕하세요 "," 를 배우는 중입니다. "." is programming language!! ","를 배우는 중입니다. }
	    
	    System.out.println("대소문자 구분치 않고 java의 개수 : " + cnt + "개");
	    // 대소문자 구분치 않고 java의 개수 : 3개
	    
	    
	    
	    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	    
	    
	    // === 11. "문자열".startsWith("찾고자하는문자열")  ===
	    //         "문자열" 에서 "찾고자하는문자열"이 맨첫번째에 나오면 true 를 반환.
	    //         "문자열" 에서 "찾고자하는문자열"이 맨첫번째에 나오지 않으면 false 를 반환. 
	    
	    // "건강" 이라는 단어로 시작하는 것만 출력하세요.
	    // <결과값>
	    // 건강하세요
	    
	    for(int i=0; i<contents.length; i++) {
	    	if(contents[i].startsWith("건강")) {
	    		System.out.println(contents[i]);	 
	    	}
	    } // end of for---------------------------
	    
	    
	    
	    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	    
	    	    
	    // === 12. "문자열".endsWith("찾고자하는문자열")  ===
	    //         "문자열" 에서 "찾고자하는문자열"로 끝나면 true 를 반환.
	    //         "문자열" 에서 "찾고자하는문자열"로 끝나지 않으면 false 를 반환.
	    
	    // "하세요" 라는 단어로 끝나는 것만 출력하세요.
	    /* <결과값>
	       호호안녕하세요
	       건강하세요
	    */
	    for(int i=0; i<contents.length; i++) {
	    	if(contents[i].endsWith("하세요")) {
	    		System.out.println(contents[i]);	 
	    	}
	    } // end of for---------------------------
	    
	    
	    
	    // === 13. "문자열".trim()  === 
	    //       "문자열".trim() 은 "문자열"의  좌,우에 공백이 있으면 공백을 모두 제거하고서 반환. 
	    String insa = "          수고        많으셨습니다                ";
	      
	    System.out.println("하하하"+insa+"내일 뵐께요~~");
	    // 하하하          수고        많으셨습니다                내일 뵐께요~~
	      
		System.out.println("하하하"+insa.trim()+"내일 뵐께요~~");
		// 하하하수고        많으셨습니다내일 뵐께요~~
		  
		  
		
		// === 14. "문자열".isEmpty()  === 
		//       "문자열" 이 아무것도 없으면  true 를 반환해주고,
		//       "문자열" 이 뭔가 있으면  false 를 반환해준다.
		String str1="", str2="abc", str3="        ";
		  
		System.out.println(str1.isEmpty());  // true 
		System.out.println(str2.isEmpty());  // false
		System.out.println(str3.isEmpty());  // false
		System.out.println(str3.trim().isEmpty());  // true
		//                 "".isEmpty(); 
    
		
		
		
		// === 15. "문자열".toUpperCase()  ===
	    //       "문자열"에서 소문자가 있으면 모두 대문자로 변경해서 반환.
	    String words = "My Name is Tom 입니다.";
	    System.out.println(words.toUpperCase());
	    // MY NAME IS TOM 입니다. 
	       
	    
	    
	            
	    // === 16. "문자열".toLowerCase()  ===
	    //       "문자열"에서 대문자가 있으면 모두 소문자로 변경해서 반환.
	    words = "My Name is Tom 입니다.";
	    System.out.println(words.toLowerCase());
	    // my name is tom 입니다.
	      	    
 
	    strr = "안녕하세요 javajava를 배우는 중입니다. Java is Programming Language!! JAVA를 배우는 중입니다.";
	    // str2 에서 대, 소문자를 구분치 않고 java 라는 글자가 몇변 나오는지 그 횟수를 구하세요.
	    
	    strr = strr.toLowerCase();	    
	    cnt = (strr.indexOf("java") != -1)?strr.split("java").length-1:0;
	    System.out.println("대소문자 구분치 않고 java의 개수 : " + cnt + "개");
	    // 대소문자 구분치 않고 java의 개수 : 4개
	    
	    
	    
	    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	    
	    // === 17. "문자열".contains("찾을문자열")  ===
	    //		"문자열" 에서 "찾을문자열" 을 포함하고 있으면 true 을 반환	    
	    //		"문자열" 에서 "찾을문자열" 을 포함하고 있지 않으면 false 을 반환
	    System.out.println("안녕하세요 JaVa입니다.".contains("java")); 	 				// false
	    System.out.println("안녕하세요 JaVa입니다.".toLowerCase().contains("java"));		// true
	    
	    
	    
	    
	    // === 18. "문자열".equals("비교대상문자열")  ===
	    //     대문자와 소문자를 구분하면서
	    //     "문자열" 과 "비교대상문자열" 의 값이 일치하면  true 를 반환.
	    //     "문자열" 과 "비교대상문자열" 의 값이 일치하지 않으면  false 를 반환. 
	            
	    
	    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	        
	    
	    // === 19. "문자열".equalsIgnoreCase("비교대상문자열")  ===
	    //     대문자와 소문자를 구분하지 않으면서 
	    //     "문자열" 과 "비교대상문자열" 의 값이 대,소문자와 관계없이 일치하면  true 를 반환.
	    //     "문자열" 과 "비교대상문자열" 의 값이 대,소문자와 관계없이 일치하지 않으면  false 를 반환. 
	    	    
	    
	    
	    String[] strArr = {"korea", "kORea", "   kOReA   ", "seoul", " korea seoul", " KOREA seoul", "Korea 대한민국", "서울 kOrEA 만세", null};
	    
	    
	    // strArr 에서 대소문자 구분하지 않고 "korea" 라는 글자만 있는 것을 출력하세요.
	    for(String s : strArr) {
	    	if(s != null && s.trim().equalsIgnoreCase("korea")) {
	    		System.out.println(s);
	    	}
	    } // end of for-----------------------------------
	    
	    /* <결과값>
	       korea
		   kORea
  			 kOReA 
	    */
	    
	    System.out.println("====== 또는 ======");
	    for(String s : strArr) {
	    	if( s != null && "korea".equalsIgnoreCase(s.trim()) ) {
	    		System.out.println(s);
	    	}
	    } // end of for-----------------------------------
	    
	    /* <결과값>
	       korea
		   kORea
			 kOReA 
	    */
	    
	    System.out.println("===========================================================");
	    
	    
	    // strArr 에서 "korea" 라는 글자가 들어있는 것만 출력하세요.
	    
	    /* <결과값>
	       korea
	        korea seoul
	    */
	    
	    for(String s : strArr) {
	    	if(s != null && s.contains("korea")) {
	    		System.out.println(s);
	    	}
	    } // end of for----------------------------------------
	    
	    
	    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	    
	    // strArr 에서 "korea" 또는 "KOREA" 또는 "kOrEA"와 같이 3개중에 아무거나 입력하더라도 글자가 들어있는 것만 출력하세요.
	    
	    /* <결과값>
	        "korea"
	        "korea seoul"
	        "KOREA seoul"
	        "Korea 대한민국"
	        "서울 kOrEA 만세" 가 출력되도록 하세요.
	    */
	    
	    String search = "kORea";
	    for(String s : strArr) {
	    	if( s != null && s.toLowerCase().contains(search.toLowerCase())) {
	    		System.out.println(s);
	    	}
	    	
	    } // end of for------------------------------------------
	    		
	       
	    System.out.println("==== 또는 ====");
	    
	    for(String s : strArr) {
	    	if(s != null && s.contains("korea")) {
	    		System.out.println(s);
	    	}
	    } // end of for----------------------------------------
	    
	    /* 
	      korea
		    korea seoul 
	     */
	    
	    System.out.println("\n===================================\n");
	    
	    
	    
	    
	    // ==== JDK 11 부터 새로이 추가된 String 관련 메소드 (JDK 1.8 에서는 사용이 불가함) ==== //
	      
	      // isBlank: 문자열이 비어있거나 공백이면 true 반환
	      System.out.println("".isBlank()); // true
	      System.out.println("".isEmpty()); // true
	      
	      System.out.println("         ".isEmpty()); // false
	      System.out.println("         ".isBlank()); // true
	      System.out.println("         ".trim().isEmpty()); // true
	      
	      System.out.println(" 안녕 ".isBlank()); // false
	      System.out.println(" 안녕 ".trim().isEmpty()); // false
	      
	      
	      
	      System.out.println("\n===================================\n");
	      
	      
	      
	      // strip: 문자열 공백 제거 
	      // stripLeading: 문자열 앞의 공백을 제거
	      // stripTrailing: 문자열 뒤의 공백을 제거
	      System.out.println("시작" + "        ja va       ".strip() +"끝");
	      // 시작ja va끝
	      
	      System.out.println("시작" + "        ja va       ".stripLeading() +"끝");
	      // 시작ja va       끝
	      
	      System.out.println("시작" + "        ja va       ".stripTrailing() +"끝");
	      // 시작        ja va끝
	      
	      // repeat: 문자열을 파라미터로 주어진 수 만큼 반복
	      System.out.println("\n"+"~".repeat(50)+"\n");     // ~ 를 50번 찍음
	      System.out.println("안녕 ".repeat(5));				// 안녕을 5번 찍음
	      // 안녕 안녕 안녕 안녕 안녕
	    
	      
	      System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	      
	      
	      
	      // lines: 줄 단위로 나뉘어 있는 문자를 배열로 반환
	      Object[] arr_obj = "id:leess\npwd:qwer1234$\n성명:이순신\n주소:경기도 군포시".lines().toArray();
		      for(Object obj : arr_obj) {
		         System.out.println((String)obj);
		      }// end of for------------------
		      
		 /* <결과값>
		    id:leess
			pwd:qwer1234$
			성명:이순신
			주소:경기도 군포시       
		 */
		      
	      System.out.println("------------------");
	      
	      String[] arr_str = "id:leess\npwd:qwer1234$\n성명:이순신\n주소:경기도 군포시".split("\n");
	      for(String info : arr_str) {
	         System.out.println(info);
	      }// end of for------------------
			 
	      /* <결과값>
		    id:leess
			pwd:qwer1234$
			성명:이순신
			주소:경기도 군포시       
		 */
	    
	} // end of main()-----------------------------------------------

}
