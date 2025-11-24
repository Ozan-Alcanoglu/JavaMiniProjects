package org.example.example10;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianFinder {

    private PriorityQueue<Integer> lows;
    private PriorityQueue<Integer> highs;


    public MedianFinder(){
        this.highs= new PriorityQueue<>(Comparator.reverseOrder());
        this.lows= new PriorityQueue<>();
    }

    public PriorityQueue<Integer> getLows(){
        return this.lows;
    }

    public void setLows(PriorityQueue<Integer> lows) {
        this.lows = lows;
    }

    public PriorityQueue<Integer> getHighs() {
        return highs;
    }

    public void setHighs(PriorityQueue<Integer> highs) {
        this.highs = highs;
    }


    public void addNum(int number){

        lows.add(number);

        highs.add(lows.poll());

        if (highs.size() > lows.size()) {
            lows.add(highs.poll());
        }

    }

    public double findMedian() {
        if (lows.size() > highs.size()) {
            return (double) lows.peek();
        } else {
            return (lows.peek() + highs.peek()) / 2.0;
        }
    }

}
