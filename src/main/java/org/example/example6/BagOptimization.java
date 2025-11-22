package org.example.example6;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class BagOptimization {

    private final int capacity;
    private final List<Product> productList = new ArrayList<>();

    public BagOptimization(int capacity){
        this.capacity = capacity;
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public int findMax() {
        int n = productList.size();
        int W = capacity;

        int[][] DP = new int[n + 1][W + 1];

        for (int i = 1; i <= n; i++) {

            int weight_i = productList.get(i - 1).getWeight();
            int value_i = productList.get(i - 1).getValue();

            for (int w = 1; w <= W; w++) {

                if (weight_i <= w) {

                    int takeValue = DP[i - 1][w - weight_i] + value_i;
                    int skipValue = DP[i - 1][w];


                    DP[i][w] = Math.max(takeValue, skipValue);

                } else {
                    DP[i][w] = DP[i - 1][w];
                }
            }
        }

        return DP[n][W];
    }
}