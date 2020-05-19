package Repl_its;

import java.util.Scanner;

public class _109_Arrays_printing01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String [] arr = new String[5];

        for (int i = 0; i < 5; i++ ) {
            arr[i] = input.nextLine();
        }

        String res= "";
        for (int j =0; j < arr.length; j++) {

            res =  arr[j].substring(0,3);
            System.out.println(res);
        }





    }


}
