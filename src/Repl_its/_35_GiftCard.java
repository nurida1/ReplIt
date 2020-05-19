package Repl_its;

import java.util.Scanner;

/*
Let's say I've got a 100$ gift card and you want to buy something in your online store . Write a program that will help me to buy something and display leftover balance after purchase. If item is not in the list, display message: "Invalid item!". If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
Hint
Use if/ else if / else
CODE EXAMPLE:
Example #1
input: Hat
output: Thank you for your purchase!
output: Your current balance is: 75$

Example #2
input: Pants
output: Thank you for your purchase!
output: Your current balance is: 50$

Example #3
input: Laptop
output: Sorry, not enough funds on your gift card!

Example #4
input: Cupcake
output: Invalid item!
List of items



 */
public class _35_GiftCard {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();


        if (item.equalsIgnoreCase("smartphone") || item.equalsIgnoreCase("Laptop")) {
            System.out.println("Sorry, not enough funds on your gift card!");

        }else if (item.equalsIgnoreCase("charger")) {
            System.out.println("Thank you for your purchase! \nYour current balance is: " + (100-15) + "$");
        }else if (item.equalsIgnoreCase("usb cable")){
            System.out.println("Thank you for your purchase! \nYour current balance is: " + (100-10) + "$");
        }else if (item.equalsIgnoreCase("headphones")){
            System.out.println("Thank you for your purchase! \nYour current balance is: " + (100-30) + "$");
        }else if (item.equalsIgnoreCase("pants")) {
            System.out.println("Thank you for your purchase! \nYour current balance is" + (100 - 50) + "$");
        }else if (item.equalsIgnoreCase("hat")) {
            System.out.println("Thank you for your purchase! \nYour current balance is" + (100 - 25) + "$");
        }else if (item.equalsIgnoreCase("socks")) {
            System.out.println("Thank you for your purchase! \nYour current balance is" + (100 - 5) + "$");
        }else if (item.equalsIgnoreCase("blanket")) {
            System.out.println("Thank you for your purchase! \nYour current balance is" + (100-60) +"$");
        }else if (item.equalsIgnoreCase("pillow")) {
            System.out.println("Thank you for your purchase! \nYour current balance is" + (100 - 40) + "$");
        }else {
            System.out.println("Invalid item!");

        }

    }

}
