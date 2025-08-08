package defaultandstatic;

//@FunctionalInterface
interface Abc {
	void dis1();		// default is abstract 
	default void dis2() {
		System.out.println("Abc interface dis2() default implementation");
	}
	default void dis3() {
		System.out.println("Abc interface dis3() default implementation");
	}
	static void dis4() {
		System.out.println("Abc interface dis4() static implementation");
	}
	
}
class Test implements Abc {
	@Override
	public void dis1() {
	System.out.println("Test class provided the body for dis1 abstract method");
	}
	@Override
	public void dis2() {
		System.out.println("Abc interface dis2() default implementation override by Test class");
	}
	
}
public class Java8Interface {

	public static void main(String[] args) {
		Test tt =new Test();
		tt.dis1();
		tt.dis2();
		tt.dis3();
		Abc.dis4(); // static 

	}

}
