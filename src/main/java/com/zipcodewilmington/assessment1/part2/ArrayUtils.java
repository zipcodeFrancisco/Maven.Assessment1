package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer counter = 0;
        for( Object x : objectArray){
            if( x.equals(objectToCount) ){
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        List<Integer> list = new ArrayList<Integer>();
        for( Object x : objectArray){
            if( !x.equals(objectToRemove) ){
                //System.out.println( x );
                list.add( Integer.parseInt(x.toString()) );
            }
        }
        Object[] myObj = new Object[list.size()];
        //System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            myObj[i] = list.get(i);
            //System.out.println( myObj[i] );
        }
//        MultiplesDeleter.convertIntegers(list);

        return MultiplesDeleter.convertIntegers(list);
    }

//    public static Integer[] convertIntegers(List<Integer> integers)
//    {
//        Integer[] ret = new Integer[integers.size()];
//        for (int i=0; i < ret.length; i++)
//        {
//            ret[i] = integers.get(i).intValue();
//        }
//        return ret;
//    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        ArrayList<Object> myArrayList = new ArrayList<Object>();

        for (Object o : objectArray){
            System.out.println( o );
        }

        return null;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        return null;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        return null;
    }
}
