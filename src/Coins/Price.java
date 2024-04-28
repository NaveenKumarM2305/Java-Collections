package Coins;

import java.util.Comparator;

public class Price implements Comparator<Coins> {

	public int compare(Coins c1, Coins c2) {
		if(c1.price==c2.price)
			return 0;
		else if(c1.price > c2.price)
			return 1;
		else 
			return -1;
	}
}
