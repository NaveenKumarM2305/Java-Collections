package Movie;

import java.util.Comparator;

public class Actor implements Comparator<Movie> {
	public int compare(Movie m1, Movie m2) {
		return m1.actor.compareTo(m2.actor);
	}
}