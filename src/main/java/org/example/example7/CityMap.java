package org.example.example7;

import java.util.*;

public class CityMap {

    private final Map<String, List<Edge>> adjacencyList;

    public CityMap() {
        this.adjacencyList = new HashMap<>();
    }

    public void addNode(String nodeName) {
        adjacencyList.putIfAbsent(nodeName, new ArrayList<>());
    }

    public void addEdge(String source, String target, int duration) {
        addNode(source);
        addNode(target);
        adjacencyList.get(source).add(new Edge(target, duration));
    }

    public Map<String, Integer> findShortestPaths(String sourceNode) {

        Map<String, Integer> distances = new HashMap<>();
        PriorityQueue<DistanceNode> pq = new PriorityQueue<>();

        for (String node : adjacencyList.keySet()) {
            distances.put(node, Integer.MAX_VALUE);
        }

        distances.put(sourceNode, 0);
        pq.add(new DistanceNode(sourceNode, 0));

        while (!pq.isEmpty()) {

            DistanceNode current = pq.poll();
            String currentNodeName = current.nodeName;
            int currentDistance = current.distance;

            if (currentDistance > distances.get(currentNodeName)) {
                continue;
            }

            for (Edge edge : adjacencyList.getOrDefault(currentNodeName, Collections.emptyList())) {

                String neighborNode = edge.targetNode;
                int travelDuration = edge.duration;

                int newDistance = currentDistance + travelDuration;

                if (newDistance < distances.get(neighborNode)) {

                    distances.put(neighborNode, newDistance);

                    pq.add(new DistanceNode(neighborNode, newDistance));
                }
            }
        }

        return distances;
    }
}
