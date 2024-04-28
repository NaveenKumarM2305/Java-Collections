package TreeSet;

import java.util.Comparator;

public class Model implements Comparator<Bike>{

	@Override
	public int compare(Bike b1, Bike b2) {
		if(b1.model == b2.model)
			return 0;
		else if(b1.model > b2.model)
			return 1;
		else return -1;

}
}
