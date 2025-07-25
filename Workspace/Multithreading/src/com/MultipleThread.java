package com;
class Task implements Runnable{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
	}
}
public class MultipleThread {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		Runnable task = new Task();
		Thread t1 = new Thread(task,"first thread");
		Thread t2 = new Thread(task,"second thread");
		Thread t3 = new Thread(task,"third thread");
		Thread t4 = new Thread(task,"fourth thread");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
