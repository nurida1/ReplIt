package Repl_its;
import java.util.Scanner;

public class _151_ByNaci {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }
    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE
        for (int each2 : nums) { // 3: A,
            int count = 0;
            for (int each : nums) {
                if (each == (each2)) {
                    count++;
                }
            }
            if (count == 1) {  // if the character is unique
                System.out.println(each2);
            }
        }
    }
}


