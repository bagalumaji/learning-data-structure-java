package com.bagal.sorting;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(3);
        System.out.println("sortByUsingBubbleSort(list) = " + sortByUsingBubbleSort(list));
    }
    static List<Integer> sortByUsingBubbleSort(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i)>list.get(j)){
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }
}
