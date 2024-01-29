package collection;

import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {

	public static void main(String[] args) {
		HashMap <Integer,String>hmap=new HashMap<>();
		hmap.put(3,"house");
		hmap.put(8,"flat");
		hmap.put(1,"hut");
		hmap.put(4,"tent");
		hmap.put(2,"mansion");
		
		for(Map.Entry m: hmap.entrySet()) {
		System.out.println(m.getKey()+","+m.getValue());}
		
	}}