package Repl_its;

import java.util.Arrays;
import java.util.Scanner;

public class _149_ByRahman {


        public static void add_to_r(int[] r,int n) {

        int[] newArr = new int[r.length + 1]; //a new array bigger by one then (int[] r).

        for (int i = 0; i < r.length; i++) {
            newArr[i] = r[i];
            for (int j = 0; j < newArr.length; j++) {
                newArr[r.length] = n;
            }
        }
            System.out.println(Arrays.toString(newArr));

    }
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(),n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        add_to_r(arr, n);


    }
}




