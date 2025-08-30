package org.example.Strategy;

import java.util.List;

public class QuickSortStrategy implements Strategy{

    public int quick(int l,int h,List<Integer> list) {
        int pivot=list.get(l);
        int i=l;int j=h;
        while(i<j) {
            while(list.get(i) <=pivot && i<=h-1) {
                i++;
            }
            while(list.get(j)>pivot && j>=l+1) {
                j--;
            }
            if(i<j) {
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }
        int temp = list.get(l);
        list.set(l, list.get(j));
        list.set(j, temp);
        return j;
    }
    public void quicksort(int l,int h,List<Integer> list) {
        if(l<h) {
            int partition = quick(l, h, list);
            quicksort(l, partition - 1, list);
            quicksort(partition+1, h, list);
        }
    }
    @Override
    public void sort(List<Integer> list) {
        quicksort(0,list.size()-1,list);
    }
}
