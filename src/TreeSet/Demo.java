package TreeSet;

import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
		TreeSet<Bike> t = new TreeSet<Bike>(new Name());
	t.add(new Bike("Pulsar",2018,90000.00));
	t.add(new Bike("Activa",2022,100000));
	t.add(new Bike("Access",2021,110000));

	for(Bike o: t) {
		System.out.println(o.name+", "+o.model+", "+o.price);
	}
	
	}

}
