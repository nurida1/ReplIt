package Repl_its;
/*
        String word1 = scan.next();
ex:
adobe
ae
 */
import java.util.Scanner;

public class _62_PrintFirstAndLastLetters {
    public static void main(String[] args) {

        Scanner scan =new Scanner (System.in);
        String word = scan.next();

        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(word.length()-1);

        System.out.println(firstLetter + "" + lastLetter);

    }
}
