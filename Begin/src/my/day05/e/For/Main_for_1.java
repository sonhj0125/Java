package my.day05.e.For;

import java.util.Iterator;

/*
 **** 반복문(loop) ==> for 문 ****
  
    ※ for 문의 형식
   
    for(초기화; 조건식; 증감식) {
          반복해서 실행할 문장;
    }  
    
    ▣ 순서
    1) 초기화;
    2) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
                              조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
               } 을 빠져나간다.)
    3) 증감식
    4) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
                              조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
               } 을 빠져나간다.) 
    5) 증감식
    6) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
                              조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
               } 을 빠져나간다.)                                                  
    
*/
public class Main_for_1 {

	public static void main(String[] args) {
		
		for(int i=0; i<10 ; i++) {  // 조건이 거짓이라면 sysout 하지 않고 빠져나옴
	         System.out.println((i+1)+ ". 안녕자바~");;
	    }  
		
		/*
		   1. 안녕자바~
		   2. 안녕자바~
		   3. 안녕자바~
		   4. 안녕자바~
		   5. 안녕자바~
		   6. 안녕자바~
		   7. 안녕자바~
		   8. 안녕자바~
		   9. 안녕자바~
		   10. 안녕자바~
		   10번을 반복하는 코드
		*/
		
		System.out.println("===========================================");
		
		for(int i=0; i<10; i+=1) {   // i+=1; 은 i = i+1; 와 같다.
			System.out.println((i+1) + ". 안녕 Java~");
		}
		

		/*
		   1. 안녕 Java~
		   2. 안녕 Java~
		   3. 안녕 Java~
		   4. 안녕 Java~
		   5. 안녕 Java~
		   6. 안녕 Java~
		   7. 안녕 Java~
		   8. 안녕 Java~
		   9. 안녕 Java~
		   10. 안녕 Java~
		*/
		
		System.out.println("===========================================");
		
		for(int i=0; i<10; i+=1) {   
			System.out.println(++i + ". 안녕 이클립스~"); // 전위는 자신 먼저 증가
		}
		
		/*
		   1. 안녕 이클립스~		   
		   3. 안녕 이클립스~		  
		   5. 안녕 이클립스~			   
		   7. 안녕 이클립스~			   
		   9. 안녕 이클립스~			   
		*/
		
		System.out.println("===========================================");
		
		for(int i=0; i<10; i+=2) {    // i+=1; 은 i = i+2; 와 같다.
			System.out.println((i+1) + ". 안녕 Eclipse~"); 
		}
	
		/*
		  1. 안녕 Eclipse~
		  3. 안녕 Eclipse~
		  5. 안녕 Eclipse~
		  7. 안녕 Eclipse~
		  9. 안녕 Eclipse~		   
		*/
		
		
		System.out.println("===========================================");
		
		for(int i=0, j=0; i<10; i++, j+=2) {   
			System.out.println((j+1) + ". 안녕 오라클~"); 
		}
	
		/*
		  1. 안녕 오라클~
		  3. 안녕 오라클~
		  5. 안녕 오라클~
		  7. 안녕 오라클~
		  9. 안녕 오라클~
		  11. 안녕 오라클~
		  13. 안녕 오라클~
		  15. 안녕 오라클~
		  17. 안녕 오라클~
		  19. 안녕 오라클~		   
		*/
		
		
		System.out.println("===========================================");
		
		for(int i=10; i>0; i--) {   			
			System.out.println(i + ". 안녕 Oracle~"); 		
		}
		
		/*
		  10. 안녕 Oracle~
		  9. 안녕 Oracle~
		  8. 안녕 Oracle~
		  7. 안녕 Oracle~
		  6. 안녕 Oracle~
		  5. 안녕 Oracle~
		  4. 안녕 Oracle~
		  3. 안녕 Oracle~
		  2. 안녕 Oracle~
		  1. 안녕 Oracle~	   
		*/
		
		System.out.println("===========================================");
		
		for(int i=10; i>0; i-=1) {   			// i-=1; 은 i = i-1; 과 같다.
			System.out.println(i + ". 안녕 스프링~"); 		
		}
		
		/*
		  10. 안녕 스프링~
		  9. 안녕 스프링~
		  8. 안녕 스프링~
		  7. 안녕 스프링~
		  6. 안녕 스프링~
		  5. 안녕 스프링~
		  4. 안녕 스프링~
		  3. 안녕 스프링~
		  2. 안녕 스프링~
		  1. 안녕 스프링~  
		*/
		
		System.out.println("===========================================");
		
		for(int i=10; i>0; i--) {   		
			if(i%2 != 0)    // 홀수라면, i%2 은 i 를 2 로 나누었을때의 나머지를 나타내는 것이다.
				System.out.println(i + ". 안녕 Spring~");		 // if(){} 에서 {} 는 해당 명령어가 1개밖에 없으면, {} 를 해도되고 안해도됨.				
		}
		
		/*
		   9. 안녕 Spring~
		   7. 안녕 Spring~
		   5. 안녕 Spring~
		   3. 안녕 Spring~
		   1. 안녕 Spring~ 
		*/
		
		System.out.println("===========================================");
		
		for(int i=10; i>0; i-=2) { // 2씩 감소하므로 5번 반복
			System.out.println((i-1) +".안녕하십니까?");			
		}
		
		/*
		   9. 안녕하십니까?
		   7. 안녕하십니까?
		   5. 안녕하십니까?
		   3. 안녕하십니까?
		   1. 안녕하십니까? 
		*/
		
		System.out.println("===========================================");
		
		for(int i=10; i>0; i--) { 
			System.out.println(--i +".Hello");		
		}
		
		/*
		   9.Hello
		   7.Hello
		   5.Hello
		   3.Hello
		   1.Hello
		*/
		
		System.out.println("===========================================");
		
		for(int i=0, j=9; i<5; i++, j-=2) { 
			System.out.println(j + ".헬로");		
		}
		
		/*
		   9.헬로
		   7.헬로
		   5.헬로
		   3.헬로
		   1.헬로
		*/
	
		System.out.println("===========================================");
		
		int i=0;  // 초기화
		for(; i<5; i++) { 
			System.out.println( (i+1) + ".길동");		
		}// end of for ---------------------------------	
		System.out.println("반복문을 빠져나온 i 값 : " + i);
		// 반복문을 빠져나온 i 값 : 5
		
		System.out.println("\n>> 프로그램 종료 <<");

	}

}
