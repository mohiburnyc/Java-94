package co.edureka.threads;
class Printer{
	//public void printTable(int num) {
	synchronized public void printTable(int num) {
		for(int i=1; i<=10; i++) {
			int p = num * i;
			System.out.println(Thread.currentThread().getName()+" ----> "+ num + " x " + i + " = " + p);
			try {
				Thread.sleep(1000);
			}catch(Exception ex) {	}				
		}
		System.out.println("--------------------------------------------------------------------------");
		try {
			Thread.sleep(5000);
		}catch(Exception ex) {	}				
	}
}

class ComputerThread1 extends Thread{
	Printer printer;

	public ComputerThread1(Printer printer) {
		this.printer = printer;
	}

	public void run() {
		printer.printTable(5);
	}
}

class ComputerThread2 extends Thread{
	Printer printer;

	public ComputerThread2(Printer printer) {
		this.printer = printer;
	}

	public void run() {
		printer.printTable(6);
	}
}
public class SynchroTest {

	public static void main(String[] args) {
		Printer printer = new Printer();
		
		ComputerThread1 thread1 = new ComputerThread1(printer);
		ComputerThread2 thread2 = new ComputerThread2(printer);
		
		thread1.start();
		thread2.start();
	}

}
