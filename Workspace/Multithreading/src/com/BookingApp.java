package com;
class BookTicket implements Runnable{
	int avl=2;
	@Override
	public synchronized void run() {
		String name = Thread.currentThread().getName();
		if(avl>0) {
			System.out.println(name+ " booked the ticket");
			avl = avl-1;
		}else {
			System.out.println(name+" sorry no ticket");
		}
		
	}
}
public class BookingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable task1 = new BookTicket();		// avl=2
		//Runnable task2 = new BookTicket();		// avl=2
		//Runnable task3 = new BookTicket();		// avl=2
		//Runnable task4 = new BookTicket();		// avl = 2
		
		Thread t1 = new Thread(task1,"Raj");
		Thread t2 = new Thread(task1,"Ajay");
		Thread t3 = new Thread(task1,"Vikash");
		Thread t4 = new Thread(task1,"Mahesh");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
