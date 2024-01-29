package Stream1;

import java.io.FileWriter;

public class Filewriter2 {

	public static void main(String[] args) {
		try {
		FileWriter fw=new FileWriter("java.txt");
		fw.write("successfully write data to a file");
		fw.close();
		System.out.println("completed");}
		
		catch(Exception e) {
			System.out.println("FileWriter");
		}
	}

}
