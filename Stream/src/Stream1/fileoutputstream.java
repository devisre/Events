package Stream1;

import java.io.*;

public class fileoutputstream {


	public static void main(String[] args)throws IOException {
		FileOutputStream obj=new FileOutputStream("welcome.txt");
		obj.write(65);
		obj.write(76);
		obj.close();
		System.out.println("completed..");

	}

}
