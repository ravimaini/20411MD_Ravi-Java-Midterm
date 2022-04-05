package string_problems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {


    /*
    Write a Java Program, `isAnagram`, to check if any two strings are anagrams

    An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
    original letters exactly once.

        Ex: "CAT" & "ACT",
            "ARMY" & "MARY",
            "FART" & "RAFT"
    */

    //Implement Here
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("This program made to check if user entered anagrams Strings or not");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Enter the first String");
        String first= input.next();
        System.out.println("Enter the second String");
        String second=input.next();
        if(first.length()!=second.length()){
            System.out.println("Not Anagram");
        }
        else{
            char[] char1=first.toCharArray();
            char[] char2=second.toCharArray();
            Arrays.sort(char1);
            Arrays.sort(char2);
            if(Arrays.equals(char1,char2)){
                System.out.println("Strings are anagram");
            }
            else{
                System.out.println("Strings are not anagram");
            }

        }

    }

}
