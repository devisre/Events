package operator;

import java.util.Scanner;

public class arraystring1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	String []cars= {"Suzuki","BMW","Honda","Kia"};
	int []price= {400,500,300,1200};
	System.out.println("Enter your options:");
	System.out.println("Suzuki");
	System.out.println("BMW");
	System.out.println("Hond");
	System.out.println("Kia");
	String car=sc.nextLine();
	
	if(car.equals(cars[0])) {
		System.out.println(cars[0]+"="+price[0] );
	 }
	else if(car.equals(cars[1])) {
		System.out.println(cars[1]+"="+price[1]);
	}
	else if(car.equals(cars[2])) {
		System.out.println(cars[2]+"="+price[2]);
	}
	else if(car.equals(cars[3])) {
		System.out.println(cars[3]+"="+price[3]);
	}
			
	System.out.println("Enter your budget");
	int a=sc.nextInt();
	if(a>=1200) {
		System.out.println(cars[0]+"="+price[0]);
		System.out.println(cars[1]+"="+price[1]);
		System.out.println(cars[2]+"="+price[2]);
	    System.out.println(cars[3]+"="+price[3]);
	    }
	
	else if (a>=500) {
		System.out.println(cars[0]+"="+price[0]);
		System.out.println(cars[2]+"="+price[2]);
		System.out.println(cars[3]+"="+price[3]);
	}
	else if(a>=400) {
		
		System.out.println(cars[0]+"="+price[0]);
		System.out.println(cars[2]+"="+price[2]);
	}
	else if (a>=300) {
		System.out.println(cars[2]+"="+price[2]);
	}else {
		System.out.println("sorry");
	}
	}

}
