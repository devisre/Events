package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {

	public static void main(String[] args) {
		ArrayList<String> co=new ArrayList<> ();
		int a;
		co.add("java");
		co.add("hello");
		co.add("eclipse");
		co.add("arraylist");
		System.out.println(co);
		System.out.println(co.get(1));
		co.set(3,"array");
		co.remove("hello");
        System.out.println(co);
        System.out.println("Is Arraylist Empty="+co.isEmpty());
        for(a=1;a<=5;a++) {
        	System.out.println(co);
        Iterator itr=co.iterator();	
       
        }

        }
		}
		
	


