package org.example.example5;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

    private final int capacity;

    private final LinkedHashMap<String, String> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;

        this.cache = new LinkedHashMap<>(capacity, 0.75f, true);
    }

    public String get(String key) {
        String value = cache.get(key);

        if (value != null) {

            System.out.println("GET (" + key + "): " + value + " -> En sona taşındı.");
        } else {
            System.out.println("GET (" + key + "): Bulunamadı (null).");
        }

        displayCache();
        return value;
    }

    public void put(String key, String value) {

        if (cache.containsKey(key)) {
            cache.put(key, value);
            System.out.println("PUT (" + key + "): Değer güncellendi ve sona taşındı.");
        } else {

            if (cache.size() >= capacity) {
                String leastUsedKey = cache.keySet().iterator().next();
                cache.remove(leastUsedKey); // Sil (O(1))
                System.out.println("PUT (KAPASİTE AŞIMI): En az kullanılan '" + leastUsedKey + "' silindi.");
            }

            cache.put(key, value);
            System.out.println("PUT (" + key + "): Yeni eleman eklendi.");
        }

        displayCache();
    }

    private void displayCache() {
        System.out.print("Mevcut Önbellek Sırası (En Eski -> En Yeni): [");
        for (Map.Entry<String, String> entry : cache.entrySet()) {
            System.out.print(entry.getKey() + ":" + entry.getValue() + " | ");
        }
        System.out.println("] (Boyut: " + cache.size() + ")\n" + "---");
    }
}