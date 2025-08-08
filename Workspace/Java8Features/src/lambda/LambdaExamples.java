package lambda;


interface Operation {
	public int add(int x, int y);
}
interface Compare {
	public String findLargest(int x, int y);
}
public class LambdaExamples {

	public static void main(String[] args) {
	Operation op1 = (x,y)->x+y;	// it return by default without return keyword 
	System.out.println(op1.add(100, 200));
	Operation op2 = (a,b)->a+b;	// it return by default without return keyword 
	System.out.println(op2.add(10, 20));
	Operation op3 = (int x,int y)->x+y;	// it return by default without return keyword 
	System.out.println(op3.add(1, 2));
	Compare cc = (x,y)-> {
		if(x>y) {
			return "1st Number is largest";
		}else {
			return "2nd Number is largest";
		}
	};
	System.out.println(cc.findLargest(100, 500));
	}

}
