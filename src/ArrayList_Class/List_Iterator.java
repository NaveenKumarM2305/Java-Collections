package ArrayList_Class;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_Iterator {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		
		//to display the elements in reverse order by using hasnext() and next()
		ListIterator p = a.listIterator();
		while(p.hasNext()) {
			System.out.println(p.next());
		}
		while(p.hasPrevious()) {
			System.out.println(p.previous());
		}
		System.out.println("------------------------------------------");
		// to display the elements in reverse order by "not" using hasnext() and next()
		ListIterator l = a.listIterator(a.size());
		
		while(l.hasPrevious()) {
			System.out.println(l.previous());
		}

}
}