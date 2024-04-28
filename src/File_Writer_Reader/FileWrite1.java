package File_Writer_Reader;
import java.io.*;

class FileWrite1 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("File1.txt", true);
		fw.write("Java Program");
		fw.flush(); // to insert data/ push data
		fw.close();
		System.out.println("Data Stored");
		FileReader fd = new FileReader("File1.txt");
		int a =0;
		while( (a=fd.read())!=-1)  // read() returns integer , and initialised to variable a  
		{// read()  will return -1 if data is not present
			System.out.print((char)a);
		}
		fd.close();
 
	}

}
