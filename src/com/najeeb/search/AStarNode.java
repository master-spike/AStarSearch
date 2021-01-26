package com.najeeb.search;

public abstract class AStarNode implements Comparable<AStarNode> {
	
	public abstract int heuristic();
	public abstract int cost();
	
	public int compareTo(AStarNode n) {
		if (n.heuristic() + n.cost() > heuristic() + cost()) return -1;
		else if (n.heuristic() + n.cost() == heuristic() + cost()) return 0;
		else return 1;
		
	}
	
}
