package operator;

import java.util.Scanner;

public class studentdetails1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter student name");
	    String Name=sc.nextLine();
	  
	    System.out.println("Enter class");
	    int Class=sc.nextInt();
	 
	    System.out.println("Enter roll number");
	    int Rollno=sc.nextInt();
	
	    System.out.println("Enter mark");
	    int Mark=sc.nextInt();
	    
	    System.out.println("Name="+Name);
	    System.out.println("Class="+Class);
	    System.out.println("Rollno="+Rollno);
	    System.out.println("Mark="+Mark);
	    if (Mark>70) {
	    	System.out.println("Eligible for higher studies");
	    }
	    else {
	    	System.out.println("Not eligible for higher studies ");
	    }
	    
	 
		
	}
	}
