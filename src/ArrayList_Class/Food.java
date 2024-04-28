package ArrayList_Class;

import java.util.ArrayList;
import java.util.Collections;

public class Food {
	public Food(String type, double price, double rating) {

		this.type = type;
		this.price = price;
		this.rating = rating;
	}
	String type;
	double price;
	double rating ;
public static void main(String[] args) {
	ArrayList<Food> f = new ArrayList<Food>();
	f.add(new Food("Gobi",30,3));
	f.add(new Food("Mudde",20,5));
	f.add(new Food("Noodles",40,4));
for( Food f1: f) {
	System.out.println(f1.type+" "+f1.price+" "+f1.rating);
}
System.out.println("------------------------------");
System.out.println("After sorting");
Collections.sort(f, new Price());  //sorting by price
//Collections.sort(f,new Rating());  //Sorting by rating
//Collections.sort(f, new Type());  

for( Food f1: f) {
	System.out.println(f1.type+" "+f1.price+" "+f1.rating);
}
}
}
