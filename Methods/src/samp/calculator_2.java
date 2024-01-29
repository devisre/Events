package samp;

import java.util.Scanner;

public class calculator_2 extends calculator_1 {
	
	
  public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc=new Scanner(System.in);
  calculator_2 ob=new calculator_2();
  int a= sc.nextInt();
  int b= sc.nextInt();
    ob.add(a,b);
    ob.sub(a,b);
    ob.multiple(a,b);
    ob.divide(a,b);

	}

}
