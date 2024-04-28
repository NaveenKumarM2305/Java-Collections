package Hashtable_programs;

import java.util.Hashtable;
import java.util.LinkedHashMap;

public class movies {
	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		
//		h.put(null, null);// cannot store null key or values
	
		h.put(100,"KGf");	
		h.put(20,"toby");	
		h.put(10,"777");	
		h.put(50,"Kirik party");	
		h.put(30,999);	
		System.out.println(h);
		h.put(100, "KGF-2");  // only the value KGF is replaced by KGF-2 because no duplicates key are allowed
		System.out.println(h);
		h.put(40, "toby");
		System.out.println(h);
		
		// construcor method
		Hashtable i = new Hashtable(h);
		System.out.println(i);


		// putAll
		Hashtable p = new Hashtable();
		p.putAll(h);
		System.out.println(p);

		// containsKey
		System.out.println(h.containsKey(100)); // return true if the key is present

		// get(Key)
		System.out.println(h.get(40));  // returns the value of the key

		// remove(Key)
		System.out.println(h.remove(50));
		System.out.println(h);

		// try all methods

	}

}
