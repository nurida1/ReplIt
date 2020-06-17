package Repl_its;

import java.util.Arrays;

public class _176_MethodsOverloading_1 {
    /*
    In this task, you need to write 2 methods findMax()
    that will find a maximum number in the array.

    First method should work with array of integers (int[]) and return int, and second method should work with an array of doubles (double[]) and return double as a result.

Methods must have the same name and different parameters.
Fo more information:  https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html

Comment: Methods should be non static and with a return type.

     */
/* 1:
    public int findMax(int[] num) {
//int max = num[0];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        return max;

    }

    public double findMax(double[] num) {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        return max;

    }
}

 */

//2:

public int findMax(int[]arr) {
    Arrays.sort(arr);
    int max = arr[arr.length-1];
    return max;
}

public double findMax(double[]arr) {
    Arrays.sort(arr);
    double max = arr.length-1;
    return max;
}
}
