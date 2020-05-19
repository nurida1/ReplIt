package Repl_its;
/*
Write a  for loop that prints the odd integers 11 through 121 inclusive, separated by spaces.
 */
public class _AssessmentTest_2_1_PrintOddNumbers {
    public static void main(String[] args) {

        for (int i = 11; i <= 121; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }


}
