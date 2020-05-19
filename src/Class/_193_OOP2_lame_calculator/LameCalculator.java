package Class._193_OOP2_lame_calculator;
/*
The LameCalculator class has instance methods that can do simple math operations on two numbers.

the methods are: plus, minus, multiply and divide .

all the methods get two ints then the method does the required math operation and returns the result as an int.

for example:

LameCalculator lc = new LameCalculator();

lc.plus(1,1)
returns:2

lc.minus(1,1)
returns:0

lc.multiply(2,1)
returns:2

lc.divide(10,2)
returns:5
 */
public class LameCalculator {

    public int plus (int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public int minus (int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    public int multiply (int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    public int divide (int num1, int num2) {
        int result = num1/num2;
        return result;
    }
}
