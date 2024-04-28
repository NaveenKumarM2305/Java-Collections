package City;

import java.util.Comparator;

class Pin implements Comparator<City>{
	public int compare(City c1 , City c2) {
		if(c1.pin == c2.pin) 
			return 0;
		else if(c1.pin>c2.pin)
			return 1;
		else 
			return -1;
	}

}
