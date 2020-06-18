package Repl_its;

public class _AsessmentTest_3_3Reverse_anArray {
    /*
    Write the definition of a method reverse, whose parameter is an array of Strings.
    The method reverses the elements of the array.
    The method returns an array of strings in the reversed order.
Example:
input: ["apple", "pear"]
output: ["pear", "apple"]
     */

    public static void main(String[] args) {

    }

    public static String [] reverse (String [] arr) {

        //creation of new string array:
     String [] reversed = new String[arr.length]; //new Arrays{str, str}

        //j = count
        int j = arr.length; //[2]

     for (int i = 0; i < arr.length; i++ ) {
            reversed[i] = arr[j]; //arr[1, 2]
            j--;
     }

       return reversed;

    }
}
