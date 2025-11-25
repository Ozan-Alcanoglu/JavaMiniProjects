package org.example.example11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        List<Integer> inputList = Arrays.asList(1, 1, 1, 2, 2, 3, 4, 4, 4, 4, 5, 5, 5);
        int K = 3;

        TopKFrequentFinder finder = new TopKFrequentFinder();

        List<Integer> topKResult = finder.topKFrequent(inputList, K);

        System.out.println("--- Top K Frequent Elements Finder ---");
        System.out.println("Giriş Veri Seti: " + inputList);
        System.out.println("Aranan K Değeri: " + K);

        System.out.println("\n✅ EN ÇOK TEKRAR EDEN İLK " + K + " ELEMAN:");
        System.out.println(topKResult);

    }
}
