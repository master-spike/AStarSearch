package com.najeeb.search;

import java.util.ArrayList;
import java.util.PriorityQueue;

public abstract class AStarSearch<T extends AStarNode> {
	
	private PriorityQueue<T> queue;
	
	public abstract ArrayList<T> successors(T n);
	protected abstract boolean isGoal(T n);
	protected void expandNext(){
		
		T n = queue.remove();
		ArrayList<T> s = successors(n);
		queue.addAll(s);
		
	}
	
	public T search() {
		while(!isGoal(queue.peek())) {
			expandNext();
		}
		return queue.peek();
		
	}
	
	public void initialise(T n) {
		queue = new PriorityQueue<T>();
		queue.add(n);
	}
	
}
