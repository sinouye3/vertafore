package com.vertafore.takehome;
import java.util.*;

public class QuestionTwo {
    /*

        This function takes a string (of at least 2 char len) and shortens it
        in the following style: (first letter) + (# of removed letters) + (last letter)
        it then returns the abbreviated string

        If string length < 2, an IllegalArgumentException will be raised
        If string contains numbers an IllegalArgumentException will also be raised

        Params: String (len > 2)
        output: String
     */
    public static String abbreviate(String inp){

        StringBuilder output = new StringBuilder();
        if(inp == null){
            throw new IllegalArgumentException("string cannot be null");
        }
        if(!inp.chars().allMatch(Character::isLetter)){
            throw new IllegalArgumentException("String can only contain letters");
        }
        if(inp.length() < 2){
            throw new IllegalArgumentException("string must be at least 2 characters in length");
        }

        else if(inp.length() == 2){
            output.append(inp.charAt(0)).append(0).append(inp.charAt(1));
        }else{
            int removedCount = inp.length() - 2;
            output.append(inp.charAt(0)).append(removedCount).append(inp.charAt(inp.length()-1));
        }
        return output.toString();
    }

    public static void main(String[] args){


        String internationalization = "h9llo";
        String localization = "localization";
        String nullTest = null;

        //test cases
        System.out.println(internationalization + " -> " + abbreviate(internationalization));
        System.out.println(localization + " -> " + abbreviate(localization));

        //null test case
        //System.out.println(nullTest + " -> " + abbreviate(nullTest));

    }
}
