package com.bagal.sorting;

import java.util.List;

public class SelectionSort {
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

    public static int []  sortValuesByUsingSelectionSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int min  = arr[i];
            int index=0;
            for (int j = i+1; j < arr.length; j++) {
                if(min > arr[j]){
                    min = arr[j];
                    index = j;
                }
            }
            if(index !=0){
                int t = arr[i];
                arr[i] = arr[index];
                arr[index] = t;
            }
        }
        return arr;
    }
}
