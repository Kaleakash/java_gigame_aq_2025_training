package methodreference;

import java.util.Arrays;

interface Operation {
	int add(int x, int y);
}
class OperationImp {
	public static int add(int x, int y) {
		return x+y;
	}
}

class OperationImp1 {
	public int add(int x, int y) {
		return x+y;
	}
}
public class MethodReferenceExample {

	public static void main(String[] args) {
	Operation op = (x,y)->x+y;
	System.out.println(op.add(100, 200));

	Operation op1 = OperationImp::add;
	System.out.println(op1.add(10, 20));
	
	OperationImp1 opp1 = new OperationImp1();
	Operation op2 = opp1::add;
	System.out.println(op2.add(1, 2));
	
	int num[]= {10,20,30,40};
	System.out.println("using stream with labmda");
	Arrays.stream(num).forEach(e->System.out.println(e));
	System.out.println("using stream with method reference");
	Arrays.stream(num).forEach(System.out::println);
	}

}
