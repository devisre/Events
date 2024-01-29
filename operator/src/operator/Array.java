package operator;

public class Array {

	public static void main(String[] args) {
		int a;
		int c[]=new int[5];
		int b[]= {1,2,3,4,5,9};
		a=9;
		c[0]=10;
		
	System.out.println(a);
	System.out.println(b[0]);
	System.out.println(b[1]+b[3]);
	System.out.println(b[1]+""+b[4]);
	for(int i=0;i<b.length;i++) {//b.length means total numbers in that array
		System.out.println(b[i]*2);
	}
	System.out.println(b.length);
	

}}
