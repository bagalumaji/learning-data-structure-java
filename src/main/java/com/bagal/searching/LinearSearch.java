package com.bagal.searching;

import java.util.List;

public class LinearSearch {
    public static int searchElement(int [] arr, int value){
        int index = -1 ;
        int i=0;
        while (i<arr.length){
            if(arr[i]==value){
                index = i;
                break;
            }
            i++;
        }
        return index;
    }
    public static int searchElement(List<Integer> arr, int value){
        int index = -1 ;
        int i=0;
        while (i<arr.size()){
            if(arr.get(i)==value){
                index = i;
                break;
            }
            i++;
        }
        return index;
    }
}
