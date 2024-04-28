package Coins;

import java.util.Comparator;

public class Currency implements Comparator<Coins> {
	public int compare(Coins c1, Coins c2) {
		return c1.currency.compareTo(c2.currency);
	}

}
