package math_problems;

public class Pattern {

    public static int pattern(int number) {
        for (int j = number; j >= 1; j-- ) {
            if((j>(number-10)) ){
            System.out.print(j+",");}

            if((j<=(number-10)) && (j>=(number-30))){

                System.out.print(j+",");
                j=j-1;
            }
            if((j<=(number-30)) && (j>=(number-60))){
                j=j-2;
                System.out.print(j+",");
            }
            if((j<=(number-60)) && (j>=(number-100))){

                System.out.print(j+",");
                j=j-3;
            }

        }

        return 1;
    }

    /** INSTRUCTIONS
     * Read the numbers below, identify the pattern, and then implement the logic from this pattern.
     * Once done, you should test to see if you get the same output as below:
     *
     * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32...
     *
     */
    public static void main(String[] args) {
    Pattern.pattern(100);
    }
}
