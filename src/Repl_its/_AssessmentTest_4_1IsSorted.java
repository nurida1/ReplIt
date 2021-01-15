package Repl_its;

import java.util.Arrays;

public class _AssessmentTest_4_1IsSorted {
    /*
    this is a sorted collection (in this case array):

7,8,9,10

this is an unsorted collection:

5,4,9,8,7,3

sorted in this case means smallest number to biggest.
isSort gets an array and returns true if its sorted.

for example:
isSort([2,3,5,4,9]);
returns: false

isSort([1,2,3]);
returns: true

isSort([7,8,9]);
returns: true.

     */

    public static boolean isSort(int [] nums) { //[1,4,5,6,2]

        int [] sort = new int [nums.length];  //new array

        for (int i =0; i< nums.length; i++) {
            sort[i] +=nums[i];                //put numbers into new array
        }

        Arrays.sort(sort);

        for (int j = 0; j<nums.length; j++) {

            if (sort[j] == nums[j] ) {
                return true;
            }
        }

        return false;
    }









}
