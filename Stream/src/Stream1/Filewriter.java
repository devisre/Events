package Stream1;

import java.io.*;

public class Filewriter {

	public static void main(String[] args) {
		try {
		FileWriter obj=new FileWriter("java.txt");
		obj.write("this is filewriter");
		obj.close();
		System.out.println("completed");}
		
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
	}

}
