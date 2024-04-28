package ArrayList_Class;

import java.util.ArrayList;

public class contains_and_containsAll {
public static void main(String[] args) {
	ArrayList a = new ArrayList();
	a.add("Apple");
	a.add("banana");
	a.add("Orange");
	ArrayList b = new ArrayList();
//	b.add(a); // adds collection 'a' as one object in 'b'
////	b.addAll(a); //copies collect 'a' to 'b'
//	System.out.println(b.contains(a));  // 'a' collection is strored in 'b ' as a single object hence true
//	System.out.println(b.containsAll(a)); // false
//	System.out.println(b.contains("Apple")); // false 
//	System.out.println(b.contains(a));  // ture
//	

	b.addAll(a); //copies collect 'a' to 'b'
	System.out.println(b.contains(a));  // false
	System.out.println(b.containsAll(a)); // true
	System.out.println(b.contains("Apple")); // true
	System.out.println(b.contains(a));//false
}
}
