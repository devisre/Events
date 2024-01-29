package Thread;

public class syncho_eg2 extends Thread {
	syncho_eg1 s;
	syncho_eg2(syncho_eg1 s){
		this.s=s;
	}
	public void run() {
		s.print(7);
	}

}
