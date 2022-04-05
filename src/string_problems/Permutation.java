package string_problems;

public class Permutation {
/*
    Create a Java program to compute all permutations of any given string

        e.g. -  "ABC" = "ABC" "ACB" "BAC" "BCA" "CAB" "CBA"
     */

    // Implement Here
    public static void main(String[] args) {
permutation("ABC");
    }
    public static void permutation(String input){
        permutation("",input);
    }

    private static void permutation(String permu, String word){
        if(word.isEmpty()){
            System.out.println(permu+word);
        }
        else{
            for (int i=0; i<word.length(); i++){
                permutation(permu+word.charAt(i),word.substring(0,i)+word.substring(i+1,word.length()));
            }
        }
    }


}
