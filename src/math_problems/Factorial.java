package math_problems;

public class Factorial {

    /**
     * INSTRUCTIONS
     * Write a method to return the Factorial of any given number using Recursion, as well as iteration.
     * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.
     * <p>
     * HINT: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static int fact_Recursion(int number) {
        if (number == 1)
            return 1;
        else {
            return (number * fact_Recursion(number - 1));
        }

    }

    public static int fact_Iterartion(int number) {
        int factorial = 1;
        for (int i = number; i > 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }


    public static void main(String[] args) {
        System.out.println("Factorial using Recursion " + Factorial.fact_Recursion(5));
        System.out.println("----------------------------------------");
        System.out.println("Factorial using Iterartion " + Factorial.fact_Iterartion(5));

    }

}
