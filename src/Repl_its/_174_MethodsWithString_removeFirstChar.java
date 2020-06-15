package Repl_its;

public class _174_MethodsWithString_removeFirstChar {
/*
The method gets a string and returns a string minus the first letter.

for example:

removeFirst("aaa")
returns "aa"
 */

public static String removeFirst(String target) {

    //1:
    //return target.substring(1);

    //2:
    return target.replaceFirst(target.substring(0,1),"");


}


}
