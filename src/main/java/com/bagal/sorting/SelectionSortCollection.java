package com.bagal.sorting;

import java.util.List;

public class SelectionSortCollection {
    public static List<Integer> sortValuesByUsingSelectionSort(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            int min = list.get(i);
            int swapIndex = 0;
            for (int j = i+1; j < list.size(); j++) {
                if(min > list.get(j)){
                    min = list.get(j);
                    swapIndex = j;

                }
            }
            if(swapIndex !=0){
                int t = list.get(i);
                list.set(i,min);
                list.set(swapIndex,t);
            }
        }
        return list;
    }
}
