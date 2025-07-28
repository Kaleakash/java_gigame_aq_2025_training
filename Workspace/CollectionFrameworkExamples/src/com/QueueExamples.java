package com;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
public class QueueExamples {
	public static void main(String[] args) {
		Queue qq1 = new PriorityQueue();
			qq1.add(4);qq1.add(1);qq1.add(6);qq1.add(5);
		System.out.println(qq1);
		System.out.println("Remove "+qq1.poll());
		System.out.println(qq1);
		System.out.println("----------------");
		Queue qq2 = new LinkedList();
		qq2.add(4);qq2.add(1);qq2.add(6);qq2.add(5);
		System.out.println(qq2);
		System.out.println("Remove "+qq2.poll());
		System.out.println(qq2);
	}

}
