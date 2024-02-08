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
        
        
        
        
        

	} // end of main()-----------------------------------------------------

}
