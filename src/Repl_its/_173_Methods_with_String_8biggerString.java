package Repl_its;

public class _173_Methods_with_String_8biggerString {
    /*
    the method gets two strings and return the longest one
    biggerS("apple","orange") ==> "orange"
     */

    public static String biggerS(String a, String b) {

        //1:
//        String result ="";
//        if (a.length() > b.length()) {
//            result+= a;
//        }else {
//            result+=b;
//        }
//        return result;
//
        //2:
//        if (a.length()>b.length()){
//            return a;
//        }else {
//            return b;
//        }

        //3: ternary
        return (a.length()>b.length())? a : b;

    }
}
