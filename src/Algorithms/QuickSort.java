package Algorithms;// Created by natha on 10/9/2017.

// Author: Nathaniel Ben. Moody
// Initial Date: 10/9/2017
// Filename: QuickSort.java
// Project: JavaTrials


// Imports:


public class QuickSort {

// Attributes:


// Methods:
    public static int partition(int arr[], int low, int high){

        /* This chooses the end of the array as the pivot, always.
        Other implementations might choose the beginning, median, or a random index.*/
        int pivot = arr[high];
        int i = (low-1);
        for(int j=low; j<high; j++){
            //If the element at j is <= the pivot element:
            if(arr[j] <= pivot){
                i++;

                // Swap the element at arr[i] with the element at arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the element at arr[i+1] and the pivot (arr[high]):
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }


// Setters and Getters:


}//end of head class
