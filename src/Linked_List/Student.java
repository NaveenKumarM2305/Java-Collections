package Linked_List;

import java.util.LinkedList;

public class Student {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(1);
		l.add("Naveen Kumar M");
		l.add("BCA");
		l.add(2);
		l.add("Darshan D Sutar");
		l.add("BE");
		System.out.println(l);
		LinkedList m = new LinkedList(l);
	 m.addAll(l);
	System.out.println(m.containsAll(l));
	System.out.println(l.containsAll(m));
	
		System.out.println(m);
		
	}

}
