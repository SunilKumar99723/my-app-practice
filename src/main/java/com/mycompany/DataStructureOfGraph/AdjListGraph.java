package com.mycompany.DataStructureOfGraph;

/*
 * Undirected Graph
0----1 \
|   /|  \
|  / |   2
| /  |  /
4----3 /
*
*/
import java.util.ArrayList;

public class AdjListGraph {
	
	//Add edge in Undirected graph.
	static void addeEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
		
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	static void printGraph(ArrayList<ArrayList<Integer>> adj) {
		
		for(int i=0;i<adj.size();i++) {
			System.out.println("Adj. list of Vertex ("+i+")");
			
			for(int j=0;j<adj.get(i).size();j++) {
				
				System.out.print("-->"+adj.get(i).get(j));
				
			}
			 
			System.out.println();
		}
		
		
	}
	
	public static void main(String[] argrs) {
	
		// Creating Graph with 5 vertices
	int v=5;
	ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>> (v); 
	
	for(int i=0; i <v;i++) {
		adj.add(new ArrayList<Integer>());
	}
//   addeEdge(adj, 2, 1);
//   addeEdge(adj, 2, 4);
//   addeEdge(adj, 1, 3);
//   addeEdge(adj, 1, 5);
//   addeEdge(adj, 3, 5);
	// Adding edges one by one
    addeEdge(adj, 0, 1);
    addeEdge(adj, 0, 4);
    addeEdge(adj, 1, 2);
    addeEdge(adj, 1, 3);
    addeEdge(adj, 1, 4);
    addeEdge(adj, 2, 3);
//    addeEdge(adj, 3, 4);
   printGraph(adj);
  }
}
