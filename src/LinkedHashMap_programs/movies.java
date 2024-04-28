package LinkedHashMap_programs;

import java.util.LinkedHashMap;

public class movies {
	public static void main(String[] args) {
		LinkedHashMap h = new LinkedHashMap();
		// insertion order is maintained
		h.put(null, null);
		h.put(null, null);// one more entry will not be created , instead will be replaced
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
		LinkedHashMap i = new LinkedHashMap(h);
		System.out.println(i);


		// putAll
		LinkedHashMap p = new LinkedHashMap();
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
