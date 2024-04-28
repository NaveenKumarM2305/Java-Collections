package ArrayList_Class;
import java.util.*;
 class Rating  implements Comparator<Food>{
public int compare(Food f1, Food f2) {
	if(f1.rating== f2.rating )
		return 0;
	else if(f1.rating > f2.rating)
		return -1;
	else return 1;
}

}
