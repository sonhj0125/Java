package my.day15.b.overloading;

public class Child extends Parent {
	
	//field
	String name;
	
	// == 메소드의 오버라이딩(overriding) == 메소드의 재정의 == //
	// 메소드의 오버라이딩 시 접근제한자는 부모클래스에서 정의한 메소드의 접근제한자와 같거나 또는 더 큰 범위의 허용되는 값을 해야 한다.
	// 예) private > 표준 > protected > public
	// 또한 메소드의 오버라이딩 시 껍데기(리턴타입, 메소드명, 파라미터) String info() 는 동일해야 한다.
	// 알맹이(내용물)는 새롭게 정의해서 만들면 된다.
	
	@Override		// @ 를 애노테이션(어노테이션)이라 부른다.
	public String info() {
		return "아이디 : " + super.id + "\n"
			  +"비밀번호  : " + super.passwd;
	}
	
	// == 메소드의 오버로딩(overloading) == //
	// 파라미터만 중복되지 않으면 됨.(오버로딩 overloading)
	public void info(int n) {
		System.out.println("");
	}	
	
	public void info(short m) {
		System.out.println("");
	}
	
	public void info(int a, String str) {
		System.out.println("");
	}
	
	public void info(String s, int b ) {
		System.out.println("");
	}
	
	public String info(String s, int b, int c ) {
		return "";
	}
	
	private void info(int c, String st, byte d ) {
		System.out.println("");
	}
	
	// 오버라이딩(overriding) : 부모클래스로부터 상속받은 메소드 내용을 수정할 때 메소드의 리턴타입과 이름, 파라미터는 동일해야한다. 그리고 접근제한자는 허용범위가 같거나 더 커야함.
	// 오버로딩(overloading) : 메소드의 이름은 같지만, 파라미터가 다르면 동일한 메소드로 취급하지 않는다. 접근제한자 및 리턴타입은 메소드의 오버로딩에 관련이 없음.
	
	
	// == 생성자의 오버로딩(overloading) == //
	public Child() {
		
	}
	
	public Child(String id, String passwd) {
		this.id = id;
		this.passwd = passwd;
	}
	
	public Child(String id, String passwd, String name) {
		this(id, passwd);		
		this.name = name;
	}
	
	/*
	 
	  public Child(String id, String passwd, String name) {
	  // 생성자가 먼저 나와야함. this.name = name; 밑에 나오면 오류. 
	   
	  this.name = name; 	  
	  this(id, passwd); 	  
	  }
	   
	*/
	
	
	
	
	
	
	
}
