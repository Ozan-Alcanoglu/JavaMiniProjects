package org.example.example7;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        CityMap map = new CityMap();

        map.addEdge("A", "B", 6);
        map.addEdge("A", "D", 1);
        map.addEdge("B", "D", 2);
        map.addEdge("B", "C", 5);
        map.addEdge("C", "E", 5);
        map.addEdge("D", "E", 1);
        map.addEdge("D", "B", 2);
        map.addEdge("D", "C", 4);

        String source = "A";
        Map<String, Integer> shortestDistances = map.findShortestPaths(source);

        System.out.println("--- Shortest Travel Durations from " + source + " ---");

        for (Map.Entry<String, Integer> entry : shortestDistances.entrySet()) {
            String node = entry.getKey();
            Integer distance = entry.getValue();

            String output = (distance == Integer.MAX_VALUE) ? "Unreachable" : String.valueOf(distance);

            System.out.printf("%s -> %s: %s\n", source, node, output);
        }
    }
}
