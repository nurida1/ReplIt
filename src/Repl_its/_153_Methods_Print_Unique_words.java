package Repl_its;

import java.util.Scanner;

public class _153_Methods_Print_Unique_words {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String [] words) {
//
//        for ( int k =0; k < words.length; k++) {
//            int count = 0;
//            for (int j = 0; j < words.length; j++) {
//                if (words[j].equals(words[k])) {
//                    count++;
//                }
//            }
//            if (count ==1) {
//                System.out.println(words[k]);
//            }

        for ( String each : words) {
            int count =0;
            for (String each2 : words) {
                if (each2.equals(each)) {
                    count++;
                }
            }
                if (count ==1) {
                    System.out.println(each);
                }
            }



        }
    }


