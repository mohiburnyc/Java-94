package co.edureka.threads;

class MyTask implements Runnable{
	public void run() {
		System.out.println("inside run() method");
		Thread t = Thread.currentThread();
		System.out.println(t);
	}
}

public class ThreadTest1 {

	public static void main(String[] args) {
		System.out.println("no of active threads = " + Thread.activeCount());
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		MyTask task = new MyTask();
		Thread ct = new Thread(task); //new thread
		ct.start(); //runnable thread
		
		
		System.out.println("no of active threads = " + Thread.activeCount());
	}
}
