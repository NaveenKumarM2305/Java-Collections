package ArrayList_Class;

import java.util.ArrayList;

public class Foods {
	public static void main(String[] args) {
		ArrayList f1 = new ArrayList();
		f1.add("MasalDoose");
		f1.add("Mudde");
		f1.add("Chapati");
		f1.add("Obattu");
		f1.add("Full-Meals");
		f1.add("Chapati");
		System.out.println(f1);
		
		ArrayList f2 = new ArrayList();
		f2.add("Goobi");
		f2.add("Noodles");
		f2.add("Panipuri");
		f2.add("Belpuri");
		f2.add("Chapati");
System.out.println(f2);
//		f1.removeAll(f2);  // remove common elements in f1 which is f2
//		System.out.println(f1);
//		f1.retainAll(f2);  // retains only the common elements in f1 and f2 and rest uncommon elements are removed
//		System.out.println(f1);
		f1.remove(4);// removes Full-Meals present in index 4
		System.out.println(f1);
		f1.remove("Chapati");// removes first element   Chapati
		System.out.println(f1);
		
		
		
		
		
		
		
		
		
	}

}
