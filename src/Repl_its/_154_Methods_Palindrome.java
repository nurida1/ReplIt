package Repl_its;

import java.util.Scanner;

/*
Complete a method isPalindrome() that will check if number is a palindrome. Print your result as a boolean (true or false).
Example:
input: 1001
output: true

Example:
input: 1234
output: false
 */
public class _154_Methods_Palindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num) {

        String str = "" + num;


        int lastIndexNum = str.length()-1;
        String reverse = "";
        for (int i =lastIndexNum; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equals(reverse )) {
            System.out.println(true);
        }else   {
            System.out.println(false);
        }

    }



}
