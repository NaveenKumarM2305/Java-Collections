package TreeSet;

import java.util.Comparator;

class Price implements Comparator <Bike>{


	@Override
	public int compare(Bike b1, Bike b2) {
		if(b1.price == b2.price)
			return 0;
		else if(b1.price > b2.price)
			return 1;
		else return -1;
	}
}
