package Stream1;

import java.io.FileInputStream;

public class fileinputstream2 {

	public static void main(String[] args) {
		try {
		FileInputStream fis=new FileInputStream("java.txt");
		int a=fis.read();
		while((a=fis.read())!=-1){
		System.out.println((char)a);}
		fis.close();}
		
		catch(Exception e) {
			System.out.println("successfully completed");
		}
		

	}

}
