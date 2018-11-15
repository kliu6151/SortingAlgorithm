package KevinLiu;

import java.util.Arrays;

public class sortingAlgorithms {

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int[] arr)
    {
        //This will loop through the entire array, ensuring all the indexes are checked
        for (int i = 0; i < arr.length; i++)
        {
            //This will loop through for each individual number/index
            for (int j = 0; j < arr.length - i - 1; j++) {
                //If the number is greater than the next
                // number, then they will switch
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j + 1);
                }
            }
        }

    }

    public static void selectionSort(int[] arr)
    {
        int i,j;
        for(i = 0; i < arr.length - 1; i++)
        {
            int min = i;
            for(j = i + 1; j<arr.length - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    min = j;
                }
                if(min != i)
                {
                    swap(arr, i, min);
                }
            }

        }
    }

    //Creates an array of random integers
    public static int[] randIntArr(int count)
    {
        int[] arr = new int[count];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random()*10000);
        }
        return arr;
    }

}