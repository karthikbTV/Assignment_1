package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int key = 4;
        Set<Pair> finalResult = new HashSet<>();
        Integer[] numbers = new Integer[] {1, 2, -1, -2, 4, 5, -9, 0, 10, 40 };

        for (int i = 0; i <numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == key & i !=j ) {
                    getFinalResult(finalResult, numbers, i, j);
                }
                else if (numbers[i] - numbers[j] == key & i !=j ){
                    getFinalResult(finalResult, numbers, i, j);
                }
                else if (numbers[i] * numbers[j] == key ){
                    getFinalResult(finalResult, numbers, i, j);
                }
                else if ((float)numbers[i] / numbers[j] == key ){
                    getFinalResult(finalResult, numbers, i, j);
                }
            }
        }
        System.out.println("Result array : "+ finalResult);
    }

    private static Set<Pair> getFinalResult(Set<Pair> finalResult, Integer[] numbers, int i, int j) {
        Pair resultAppend;
        if (numbers[i] < numbers[j]){
            resultAppend = new Pair(numbers[i], numbers[j]);
        }
        else {
            resultAppend = new Pair(numbers[j], numbers[i]);
        }
        finalResult.add(resultAppend);
       return finalResult;
    }
}