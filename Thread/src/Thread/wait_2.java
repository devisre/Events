package Thread;

public class wait_2 {

	public static void main(String[] args) {
		wait_eg1 a1=new wait_eg1();
		new Thread(){
		public void run(){a1.withdraw(15000);}
		}.start();
		new Thread(){
		public void run(){a1.deposit(10000);}
		}.start();

	}

}
