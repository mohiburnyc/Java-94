package co.edureka.threads;

public class LifecycleTest {

	public static void main(String[] args) throws InterruptedException {
		for(int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName().toUpperCase()+" - " + i);
			Thread.sleep(1500);
			if(i==5)
				Thread.currentThread().stop();
		}

	}

}
