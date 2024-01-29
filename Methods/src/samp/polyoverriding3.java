package samp;

public class polyoverriding3 extends polyoverriding1 {
	void dog() {
		System.out.println("eating...");
	}

	public static void main(String[] args) {
		polyoverriding3 ob=new polyoverriding3();
		ob.dog();

	}

}
