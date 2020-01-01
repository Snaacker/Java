package com.snaacker.playground.algo.sort;

public class BubbleSort {

    public int[] bubbleSort(int[] inputArray){
        for(int i=0; i < inputArray.length - 1; i++) {
            for(int j=0; j < inputArray.length - 1 - i; j++) {
                if(inputArray[j] > inputArray[j + 1]) {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j+1];
                    inputArray[j+1] = temp;
                }
            }
        }
        return inputArray;
    }

}
