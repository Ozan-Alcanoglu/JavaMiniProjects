package org.example.example11;

import java.util.*;

public class TopKFrequentFinder {

    public Map<Integer, Integer> calculateFrequency(List<Integer> list) {
        Map<Integer, Integer> frequencies = new HashMap<>();
        for (int num : list) {
            frequencies.put(num, frequencies.getOrDefault(num, 0) + 1);
        }
        return frequencies;
    }

    public List<Integer> topKFrequent(List<Integer> list, int k) {
        if (k == 0) return Collections.emptyList();

        Map<Integer, Integer> frequencies = calculateFrequency(list);

        PriorityQueue<FrequencyElement> minHeap = new PriorityQueue<>(
                Comparator.comparingInt(e -> e.frequency)
        );

        for (Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {

            FrequencyElement element = new FrequencyElement(entry.getKey(), entry.getValue());

            minHeap.add(element);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        List<Integer> result = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll().number);
        }

        Collections.reverse(result);
        return result;
    }
}