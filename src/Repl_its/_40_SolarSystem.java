package Repl_its;
/*
in the given program you have a quiz question and a scanner to catch user input which will be stored on string a.

after the user inputs an answer (a, b or c) we need to check if its the correct, wrong, valid answer.
 */
import java.util.Scanner;

public class _40_SolarSystem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("what is the farthest planet in the solar system:");
        System.out.println("a)venus");
        System.out.println("b)pluto");
        System.out.println("c)neptune");
        String answer = s.nextLine();

        if (answer.equals("a")) {
            System.out.println("a is wrong");
        } else if (answer.equals("b")) {
            System.out.println("b is correct");
        } else if (answer.equals("c")) {
            System.out.println("c is wrong");
        } else if (answer.equals("z")) {
            System.out.println("z is not a valid answer");
        } else {
            System.out.println(answer + " is not a valid answer");


        }
    }
}