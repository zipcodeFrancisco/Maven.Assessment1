package com.zipcodewilmington.assessment1.part4;

import java.math.BigInteger;


public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        Integer c = 0;
        Integer i = 0;
        BigInteger c2 = new BigInteger("0");
        BigInteger i2 = new BigInteger("0");
        BigInteger uno = new BigInteger("1");
        System.out.println( "Test: k:" + k + " j:" + j);
        if( k >= j ) {
            while (k > i) {
                i = i + j;
                System.out.println("k:" + k + " j:" + j + " c:" + c);
                c = c + 1;
            }
        }
        else {
            c = k;
        }
    return c;
    }
}
