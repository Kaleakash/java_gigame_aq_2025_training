package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionStreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = Arrays.asList("Ravi","Ramesh","Lokesh","Ram","Ahay","Ajay","Ajay");
		System.out.println(names.size());
		// display all names in lower case 
		//names.stream().map(m->m.toLowerCase()).forEach(e->System.out.println(e));
		// few more terminal operator 
		boolean result1 = names.stream().allMatch(e->e.contains("a"));
		System.out.println(result1);
		boolean result2 = names.stream().allMatch(e->e.length()>=2);
		System.out.println(result2);
		boolean result3 = names.stream().anyMatch(e->e.endsWith("i"));
		System.out.println(result3);
		System.out.println("afer filter or map or any other intermediate operator we want to store");
		List<String> namesUpperCase=  names.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
		System.out.println(namesUpperCase);
		List<String> filterNames=  names.stream().filter(f->f.contains("e")).collect(Collectors.toList());
		System.out.println(filterNames);
		Set<String> startNames=  names.stream().filter(f->f.startsWith("A")).collect(Collectors.toSet());
		System.out.println(startNames);
	}

}
