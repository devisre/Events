package operator;

import java.util.Scanner;

public class string_comparison1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String username="priya_sreedevi";
//System.out.println("username="+username);
String password="sreepriya";
//System.out.println("password="+password);
System.out.println("Enter your username");
String name=sc.nextLine();
System.out.println("Enter your password");
String number=sc.nextLine();
if ((!username.equals(name))&&(!password.equals(number))) {//ins string comparison(==)= .equals(),(!=)= add ! first
	
	System.out.println("Login successfully");
}
else {
	System.out.println("Login failed");
}

	}

}
