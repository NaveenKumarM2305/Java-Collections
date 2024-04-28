package hashSet;

import java.util.HashSet;

public class City {
	
	String name;
public City(String name) {
	
		this.name = name;
	}
public String toString() {
	return "City : "+name;
}
public static void main(String[] args) {
	HashSet<City> h = new HashSet<City>();
	h.add(new City("Bengaluru"));
	h.add(new City("Mysuru"));
	h.add(new City("Mangluru"));
	h.add(new City("Udupi"));
	System.out.println(h);
	
}
}
