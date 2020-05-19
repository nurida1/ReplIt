package Repl_its;

import java.util.Scanner;

/*
ask the user for his name, capture it on a string using scanner.

then output the length of the name string.
 */
public class _StringLength {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.next();

        System.out.println(name.length());


    }
}