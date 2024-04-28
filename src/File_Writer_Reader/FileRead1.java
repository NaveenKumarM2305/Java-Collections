package File_Writer_Reader;
import java.io.*;
public class FileRead1 {
	public static void main(String[] args) throws IOException {
		FileReader fd = new FileReader("C:\\Users\\Naveen Kumar M\\eclipse-workspace\\Collections\\src\\File_Writer_Reader\\Test.txt");
	System.out.println(fd.read());
	
	}

}
