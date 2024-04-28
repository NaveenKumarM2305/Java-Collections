package Priority_Queue;

import java.util.Comparator;

public class A implements Comparator<Demo2>{
	public int compare(Demo2 d1, Demo2 d2) {
		if(d1.a == d2.a)
			return 0;
		else if(d1.a > d2.a)
			return 1;
		else return -1;
	}

}
