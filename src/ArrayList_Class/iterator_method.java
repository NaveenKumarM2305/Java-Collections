package ArrayList_Class;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator_method {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("Naveen");
		a1.add("22");
		a1.add("Banglore");
		System.out.println(a1);
		 Iterator i =a1.iterator(); 
		 // we create object for ArrayList class with the help of iterator() which is present in Iterator Interface
		 while(i.hasNext()) {
			 System.out.println(i.next());
		 }
	}

}
