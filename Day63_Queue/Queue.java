/*
Question -> 
  A Queue is defined as a linear data structure that is open at both ends and the operations are performed in First In First Out (FIFO) order.
  We define a queue to be a list in which all additions to the list are made at one end, and all deletions from the list are made at the other end. 
  The element which is first pushed into the order, the operation is first performed on that.
  */

Solution -> 


import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();

		for (int i = 0; i < 5; i++)
			q.add(i);

		// Display contents of the queue.
		System.out.println("Elements of queue "
				+ q);

		// To remove the head of queue.
		int removedele = q.remove();
		System.out.println("removed element-"
				+ removedele);

		System.out.println(q);

		// To view the head of queue
		int head = q.peek();
		System.out.println("head of queue-"
				+ head);

		int size = q.size();
		System.out.println("Size of queue-"
				+ size);
	}
}
