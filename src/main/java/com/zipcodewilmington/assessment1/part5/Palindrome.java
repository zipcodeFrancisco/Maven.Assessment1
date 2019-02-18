package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part2.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class Palindrome {

    public Integer countPalindromes(String input){
        List<List<String>> str = substrings(input);
        System.out.println( str );



        return null;
    }

    static List<List<String>> substrings(String input) {
        List<List<String>> result = new ArrayList<>();
        if (input.length() == 1) {
            result.add(Arrays.asList(new String[]{input}));
        }
        else {
            //iterate j, ja, jav, jav
            for (int i = 0; i < input.length()-1; i++ ) {
                String root = input.substring(0,i+1);
                String leaf = input.substring(i+1);
                for( List<String> strings: substrings(leaf) ) {
                    ArrayList<String> current = new ArrayList<String>();
                    current.add(root);
                    current.addAll(strings);
                    result.add(current);
                }
            }
            //adds the whole string as one of the leaves (ie. java, ava, va, a)
            result.add(Arrays.asList(new String[]{input}));
        }
        return result;
    }


    public static boolean isPalindromic(String[] array) {
        //System.out.print('\u000C');
        //System.out.println( "Original array: " + Arrays.toString(array) );
        //System.out.println( array );
        String [] cloneArray = Arrays.copyOf(array, array.length); // Clone original array
        List<String> newList = Arrays.asList(cloneArray); // Converting original array to list
        //System.out.println( "List:" + newList );
        Collections.reverse( newList ); //Reverse list
        //System.out.println( "Reverted: " +  newList );
        //System.out.println( Arrays.toString(cloneArray) );
        String[] dummy = newList.toArray(new String[0]);
        //System.out.println( dummy );
        //System.out.println( dummy.equals(cloneArray) );
        Boolean result = dummy.equals(cloneArray);
        //Boolean result = dummy == cloneArray;
        return Arrays.toString(array).equals(Arrays.toString(dummy));
    }

}
