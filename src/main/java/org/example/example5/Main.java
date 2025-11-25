package org.example.example5;

public class Main {

    public static void main(String[] args) {

        LRUCache lruCache= new LRUCache(3);

        lruCache.put("A", "veri-a");

        lruCache.put("B", "veri-b");

        lruCache.put("C", "veri-c");

        lruCache.get("A");

        lruCache.put("D", "veri-d");

        lruCache.get("B");

        lruCache.put("E", "veri-e");
    }
}
