package Repl_its;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsWithArrayList_2Times {
    /*
    Create a method that:

is called twoTimes
returns a new ArrayList of Integers
takes in a single parameter - an ArrayList of Integers

This method should create a new ArrayList of Integers that contains every value of the ArrayList parameter repeated twice.

For example, if the parameter is
(1,5,3,7)
The method should return a new ArrayList of Integers with
(1,1,5,5,3,3,7,7)
     */

    public static void main(String[] args) {

    }

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> list) {
        //(1,5,3,7)
        //(1,1,5,5,3,3,7,7)
        ArrayList<Integer> listDuplicate = new ArrayList<>();
//            listDuplicate.add(list.get(0));
//            listDuplicate.add(list.get(0));
//
//            listDuplicate.add(list.get(1));
//            listDuplicate.add(list.get(1));
          /*
        for (int i = 0; i < list.size(); i ++ ) {
            listDuplicate.add(list.get(i));
            listDuplicate.add(list.get(i));
        }
        return listDuplicate;

   }
            */

        for (Integer oldEach : list) {
            listDuplicate.add(oldEach);
            listDuplicate.add(oldEach);
        }
        return listDuplicate;
    }
}
