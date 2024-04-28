package Movie;

import java.util.Comparator;

class Title implements Comparator<Movie> {
public int compare(Movie m1, Movie m2) {
	return m1.title.compareTo(m2.title);
}
}

