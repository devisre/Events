package operator;

import java.util.Scanner;

public class SwitchDob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	  System.out.println("Date");
	  int Date=sc.nextInt();
	  System.out.println("Month");
	  int Month=sc.nextInt();
	  System.out.println("Year");
	  int Year=sc.nextInt();
	  System.out.println("Date="+Date);
	  System.out.println("Month="+Month);
	  System.out.println("Year="+Year);
	  
	  
	  System.out.print("Your Birthday on:");
	  switch(Month) {
	  case 1->System.out.println(Date+" "+"January"+" "+Year);
	  case 2->System.out.println(Date+" "+"February"+" "+Year);
	  case 3->System.out.println(Date+" "+"March"+" "+Year);
	  case 4->System.out.println(Date+" "+"April"+" "+Year);
	  case 5->System.out.println(Date+" "+"May"+" "+Year);
	  case 6->System.out.println(Date+" "+"June"+" "+Year);
	  case 7->System.out.println(Date+" "+"July"+" "+Year);
	  case 8->System.out.println(Date+" "+"August"+" "+Year);
	  case 9->System.out.println(Date+" "+"September"+" "+Year);
	  case 10->System.out.println(Date+" "+"October"+" "+Year);
	  case 11->System.out.println(Date+" "+"November"+" "+Year);
	  case 12->System.out.println(Date+" "+"December"+" "+Year);
	  }
	  
	  int b=2023;
	  System.out.println("Your age:"+(b-Year));
    
      }

      }
