package Thread;

public class thread_eg2 implements Runnable {
	public void run() {
		System.out.println("thread is running");
	}

	public static void main(String[] args) {
		thread_eg2 ob=new thread_eg2 ();
		Thread t1=new Thread();
		ob.run();
		t1.start();
	}

}
