package math_problems;

public class Fibonacci {

    /** INSTRUCTIONS
     * Write a method that will print or return at least 40 Fibonacci numbers
     *
     * e.g. - 0,1,1,2,3,5,8,13
     **/

    public static int fibonacci_Series(int number){
        int first_Number=0;
        int second_Number=1;
        System.out.print(first_Number+" "+second_Number+" ");
        int sum =first_Number+second_Number;
        while(number>1){
            sum=first_Number+second_Number;
            System.out.print(sum+" ");
            first_Number=second_Number;
            second_Number=sum;
            number--;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci.fibonacci_Series(40));
    }

}
