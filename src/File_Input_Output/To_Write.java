package File_Input_Output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;
public class To_Write {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Naveen Kumar M\\eclipse-workspace\\Collections\\src\\File_Input_Output\\Demo.txt");
		FileOutputStream fos = new FileOutputStream(f, false);
//		fos.write(110);
//		fos.write('d');
//		fos.write(90);
		System.out.println("Done");
		int i=1;
		int h=1;
		while(i!=128)
	{
			
			fos.write(h);
			h++;
          	i++;
	}
		fos.close();
		FileInputStream fis = new FileInputStream(f);
		System.out.println(fis.available());  // returns number of characters in file i.e.,127
		while(fis.available()!=0) // available()  will return 0 if data is not present
		{
			System.out.print((char)fis.read());
		}
		fis.close();
System.out.println("Done");
	}

}
