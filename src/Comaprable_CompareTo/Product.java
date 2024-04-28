package Comaprable_CompareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Product implements Comparable<Product>{
	int pId;
	String pname;
	int Price;
	public Product(int pId, String pname,  int price) {
		this.pId = pId;
		this.pname = pname;
		Price = price;
	}
	public String toString() {
		return "ID: "+this.pId+" "+"Name: "+this.pname+"price: "+this.Price;
	}
	@Override
	public int compareTo(Product p) {
		if(this.Price==p.Price)
			return 0;
		else if(this.Price>p.Price)
			return 1;
		else
			return -1;
	}
	public static void main(String[] args) {
		List<Product> al= new ArrayList<>();
		al.add(new Product(101,"Laptop",65543));
		al.add(new Product(102,"Mobile",50764));
		al.add(new Product(100,"Tab",350000));
//		for(Product p:al) {
//			System.out.println(p);
//		
System.out.println(al);

Collections.sort(al);
System.out.println(al);
		
	}
	
	
	
	
	

}
