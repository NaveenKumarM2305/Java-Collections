package Coins;

import java.util.Comparator;

public class Year implements Comparator<Coins> {

	public int compare(Coins c1, Coins c2) {
		if(c1.year==c2.year)
			return 0;
		else if(c1.year > c2.year)
			return 1;
		else 
			return -1;
	}
}
