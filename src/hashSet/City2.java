package hashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class City2 {
public static void main(String[] args) {
	HashSet<String> h = new HashSet<String>();
	h.add("Bengaluru");
	h.add("Mysuru");
	h.add("Mangluru");
	h.add("Udupi");
	System.out.println(h);
	ArrayList a = new ArrayList(h);  // copy HashSet to ArrayList()
	System.out.println(a);
}
}
