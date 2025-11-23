package org.example.example7;

class Edge {
    String targetNode;
    int duration;

    public Edge(String targetNode, int duration) {
        this.targetNode = targetNode;
        this.duration = duration;
    }
}

class DistanceNode implements Comparable<DistanceNode> {
    String nodeName;
    int distance;

    public DistanceNode(String nodeName, int distance) {
        this.nodeName = nodeName;
        this.distance = distance;
    }

    @Override
    public int compareTo(DistanceNode other) {
        return Integer.compare(this.distance, other.distance);
    }
}
