package com.example.springexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
    @Autowired
    private SortAlgo sortAlgo;

    public boolean binarySearch(int[] numbers, int number) {
        int[] sortedArray = sortAlgo.sort(numbers);
        return binarySearch(sortedArray, 0, sortedArray.length - 1, number) != -1;
    }

    private int binarySearch(int[] arr, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }

        return -1;
    }
}
