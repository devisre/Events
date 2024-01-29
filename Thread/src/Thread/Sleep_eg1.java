package Thread;

public class Sleep_eg1 extends Thread {
	public void run() {
		for (int i=1;i<5;i++) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		//	catch(InterruptedException ex) {
			//	System.out.println(ex);{
		{System.out.println(i);}
		
		}}

	public static void main(String[] args) {
		Sleep_eg1 a1=new Sleep_eg1();
		Sleep_eg1 a2=new Sleep_eg1();
		Sleep_eg1 a3=new Sleep_eg1();
		a1.start();
		try {
			a1.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		a2.start();
        a3.start();
	}

}
