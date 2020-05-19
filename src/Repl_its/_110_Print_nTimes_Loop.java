package Repl_its;

import java.util.Scanner;

/*
Given an int variable n that has already been declared and initialized to a positive value,
and another int variable j that has already been declared,
use a for loop to print a single line consisting of n asterisks.
Thus if n contains 5, five asterisks will be printed. Use no variables other than n and j.

Example:
input: 1
output: *

Example:
input: 3
output: ***

NO NEED FOR ARRAY HERE, JUST USE LOOP
 */
public class _110_Print_nTimes_Loop {

    public static void main(String[] args) {

        int j =0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

    for (j = 0; j < n; j++ ) {
        System.out.print("*");
    }
    }


}
