package samp;

public class interfaceD extends interfaceC implements interfaceA,interfaceB{
	void string() {
		System.out.println("This is hybrid inheritance ");
	}

	public static void main(String[] args) {
		interfaceD ob=new interfaceD();
		ob.string();
		ob.multiple();
		ob.sub();
		ob.sum();
	}

}
