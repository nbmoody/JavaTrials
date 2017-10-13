package Algorithms;// Created by natha on 10/9/2017.

// Author: Nathaniel Ben. Moody
// Initial Date: 10/9/2017
// Filename: BinarySearch.java
// Project: JavaTrials


// Imports:
import java.util.Scanner;

public class BinarySearch {

    //-----------------------------------------------------------------------------------
    public static void main(String[] args) {
        BinarySearch.binarysearch_demonstration();
    }
    //-----------------------------------------------------------------------------------


    public static int binarySearch(int[] array, int left, int right, int search) {

        int middle = ((left + right)/2);

        if(array[middle] == search){
            return middle;
        } else if(array[middle] < search){
            // If the element at the middle is less than search, recurse using the top half:
            binarySearch(array, middle, right, search);
        } else if(array[middle] > search){
            // If the element at the middle is greater than search, recurse using the bottom half:
            binarySearch(array, left, middle, search);
        }

        return middle;
    }


    public static int[] quickSort(int[] unsortedArrayIn, int leftIn, int rightIn){

        int index = partition(unsortedArrayIn, leftIn, rightIn);

        // Run down the left side:
        if (leftIn < index-1) { quickSort(unsortedArrayIn, leftIn, index - 1); }
        // Run down the right side:
        if (index < rightIn) { quickSort(unsortedArrayIn, index, rightIn); }

        return unsortedArrayIn;
    }


    public static int partition(int arrayIn[], int leftIn, int rightIn) {

        // Assign the left (start) and right (end) of the part of the array passed in that is being considered.
        int left = leftIn, right = rightIn;
        int temp; // (to use when swapping values)

        // Find the middle of the part of the array passed in and use it as the pivot.
        int pivot = arrayIn[(left+right)/2];

        while (left <= right) { // If left is ever greater than right, then they've passed each other, so stop iterating.
            // Increment from left to right until you find a value bigger than the pivot.
            while (arrayIn[left] < pivot) { left++; }
            // Then increment from the right to left until you find a value smaller than the pivot.
            while (arrayIn[right] > pivot) { right--; }
            // If the value on left is less than or equal to the value on the right, swap them.
            if (left <= right) {
                //Swap and iterate.
                temp = arrayIn[left];
                arrayIn[left] = arrayIn[right];
                arrayIn[right] = temp;
                left++;
                right--;
            }
        }

        return left;

    }


    public static void quicksort_demonstration(){
        int[] unsorted_array = {2,8,6,3,5,9,4,7,10,1};
        int test_left_in = 0;
        int test_right_in = unsorted_array.length -1;

        int[] original_array = unsorted_array.clone();
        int[] sorted_array = BinarySearch.quickSort(unsorted_array, test_left_in, test_right_in);

        System.out.println("Array In:");
        for (int element : original_array) { System.out.print(element + ","); }
        System.out.println("Array Out: ");
        for (int element : sorted_array) { System.out.print(element + ","); }

    }


    public static void binarysearch_demonstration(){
        int[] unsorted_array = {4,5,8,10,9,1,6,3,7,2};
        int left = 0;
        int right = unsorted_array.length - 1;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number between 1-10 that you would like to search for: ");
        int search = in.nextInt();

        System.out.println("Beginning with unsorted array:");
        for(int element : unsorted_array){ System.out.print(element + ","); }

        System.out.println("Sorting using quicksort()...");
        quickSort(unsorted_array, left, right);

        System.out.println("Array sorted succesfully:");
        for(int element : unsorted_array){ System.out.print(element + ","); }

        System.out.println("Searching array for " + search + ".");
        System.out.println("Initializing Binary Search...");
        int searchIndex = binarySearch(unsorted_array, left, right, search);
        System.out.println("The element you are searching for is at index " + searchIndex + ".");

    }

}//end of head class
