package com.bagal.sorting;

public class BubbleSortByUsingArray {
    public static void main(String[] args) {
        int [] arr = {2,3,1,5,4};
        sortArrayByUsingBubbleSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    static void sortArrayByUsingBubbleSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }
}
