package my.day02.b.constructor;

public class Member {
	
	// field, attribute, property, 속성
	String userid;
	String passwd;
	String name;
	String email;
	int age;
	int point;
	
	// constructor(생성자)는 2가지가 있는데,
	// 기본생성자( 파라미터(== 매개변수)가 없는 생성자 )와
	// 파라미터(== 매개변수)가 있는 생성자로 나뉘어진다.
	
	// 기본생성자 ( 파라미터(== 매개변수)가 없는 생성자 )
	Member() {}
	
	// 파라미터(== 매개변수)가 있는 생성자
	Member(String a, String b, String c, int d, int e) {
		userid = a;
		passwd = b;
		name = c;
		age = d;
		point = e;
	}
	
	// behavior, 행위, 기능, method
	void info_print() {
		System.out.println("=== " + name + "님의 회원정보 ===\n" 
						+ "1. 아이디 : " + userid + "\n"
						+ "2. 비밀번호 : " + passwd + "\n"
						+ "3. 성명 : " + name + "\n"
						+ "4. 나이 : " + age + "\n"
						+ "5. 포인트 : " + point + "\n"
						+ "6. 이메일 : " + email + "\n");
								
	}
	

}
