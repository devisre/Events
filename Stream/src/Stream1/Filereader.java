package Stream1;

import java.io.FileReader;

public class Filereader {

	public static void main(String[] args)throws Exception {
		FileReader fr=new FileReader("welcome.txt");
		int a=fr.read();
		while((a=fr.read())!=-1)
		System.out.println((char)a);
		fr.close();
		}
		
	}


