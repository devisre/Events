package Stream1;

import java.io.FileReader;

public class Filereader2 {

	public static void main(String[] args) {
		try {
		FileReader FR=new FileReader("java.txt");
		int a=FR.read();
		while((a=FR.read())!=-1) {
			System.out.println((char)a);}
		}
		
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
