package Repl_its;

import java.util.Scanner;

/*
using substring method output the first two letters of text string
for examole:
String txt = "foo"
the first two letters are "fo"


use print not println.

 */
public class _StringSubstring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();

        System.out.print(txt.substring(0,2));




    }


}
