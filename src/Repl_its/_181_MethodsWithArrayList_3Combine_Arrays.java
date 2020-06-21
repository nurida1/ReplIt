package Repl_its;

import java.util.ArrayList;

public class _181_MethodsWithArrayList_3Combine_Arrays {
/*
combine two String arrays into one arraylist and return it as a string.

for example:

combineRs(["f","o","o"],[" b","a","r"])
returns "foo bar"


combineRs(["1","2","3"],[" 4"])
returns "1234"
 */

    public static String combineRs(String [] r1, String [] r2) {

        ArrayList<String> list = new ArrayList<>();

        for (String each: r1) {
            list.add(each);
        }

        for (String each : r2) {
            list.add(each);
        }

        String result = "";
        for (String eachList: list) {
            result += eachList;
        }
        return result;
    }

}
