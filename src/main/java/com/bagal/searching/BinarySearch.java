package com.bagal.searching;


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
}
