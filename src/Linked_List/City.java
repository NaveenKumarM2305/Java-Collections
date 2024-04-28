package Linked_List;

import java.util.LinkedList;

public class City {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("Bengaluru");
		l.add("Mysuru");
		l.add("Mangaluru");
		l.add("Dharwada");
		System.out.println(l);  //[BL,MY,MG,DW]
		LinkedList m = new LinkedList();
		m.add(l);  //[[BL,MY,MG,DW]]
		m.add("udupi"); //[[BL,MY,MG,DW],udupi]
		
		System.out.println(m);
		System.out.println(m.contains(l));  //true
		System.out.println(l.contains(m));   //false
		System.out.println("------------------------");
		System.out.println(m.containsAll(l));  // false
		System.out.println(l.containsAll(m));  // false
		
		
	}

}
