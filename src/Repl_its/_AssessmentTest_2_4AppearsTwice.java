package Repl_its;

public class _AssessmentTest_2_4AppearsTwice {
/*
Write a a method appearsTwice() that returns true if value of variable target appears only twice in the string sentence,
otherwise return false.

Examples:
Main.appearsTwice("java", "java is fun!") - returns false, because java appears only once.
Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.")
 - returns true, because laptop appears twice.
 */
public static void main(String[] args) {
    System.out.println("Hello World");


}


public static boolean appearsTwice(String target, String sentence) {

    int count =0;

    for (int i =0; i< sentence.length(); i++) {
        if (sentence.contains(target)) {
           sentence = sentence.replaceFirst(""+target,"");
            count++;
        }
    }

    if (count==2) {
        return true;
    }

    return false;
}



}
