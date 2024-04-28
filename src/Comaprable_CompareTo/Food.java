package Comaprable_CompareTo;


import java.util.ArrayList;
import java.util.Collections;
// this program is to demonstrate the use of compareTo without using generics 
public class Food implements Comparable{
	String name;
	int price;
	double rating;
	public Food(String name, int price, double rating) {
		
		this.name = name;
		this.price = price;
		this.rating = rating;
	}
	public String toString() {
		return "( Name: "+name+", Price: "+price+", rating: "+rating +" )";
		}
	public int compareTo(Object o) {  // implicit UpCasting
		Food f = (Food)o;  // DownCasting because Generics is not used
		if(this.rating== f.rating)
			return 0;
		else if(this.rating > f.rating)
			return 1;
		else 
			return -1;
	}
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		Food f1 = new Food("Neer Dose",60,4.8);
		Food f2 = new Food("Masala Dose",80,4.5);
		Food f3 = new Food("Idle Dose",40,4.9);
		a.add(f1);
		a.add(f2);
		a.add(f3);
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		//  display using for-Each method
		for(Object o :a) {
			Food f=(Food)o; // downcasting because we are not using generics
			System.out.println(f);
		}
		
		
	}
	

}
