package KevinLiu;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[] arr = sortingAlgorithms.randIntArr(5);
        System.out.println(Arrays.toString(arr));
        sortingAlgorithms.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}