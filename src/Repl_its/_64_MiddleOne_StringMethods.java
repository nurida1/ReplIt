package Repl_its;

import java.util.Scanner;

/*
You have a word, do the following:

1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
             - Single character, print that character 3 times
      # ==> ###
      q ==> qqq

2. When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi

 */
public class _64_MiddleOne_StringMethods {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();


        if (word.length() % 2 != 0) {
            if (word.length() >= 3) {
                System.out.println(word.charAt(word.length() / 2));
            } else {
                System.out.println(""+ word.charAt(0)+word.charAt(0)+word.charAt(0));
            }
        } else {
            if (word.length() >= 4) {
                System.out.println(""+ word.charAt(word.length() / 2 - 1) + word.charAt(word.length() / 2));

            } else {
                System.out.println(word.concat(word));
            }
        }

    }
}

