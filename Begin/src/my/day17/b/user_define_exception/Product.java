package my.day17.b.user_define_exception;

public interface Product {
	
	// 주문받기1
	void order(int jumun_su) throws Jango_lack_Exception;		// 사용자가 정의하는 Jango_lack_ExceptionException
	
	
	// 주문받기2
	void jumun(int jumun_su) throws Jango_lack_Exception ;

}
