	package Priority_Queue;

import java.util.*;

public class Demo2 {
	int a;
	int b;
	int c ;
	int d ;
	public Demo2(int a, int b, int c, int d) {

		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public static void main(String[] args) {
		PriorityQueue<Demo2> pq = new PriorityQueue<Demo2>(new A());
		pq.add(new Demo2(40,23,14,56));
		pq.add(new Demo2(34,65,78,21));
		pq.add(new Demo2(12,7,8,933));
	
		System.out.println(pq);
		System.out.println(pq.peek());// to access the data which is at the top/first 
	System.out.println(pq);
	System.out.println(pq.poll()); // to access and remove the element at the data 
	System.out.println(pq);
	pq.offer(new Demo2(12,3,46,6));  // to insert the data at the top of the queue
	System.out.println(pq);
	
for(Demo2 o:pq) {
	System.out.println(o.a+" "+o.b+" "+o.c+o.d);
}
}
}


