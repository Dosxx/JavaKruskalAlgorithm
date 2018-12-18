package com.kruskallExercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
//import java.util.PriorityQueue;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Node [] u = new Node[9];
		u[0] = new Node("A");
		u[1] = new Node("B");
		u[2] = new Node("C");
		u[3] = new Node("D");
		u[4] = new Node("E");
		u[5] = new Node("F");
		u[6] = new Node("G");
		u[7] = new Node("H");
		u[8] = new Node("I");
		
		Graph myGraph = new Graph(u);
		
		myGraph.setEdge(u[0], u[1], 4);
		myGraph.setEdge(u[0], u[7], 8);
		myGraph.setEdge(u[7], u[1], 11);
		myGraph.setEdge(u[1], u[2], 8);
		myGraph.setEdge(u[2], u[3], 7);
		myGraph.setEdge(u[2], u[5], 4);
		myGraph.setEdge(u[3], u[5], 14);
		myGraph.setEdge(u[3], u[4], 9);
		myGraph.setEdge(u[4], u[5], 10);
		myGraph.setEdge(u[5], u[6], 2);
		myGraph.setEdge(u[6], u[8], 6);
		myGraph.setEdge(u[8], u[2], 2);
		myGraph.setEdge(u[6], u[7], 1);
		myGraph.setEdge(u[7], u[8], 7);
		
//		myGraph.getEdges();
		MinSpanTree(myGraph);
			
	}
	// kruskal's algorithm for min spanning tree
	static void MinSpanTree(Graph g) {
		ArrayList<Edge> A = new ArrayList<>();
		//create a set of each vertex in the graph.
		Map<Node, Set<Node>> setOfVertex = new LinkedHashMap<Node, Set<Node>>();
		//create a set all each vertex in the graph
		for(Node v : g.getVertices()) {
		    Set<Node> vSet = new HashSet<Node>();
		    vSet.add(v);
		    setOfVertex.put(v, vSet);
		}
		// find the lightest edge and add it to A set
		for(Edge e : g.getEdgeList()) {
			Set<Node> u = setOfVertex.get(e.parentNode);
			Set<Node> v = setOfVertex.get(e.adjacentNode);
			if(!u.equals(v)) {
				A.add(e);
				u.addAll(v);
			}
			for(Node node: u) {
				setOfVertex.put(node, u);
			}
		}
		System.out.printf("The Minimun spanning tree is %s %n",A);
	}
}
