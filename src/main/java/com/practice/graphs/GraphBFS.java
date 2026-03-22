package com.practice.graphs;

import java.util.*;

public class GraphBFS {

    private Map<Integer, List<Integer>> adjecencyList = new HashMap<>();

    public void addEdge(int source, int destination){
        adjecencyList.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
    }

    public void bfs(int start){
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited.add(start);

        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.print(node + " -> ");

            for(int neighbour: adjecencyList.getOrDefault(node, new ArrayList<>())){
                if(!visited.contains(neighbour)){
                    queue.add(neighbour);
                    visited.add(neighbour);
                }
            }

        }
    }

     static void main(String[] args) {
        GraphBFS graph = new GraphBFS();
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);

        System.out.println("BFS Traversal:");
        graph.bfs(1);
    }
}
