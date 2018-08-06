package com.rodionorets.leetcode;

import java.util.Arrays;

public class MergeSortedArrays {
    public int[] merge(int[] arr1, int[] arr2) {
        int[] mergingResult = new int[arr1.length + arr2.length];

        int mergingResultIndex = 0;
        int arr1Index = 0;
        int arr2Index = 0;
        while((arr1Index < arr1.length && arr2Index < arr2.length) && (arr1[arr1Index] <= arr2[arr2Index] || arr1[arr1Index] > arr2[arr2Index])) {
            if (arr1[arr1Index] <= arr2[arr2Index]) {
                mergingResult[mergingResultIndex] = arr1[arr1Index];
                arr1Index++;
                mergingResultIndex++;
            } else if (arr1[arr1Index] > arr2[arr2Index]) {
                mergingResult[mergingResultIndex] = arr2[arr2Index];
                arr2Index++;
                mergingResultIndex++;
            }
        }

        while (arr1Index < arr1.length) {
            mergingResult[mergingResultIndex] = arr1[arr1Index];
            mergingResultIndex++;
            arr1Index++;
        }

        while (arr2Index < arr2.length) {
            mergingResult[mergingResultIndex] = arr2[arr2Index];
            mergingResultIndex++;
            arr2Index++;
        }

        return mergingResult;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new MergeSortedArrays().merge(new int[]{1, 3, 5, 7, 9, 9, 9}, new int[]{2, 4, 6, 8, 20, 20, 20})));
    }
}
