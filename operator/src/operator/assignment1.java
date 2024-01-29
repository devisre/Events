package operator;

import java.util.Scanner;

public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		String check="prime";//or int x=0
		for (int i=2;i<a;i++) {
		if (a%i==0) {
		System.out.println("not a prime number");
		check="not prime";// or x=1
		break;
		}
		}
		if(check.equals("prime")) {//or x==0
		System.out.println("no is prime");
		}	

	}

}
