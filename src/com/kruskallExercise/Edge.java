package com.kruskallExercise;

public class Edge implements Comparable<Edge> {
	private String name;
	Node parentNode, adjacentNode;
	private int weight;
	
	// Edge constructor
	public Edge(Node u , Node v, int weight) {
		name = "("+u.getName()+","+v.getName()+")";
		this.weight = weight;
		parentNode = u;
		adjacentNode = v;
	}
	public String getName() {
		return name;
	}
	public void setName(Node n, Node m) {
		this.name = "("+ n.getName()+","+m.getName()+")";
	}
	public int getWeigth() {
		return weight;
	}
	public void setWeigth(int weigth) {
		this.weight = weigth;
	}
	
	@Override
	public String toString (){
		return this.name;
	}
	@Override 
	public int compareTo(Edge i) {
		return this.weight - i.weight;
	}
}
