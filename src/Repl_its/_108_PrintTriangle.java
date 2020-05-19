package Repl_its;

import java.util.Scanner;

/*
Assume that the int variables i and j have been declared, and that n has been declared and initialized.
Using for loops (you may need more than one), write code that will cause a triangle of asterisks of size n to be output to the screen.

Example:
input: 5
output: *
output: **
output: ***
output: ****
output: *****

Example:
input: 3
output: *
output: **
output: ***
 */
public class _108_PrintTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


//        int i =1;
//        while (i <= n) {
//
//            int j =1;
//            while (j <= i){
//                System.out.print("* ");
//                j++;
//            }
//            System.out.println();
//
//            i++;

    for (int i =1; i <= n; i++) {
        for (int j =1; j <=i; j++) {
            System.out.print("*");
        }
        System.out.println();




    }
    }
}
