package Repl_its;

import java.util.Scanner;

public class _Conditional_Statement {
    /*
 For you to do:

Given a string variable "word", do the following tests

If the word ends in "y", print "-ies"
If the word ends in "ey", print "-eys"
If the word ends in "ife", print "-ives"
If none of the above is true, print "-s"
No more than one should be printed.
     */

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("In:");
        String word = inp.nextLine();

       String result = (word.endsWith("ey"))? "-eys" : (word.endsWith("y"))? "-ies" :
                (word.endsWith("ife"))? "-ives" : "-s";

        System.out.println(result);

    }






}
