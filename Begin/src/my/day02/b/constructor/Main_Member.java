package my.day02.b.constructor;

public class Main_Member {

	public static void main(String[] args) {
		
		Member hongkd_mbr = new Member();
		hongkd_mbr.userid = "hongkd";
		hongkd_mbr.passwd = "qwer1234";
		hongkd_mbr.name = "홍길동";
		hongkd_mbr.email = "hongkd@naver.com";
		hongkd_mbr.age = 33;
		hongkd_mbr.point = 100;
		
		hongkd_mbr.info_print();
		
/////////////////////////////////////////// 위의 내용을 줄이기
		
		Member eomjh_mbr = new Member("eomjh", "abcd", "엄정화", 27, 200);
		eomjh_mbr.info_print();
		

	}

}
