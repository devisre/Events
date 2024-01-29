package operator;

import java.util.Scanner;

public class atmproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

int a=1000;
System.out.println("Current Balace=1000");

String first="Enter your option";
System.out.println(first);

String depos=sc.nextLine();

if(depos.equals("Deposite")) {
	System.out.println("Do you wish to continue Yes or No?");{
 String yes=sc.nextLine();
	if(yes.equals("Yes")) {
	System.out.println("Enter your amount"); 
	int b=sc.nextInt();
	System.out.println("Your current balance="+(a+b));}
	else if(yes.equals("No")) {
		System.out.println(first);}          }}

	
else if(depos.equals("Withdraw")) {
	System.out.println("Do you wish to continue Yes or No?");{ 
	String no=sc.nextLine();
	 if(no.equals("Yes")) {
	System.out.println("Enter your amount");{
	int b=sc.nextInt();
	if (b>a) {
	System.out.println("Not enough balance");}
	else {System.out.println("Your current balance="+(a-b));}}
	 }
	else if(no.equals("No")) {
			System.out.println(first);}      }}

else if (depos.equals("Exit")) {
	System.out.println(first);
}

 String second=sc.nextLine();
 System.out.println(first);
	
	 }
}
