package Thread;

public class syncho_eg4 {

	public static void main(String[] args) {
		syncho_eg1 t1=new syncho_eg1();
		syncho_eg2 t2=new syncho_eg2(t1);
		syncho_eg3 t3=new syncho_eg3(t1);
		t2.start();
        t3.start();
	}

}

