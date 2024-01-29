package operator;

import java.util.Scanner;

public class while_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		int b=1;
		System.out.println("Multiplication table of");
		
		while (b<=10) {
			int c=b*a;
			
			System.out.println(b+"*"+a+"="+c);
			b++;
		}
	
		}
		

	}


