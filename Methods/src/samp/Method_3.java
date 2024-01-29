package samp;

import java.util.Scanner;

public class Method_3 {
 int b=6;
 void sub() {
 int b=15;
 int c=7;
 System.out.println(b-c);
 }
 
 int add(int i, int j){
		 int addition=i+j;
		 System.out.println(addition);
return addition;}
		 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
Method_3 ob=new Method_3();
		int i=sc.nextInt();
		int j=sc.nextInt();
		ob.add(i,j);
ob.sub();
System.out.println(ob.b);
	}

}
