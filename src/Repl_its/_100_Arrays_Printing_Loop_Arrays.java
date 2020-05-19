package Repl_its;
/*
The code provided in your main method will take in five Strings and save them into an array called arr.  Print out the first three letter of each element of arr, one per line.  You can assume that every element of arr is at least 3 letters long.

Example:
arr -> ["apple", "banana"]
 prints: app
         ban
 */
import java.util.Scanner;

public class _100_Arrays_Printing_Loop_Arrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String [] arr = new String [5];
        for (int i =0; i < 5; i++) { //words: 0, 1, 2, 3, 4

            arr[i] = input.nextLine();

            }
        for (String each : arr) {               // words
            String str = each.substring(0, 2 +1);
            System.out.println(str);

        }




    }

}
