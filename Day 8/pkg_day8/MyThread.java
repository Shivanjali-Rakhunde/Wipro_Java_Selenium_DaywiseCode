package pkg_day8;

public class MyThread extends Thread {
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName()+"- Value: "+ i);
			try {
				Thread.sleep(1000); //Pause for 1 Second
			} catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		
		
		t1.start(); //Starts the first thread
		t2.start(); // Starts the second thread

	}

}
