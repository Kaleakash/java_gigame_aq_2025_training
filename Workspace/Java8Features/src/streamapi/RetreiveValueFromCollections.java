package streamapi;

import java.util.ArrayList;
import java.util.List;

public class RetreiveValueFromCollections {

	public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	list.add(10);list.add(20);list.add(30);list.add(40);

	System.out.println(list);
	System.out.println("Retreive element from collection using for enhanced loop");
	for(int n:list) {
		System.out.println(n);
	}
	System.out.println("retreive the data using lambda");
	list.forEach((v)->System.out.println("Value is "+v));
	}

}
