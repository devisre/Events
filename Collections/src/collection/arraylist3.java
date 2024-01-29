package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist3 {

	public static void main(String[] args) {
		arraylist2 ar1=new arraylist2(22, "silpa", 18);
		arraylist2 ar2=new arraylist2(22,"jisna",28);
		ArrayList <arraylist2> Ar=new ArrayList<>();
		Ar.add(ar1);
		Ar.add(ar2);
		Iterator itr=Ar.iterator();
		while(itr.hasNext()){
			arraylist2 arr=	(arraylist2)itr.next();
			System.out.println(arr.age+","+arr.name+","+arr.rollno);
			
		}
		
		
		
	}

}
