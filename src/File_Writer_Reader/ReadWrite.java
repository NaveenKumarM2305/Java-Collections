package File_Writer_Reader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {
	public static void main(String[] args) throws IOException {
		FileReader fd = new FileReader("C:\\Users\\Naveen Kumar M\\eclipse-workspace\\Collections\\src\\File_Writer_Reader\\ReadMe");
		int a =0;
		FileWriter fw = new FileWriter("C:\\Users\\Naveen Kumar M\\eclipse-workspace\\Collections\\src\\File_Writer_Reader\\WriteMe");

		while( (a=fd.read())!=-1)  // read() returns integer , and initialised to variable a  
		{// read()  will return -1 if data is not present
			fw.write(a);
		}
		fd.close();
	//	FileWriter fw = new FileWriter("C:\\Users\\Naveen Kumar M\\eclipse-workspace\\Collections\\src\\File_Writer_Reader\\WriteMe", true);
		//int a =0;
		
		fw.flush(); // to insert data/ push data
		fw.close();
		System.out.println("done");
 
	}

}
