package com.kruskallExercise;

public class Node {
	private String name;
	
	//Node constructor
	public Node (String node_name) {
		name = node_name;
	}
	//Create and return and edge associated with a vertex
	public Edge addEdge(Node u1, Node u2, int weight) {
		Edge edge = new Edge(u1, u2, weight);
		return edge;
	}
	//accessors and mutators methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//Overriding the toString method of Object class
	@Override
	public String toString() {
		return this.name;
	}
}
