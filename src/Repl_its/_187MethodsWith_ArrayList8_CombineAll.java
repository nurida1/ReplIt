package Repl_its;

import java.util.ArrayList;

public class _187MethodsWith_ArrayList8_CombineAll {
 /*
 Create a static method that:
is called combineAL
returns an ArrayList
takes two parameters: an ArrayList of Strings called wordList1, and an ArrayList of Strings called wordList2

This method should create a new ArrayList of Strings, add all the words (in order) from wordList1, then add all the words (in order) from wordList2.  In other words, it is combining all the elements from the two parameters.
  */

public static ArrayList<String> combineAL(ArrayList<String > wordList1, ArrayList<String > wordList2) {

    ArrayList<String> list = new ArrayList<>();
/*1st method:
    for (String each : wordList1) {
        list.add(each);
    }
    for (String each : wordList2) {
        list.add(each);
    }
 */

    list.addAll(wordList1);
    list.addAll(wordList2);

    return list;

}
}
