package City;
import java.util.*;
public class Name  implements Comparator<City>{
	public int compare(City c1, City c2) {
		return c1.name.compareTo(c2.name);
	}

}
