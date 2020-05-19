package Repl_its;

import java.util.Scanner;

public class _104_Arrays_has_55_loop_array {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int [] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        boolean result = false;
        for (int i = 0; i < nums.length -1; i ++ ) {
            if (nums[i] == 5  && nums [i+1] == 5 ) {
               result = true;
                break;
            }

        }
        System.out.println(result);

    }


}
