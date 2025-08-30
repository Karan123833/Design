package org.example.Strategy;

import java.util.List;

public class BubbleSortStrategy implements Strategy{
    @Override
    public void sort(List<Integer> list) {
        int n=list.size();
        int temp;
        boolean swap=false;
        for(int i=0;i<n-1;i++) {
            swap=false;
            for(int j=0;j<n-i-1;j++) {
                if(list.get(j) > list.get(j + 1)) {
                    temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    swap=true;
                }
            }
            if(!swap) break;
        }
    }
}
