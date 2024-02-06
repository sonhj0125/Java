package my.day15.a.overriding;

public class Child extends Parent {
	
	// 메소드의 오버라이딩(overriding) == 메소드의 재정의
	// 메소드의 오버라이딩 시 접근제한자는 부모클래스에서 정의한 메소드의 접근제한자와 같거나 또는 더 큰 범위의 허용되는 값을 해야 한다.
	// 예) private > 표준 > protected > public
	// 또한 메소드의 오버라이딩 시 껍데기(리턴타입, 메소드명, 파라미터) String info() 는 동일해야 한다.
	// 알맹이(내용물)는 새롭게 정의해서 만들면 된다.
	
	@Override		// @ 를 애노테이션(어노테이션)이라 부른다.
	public String info() {
		return "아이디 : " + super.id + "\n"
			  +"비밀번호  : " + super.passwd;
	}
	

}
