package ArrayList_Class;

import java.util.ArrayList;

public class Cities2 {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
	a1.add("Bengaluru");
	a1.add(560001);
	a1.add("Udupi");
	a1.add(58001);
	a1.add("Mysuru");
	a1.add("Mysuru");
	System.out.println(a1);
ArrayList a2 = new ArrayList();
a2.add(a1);  //adds entire a1 as one object 
a2.add(0,"maddhur");
a2.add(0,"Manglore");
//a2.add(4,"Kundapur");// exception due to index 3 is not present
a2.add(3,"Kunigal"); 
System.out.println(a2);

}
}


