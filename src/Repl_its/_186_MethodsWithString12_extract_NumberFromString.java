package Repl_its;

public class _186_MethodsWithString12_extract_NumberFromString {
    /*
    extractNum

description:
a method that cleans any non number string from a string it gets
and returns the clean string
input:
-s (string)- a string the method gets
return: string: a string of numbers only

example use:

extractNum("aa2aa3") ==> 23
extractNum("aa2") ==> 2
extractNum("aa10aa") ==> 10
extractNum("aa!!%$#.10aa") ==> 10


hint:
you can use:
 Character.isDigit(ch)
 or conditions

     */

    public static String extractNum(String s) {

        //1:
        String numStr = "";
        for (char currentChar : s.toCharArray()) {
            if (Character.isDigit(currentChar)) {
                numStr += currentChar;
            }
        }
        return numStr;
    }

    public static void main(String[] args) {
        System.out.println(extractNum("Hello1"));
    }
}
            //2:
//            String numStr = "";
//            for (char currentChar : s.toCharArray()) {
//        if (currentChar >= '0' && currentChar <= '9') {
//                numStr += currentChar;


    /*
    String numStr = "";
    for (int i = 0; i < s.length(); i++) {
        char currentChar = s.charAt(i);
        if (Character.isDigit(currentChar)) ;
        numStr += currentChar;
    }
    return numStr;
}
     */


