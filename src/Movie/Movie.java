package Movie;

import java.util.ArrayList;
import java.util.Collections;

public class Movie {
	String title;
	String actor;
	int year;
	double rating;
	
	public Movie(String title, String actor, int year, double rating) {
	
		this.title = title;
		this.actor = actor;
		this.year = year;
		this.rating = rating;
	}

	public static void main(String[] args) {
		ArrayList<Movie> a = new ArrayList<Movie>();
	a.add(new Movie("KGF","Yash",2019,8.4));
	a.add(new Movie("Ugram","Murli",2015,8.0));
	a.add(new Movie("Happyness","Will Smith",2008,9.0));
    a.add(new Movie("American Sniper","Carl ",2016,7.8));
	for(Movie m: a   ) {
		System.out.println("Title: "+m.title+" Actor: "+ m.actor+" Year of Release: "+m.year+" Rating "+m.rating);
	}
	System.out.println("------------------------");
	Collections.sort(a, new Title());

	for(Movie m: a   ) {
		System.out.println("Title: "+m.title+" Actor: "+ m.actor+" Year of Release: "+m.year+" Rating "+m.rating);
	}
	System.out.println("------------------------");
	Collections.sort(a, new Year());
	for(Movie m: a   ) {
		System.out.println("Title: "+m.title+" Actor: "+ m.actor+" Year of Release: "+m.year+" Rating "+m.rating);
	}
	
	
	}

}
