package math_problems;

public class FindLowestDifference {


    /**
     * INSTRUCTIONS
     * Write a method to return the lowest number, that is not shared between the 2 arrays
     * HINT: The lowest number that isn't shared between these arrays is 1
     */

    public static void main(String[] args) {

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1, -15};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19, -15};
        int  array3Size=array1.length+array2.length;
        int [] array3= new int[array3Size];
        for (int i = 0; i <array1.length; i++) {
            array3[i]=array1[i];
            }
        for (int i=0; i<array2.length; i++){
            array3[(array1.length)+1]=array2[i];
        }
        for (int i=0; i<array3.length; i++){
            System.out.print(array3[i]);
        }
        }

}
