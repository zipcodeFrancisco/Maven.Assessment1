package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

import java.util.Arrays;

public class Palindrome {

    public Integer countPalindromes(String input){
        System.out.println( separator(input) );
        return separator(input);
    }

    public static Integer separator(String str){
        Integer c = 0;
        Integer res = 0;
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length() + 1; j++) {
                c++;
                s = str.substring(i, j);
                if ( BasicStringUtils.reverse(s).equals(s) ){
                    res++;
                }
            }
        }
        return res;
    }
}
