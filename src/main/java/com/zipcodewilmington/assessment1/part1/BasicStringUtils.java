package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        return str.substring(0,1).toUpperCase()+str.substring(1,str.length());
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String container = "";
        for( int i = str.length(); i > 0; i--){
            container += str.substring(i - 1, i);
        }
        return container;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        return camelCase(reverse(str));
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1,str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
//    String input = "tHE quiCK brOwN";
//    String expected = "The QUIck BRoWn";
    public static String invertCasing(String str) {
        String container = "";
        for (int i = 0  ; i < str.length(); i++) {
            container += invertLetter(str.substring(i,i+1).charAt(0));
        }
        return container;
    }

    public static String invertLetter(Character c){
        if( c != ' '){
            if( Character.isUpperCase( c ) ){
                return c.toString().toLowerCase();
            }
            else {
                return c.toString().toUpperCase();
            }
        }
        return " ";
    }
}
