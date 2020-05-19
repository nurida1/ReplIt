package Repl_its;

import java.util.Scanner;

/*
Given method called cube. Write all required code inside this method in order  to asks the user for a number and then prints the cubed value of that number:

Example:

input: 5
output: 125

hint: cube of a number n = n*n*n
 */
public class _141_Methods3_findCube {

    public static void cube() {
        Scanner input = new Scanner (System.in);

        int num = input.nextInt();

        num = num*num*num;

        System.out.println(num);
    }

    public static void main(String[] args) {
        cube();
    }




}
