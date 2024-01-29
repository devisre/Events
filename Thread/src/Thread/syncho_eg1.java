package Thread;

public class syncho_eg1 {
	synchronized void print(int a) {
	 for(int i=1;i<=5;i++) {
		 System.out.println(a*i);}
	 
	 try {Thread.sleep(500);}
	 catch(InterruptedException e) {
		 System.out.println(e);
	 }
	 }

}
