package my.day13_14.b.multi_inheritance;

// public class Me extends Father, Mother{

	// 자바는 클래스 생성시 여러 클래스를 동시에 상속받는 다중상속이 불가하다.!!
	// 자바는 인터페이스 생성시에는 여러 인터페이스를 동시에 상속받는 다중상속이 가능하다.!! 
	// 참고로 C++ 이라는 언어에서는 클래스 생성시 여러 클래스를 동시에 상속받는 다중상속이 가능하다.
	

public class Me extends Mother {		// Father -> Mother -> Me 순차적으로 상속받음
	
	String name = "이순신";
	
	// Me 클래스는 Mother 클래스에서 사용되어지는 String userid 와 String passwd 를
	// 상속받아 사용할 수 있게 된다.

}
