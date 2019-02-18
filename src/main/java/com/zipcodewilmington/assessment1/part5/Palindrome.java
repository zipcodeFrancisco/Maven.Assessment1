package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part2.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class Palindrome {

    public Integer countPalindromes(String input){
//        List<List<String>> str = substrings(input);
//        System.out.println( str );
//
//

        return null;
    }

    static List<List<String>> substrings(String input) {

        // Base case: There's only one way to split up a single character
        // string, and that is ["x"] where x is the character.
        if (input.length() == 1)
            return Collections.singletonList(Collections.singletonList(input));

        // To hold the result
        List<List<String>> result = new ArrayList<>();

        // Recurse (since you tagged the question with recursion ;)
        for (List<String> subresult : substrings(input.substring(1))) {

            // Case: Don't split
            List<String> l2 = new ArrayList<>(subresult);
            l2.set(0, input.charAt(0) + l2.get(0));
            result.add(l2);

            // Case: Split
            List<String> l = new ArrayList<>(subresult);
            l.add(0, input.substring(0, 1));
            result.add(l);
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
