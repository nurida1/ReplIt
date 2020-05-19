package Repl_its;

import java.util.Scanner;

/*
Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars,  otherwise print the string unchanged.

Example:
input: xHiX
output: Hi

Example:
input: apple
output: apple

input: xUxL
output: UxL

input: JavaX
output: Java
 */
public class _75_Without_X_x_StringMethods {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String str ="";

        if (word.toLowerCase().startsWith("x") && word.toLowerCase().endsWith("x") ) {
            str = word.substring(1, word.length() - 1);
        } else if (word.toLowerCase().startsWith("x")) {
            str = word.substring(1);
        } else if (word.toLowerCase().endsWith("x")) {
            str = word.substring(0,word.length()-1);
        }else{
            str = word;
        }
        System.out.println(str);

    }

}
