package collections;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queues {
	
    public static void main(String[] args) {
	    ///( head) <- 00000000000000000000000000 <-(tail) FIFO(first in ,first out)
    	// it has fixed size 
    	Queue<Integer> q = new ArrayBlockingQueue<Integer>(4);
    	
    	q.add(10);
    	q.add(13);
    	q.add(2);
    	q.add(30);
    	System.out.println("head of queue is  :"+q.element());
    	try {
    	q.add(21);
    	}catch(IllegalStateException e)
    	{
    		System.out.println(" tried to add too many items to the queue !!");
    	}
    	System.out.println(q);
    	for(Integer num : q)
    	{
    		System.out.println(" "+num);
    	}
    
    	System.out.println("\n removed value is :"+q.remove());
    	System.out.println("\n removed value is :"+q.remove());
    	System.out.println("\n removed value is :"+q.remove());
    	System.out.println("\n removed value is :"+q.remove());
    	try {
    		System.out.println("\n removed value is :"+q.remove());    	}
    	catch(Exception e ) {
    		System.out.println("try to remove too many items form queue !!");
    	}
    	
    	///////////////////////////
    	Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(3);
    	// if queue is empty it return null instead of exception 
    	System.out.println(" \nQueue  2 peak is :"+ q2.peek());
    	q2.offer(10);
    	q2.offer(13);
    	q2.offer(2);
    	q2.offer(30);
    	System.out.println(" \nQueue  2 peak is :"+ q2.peek());
    	// offer use beacuse it not throw exception and return false
    	for(Integer num : q2)
    	{
    		System.out.println(" "+num);
    	}
    	// instead of remove use poll because if queue is empty it return null instead of exception
    	System.out.println("\n removed value is :"+q2.poll());
    	System.out.println("\n removed value is :"+q2.poll());
    	System.out.println("\n removed value is :"+q2.poll());
    	System.out.println("\n removed value is :"+q2.poll());
}
}
