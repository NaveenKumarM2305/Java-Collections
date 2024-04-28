package ArrayList_Class;
import java.util.ArrayList;
 import java.util.*;
import java.util.Collections;
 class Product implements Comparable<Product>{
String brand;
double price;
double rating;
	
	Product(String brand, double price, double rating){
		this.brand= brand;
		this.price= price;
		this.rating = rating;
		
	}
	public String toString() {
		return "(Brand: "+brand+", Price: "+price+", rating: "+rating+")";
	}
	public int compareTo(Product p) {
////		Product p =(Product)o;
//		
//		if(this.price==p.price) 
//			return 0;
//		else if(this.price>p.price)
//			return 1;
//	else 
//			return -1;
		
	return this.brand.compareTo(p.brand);
	
	}
	
public static void main(String[] args) {
	ArrayList<Product>a = new ArrayList<Product>();
//	ArrayList a = new ArrayList();
	a.add(new Product("Titan",4050,4.3));
	a.add(new Product("HMT", 5063.98,4.5));
	a.add(new Product("Casio",3000,4.2));
	System.out.println(a);
	Collections.sort(a);
	System.out.println(a);
	
	
}


}

