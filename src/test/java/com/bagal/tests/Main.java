package com.bagal.tests;

import static com.bagal.searching.BinarySearch.searchElementByUsingBinarySearch;

public class Main {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6};
        System.out.println("searchElementByUsingBinarySearch(arr,4) = " + searchElementByUsingBinarySearch(arr, 5));
    }
}