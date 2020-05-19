package Repl_its;

import java.util.Scanner;

/*
Write a program that will print out information about the user based on email. Print first and last name from the email with the upper case. (Assume that first and last names were separated by an underscore)

Example:
Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com
 */
public class _73_Email2_StringMethods {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        if (email.contains("_")) {
            String firstName = email.substring(0, 1).toUpperCase() + email.substring(1,email.indexOf("_"));
            String lastName = email.substring(email.indexOf("_")+1,email.indexOf("_")+2).toUpperCase() +email.substring(email.indexOf("_")+2,email.indexOf("@"));
            String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
            String topLevelDomain = email.substring(email.indexOf(".")+1);

            System.out.println("First name: "+firstName);
            System.out.println("Last name: " + lastName);
            System.out.println("Domain: "+domain);
            System.out.println("Top-Level Domain: " + topLevelDomain);

        }else {
            System.out.println(email);
        }
    }

}
