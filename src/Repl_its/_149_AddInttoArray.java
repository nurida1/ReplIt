package Repl_its;
/*
add_to_r is a method that gets an array and a number.

the method creates a new array bigger by one then (int[] r).
It populates the new array with the old ones(r) values.
and finally in the last position adds the number (int n) to it.

for example:
method input: add_to_r(new int{1,5,77,8}  ,2)

outputs (int array):
[1, 5, 77, 8, 2]
 */
import java.util.Scanner;

public class _149_AddInttoArray {

    public static void add_to_r(int[] r, int n) {

        int[] newArr = new int[r.length + 1]; //a new array bigger by one then (int[] r).
        for (int i = 0; i < r.length; i++) {
            newArr[i] = r[i];
        }
        n= newArr[newArr.length];


    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(), n = inp.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size - 1; i++) {

            arr[i] = inp.nextInt();
        }

        add_to_r(arr, n);

    }
}

