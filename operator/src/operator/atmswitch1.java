package operator;

import java.util.Scanner;

public class atmswitch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=1000;
		
		String wish="no";
	
	do{
		
		System.out.println("Enter your option");
		String ab="Deposite";
		System.out.println("1."+ab);
		String bc="Withdraw";
		System.out.println("2."+bc);
		String cd="Exit";
		System.out.println("3."+cd);
		int name=sc.nextInt();
		switch (name) {
	case 1:
	     {   System.out.println("Enter your amount"); 
		     int b=sc.nextInt();
		    // a=a+b;
		     a+=b;
			 System.out.println("Your current balance="+a);
			 break;
		 }	


	case 2:
		{    System.out.println("Enter your amount");
	         int b=sc.nextInt();
			 if (b>a) {
			System.out.println("Not enough balance");}
			 else {//a=a-b;
				 a-=b;
				 System.out.println("Your current balance="+a);
				 }
			 break ;
			 }
			
		
	case 3:
	{
		System.out.println("You are exit");
		break;
		}
	}
     System.out.println("Do you wish to continue");
      wish=sc.next();
     }while(wish.equals("yes") ); 
     
	}
	
}

