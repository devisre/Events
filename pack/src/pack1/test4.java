package pack1;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		//int a=sc.nextInt();
		int sumOeven=0;
		int sumOodd=0;
		for(int a=1;a<=10;a++) {
			if(a%2==0) {
				sumOeven=a+sumOeven;}
		else if(a%2!=0) {
			    sumOodd=a+sumOodd;}
	      }  
		System.out.println(sumOeven);	
		System.out.println(sumOodd);
		}
				
}
	
		

	


