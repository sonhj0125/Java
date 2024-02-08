package my.day18.a.collection;

import java.util.ArrayList;
import java.util.List;

/*
	== ArrayList == 
	1. 출력시 저장된 순서대로 나온다.
	2. 중복된 데이터를 저장할 수 있다.
	3. 데이터를 읽어오는 속도는 ArrayList 가 LinkedList 보다 상대적으로 빠르다.
	4. 순차적으로 데이터를 추가/삭제하는 경우에는 ArrayList 가 LinkedList 보다 상대적으로 빠르다.
	5. 일반적인 데이터 추가/삭제는 데이터 중간 중간마다 발생하므로 이러한 경우에는 ArrayList 가 LinkedList 보다 상대적으로 느리다.
	6. 결과값은 ArrayList 를 사용하든지 LinkedList 를 사용하든지 동일한 결과값을 가진다.
	7. LinkedList 보다는 ArrayList 를 사용하도록 하자.
*/

public class ArrayList_main_2 {

	public static void main(String[] args) {
		
		// Member 클래스의 객체만을 저장할 수 있는 ArrayList 객체 mbrList 를 생성한다.		
		List<Member> mbrList = new ArrayList<>();
		
		
		// Member 클래스의 객체 7개를 생성하여 mbrList 에 저장한다.
        mbrList.add(new Member("youjs","Qwer1234$","유재석","7209101"));
        mbrList.add(new Member("eom","Qwer1234$","엄정화","6808152"));
        mbrList.add(new Member("kanghd","Qwer1234$","강호동","7006151"));
        mbrList.add(new Member("leess","Qwer1234$","이순신","0010203"));
        mbrList.add(new Member("kimth","Qwer1234$","김태희","0105064"));
        mbrList.add(new Member("kangkc","Qwer1234$","강감찬","9812301"));
        mbrList.add(new Member("kimss","Qwer1234$","김순신","0203203"));
        
        
        Member mem1 = new Member("parksj","Qwer1234$","박서준","8812161");
		Member mem2 = mem1;
		mem2.setName("이현우");
		
		mbrList.add(mem1);	// 중복된 데이터를 저장할 수 있다.
		mbrList.add(mem2);  // 중복된 데이터를 저장할 수 있다.
		
        
        // mbrList 에 저장된 회원들의 정보를 출력하도록 한다.
        for(int i=0; i<mbrList.size(); i++) {
        	System.out.println(mbrList.get(i));     	
        } // end of for--------------------------------------
        
        
        
        /*
           === 유재석님의 회원정보 ===
           1. 아이디 : youjs
           2. 비밀번호 : Qwer1234$
           3. 성명 : 유재석
           4. 주민번호 : 7209101      
           5. 성별 : 남
           6. 만나이 : 51
           
           === 엄정화님의 회원정보 ===
           1. 아이디 : eom
           2. 비밀번호 : Qwer1234$
           3. 성명 : 엄정화
           4. 주민번호 : 6808152      
           5. 성별 : 여
           6. 만나이 : 55
           .................
        */
        
        
        System.out.println("=====================================================\n");
        
        
        for(Member mbr : mbrList) {
        	System.out.println(mbr); 
        } // end of for--------------------------------------
        
        
        System.out.println("\n=====================================================\n");
        
        System.out.println("\n[퀴즈1] mbrList 에 저장되어진 모든 회원들중에 여자만 정보를 출력하세요 \n"); 
        
        for(Member mbr : mbrList) {
            
        	if("여".equals(mbr.gender())) {
     			System.out.println(mbr);
     			}
     			
     			
        }// end of for--------------------------------------
        
        
        System.out.println("\n[퀴즈2] mbrList 에 저장되어진 모든 회원들중에 성이 김씨인 회원만 정보를 출력하세요 \n");
        
        boolean is_existence = false;
		/*
		  for(Member mbr : mbrList) { 
		  if(mbr.getName().startsWith("김")) { 
		  is_existence = true; 
		  System.out.println(mbr); 
		  } 
		  } // end of for--------------------------------------
		*/
        for(Member mbr : mbrList) {
        	if(mbr.getName().indexOf("김") == 0) {
        		 is_existence = true; 
        		 System.out.println(mbr); 
        	}
        } // end of for--------------------------------------
        
        if(!is_existence) {
        	System.out.println("김씨는 없습니다.");
        }
        
        
        
        System.out.println("\n[퀴즈3] mbrList 에 저장되어진 모든 회원들중에 이름이 순신인 회원만 정보를 출력하세요 \n");
              
        is_existence = false;
        
        for(Member mbr : mbrList) {
        	if(mbr.getName().endsWith("순신")) {
        		 is_existence = true; 
        		 System.out.println(mbr); 
        	}
        } // end of for--------------------------------------
        
        if(!is_existence) {
        	System.out.println("이름이 순신인 회원은 없습니다.");
        }
        
        
        
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        
        
        // *** ArrayList 타입인 mbrList 에 새로운 Member 객체 추가시
        //     특정 index(위치)에 들어가도록 할 수 있다. *** 
        
        System.out.println("\n ~~~ mbrList 에 새로운 Member 객체 추가하기 ~~~ \n"); 
              
        mbrList.add(new Member("seolh","Qwer1234$","설현","9910122"));
        // index 값이 없으면 mbrList 의 맨 뒤에 추가된다.
        System.out.println(mbrList.get(mbrList.size()-1));
        
        
        System.out.println("\n######################################\n");
        
        mbrList.add(3, new Member("seokj","Qwer1234$","서강준","9901051"));
        // 유재석(0) 엄정화(1) 강호동(2) 이순신(3) 으로 되어있었는데
        // 유재석(0) 엄정화(1) 강호동(2) 서강준(3) 이순신(4) 으로 된다.     
        
        for(Member mbr : mbrList) {
        		 System.out.println(mbr); 
        } // end of for--------------------------------------
        
        
        
     // **** ArrayList 타입인 mbrList 에 저장되어진 Member 객체 삭제하기 **** //
        System.out.println("\n **** ArrayList 타입인 mbrList 에 저장되어진 Member 객체 삭제하기 **** \n");
        
        System.out.println(">> 삭제하기 전 mbrList.size() => " + mbrList.size() + "\n");
        Member deleted_mbr =  mbrList.remove(3);		// mbrList.remove(3); 은 삭제할 Member 객체의 index 번호
        System.out.println(deleted_mbr);
        
       /*
        	=== 서강준님의 회원정보 ===
        	1. 아이디 : seokj
        	2. 비밀번호: Qwer1234$
        	3. 성명 : 서강준
        	4. 주민번호 : 9901051
        	5. 성별 : 남
        	6. 만나이 : 25세
		*/
        
        System.out.println(">> 삭제한 후 mbrList.size() => " + mbrList.size());
        // >> 삭제한 후 mbrList.size() => 10
        
        
        System.out.println("\n######################################\n");
        
        
        for(Member mbr : mbrList) {
        	System.out.println(mbr);
        } // end of for--------------------------------------
        
        System.out.println("\n========================================\n");
        
        boolean is_delete = mbrList.remove(mbrList.get(0));		// index 0번 유재석을 넣어주면, 유재석이 지워짐. return 타입은 boolean
        System.out.println(is_delete + "\n");
        
        for(Member mbr : mbrList) {
        	System.out.println(mbr);
        } // end of for--------------------------------------
        
        
        
        
        System.out.println("\n[퀴즈3] mbrList 에 저장되어진 모든 회원들중에 이름이 순신인 회원만 정보를 출력하세요 \n");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

	} // end of main()-----------------------------------------------------

}
