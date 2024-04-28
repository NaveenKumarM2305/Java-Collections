 package ArrayList_Class;

import java.util.Comparator;

public class Type implements Comparator<Food>{

	public int compare(Food f1, Food f2) {
			return f1.type.compareTo(f2.type);
			
}
}


//if(f1.type.equals(f2.type)) {
//return 1;
//}
//else if(!(f1.type.equals(f2.type))){
//return -1;
//}
//else return 1;