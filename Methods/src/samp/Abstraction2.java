package samp;

public class Abstraction2 extends Abstraction1{
	void string() {
		System.out.println("printing");
	}

	public static void main(String[] args) {
		Abstraction2 ob=new Abstraction2();
		ob.print();
		ob.string();
		

	}

}
