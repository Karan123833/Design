package org.example.Strategy;

import java.util.ArrayList;
import java.util.List;

public class MergeSortStrategy implements Strategy{

    public void merge(int low,int mid,int high,List<Integer> list) {
        List<Integer> temp = new ArrayList<>();
        int i=low;
        int j=mid+1;
        while(i<=mid&&j<=high) {
            if(list.get(i)<= list.get(j)) {
                temp.add(list.get(i));
                i++;
            }
            else {
                temp.add(list.get(j));
                j++;
            }
        }
        while(i<=mid) {
            temp.add(list.get(i++));
        }
        while(j<=high) {
            temp.add(list.get(j++));
        }
        for (int k = 0; k < temp.size(); k++) {
            list.set(low + k, temp.get(k));
        }
    }
    public void mergesort(int low,int high,List<Integer> list) {
        if(low<high) {
            int mid = (low + high) >> 1;
            mergesort(low, mid, list);
            mergesort(mid + 1, high, list);

            merge(low,mid,high,list);
        }
    }
    @Override
    public void sort(List<Integer> list) {
        mergesort(0, list.size()-1,list);
    }
}
