package streamapi;

import java.util.function.Consumer;

class MyConsumer implements Consumer<Integer>{
	@Override
	public void accept(Integer t) {
		System.out.println(" Value is "+t);
	}
}
public class FuntionInterfaceExample {

	public static void main(String[] args) {
	// without lambda 
	Consumer<Integer> cc1 = new MyConsumer();
	cc1.accept(100);
	// with lambda 
	Consumer<String> cc2 = (name)->System.out.println("name is "+name);
	cc2.accept("Raj Deep");
	}

}
