package C;

import A.package1;

public class package2 {

	public static void main(String[] args) {
   package1 ob=new package1();
   ob.add();
   System.out.println(ob.getAge());
   System.out.println(ob.getName());
   ob.setage(56);
   ob.setname("sreedevi");
   System.out.println(ob.getAge());
   System.out.println(ob.getName());
}}
