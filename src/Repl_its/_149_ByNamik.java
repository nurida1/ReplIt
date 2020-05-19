package Repl_its;

import java.util.Arrays;
import java.util.Scanner;

public class _149_ByNamik {

    public static void add_to_r(int[] r,int n) {
        int a[] = new int[1];
        a[0] = n;
        int[] newr = new int[r.length + a.length];
        for (int i = 0; i <= r.length - 1; i++) {
            newr[i] = r[i];
        }
        for (int i = 0; i <= a.length - 1; i++) {
            newr[r.length + i] = a[i];
        }
        System.out.println(Arrays.toString(newr));
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