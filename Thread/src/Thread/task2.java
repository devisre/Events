package Thread;

public class task2 {

	public static void main(String[] args) {
		task1 obj=new task1();
		new Thread(){
	    public void run(){obj.booktickets(550);}
			}.start();
			
	   new Thread(){
	   public void run(){obj.cancellation(50);}
			}.start();

	}

}
