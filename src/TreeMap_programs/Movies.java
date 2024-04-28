package TreeMap_programs;

import java.util.Hashtable;
import java.util.TreeMap;

public class Movies {
public static void main(String[] args) {
	TreeMap  h = new TreeMap();
//	h.put(null, null);// cannot store null key
	h.put(200, null);  // but value can be null type
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
		TreeMap i = new TreeMap(h);
		System.out.println(i);


		// putAll
		TreeMap p = new TreeMap();
		p.putAll(h);
		System.out.println(p);

		// containsKey
		System.out.println(h.containsKey(100)); // return true if the key is present

		// get(Key)
		System.out.println(h.get(40));  // returns the value of the key

		// remove(Key)
		System.out.println(h.remove(50));  // displays and removes 
		System.out.println(h);

		//keyset()
		 System.out.println(h.keySet());  // returns all the keys in the TreeMap
		
		 
		 //values()
		 System.out.println(h.values());
		 
		 
		// try all methods
		


}
}
