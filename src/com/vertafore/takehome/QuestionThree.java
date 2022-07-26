package com.vertafore.takehome;
import java.util.*;
public class QuestionThree {



    /*

        This function takes a list of strings and applies the abbreviate function
        written in questionTwo to each word in the string.
        It then returns true/false depending on if the abbreviations in the list
        are unique.

        Params: List<String>

     */
    public static void isUnique(List<String> inpList){

        System.out.println("Abbreviating words and checking for uniques\n");

        List<String> abbrevList = new ArrayList<>();
        List<Integer> index = new ArrayList<>();

        //create an array the same size as the input list, which holds the boolean
        // values and is updated if unique or not
        Boolean[] unique = new Boolean[inpList.size()];
        Arrays.fill(unique, Boolean.TRUE);

        for(String word : inpList){
            //run abbreviation function on each word in the list
            String abbrev = QuestionTwo.abbreviate(word);
            abbrevList.add(abbrev);
        }

        //loop through the list using two pointers to get indexes of the duplicate abbreviations
        //runtime is severe, could be improved
        //saves indexes of any duplicates in a sep. list.
        for(int i = 0; i < abbrevList.size(); i++){
            for(int j = 1; j < abbrevList.size(); j++){
                if(abbrevList.get(i).equals(abbrevList.get(j)) && i != j){
                    if(!index.contains(i) && !index.contains(j)){
                        index.add(i);
                        index.add(j);
                    }
                }
            }
        }

        //uses the list of indexes to mark corresponding word false
        for(int num : index){
            unique[num] = false;
        }

        for(int i = 0; i < inpList.size(); i++){
            System.out.println(inpList.get(i) + " " + abbrevList.get(i) + " " + " -> " + unique[i]);
        }

    }

    public static void main(String[] args){

        ArrayList<String> testInput = new ArrayList<>(Arrays.asList("internalization", "localization", "accessibility", "automatically"));
        ArrayList<String> sameInput = new ArrayList<>(Arrays.asList("hello", "hello", "hello", "hello"));
        ArrayList<String> diffInput = new ArrayList<>(Arrays.asList("hello", "testing", "one", "two"));

        isUnique(testInput);
        isUnique(sameInput);
        isUnique(diffInput);
    }
}
