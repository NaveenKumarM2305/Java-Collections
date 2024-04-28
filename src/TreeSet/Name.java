package TreeSet;

import java.util.Comparator;

public class Name implements Comparator<Bike>{
	public int compare(Bike b1, Bike b2) {
		return b1.name.compareTo(b2.name);
	}

}
