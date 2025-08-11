package streamapi;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class PrimitiveArrayWithMathsOperationUsingStreamAPI {

	public static void main(String[] args) {
		int num[]= {1,2,5,3,4};
		Arrays.stream(num).summaryStatistics().getMax();
		
	IntSummaryStatistics summary=	IntStream.of(10,20,30,40,50,60,70,80,90,100).summaryStatistics();
	System.out.println(summary.getCount());
	System.out.println(summary.getAverage());
	System.out.println(summary.getSum());
	System.out.println(summary.getMax());
	System.out.println(summary.getMin());
	}

}
