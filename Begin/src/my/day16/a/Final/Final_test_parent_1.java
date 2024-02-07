package my.day16.a.Final;

public class Final_test_parent_1 {

	// field
	String id;
	String name;
	
	// field 에 final 을 붙이면 더 이상 새로운 값으로 할당할 수 없다.
	final double pi = 3.141592;	// 상수 변수
	
	
	// method
	void greeting() {
		System.out.println("~~~ 안녕하세요 ~~~");
	}
	
	
	// 메소드 앞에 final 을 붙이면, 자식클래스에서 메소드의 오버라이딩을 하지 못한다.
	final void rule() {
		System.out.println("~~~ 정직하게 삽시다 ~~~");
	}
	
	
	
}
