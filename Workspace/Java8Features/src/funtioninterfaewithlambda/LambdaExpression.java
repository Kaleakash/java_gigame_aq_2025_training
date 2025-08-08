package funtioninterfaewithlambda;

interface Hello {
	void display1();
}
class HelloImp implements Hello {
	@Override
	public void display1() {
	System.out.println("Provide body for display1 using class ");
		
	}
}
public class LambdaExpression {

	public static void main(String[] args) {
		//1st Option 
		Hello h1 = new HelloImp();
		h1.display1();
		//2nd Option 
		Hello h2 = new Hello() {
			@Override
			public void display1() {
				// TODO Auto-generated method stub
				System.out.println("Provide body for display1 using anonymouse inner class - first way");
			}
		};
		h2.display1();
		Hello h3 = new Hello() {
			@Override
			public void display1() {
				// TODO Auto-generated method stub
				System.out.println("Provide body for display1 using anonymouse inner class -  second way");
			}
		};
		h3.display1();
		// 3rd Option 
		Hello h4 = ()->System.out.println("Providing body for display1 using lambda expression");
		h4.display1();

	}

}
