package Comaprable_CompareTo;




import java.util.ArrayList;
import java.util.Collections;
// this program is to demonstrate the use of compareTo with using generics 
public class Food1 implements Comparable<Food1>{
	String name;
	int price;
	double rating;
	public Food1(String name, int price, double rating) {
		
		this.name = name;
		this.price = price;
		this.rating = rating;
	}
	public String toString() {
		return "( Name: "+name+", Price: "+price+", rating: "+rating +" )";
		}
	public int compareTo(Food1 f) {  
		// DownCasting not  used as we used Gernerics
		//---------------------------------
//		 to sort interms of rating
		if(this.rating== f.rating)
			return 0;
		else if(this.rating > f.rating)
			return 1;
		else 
			return -1;
////-----------------------------
//		
//	
//		//to sort interms of name
//	return this.name.compareTo(f.name);
	//---------------
	
	}
	public static void main(String[] args) {
		ArrayList<Food1> a = new ArrayList<Food1>();
//		Food1 f1 = new Food1("Neer Dose",60,4.8);
//		Food1 f2 = new Food1("Masala Dose",80,4.5);
//		Food1 f3 = new Food1("Idle Dose",40,4.9);
		a.add(new Food1("Vada",20,4.8));
		a.add(new Food1("Paneer Butter Masala ",180,4.0));
		a.add(new Food1 ("Dose",40,4.9));
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		
		
	}
	

}

 