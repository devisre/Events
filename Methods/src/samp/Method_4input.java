package samp;

import java.util.Scanner;

  public class Method_4input {
	  
    int add (int i,int j) {
	   int addition=i+j;
	  System.out.println(addition);
	  return addition;}
	  
		  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Method_4input ob=new Method_4input ();
		int i=sc.nextInt();
		int j=sc.nextInt();
		ob.add(i, j);
		

	}

}
