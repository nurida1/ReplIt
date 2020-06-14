package Repl_its;

import java.util.Scanner;

public class _155Methods_17Fibonacci_numbers {

/*
Complete a method fib() that will compute Fibonacci numbers
In Fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……... The first two numbers of Fibonacci series are 0 and 1.
Given a number num, print n-th Fibonacci Number.

Input  : 2
Output : 1

Input  : 9
Output : 34
 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    //fib:  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144
    //n-th: 0  1  2  3  4  5  6  7   8   9   10   11   12


    //fib: sum of previous two numbers
    //0 + 1 = 1
    //1+1 = 2
    //1+2 = 3
    //2+3 = 5
    //3+5 = 8

    public static void fib(int num) {

    int []arr = new int[num+1]; //capacity is one more than it's given  //2 -> [0, 1, 1]
    arr[1] = 1;

    for (int i = 0; i <= arr.length-3; i++) { //we get 3 items at a time

        //System.out.println(arr[i+2] + " " +  arr[i] +" " + arr[i+1]);
        //                      0              0              1      [0]
        //                      0              1              1      [1]
        //                      0              1              2      [2]
        //                      0              2              3      [3]
        //                      0              3              5      [4]
        //                      0              5              8      [5]
        //                      0              8             13      [6]


        arr[i + 2] = arr[i] + arr[i + 1]; //we can get each number
        //after calculation:
        //System.out.println(arr[i+2] + "=" +  arr[i] +"+" + arr[i+1]);
        //System.out.println(arr[i+2] + " " +  arr[i] +" " + arr[i+1]);
        //                      1                0              1     [0]
        //                      2                1              1     [1]
        //                      3                1              2     [2]
        //                      5                2              3     [3]
        //                      8                3              5     [4]
        //                     13                5              8     [5]
        //                     21                8              13

    }
        System.out.println(arr[ arr.length - 1]); //to print last number
    }





        }






