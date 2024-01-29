package collection;

import java.util.Vector;

public class Vectoreg1 {

	public static void main(String[] args) {
		Vector<String> vec=new Vector<>();
		
		vec.addElement("raj");
		vec.addElement("ravi");
		vec.addElement("arun");
		vec.addElement("aravind");
		vec.addElement("saran");
		vec.addElement("raju");
		vec.addElement("abhi");
		vec.addElement("tej");
		vec.addElement("ram");
		vec.addElement("jisna");
		vec.addElement("anu");

		System.out.println(vec);
		System.out.println("The size of this Array = " +vec.size());
		System.out.println("The capacity of this array = " +vec.capacity());
		System.out.println("The first element = " +vec.firstElement());
		System.out.println("The last element = " +vec.lastElement());
		System.out.println("Remove element = " +vec.remove(2));
		System.out.println("Get element = " +vec.get(5));
		System.out.println(vec);
		
		if(vec.contains("tej")) {
			System.out.println(vec.indexOf("tej"));
		}
	



}
}