package Repl_its;

import java.util.Arrays;
import java.util.Scanner;

public class _AssessmentTest_5_2OddNumbers {
    /*
    You are given two inputs:
int num1;
int num2;
You can assume that the following:
num2 > num1 ==> TRUE

You are to write a program that will print out all the ODD numbers in between num1 and num2 inclusive.  Your output should all be on one line, separated by spaces.

Sample input/output:
#1: 3
#2: 11
3 5 7 9 11

#1: 4
#2: 20
5 7 9 11 13 15 17 19

#1: -2
#2: 6
-1 1 3 5

     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("#1: ");
        int num1 = s.nextInt();

        System.out.println("#2: ");
        int num2 = s.nextInt();

        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        }


    }


