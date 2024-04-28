package ArrayList_Class;

import java.util.ArrayList;

public class get_method {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("Apple");
		a.add("Banana");
		a.add(123);
		a.add(23.98);
		a.add(true);
		System.out.println(a);
		System.out.println(a.get(2));
		Double d = (Double)a.get(3); // downcasting
//		Double e = (Double)a.get(4); // CCE as we cannot downcast Boolean type Double in index 3
		
	
		System.out.println();
		double doubleValue = 10.75;
		int intValue = (int) doubleValue;
		System.out.println(intValue);
	
	}

}
