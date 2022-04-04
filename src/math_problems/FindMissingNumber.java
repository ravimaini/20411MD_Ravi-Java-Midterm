package math_problems;

public class FindMissingNumber {

    /** INSTRUCTIONS
     * Write a method to find the missing number from the array.
     */
    int[] array = new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6};
    int numberOfElements= array.length+1;
    int sum=(numberOfElements*(numberOfElements+1)/2);
    int missingNumber=0;
    public void missingNumber(){
        for (int i=0; i<array.length; i++){
        missingNumber=missingNumber+array[i];
        }
        System.out.println("Missing number is :"+ (sum-missingNumber));
    }
    public static void main(String[] args) {
        FindMissingNumber a= new FindMissingNumber();
        a.missingNumber();

    }
}
