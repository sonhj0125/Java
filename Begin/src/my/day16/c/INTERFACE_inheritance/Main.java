package my.day16.c.INTERFACE_inheritance;

public class Main {

	public static void main(String[] args) {
		
		Child cd = new Child();
		cd.work();
		cd.cook();
		cd.play();
		
		System.out.println("\n=======================================\n");
		
		Inter_father father = new Child();
		father.work();
		
		Inter_mother mother = new Child();
		mother.cook();
		
		System.out.println("\n=======================================\n");
		
		Inter_child child = new Child();
		child.play();
		child.work();
		child.cook();

	} // end of main()-----------------------------------------------------------

}
