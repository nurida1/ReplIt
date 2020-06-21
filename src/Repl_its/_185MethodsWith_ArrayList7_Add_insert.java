package Repl_its;

import java.util.ArrayList;

public class _185MethodsWith_ArrayList7_Add_insert {
    /*
    The last ArrayList method we are going to learn is... .add() again!

Except for this time, instead of .add() taking one parameter (the thing we want to add), this time, we will be giving it two parameters.  The two parameters are:
.add(i,element)
// i ==> the index you want to insert at
// element ==> the element you want to insert at index i

For example, if you had an ArrayList called nums with the values (4,2,5,6), and you run the following:
nums.add(1,100);
The result will be (4,100,2,5,6)

On the left, given an ArrayList of Strings called words, insert "hey" in the first index and then insert "yo" in the 3rd index.
     */

    public static void test (ArrayList<String > words) { //"wo"//how//is //everyone
        words.add(1,"hey");
        words.add(3,"yo");

        //0  1  2  3
        //hey//wo//how //is //everyone
        //hey//wo//how//is//yo

    }
}
