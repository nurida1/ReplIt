package Repl_its;

import java.util.Scanner;

/*
Print out the number of times that the string "hi" appears anywhere in the given string.
Example:
input: abc hi how hi
output: 2

Example:
input: hi code java please
output: 1
 */
public class _91_CountHi_LoopString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
     int count =0;
     while  (str.contains("hi")) {
         count ++;
         str = str.replaceFirst("hi", "");
     }
        System.out.println(count);



        /*
        int count = 0;
        for (int i =0; i < str.length(); i++) {
            if (str.contains("hi")) {
                count++;
            str = str.replaceFirst("hi", "");
            }
        }
        System.out.println(count);
         */

    }


}
