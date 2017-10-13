package TryThings;// Created by natha on 10/4/2017.

// Author: Nathaniel Ben. Moody
// Initial Date: 10/4/2017
// Filename: TryCollections.java
// Project: JavaTrials


// Imports:
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;


public class TryCollections {

    int orderedArray[] = {1,2,3,4,5,6,7,8,9,10};
    int disorderedArray[] = {2,5,1,8,9,3,7,4,6,10};
    String tempnames[] = {"Egon", "Bob", "Archie", "Haraldo"};

    public TryCollections(){
    }

    public int[] quickSortArray(){
        // Set the index of the middle element as the pivot:
        int pivot = Math.round((disorderedArray.length / 2));
        System.out.println(pivot);



        return(this.disorderedArray);
    }

}//end of head class
