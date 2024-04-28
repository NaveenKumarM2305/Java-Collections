package File_Input_Output;
import java.io.*;
public class To_Create {
	public static void main(String[] args) throws IOException{
		File f = new File("Sample.txt"); // file is created because its not created before
		FileOutputStream fos = new FileOutputStream(f,true);
		fos.write('h');
		fos.write('e');
	System.out.println("File Created and data is stored");
	}

}
