package com.example;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample2 {

	public static void main(String[] args) {
		// FIFO(First in First Out) - Queue 처음 들어간 데이터가 처음으로 나온다. 
		
		Queue<Integer> queue = new LinkedList<>();
		
		for (int i=0; i<10; i++)
			queue.offer(i);
		
		while(!queue.isEmpty())
			System.out.println(queue.poll());
	}
}
