package com.codedifferently.assessment01.part01;

public class IntegerArrayUtils {
    /**
     * Get the sum of all integers in array
     * @param intArray
     * @return
     */
    public static Integer getSum(Integer[] intArray){
        int sum = 0;
        for(int number : intArray){
            sum += number;
        }
        return sum;
    }

    /**
     * Get the product of all integers in the array
     * @param intArray
     * @return
     */
    public static Integer getProduct(Integer[] intArray){
        int product = intArray[0];
        for(int i = 1; i< intArray.length; i++){
            product *= intArray[i];
        }
        return product;
    }

    /**
     * Get the average of all integers in the array
     * @param intArray
     * @return
     */
    public static Double getAverage(Integer[] intArray){
        double average = getSum(intArray) / intArray.length;
        return average;
    }
}
