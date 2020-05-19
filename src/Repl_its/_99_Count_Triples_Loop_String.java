package Repl_its;

//We'll say that a "triple" in a string is a char appearing three times in a row. Print out the number of triples in the given string. The triples may overlap.
//        Example:
//        input: abcXXXabc
//        output: 1
//
//        Example:
//        input: xxxabyyyycd
//        output: 3
//
//        Example:
//        input: java
//        output: 0

import java.util.Scanner;

public class _99_Count_Triples_Loop_String {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int count = 0;

        for (int i =0; i < str.length()-2; i++) {

            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i+1);
            char ch3 = str.charAt(i+2);

            if (ch1 == ch2 && ch1 == ch3) {
            count++;
            }
        }
        System.out.println(count);

    }

    }

