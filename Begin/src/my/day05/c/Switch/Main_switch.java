package my.day05.c.Switch;

import java.util.Scanner;

public class Main_switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input_str = "";
		
		try {			
			System.out.print("◈ 첫 번째 정수 입력 => ");
			input_str = sc.nextLine();
			int num1 = Integer.parseInt(input_str);      // 문자열을 정수로 형변환 시킨다.
														 // 10
														 // 3000000000
														 // 튤립
				
			System.out.print("◈ 두 번째 정수 입력 => ");
			input_str = sc.nextLine();
			int num2 = Integer.parseInt(input_str);      // 문자열을 정수로 형변환 시킨다.
			 											 // 4
														 // 5000000000
														 // 해바라기
			
			System.out.print("◈ 사칙연산을 선택하세요(+ - * /) => ");   // + - * /
																 // 안녕, #, 숫자 등..			
			String operator = sc.nextLine();	
			String result = "";
			double calc_result = 0;
			
		/*	
			if("+".equals(operator)) {
				 calc_result = num1 + num2;
			}
			else if("-".equals(operator)) {
				 calc_result = num1 - num2;
			}
			else if("*".equals(operator)) {
				 calc_result = num1 * num2;
			}	
			else if("/".equals(operator)) {
				 calc_result = (double)num1 / num2;
			}
			else {
				// 사칙연산 선택 시 + - * / 를 제외한 다른것을 입력한 경우
				System.out.println("[경고] 사칙연산 선택은 + - * / 만 입력하세요.");
				sc.close();
				return; // 종료
			}
		*/	
			
			
		switch (operator) { // operator 가 비교대상, string 타입
			case "+": // operator 값이 "+" 와 같다면
				calc_result = num1 + num2; // 같다면 계산
				break; // break 를 만나면 switch 문을 빠져나옴(end)
				
			case "-":
				calc_result = num1 - num2;
				break;
				
			case "*":
				calc_result = num1 * num2;
				break;
				
			case "/":
				calc_result = (double)num1 / num2;
				break;	

			default: // 사칙연산 선택 시 + - * / 를 제외한 다른것을 입력한 경우
				System.out.println("[경고] 사칙연산 선택은 + - * / 만 입력하세요.");
				sc.close();
				return; // 종료
			} // end of switch()-------------------------------
	
		
	/*			
			if("/".equals(operator)) {
				
				if(num1%num2 == 0) {
					result = num1 + operator + num2 + " = " + (int)calc_result;
					 // 10 / 5 = 2
				}
				else {
				result = num1 + operator + num2 + " = " + calc_result;
				// 10/4 = 2.5
				}		
			}
			else { // + - * 인 경우
				result = num1 + operator + num2 + " = " + (int)calc_result;
			}
			
						
			System.out.println(result);
			
			   10 + 4 = 14
			   10 - 4 = 6
			   10 * 4 = 40
			   10 / 4 = 2.5  --> 실수가 나오게 하고 싶음.
	*/
		
		
		switch (operator) { // 키보드에 입력한 값이
			case "/": // 나누기 라면,
				if(num1%num2 == 0) { // 나머지가 없을 경우
					result = num1 + operator + num2 + " = " + (int)calc_result;
					// 10 / 5 = 2
				} else { // 나머지가 있는 경우
					result = num1 + operator + num2 + " = " + calc_result;
					// 10/4 = 2.5
					}		
			break; // switch 문장에서 break; 를 만나면 switch(operator){} 부분을 빠져나감.
		default: // + - * 인 경우
			result = num1 + operator + num2 + " = " + (int)calc_result;
			break;
		} // end of switch (key)---------------------------------
		
		System.out.println(result);
		
			
		} catch(NumberFormatException e) {
			System.out.println("\n>> 입력하신 "+input_str+"은(는) 올바른 데이터가 아닙니다. <<");
			
		} catch(ArithmeticException e) {
			System.out.println(">>> 0 으로 나눌 수 없습니다. <<<");	
		}
	
		sc.close();
		
	} // end of public static void main(String[] args)-----------------

}
