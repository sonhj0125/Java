package my.day17.b.user_define_exception;

public class Product_imple implements Product {	
// public class Product_imple extends Object implements Product { 와 동일
// 모든 클래스의 최상위 부모 클래스는 Object 이며, 클래스 생성시 extends 를 하지 않으면 자동적으로 extends Object 가 생략된 것이다.

	// field
	private String prod_name; 	// 제품명 ("새우깡", "감자깡", "양파링")
	private int jango;			// 잔고	(100,		50,		150)
	
	
	// method
	
	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public int getJango() {
		return jango;
	}

	public void setJango(int jango) {
		this.jango = jango;
	}
	
	
	// 제품의 정보를 보여주기
	@Override
	public String toString() {	// toString() 의 원뿌리는 Object => getinfo 하지 않아도오버라이딩해서 재정의할 수 있음.

		return "1. 제품명 : " + prod_name + "\n"
			 + "2. 잔고량 : " + jango + "개\n";
	}
	
	
	// 메소드의 오버라이딩
	// 주문받기1
	
	@Override
	public void order(int jumun_su) throws Jango_lack_Exception {
		
	// order(int jumun_su) 메소드는 파라미터로 들어오는 jumun_su 의 값에 따라서 
	// 사용자(개발자)가 만든 Jango_lack_Exception 익셉션을 유발할 수 있다는 말이다. 
		
	
		if(jango < jumun_su) {
			throw new Jango_lack_Exception();
		}
		else {
			System.out.println(prod_name + " 제품 " + jumun_su + "개를 주문하셨습니다.");
			jango -= jumun_su;
			System.out.println(toString());
		}	
	} // end of public void order(int jumun_su) throws Jango_lack_Exception-----------------

	
	// 주문받기2
	
	@Override
	public void jumun(int jumun_su) throws Jango_lack_Exception {
		
	// jumun(int jumun_su) 메소드는 파라미터로 들어오는 jumun_su 의 값에 따라서 
	// 사용자(개발자)가 만든 Jango_lack_Exception 익셉션을 유발할 수 있다는 말이다. 
		
	
		if(jango < jumun_su) {
			throw new Jango_lack_Exception(">> 남아있는 " + prod_name + "은 잔고가 " + jango + "개 인데, 주문량이 "+ jumun_su + "개 이므로 잔고부족으로 주문이 불가합니다. <<");
		}
		else {
			System.out.println(prod_name + " 제품 " + jumun_su + "개를 주문하셨습니다.");
			jango -= jumun_su;
			System.out.println(toString());
		}	
	} // end of public void jumun(int jumun_su) throws Jango_lack_Exception------------------

	
	
	
	
	
	
	
	
	
	
	
	
}
