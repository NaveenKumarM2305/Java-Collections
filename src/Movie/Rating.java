package Movie;

import java.util.Comparator;

class Rating implements Comparator<Movie> {
	public int compare(Movie m1, Movie m2) {
		if(m1.rating == m2.rating) 
		return 0;
		else if(m1.rating > m2.rating)
			return 1;
		else return -1;
	}

}
