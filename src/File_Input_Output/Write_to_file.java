package File_Input_Output;
import java.io.*;
public class Write_to_file {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Naveen Kumar M\\Desktop\\Hello.txt", false);
		fos.write(110);
		fos.write('d');
		fos.write(90);
		System.out.println("Done");
		int i=97;
		int h=97;
		while(i!=128)
	{
			
			fos.write(h);
			h++;
          	i++;
	}	
}

}
