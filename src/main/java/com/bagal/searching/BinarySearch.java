package com.bagal.searching;

import java.util.List;

public class BinarySearch {
    public static int searchElementByUsingBinarySearch(int [] arr,int value){
        int index=-1;
        int begin=0,end=arr.length-1,mid;
        while(begin<=end){
            mid = (begin+end)/2;
            if(arr[mid] == value){
                index=mid;
                break;
            }
            if(value>arr[mid]){
                begin=mid+1;
            }else {
                end=mid-1;
            }
        }
        return index;
    }
    public static int searchElementByUsingBinarySearch(List<Integer> arr, int value){
        int index=-1;
        int begin=0,end=arr.size()-1,mid;
        while(begin<=end){
            mid = (begin+end)/2;
            if(arr.get(mid) == value){
                index=mid;
                break;
            }
            if(value>arr.get(mid)){
                begin=mid+1;
            }else {
                end=mid-1;
            }
        }
        return index;
    }
}
