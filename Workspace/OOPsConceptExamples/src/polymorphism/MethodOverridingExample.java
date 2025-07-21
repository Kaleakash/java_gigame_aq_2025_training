package polymorphism;
class Bike {
	void speed() {
		System.out.println("Generic Speed : 60km/hr");
	}
}
//class Honda extends Bike {
//	void mailage() {
//		System.out.println("Honda mailage : 65km/lt");
//	}
//}
class Pulsar extends Bike {
	void mailage() {
		System.out.println("Pulsar mailage : 40km/lt");
	}
	void speed() {
		System.out.println("Override Speed by pulsar : 90km/hr");
	}
}
public class MethodOverridingExample {
	public static void main(String[] args) {
	//Pulsar pu = new Pulsar();
	//pu.speed();	pu.mailage();
	//Honda hh =new Honda();
	///hh.speed(); hh.mailage();
	Bike bb = new Pulsar();					// creating object of super class and assign the super class reference possible 
	bb.speed();
	//bb.mailage();
	//Pulsar pp = new Bike();					// creating super class object and sub class reference not possible 
	}

}
