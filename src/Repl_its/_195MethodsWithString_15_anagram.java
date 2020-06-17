package Repl_its;

import java.util.Arrays;

public class _195MethodsWithString_15_anagram {

    /*
    Anagram is a word, phrase, or name formed by rearranging the letters of another, such as cinema, formed from iceman.
    isAnagram method checks if word1 and word2 are anagram to each other then return a boolean.
    each letter in word1 should appear in word2 exact number of times
    ignore empty spaces
    make your code case insensitive

    Examples:
    isAnagram("listen", "Silent") ==> true
    isAnagram("earth", "heart") ==> true
    isAnagram("star", "rats") ==> true
    isAnagram("hi", "bye") ==> false
    isAnagram("java", "cava") ==> false

     */

    public static boolean isAnagram(String word1, String word2 ) {
    if (word1.length()!=word2.length()) {
        return false;
    }
        //first turn them into array => sort -> compare array equality
        char[] word1Chars = word1.replace(" ", "").toLowerCase().toCharArray();
        char[] word2Chars = word2.replace(" ", "").toLowerCase().toCharArray();

        Arrays.sort(word2Chars);
        Arrays.sort(word1Chars);
        return Arrays.equals(word1Chars, word2Chars);
    }


    public static void main(String[] args) {
        System.out.println(isAnagram("Listen","Silent"));
    }






}
