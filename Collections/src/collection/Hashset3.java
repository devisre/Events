package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset3 {

	public static void main(String[] args) {
		HashSet <hashset2>hset=new HashSet<>();
		hashset2 h1=new hashset2("ashok",12,25000);
		hashset2 h2=new hashset2("abhiraj",14,27000);
		hashset2 h3=new hashset2("anand",9,21000);
		hashset2 h4=new hashset2("jeeva",5,30000);
		hashset2 h5=new hashset2("geetha",8,33000);
		
		hset.add(h1);
		hset.add(h2);
		hset.add(h3);
		hset.add(h4);
		hset.add(h5);
		
		Iterator it=hset.iterator();
		while(it.hasNext()) {
		hashset2 hs=(hashset2)it.next();	
System.out.println(hs.name+","+hs.idno+","+hs.salary);}
		


	}

}
