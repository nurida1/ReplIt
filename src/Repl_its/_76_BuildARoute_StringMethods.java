package Repl_its;

import java.util.Scanner;

/*
Write a program that will print out route instructions. Your program should take 2 parameters: start point and end point. Use left, right, up and down for navigation. Insert ">" between commands. If start point equals to end point - display: "start/end(start or end variable!) found".
Note: you may move only clock wise.

Example:
Input: A
Input: D
Output: right > down > left: D found

Input: C
Input: C
Output: C found
 */
public class _76_BuildARoute_StringMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        String result = "";
        if (start.equals("A")) {
            if (end.equals("B")) {
                result = "right: " + end + " found";
            } else if (end.equals("C")) {
                result = "right > down: " + end + " found";
            } else if (end.equals("D")) {
                result = "right > down > left: " + end + " found";
            } else {
                result += start + " found";
            }
        } else if (start.equals("B")) {
            if (end.equals("C")) {
                result = "down: " + end + " found";
            } else if (end.equals("D")) {
                result = "down > left: " + end + " found";
            } else if (end.equals("A")) {
                result = "down > left > up: " + end + " found";
            } else {
                result += start + " found";
            }
        } else if (start.equals("C")) {
            if (end.equals("D")) {
                result = "left: " + end + " found";
            } else if (end.equals("A")) {
                result = "left > up: " + end + " found";
            } else if (end.equals("B")) {
                result = "left > up > right: " + end + " found";
            } else {
                result += start + " found";
            }
        } else if (start.equals("D")) {
            if (end.equals("A")) {
                result = "up: " + end + " found";
            } else if (end.equals("B")) {
                result = "up > right: " + end + " found";
            } else if (end.equals("C")) {
                result = "up > right > down: " + end + " found";
            } else {
                result += start + " found";
            }
        }
        System.out.println(result);
    }
}