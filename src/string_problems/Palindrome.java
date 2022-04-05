package string_problems;

import java.util.Scanner;

public class Palindrome {

     public static void palindrome_Check(String userInput){
        Scanner input= new Scanner(System.in);
        System.out.println("This program check the string you will enter is palindrome or not");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Enter the any world ");
        userInput=input.next();
        String duplicate="";
        for (int i= userInput.length()-1; i>=0; i--){
            duplicate=duplicate+userInput.charAt(i);
        }
        System.out.println("String you entered = "+userInput);
        if(userInput.equals(duplicate)){
            System.out.println("String is Palindrome ");
        }

        else{
            System.out.println("String is not Palindrome");
        }


    }

    /*
      A palindrome is a word that can be reversed, and still remain the same.
      Example: MOM, DAD, MADAM, RACECAR

      Create a method to check if any given String is a palindrome or not.
     */

    // Implement here
    public static void main(String[] args) {
        Palindrome.palindrome_Check("Mom");

    }

}
