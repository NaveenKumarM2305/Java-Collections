package Priority_Queue;

import java.util.PriorityQueue;

public class demo {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add(100);
		pq.add(50);
		pq.add(10);
		pq.add(70);
		pq.add(60);
		System.out.println(pq);
		System.out.println(pq.peek());// to access the data which is at the top/first 
	System.out.println(pq);
	System.out.println(pq.poll()); // to access and remove the element at the data 
	System.out.println(pq);
	pq.offer(90);  // to insert the data at the top of the queue
	System.out.println(pq);
	
for(Object o:pq) {
	System.out.println(o);
}
}
}