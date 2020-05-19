package Repl_its;

import java.util.Scanner;

/*
Write your code inside the method. Use the values given as method parameters.
Assign final values. Then user should select service quality that will correspond to tip percent.
Poor = 5%   Fair = 10%
Good = 15%  Great = 20%
Excellent = 25%
The program should display the following information based on the user input:
Split or No split
Number of people entered: &&&&
Service Quality:
Total to pay:
Total tip:
Total per person:
Tip per person:
https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8

Input:
Split:Yes
Number of people:4
Check amount:476.0
Service Quality:Excellent

Output:
Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
 */
public class _51TipCalculator_StringM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Split:");
        String split = scan.next();

        System.out.println("Number of people:");
        int num = scan.nextInt();

        System.out.println("Check amount:");
        double check = scan.nextDouble();

        System.out.println("Service Quality:");
        String qa = scan.next();

        String people = (num ==1)? "&": (num==2)? "&&" : (num ==3)? "&&&" : (num ==4)? "&&&&" : "&&&&&";
        System.out.println("Number of people entered: " + people);

        double tip = 0;
        if (qa.equalsIgnoreCase("poor")) {
            tip = check * 0.5;
        } else if (qa.equalsIgnoreCase("fair")) {
            tip = check * 0.10;
        } else if (qa.equalsIgnoreCase("good")) {
            tip = check * 0.15;
        } else if (qa.equalsIgnoreCase("great")) {
            tip = check * 0.20;
        }else {
            tip = check * 0.25;
        }

            System.out.println("Total to pay: " + (check+tip));
            System.out.println("Total tip: " + tip);
            System.out.println("Total per person: " + (check+tip)/num);
            System.out.println("Tip per person: " + tip/num);
        }
    }



