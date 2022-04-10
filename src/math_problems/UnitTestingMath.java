package math_problems;
public class UnitTestingMath {
    /**
     * Use this class to unit test all of the class within this package
     */
    public static void main(String[] args) {
        int a = Factorial.fact_Recursion(5);
        System.out.println("Factorial Using Recussion Test pass");
        System.out.println("---------------------------");
        int b = Factorial.fact_Iterartion(5);
        if (b == 120)
            System.out.println("Factorial Using Iterartion Test pass");
        System.out.println("---------------------------");
        int c=Fibonacci.fibonacci_Series(5);
        System.out.println("Fibonacci Series test pass ");
        System.out.println("----------------------------");
        int d=LowestNumber.lowest_Number(new int []{1,5,6,4,3,76,4,3,1});
        System.out.println("Lowest Number Testing Pass "+d);
        System.out.println("----------------------------");
        FindMissingNumber findnumber= new FindMissingNumber();
        findnumber.missingNumber();
        System.out.println("----------------------------");
        Pattern.pattern(100);
        System.out.println("----------------------------");
        PrimeNumber.prim_Number();



    }

}
