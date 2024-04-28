package Coins;

import java.util.ArrayList;
import java.util.Collections;

public class Coins {
	String currency;
	int price;
	int year;
	public Coins(String currency, int price, int year) {
		super();
		this.currency = currency;
		this.price = price;
		this.year = year;
	}
	public static void main(String[] args) {
		ArrayList<Coins> a = new ArrayList<Coins>();
		a.add(new Coins("Rupee",100,1971));
		a.add(new Coins("U.S Dollar",1,2013));
		a.add(new Coins("Rubel",40,2000));
	for(Coins c:a) {
		System.out.println(c.currency+" worth "+c.price+" was minted in "+c.year);
	}
	System.out.println("-----------------------");
	System.out.println("***Based on Price*****");
	Collections.sort(a, new Price());
	for(Coins c:a) {
		System.out.println(c.currency+" worth "+c.price+" was minted in "+c.year);
	}
	System.out.println("***Based on currency name*****");
	Collections.sort(a, new Currency());
	for(Coins c:a) {
		System.out.println(c.currency+" worth "+c.price+" was minted in "+c.year);
	}
	System.out.println("****Based on year*******");
	Collections.sort(a,new Year());
	for(Coins c:a) {
		System.out.println(c.currency+" worth "+c.price+" was minted in "+c.year);
	}
		
	}
	

}
