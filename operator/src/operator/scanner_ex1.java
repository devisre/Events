package operator;

import java.util.Scanner;

public class scanner_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		switch (number) {
		case 10->System.out.println(number);
		case 20->System.out.println(number);
		default->System.out.println("error");
		}
		

	}

}
