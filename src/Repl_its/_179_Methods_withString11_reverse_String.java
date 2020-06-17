package Repl_its;

import java.util.Arrays;

public class _179_Methods_withString11_reverse_String {
    /*
    reverse method reverse a string.
it gets a string and returns it in reverse.

for example:

reverse("foo") ==> "oof"

reverse("student") ==> "tnedust"
     */

    public static String reverse (String input) {

        String reverse = "";
        for (int i = input.length()-1; i >= 0; i--) {
            reverse += input.charAt(i);
        }
        return reverse ;
    }

    public static void main(String[] args) {
        System.out.println(reverse("foo"));
    }

}


