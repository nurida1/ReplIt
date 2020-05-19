package Repl_its;

import java.util.Scanner;

/*
You have 2 words
Print the first word, second word, second word, first word

Input:
one
two
Output:
onetwotwoone
 */
public class _63_DuplicateIt_StringMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        System.out.println(word1+word2+word2+word1);



    }


}
