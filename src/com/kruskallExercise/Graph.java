package com.kruskallExercise;

import java.util.ArrayList;
import java.util.Collections;

public class Graph {
	private ArrayList<Node> vertices;
	private ArrayList<Edge> edgeList;
	
	// Graph constructor
	public Graph(Node [] nodes) {
		vertices = new ArrayList<>();
		edgeList = new ArrayList<>();
		for (int i = 0; i < nodes.length; i++) {
			vertices.add(nodes[i]);
		}
	}
	// methods to add and retrieve edges
	public void setEdge(Node u, Node v, int w) {
		if(vertices.contains(u) && vertices.contains(v)) {
			edgeList.add(u.addEdge(u, v, w));
			Collections.sort(edgeList);
		}else {
			System.out.println("Please enter only nodes that are in the graph!");
		}
	}
	//show the edges and their respective weight
	public void getEdges() {
		for(Edge e : edgeList) {
			System.out.println(e);
		}
	}
	
	//accessors and mutators of graph
	public ArrayList<Node> getVertices() {
		return vertices;
	}
	public void setVertices(ArrayList<Node> vertices) {
		this.vertices = vertices;
	}
	public ArrayList<Edge> getEdgeList() {
		return edgeList;
	}
	public void setEdgeList(ArrayList<Edge> edgeList) {
		this.edgeList = edgeList;
	}
}
