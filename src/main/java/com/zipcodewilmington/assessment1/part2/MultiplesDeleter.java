package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        ArrayList<Integer> myArray = new ArrayList<>();
        for(int i = 0; i< ints.length; i++){
            if(ints[i]%2 != 0){
                myArray.add(ints[i]);
            }
        }
        return convertIntegers(myArray);
    }

    public static Integer[] convertIntegers(List<Integer> integers)
    {
        Integer[] ret = new Integer[integers.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        ArrayList<Integer> myArray = new ArrayList<>();
        for(int i = 0; i< ints.length; i++){
            if(ints[i]%2 != 1){
                myArray.add(ints[i]);
            }
        }
        return convertIntegers(myArray);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        ArrayList<Integer> myArray = new ArrayList<>();
        for(int i = 0; i< ints.length; i++){
            if(ints[i]%3 != 0){
                myArray.add(ints[i]);
            }
        }
        return convertIntegers(myArray);
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        ArrayList<Integer> myArray = new ArrayList<>();
        for(int i = 0; i< ints.length; i++){
            if(ints[i]%multiple != 0){
                myArray.add(ints[i]);
            }
        }
        return convertIntegers(myArray);
    }
}
