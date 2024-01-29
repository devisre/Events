package Thread;

public class syncho_eg3 extends Thread {
	syncho_eg1 s;
	syncho_eg3(syncho_eg1 s){
		this.s=s;
	}
    public void run() {
    	s.print(100);
    }
}
