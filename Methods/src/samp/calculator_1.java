package samp;

import java.util.Scanner;

public class calculator_1 {
	
 int add(int a, int b){
		 int addition=a+b;
		 System.out.println(addition);
		 return addition; }

 int sub(int a, int b){
		 int substraction =a-b;
		 System.out.println(substraction);
		 return substraction;}

 int multiple(int a, int b){
		 int multiplication=a*b;
		 System.out.println(multiplication);
		 return multiplication;}
 
 int divide(int a, int b){
		 int division=a/b;
		 System.out.println(division);
		 return division;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
calculator_1 ob=new calculator_1();

System.out.println("Enter your numbers");
int a=sc.nextInt();
int b=sc.nextInt();

System.out.println("Enter your option");
String ab="Addition";
System.out.println("1."+ab);
String bc="Substraction";
System.out.println("2."+bc);
String cd="Multiplication";
System.out.println("3."+cd);
String de="Division";
System.out.println("4."+de);
int name=sc.nextInt();

switch (name) {

case 1:
{  ob.add(a,b); 
   break;}

case 2:
{   ob.sub(a,b);
   break;}

case 3:
{   ob.multiple(a,b);
   break;}

case 4:
{   ob.divide(a,b) ;
   break;}
	
}
}}


