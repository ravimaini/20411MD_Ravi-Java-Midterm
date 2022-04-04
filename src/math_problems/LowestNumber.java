package math_problems;

public class LowestNumber {
    /**
     * INSTRUCTIONS
     * Write a method to find the lowest number from this array.
     * nb
     * @return
     */
    public static int lowest_Number(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 1) {
                temp = (array[0] < array[1]) ? array[0] : array[1];
            } else if (i > 1) {
                temp = (temp < array[i]) ? temp : array[i];
            }
        }

        System.out.println(temp);
        return temp;
    }

    public static void main(String[] args) {
        int[] array_in= new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123,
                67, 5, 679, 54, 32, 65};
        LowestNumber.lowest_Number(array_in);
    }
}


