package Repl_its;

public class _168MethodsWithString_3_CoverMe {
    /*
    coverString method will take 2 string parameters from the caller.

Your job is to write an important code that will :

- to search and find each appearance of coverME within main
- then surround it with [coverMe] (square brackets)
- if you cannot find the coverME within main after tirelessly looping then just return whole main itself covered [main].
- keep in mind that coverME value can be of any length.

Examples:
coverString("java methods", "me") ) ; ==> "java [me]thods"

coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"

coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"

coverString("apples", "pears") ) ; ==> "[apples]"
     */

    public static void main(String[] args) {

        System.out.println(coverString("java methods", "me")); //java [me]thods
    }

    /*
    public static String coverString (String main, String coverMe) {
        String result ="";

        if (!main.contains(coverMe)) {
            result = "["+main+"]";
        }else {
            result = main.replace(coverMe , "[" + coverMe + "]");
        }

        return result;
    }

     */

public static String coverString (String main, String coverMe) {

    String result = "";
//Not correct
    for (int i =0; i< main.length(); i+=coverMe.length()) {
            result = main.charAt(i) +"[" + coverMe + "]";

        }


    return result;

}



}
