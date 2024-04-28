package Movie;

import java.util.Comparator;

public class Year implements Comparator<Movie> {
	public int compare(Movie m1, Movie m2) {
		if(m1.year == m2.year) 
		return 0;
		else if(m1.year > m2.year)
			return 1;
		else return -1;
	}
}
 