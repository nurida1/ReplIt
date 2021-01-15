package Repl_its;

import java.util.Scanner;

public class _AssessmentTest_5_1PrintVowels {
    /*
    Inputs:
String word;

Write a for loop that will loop through every letter of the input and print out just the vowels. Sample input/outputs
HINT:  vowel is a letter representing a vowel sound, such as a, e, i, o, u.

In: howdyho
oo

In: huehuehuehue
ueueueue

In: poopoo what idk what im doing
ooooaiaioi
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("In: ");
        String word = inp.nextLine();

        //a, e, i, o, u

        String result = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i); //because from String to char
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                result += ch;
            }

        }
        System.out.println( result );
    }
}
