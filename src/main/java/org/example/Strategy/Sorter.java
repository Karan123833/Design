package org.example.Strategy;

import java.util.List;

public class Sorter {
    private Strategy strategy;

    public Sorter(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy=strategy;
    }

    public void sortkaro(List<Integer> list) {
        this.strategy.sort(list);
    }
}
