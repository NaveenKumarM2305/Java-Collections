package ArrayList_Class;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator2 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		System.out.println(a);
		Iterator i= a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		     
		}
	}

}
