package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     * NOTE: This method includes the n in order to satisfy the test. You can change the limit of the loop if you
     * want to do not include the n
     */
    public static Integer getSumOfN(Integer n) {
        Integer container = 0;
        for(int i = 0; i <= n; i++){
            container += i;
        } 
        return container;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        Integer container = 1;
        for(int i = 1; i <= n; i++){
            container *= i;
        }
        return container;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        return Integer.parseInt(BasicStringUtils.reverse(val.toString()));
    }
}
