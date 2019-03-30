package com.zipcodewilmington.assessment1.part2;

import java.util.*;
import java.util.stream.Collectors;

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
        Integer[] resInteger = new Integer[objectArray.length];
        Integer counter = 0;
        for (Object o : objectArray){
            if( !o.equals(objectToRemove)){
                resInteger[counter] = (Integer) o;
                counter++;
            }
        }

        System.out.println( "Arrays: " + Arrays.asList(resInteger) + counter );
        resInteger = Arrays.copyOf(resInteger,counter);
        return resInteger;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        LinkedHashMap<Integer,Integer> previousValues = new LinkedHashMap<>();
        for (int i = 0; i < objectArray.length; i++){
            //System.out.println( "*" + Arrays.asList(previousValues) );
            Integer currentKey = (Integer) objectArray[i];
            System.out.println( i + " ** " + currentKey + " --- " + Arrays.asList(previousValues) );
            if( previousValues.get(currentKey) == null ){
                previousValues.put(currentKey, 1);
            }
            else {
                previousValues.put(currentKey, previousValues.get(currentKey) + 1);
            }
            //System.out.println( i + " ** " + currentKey + " --- " + Arrays.asList(previousValues) );
        }
        System.out.println( previousValues );
        //Collections.sort( previousValues.keySet() );

        LinkedHashMap<Integer, Integer> sortedMap =
                previousValues.entrySet().stream().
                        sorted(Map.Entry.comparingByValue()).
                        collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println( sortedMap.entrySet() + " " + sortedMap.entrySet().iterator().next()
                + " " + sortedMap.get(sortedMap.size()-1) + " " + sortedMap.values().iterator().next()
                + " " + sortedMap.keySet().toArray()[sortedMap.size()-1] );

        return sortedMap.keySet().toArray()[sortedMap.size()-1];
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        LinkedHashMap<Integer,Integer> previousValues = new LinkedHashMap<>();
        for (int i = 0; i < objectArray.length; i++){
            //System.out.println( "*" + Arrays.asList(previousValues) );
            Integer currentKey = (Integer) objectArray[i];
            //System.out.println( i + " ** " + currentKey + " --- " + Arrays.asList(previousValues) );
            if( previousValues.get(currentKey) == null ){
                previousValues.put(currentKey, 1);
            }
            else {
                previousValues.put(currentKey, previousValues.get(currentKey) + 1);
            }
            //System.out.println( i + " ** " + currentKey + " --- " + Arrays.asList(previousValues) );
        }
        //System.out.println( previousValues );
        //Collections.sort( previousValues.keySet() );

        LinkedHashMap<Integer, Integer> sortedMap =
                previousValues.entrySet().stream().
                        sorted(Map.Entry.comparingByValue()).
                        collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));

        //System.out.println( sortedMap.entrySet() + " " + sortedMap.entrySet().iterator().next()
                //+ " " + sortedMap.get(sortedMap.size()-1) + " " + sortedMap.values().iterator().next()
                //+ " " + sortedMap.keySet().toArray()[sortedMap.size()-1] );

        return sortedMap.keySet().toArray()[0];
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        System.out.println( objectArray.length );
        System.out.println( objectArrayToAdd.length );
        Integer objectArrayLength = (objectArray.length);
        Integer objectArrayToAddLength = (objectArrayToAdd.length);
        Integer totalLength =  objectArrayLength + objectArrayToAddLength;
        Integer[] resObj = new Integer[totalLength];
        Integer counter = 0;
        for (Object o : objectArray){
            resObj[counter] = (Integer) o;
            counter++;
        }
        for( Object o : objectArrayToAdd){
            resObj[counter] = (Integer) o;
            counter++;
        }
        return resObj;
    }
}
