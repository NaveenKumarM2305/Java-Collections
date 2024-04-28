package City;

import java.util.Collections;
//import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class City {
	
	String name;
	int pin;
	String famous;
	
	public City(String name, int pin, String famous) {
		super();
		this.name = name;
		this.pin = pin;
		this.famous = famous;
	}

	public static void main(String[] args) {
		//Sort using TreeSet
		TreeSet<City> h = new TreeSet<City>(new Famous());
		h.add(new City("Bengaluru",560001,"Silicon City"));
		h.add(new City("Udupi",520001, "Sri Krishna"));
		h.add(new City("Mysuru",570001,"MyuruPak"));
		for(City c:h) {
			System.out.println(c.name+" , "+c.famous+", "+c.pin);
		}
//		Collections.sort(h, new Name());
		
	}

}
