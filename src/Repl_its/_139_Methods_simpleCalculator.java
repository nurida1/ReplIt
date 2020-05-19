package Repl_its;

import java.util.Scanner;

public class _139_Methods_simpleCalculator {


    public static void main(String[] args) {

        plus();


    }

    public static void plus() {

        Scanner input = new Scanner(System.in);

        System.out.println("enter first number:");
        int num1 = input.nextInt();

        System.out.println("enter second number:");
        int num2 = input.nextInt();

        int result = num1+num2;

        System.out.println("result: " +result);



    }


}
