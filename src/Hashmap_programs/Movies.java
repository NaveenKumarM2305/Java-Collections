package Hashmap_programs;
import java.util.*;
public class Movies {
	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer,String>();// using generics
//		HashMap h = new HashMap();
		// put method
		System.out.println(h);
h.put(100,"KGf");	
h.put(20,"toby");	
h.put(10,"777");	
h.put(50,"Kirik party");	
h.put(30,"999");	
System.out.println(h);
h.put(100, "KGF-2");  // only the value KGF is replaced by KGF-2 because no duplicates key are allowed
System.out.println(h);
h.put(40, "toby");
System.out.println(h);

// construcor method
//HashMap i = new HashMap(h);
//System.out.println(i);


// putAll
//HashMap p = new HashMap();
//p.putAll(h);
//System.out.println(p);

// containsKey
System.out.println(h.containsKey(100)); // return true if the key is present

// get(Key)
System.out.println(h.get(40));  // returns the value of the key

// remove(Key)
System.out.println(h.remove(50));
System.out.println(h);

// try all methods
HashMap<Character,Integer> m = new HashMap<Character,Integer>();
m.put('I',1);
m.put('V',5);
m.put('X',10);
m.put('L',50);
m.put('C',100);
m.put('D',500);
m.put('M',1000);
System.out.println(m);
System.out.println(m.get('L'));
	}

}
