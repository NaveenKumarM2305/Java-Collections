package ArrayList_Class;

import java.util.Comparator;
// sorting logic according to the price
public class Price  implements Comparator<Food>{
	public int compare(Food f1, Food f2) {
		if(f1.price== f2.price )
			return 0;
		else if(f1.price > f2.price)
			return 1;
		else return -1;
	}
}
