package Stream1;

import java.io.FileInputStream;

public class fileinputstream1 {

	public static void main(String[] args) {
		try {
		FileInputStream obj=new FileInputStream("java.txt");
		int a=obj.available();
		while((a=obj.read())!=-1){
		System.out.println((char)a);}
		obj.close();}
		 catch(Exception e) {
			 System.out.println(e);
		}

	}

}
