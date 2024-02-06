package my.day15.e.polymorphism;

public class Cat extends Animal{
	
	// Cat 만 가지는 field 를 정의 (추상화)	
	private String color;

	
	
	// Cat 만 가지는 method 를 정의 (추상화)	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if(color != null && !color.isBlank()) {
			this.color = color;
		}
		
	}
	
	
	// === 메소드의 오버라이딩(메소드의 재정의) === //
	@Override
	protected void view_info() {	
		System.out.println("==== 고양이 정보 ====\n"
				+ "1. 이름 : " + super.getName() + "\n"
				+ "2. 생년 : " + super.getBirth_year() + "년\n"
				+ "3. 색상 : " + color + "\n");
	}
	
	@Override
	protected void action() {
		System.out.println( "[고양이는 점프를 합니다.!!!]");
	}
	
	
	
	

}
