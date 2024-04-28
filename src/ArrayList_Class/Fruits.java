package ArrayList_Class;
import java.util.ArrayList;
public class Fruits {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("Apple");
		a1.add("Banana");
		a1.add("Grapes");
		a1.add("Orange");
		System.out.println(a1);
		
		ArrayList a2 = new ArrayList();
		a2.add("JackFruit");
		a2.addAll(a1);
		a2.add("Kiwi");
		System.out.println(a2);
		System.out.println(a1.size());
		System.out.println(a2.size());
		a2.add(3,"pomogranate");
		System.out.println(a2);
		a1.addAll(2,a2);
		System.out.println(a1);
		a1.add(null);
		System.out.println(a1);
		a1.add(null);
		System.out.println(a1);
	}

}
