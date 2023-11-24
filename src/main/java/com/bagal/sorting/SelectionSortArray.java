package com.bagal.sorting;

public class SelectionSortArray {
    public static void main(String[] args) {
        int [] arr = {20,40,10,50,30};
        sortValuesUsingSelectionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    static void sortValuesUsingSelectionSort(int [] arr){
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
    }
}
