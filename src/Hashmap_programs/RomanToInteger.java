package Hashmap_programs;

import java.util.HashMap;

public class RomanToInteger {
	public static void main(String[] args) {
		System.out.println(romanToInt("IMV"));;
	}
	
	public static int romanToInt(String s) {
	    
	    int answer = 0, number = 0, prev = 0;

	    for (int j = s.length() - 1; j >= 0; j--) {
	        switch (s.charAt(j)) {
	            case 'M' -> number = 1000;
	            case 'D' -> number = 500;
	            case 'C' -> number = 100;
	            case 'L' -> number = 50;
	            case 'X' -> number = 10;
	            case 'V' -> number = 5;
	            case 'I' -> number = 1;
	        }
	        if (number < prev) {
	            answer -= number;
	        }
	        else {
	            answer += number;
	        }
	        prev = number;
	    }
	    return answer;
	}
	
	 public static  int romanToInt1(String s) {
	        HashMap<Character,Integer> m = new HashMap<Character,Integer>();
	        m.put('I',1);
	        m.put('V',5);
	        m.put('X',10);
	        m.put('L',50);
	        m.put('C',100);
	        m.put('D',500);
	        m.put('M',1000);
	        int sum=0;
	        for(int i=s.length()-1;i>=0;i--){

	char ch=s.charAt(i);
	int digit= m.get(ch);
	if(sum<=digit){
	    sum=sum+digit;
	}
	else{
	    sum=sum-digit;
	}




	        }
	return sum;


	    }

}
