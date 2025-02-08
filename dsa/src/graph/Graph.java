package graph;

import java.util.ArrayList;
import java.util.HashMap;

/*big o
addVertex: O(1);
addEdge: O(1);
removeEdge: O(e);
removeVertex: (v + e);

 */

//it can be done with adjacency matrix or adjacency list strategies -- bidirection graph
public class Graph {
	//using adjacency list strategy
	private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

	public boolean addVertex(String vertex) {
		if(adjList.get(vertex) == null) {
			adjList.put(vertex, new ArrayList<String>());
			return true;
		}
		return false;
	}

	public boolean addEdge(String vertexOne, String vertexTwo) {
		if(this.adjList.get(vertexOne) != null && this.adjList.get(vertexTwo) != null) {
			this.adjList.get(vertexOne).add(vertexTwo);
			this.adjList.get(vertexTwo).add(vertexOne);
			return true;
		}
		return false;
	}

	public boolean removeEdge(String vertexOne, String vertexTwo) {
		boolean decider = false;
		if(this.adjList.get(vertexOne) != null && this.adjList.get(vertexTwo) != null) {
			if(this.adjList.get(vertexOne).contains(vertexTwo) && this.adjList.get(vertexTwo).contains(vertexOne)) {
				this.adjList.get(vertexOne).remove(vertexTwo);
				this.adjList.get(vertexTwo).remove(vertexOne);
				decider = true;
			}
		}
		return decider;
	}

	public boolean removeVertex(String vertex) {
		if(adjList.get(vertex) == null) return false;
		for(String otherVertex : adjList.get(vertex)) {
			this.adjList.get(otherVertex).remove(vertex);
		}
		adjList.remove(vertex);
		return true;
	}

	public void print() {
		System.out.println(this.adjList);
	}

}
