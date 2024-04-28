package LindedListPractice;

import java.util.Collections;
import java.util.LinkedList;

public class Demo1 {
public static void main(String[] args) {
	LinkedList<Integer> ll = new LinkedList<Integer>();
	ll.add(10);
	ll.add(30);
	ll.add(70);
	Integer a=ll.get(2);
	System.out.println(a);
	System.out.println(ll.size());
	for(Integer n:ll) {
		System.out.println(n);
	}
		ll.add(2, 20);
		System.out.println(ll);
		Collections.sort(ll);
		System.out.println(ll);
	Integer c=20;
	System.out.println(c.compareTo(a));
}
}
