package City;

import java.util.Comparator;

public class Famous implements Comparator<City>{
	public int compare(City c1,City c2) {
		return c1.famous.compareTo(c2.famous);
	}

}
