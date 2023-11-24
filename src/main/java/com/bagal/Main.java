package com.bagal;

import com.bagal.sorting.SelectionSort;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,1,5,4,3);
        System.out.println(SelectionSort.sortValuesByUsingSelectionSort(list));
    }
}