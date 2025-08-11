package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> result1 = Optional.of("Akash");
		Optional<String> result2 = Optional.empty();
		if(result2.isPresent()){
			System.out.println("name presnet");
		}else {
			System.out.println("Name not presnet");
		}
		
		Optional<Integer> result3 =  Arrays.asList(10,20,30,40,50,60).stream().findFirst();
		if(result3.isPresent()) {
				Integer result = result3.get();
				System.out.println(result);
		}else {
			System.out.println("no present");
		}
		
		List<String> names = Arrays.asList();
		Optional<String> result4 = names.stream().findAny();
		if(result4.isPresent()) {
			System.out.println(result4.get());
		}else {
			System.out.println("No element");
		}
		
		
	}

}
