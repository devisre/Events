package exception;

import java.util.Scanner;

public class class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   int b=sc.nextInt();
   try 
       {System.out.println(a/b);}
   catch
       (ArithmeticException e) {System.out.println("/ by 0 is not poosii");}
   finally
      {System.out.println("this is the last line");}
	}

}
