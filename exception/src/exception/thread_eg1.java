package exception;

public class thread_eg1 extends Thread {
   public void run() {
	   System.out.println("running...");
   }
   
   public static void main(String args[]) {
	   thread_eg1 ob=new thread_eg1();
	   thread_eg1 ob1=new thread_eg1();
	   ob.start();
	   ob1.start();
   }
}
 