package Repl_its;

import java.util.Arrays;
import java.util.Scanner;

/*
Write a void method printUniqueNumbers that will
print unique numbers from an array of ints.
Write a void method printUniqueNumbers that will print
unique numbers from an array of ints.

 */
public class _151_UniqueNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {

            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums) {

        String str = Arrays.toString(nums); //converting the given number into String datatype
        // Int datatype is converting to String , String helps to extract the character by charAt() and check each character is matching with the rest.

        String unique = "";
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (str.charAt(i) == str.charAt(j)) { //if any digits are repeated, then it is not a UniqueNumber
                    count++;
                }
            }
                if (count == 1) {
                    unique += str.charAt(i);
                }
        }
        System.out.println(unique);

    }
    }

