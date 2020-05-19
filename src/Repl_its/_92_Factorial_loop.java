package Repl_its;
/*
In mathematics, the factorial of a positive integer n, denoted by n!, is the product of all positive integers less than or equal to n.  Calculate factorial and output result to the console.
Example:
input: 5
output: 120
 */
import java.util.Scanner;

public class _92_Factorial_loop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); //4

        long factorial =1; //1

        for (int i = 1; i <= n; i++ ) {   //1, 2 , 3, 4
            factorial = factorial*i;      //1*1, 1*2, 2*3, 6 * 4

        }
        System.out.println(factorial);
    }



}
