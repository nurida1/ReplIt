package Repl_its;

import java.util.Scanner;

/*
Given an array nums, calculate count of even numbers in nums and print out to console.

nums → [2, 1, 2, 3, 4]) → 3
nums → [2, 2, 0, 3, 5]) → 3
nums → [1, 3, 5, 7, 9]) → 0

 */
public class _107_Arrays_countEven_Loop_Array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int [] nums ={input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int countEven =0;

        for (int each : nums) {
            if (each % 2 ==0) {
                countEven++;
            }
        }
        System.out.println(countEven);



    }




}
