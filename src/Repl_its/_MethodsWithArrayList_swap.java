package Repl_its;

import java.util.ArrayList;

public class _MethodsWithArrayList_swap {
  /*
  In this assignment you will swap a position in an array list with another.

swap gets 3 arguments, an arraylist, a position, and another position to swap with.

for example:

swap(["one","two","three"],0,2)
returns:["three","two","one"]


swap(["a","c","b","d","e"],0,3)
returns:["d","c","b","a","e"]
   */

public static ArrayList<String> swap (ArrayList<String> list, int pos1, int pos2) {

    String first = list.get(pos1);
    String second = list.get(pos2);

    list.set(pos1, second);
    list.set(pos2,first);

    return list;
}

    public static void main(String[] args) {

    }



}
