package org.example.Strategy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Strategy strategy = new BubbleSortStrategy();
        List<Integer> list = Arrays.asList(2,1,5,4,1,2,1,2,3,5);
        Sorter sorter = new Sorter(strategy);
        sorter.setStrategy(new QuickSortStrategy());
        sorter.setStrategy(new MergeSortStrategy());
        sorter.sortkaro(list);
        System.out.println(list);
    }
}
