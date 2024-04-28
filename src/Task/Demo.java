package Task;

import java.util.*;
import java.util.Scanner;
// program to not store duplicates in the sentence
public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet a = new HashSet();
		System.out.println("Enter the String");
		String s = sc.nextLine();
		for(int i=0;i<s.length();i++) {
			
			 char c = s.charAt(i);
			 if(c!=' ')
				 a.add(c);
		}
		System.out.println(a); // displays after removing the duplicates
		String p ="";
		for( Object o: a ) {
			
   p=p+o;
		}
		
		System.out.println(p);
	}

}
