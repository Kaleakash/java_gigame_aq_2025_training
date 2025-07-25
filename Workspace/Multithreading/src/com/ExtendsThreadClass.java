package com;
class MyThread1 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("i "+i);
		}
	}
}
class MyThread2 extends Thread {
	@Override
	public void run() {
		for(int j=0;j<5;j++) {
			System.out.println("j "+j);
		}
	}
}
public class ExtendsThreadClass {

	public static void main(String[] args) {
	Thread t1 = new MyThread1();
	Thread t2 = new MyThread2();
	t1.start();
	t2.start();

	}

}
