package pack1;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Age");
		int a=sc.nextInt();
	if (a<=2) {
		System.out.println("Infant");
		}
	else if((a>=3)&&(a<=5)) {
		System.out.println("Toddler");
	}
	else if((a>=6)&&(a<=12)) {
		System.out.println("Child");
	}
	else if((a>=13)&&(a<=19)) {
		System.out.println("Teenager");
	}
	else if(a<=20) {
		System.out.println("Adult");
	}
	}

}
