package Linked_List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class iterator_method {
	public static void main(String[] args) {
		LinkedList m = new LinkedList();
		m.add("Banglore");
		m.add("Mysuru");
		m.add("Manglore");
		System.out.println(m);
		 Iterator i=m.iterator(); 
while(i.hasNext()) {
	System.out.println(i.next());
}


ListIterator l = m.listIterator();
while(l.hasNext()) {
	System.out.println(l.next());
}
while(l.hasPrevious()) {
	System.out.println(l.previous());
}
		 
		 
}
	
}