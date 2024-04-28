package ArrayList_Class;

import java.util.ArrayList;

public class for_each {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		for(Object o : a)
		{
			Integer i =(Integer)o;
			// Unboxing and widening in different line
			int in1 =i;
			double d =in1;
			// Unboxing and widening in same line
			double d1 = i;
			
		}
	}

}
