package Stream1;

import java.io.FileOutputStream;

public class fileoutputStream2 {

	public static void main(String[] args) {
		try {
			FileOutputStream ob=new FileOutputStream("welcome.txt") ;
		String a="Welcome to java Files.";
		byte b[]=a.getBytes();
		ob.write(b);
		ob.close();
		System.out.println("success...");
	}
		catch(Exception e) {System.out.println(e);}
	
		
	}			
			}
		
	


