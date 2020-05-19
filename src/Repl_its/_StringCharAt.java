package Repl_its;
/*
using charAt method output the 3rd letter of txt string then the 5th letter then the 6th letter.

use print not println.
 */

import java.util.Scanner;

public class _StringCharAt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();

        System.out.print(txt.charAt(2)); //Nurida 012345
        System.out.print(txt.charAt(4));
        System.out.print(txt.charAt(5));

    }



}
