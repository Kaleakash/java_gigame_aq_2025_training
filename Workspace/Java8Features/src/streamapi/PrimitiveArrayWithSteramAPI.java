package streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

public class PrimitiveArrayWithSteramAPI {

	public static void main(String[] args) {
	//int num[]= {1,2,3,4,5,6,7,8,9,10};

	// num is container 
	//Stream.of(num).forEach(v->System.out.println("Value is "+v));
	//Arrays.stream(num).forEach(v->System.out.println("Value is "+v));
	// display only even number 
	//Arrays.stream(num).filter(v->v%2==0).forEach(v->System.out.println("Value is "+v));
	// display only odd number 
	//Arrays.stream(num).filter(v->v%2!=0).forEach(v->System.out.println("Value is "+v));
	// modify each element with some value 
	//Arrays.stream(num).map(m->m+10).forEach(v->System.out.println(v));
		
	String names[]= {"Ravi","raj","Mahesh","Reeta","Leeta","Vikash","akash"};
	
	//Arrays.stream(names).filter(name->name.contains("ee")).forEach(name->System.out.println(name));
//	Arrays.stream(names).map(name->name.toUpperCase()).forEach(name->System.out.println(name));
	Stream<String> ss = Arrays.stream(names);
	ss.forEach(e->System.out.println(e));
	ss.forEach(e->System.out.println(e));
	}

}
