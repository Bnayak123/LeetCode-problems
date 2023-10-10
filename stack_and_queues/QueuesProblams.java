package stack_and_queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueuesProblams {

	public static void main(String[] args) {
		Queue< Integer> queue= new LinkedList<>();
		queue.add(50);
		queue.add(20);
		queue.add(30);
		queue.add(50);
		
		System.out.println(queue.remove());     
		
	}

}
