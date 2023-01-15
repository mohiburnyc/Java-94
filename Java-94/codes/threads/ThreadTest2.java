package co.edureka.threads;

class MyTask1 extends Thread{
	public void run() {
		System.out.println("inside run() method");
		Thread t = Thread.currentThread();
		System.out.println(t);
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {
		System.out.println("no of active threads = " + Thread.activeCount());
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		MyTask1 ct = new MyTask1();	//new thread	
		ct.start(); //runnable thread		
		
		System.out.println("no of active threads = " + Thread.activeCount());
	}
}

