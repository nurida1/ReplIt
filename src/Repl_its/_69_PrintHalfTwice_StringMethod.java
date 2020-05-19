package Repl_its;

import java.util.Scanner;

/*
Write a program that will print out first half of the word twice.

Example:

input: java
output: jaja
 */
public class _69_PrintHalfTwice_StringMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.println(word.substring(0,word.length()/2)+ word.substring(0, word.length()/2));

    }


}
/*Muhtar:
 if (word.length()%2!=0){
            word = word.substring(0,word.length()/2) + word.substring(0,word.length()/2);
        }else{
            word = word.substring(0,word.length()/2)+word.substring(0,word.length()/2);
        }

        System.out.println(word);

 */