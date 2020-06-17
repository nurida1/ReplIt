package Repl_its;

public class _189_Methods_with_String_13_find_error_string {
/*
isError method checks if the line of string it gets has the word error at the start of it.

it gets a string and returns a boolean.
true if it found the word 'error' an the start of the line string

example use:

isError("foo bar")
returns : false

isError("error foo bar")
returns : true

isError("error one two")
returns : true

isError("three four error")
returns : false

hint: check the string methods in the java doc. one of them is helpful for this.

https://docs.oracle.com/javase/7/docs/api/java/lang/String.html

 */

    public static boolean isError(String line) {

        for (int i = 0; i < line.length(); i++) {
            if (line.startsWith("error")) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        isError("error hu ja");
    }
}
