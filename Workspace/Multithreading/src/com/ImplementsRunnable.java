package com;

class MyThread3 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("i "+i);
		}
	}
}
class MyThread4 implements Runnable {
	@Override
	public void run() {
		for(int j=0;j<5;j++) {
			System.out.println("j "+j);
		}
	}
}
public class ImplementsRunnable {

	public static void main(String[] args) {
	Runnable r1 = new MyThread3();
	Runnable r2 = new MyThread4();
	//r1.run();
	//r2.run();
	
	Thread t1 = new Thread(r1);
	Thread t2 = new Thread(r2);
	t1.start();
	t2.start();

	}

}
