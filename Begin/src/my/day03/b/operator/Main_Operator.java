package my.day03.b.operator;

public class Main_Operator {

	public static void main(String[] args) {
		
		// #### 1. 산술연산자 ####
		//       + - * / %(나머지)
		
		System.out.println("==== 1. 산술연산자 + - * / %(나머지) ====");
		
		int n = 10;
		System.out.println("n+3 = "+ n+3);
		// n+3 = 103     n+3 = 10 문자열에 3을 합침. = 103
		
		System.out.println("n+3 = "+ (n+3));
		// n+3 = 13
		
		System.out.println("n+3 = "+ (n+3));  // n+3 = 13
		System.out.println("n+3 = "+ (n-3));  // n-3 = 7
		System.out.println("n+3 = "+ (n*3));  // n*3 = 30
		System.out.println("n+3 = "+ (n/3));  // n/3 = 3. 정수/정수 = 정수(몫)
		System.out.println("n+3 = "+ ((double)n/3));   // n+3 = 3.3333333333333335
		System.out.println("n%3 = "+ (n%3));  // n%3 = 1  10을 3으로 나누었을 때의 나머지를 말함.
		
		
		// #### 2. 증감연산자 ####
		//         ++ --
		System.out.println("\n==== 2. 증감연산자 ++ -- ====");
		
		/*
		  int a = 7;
		  int b = 3;
		*/
		// 또는
		int a = 7, b = 3;
		System.out.println("a => " + a);    // a => 7
			
		// a = a + 1;
		// 또는
		a++;
		System.out.println("a => " + a);    // a => 8
		
		++a;
		System.out.println("a => " + a);    // a => 9
		
		
////////////////////////////////////////////////////////////////////		
		
		System.out.println("b => " + b);    // b => 3
		
		// b = b - 1;
		// 또는
		b--;
		System.out.println("b => " + b);    // b => 2
		
		--b;
		System.out.println("b => " + b);    // b => 1
		
	// !!!! 꼭 암기하세요 !!!! //
    // 후위증감연산자(a++; b--;)는 다른 연산을 다 마친 이후에 1씩 증감한다.
    // 전위증감연산자(++a; --b;)는 맨먼저 1씩 증감을 마친 이후에 다른 연산을 한다.
		int x = 10, y = 10;
		int z = ++x;    // x = x + 1; 먼저 실행 후 int z = x; 하는 것과 같다.
		System.out.println("z => " + z);  // z => 11
		System.out.println("x => " + x);  // x => 11
		
		z = y++;        // z = y; 먼저 실행 후 y = y + 1; 하는 것과 같다.
		System.out.println("z => " + z);  // z => 10
		System.out.println("y => " + y);  // y => 11
		
		System.out.println("x => " + x++);  // System.out.println("x => " + x); x => 11 그 다음, x = x + 1;
		System.out.println("x => " + x);    // x => 12
		
		System.out.println("y => " + ++y);  // y = y + 1; 그 다음, System.out.println("y => " +y); y => 12
		System.out.println("y => " + y);    // y => 12
		
		
		
		
		
		
		
	}

}
