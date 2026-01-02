package Basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Strings {
    public static void main(String[] args) {
        // String basics tasks
        //task 1-Reverse a string
        String toReverse = "hello";
        String reversed = "";

        for (int x=toReverse.length()-1; x>=0;x--){
            reversed += toReverse.charAt(x);
        }
        System.out.println(reversed);

        //task 2-Count vowels
        String countVowels = "Hello World";
        ArrayList<Character> vowels = new ArrayList<>();
        int count =0;

        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        for (int x=0; x<countVowels.length();x++){
            if (vowels.contains(countVowels.toLowerCase().charAt(x))){
                count++;
            }
        }
        System.out.println(count);

        //task 3-Count words in sentence
        String countWords = "Java is very powerful";
        String[] splitted = countWords.split(" ");
        System.out.println(splitted.length);

        //task 4-Find longest word
        HashMap<String, Integer> wordsLength = new HashMap<>();
        for (int x=0; x<splitted.length;x++){
            wordsLength.put(splitted[x], splitted[x].length());
        }
        int maxLength = 0;

        for (int x=0;x<wordsLength.size();x++){
            if (wordsLength.get(splitted[x]) > maxLength){
                maxLength = wordsLength.get(splitted[x]);
            }
        }

        for (int x=0; x<wordsLength.size();x++){
            if(wordsLength.get(splitted[x])==maxLength){
                System.out.println(splitted[x]);
            }
        }

        //task 5 -  Check palindrome string
        String checkPalindrome = "level";
        String reversedPalindrome = "";
        for (int x=checkPalindrome.length()-1; x>=0; x--){
            reversedPalindrome += checkPalindrome.charAt(x);
        }
        if (checkPalindrome.equals(reversedPalindrome)){
            System.out.println("YES palindrome");
        } else {
            System.out.println("NO palindrome");
        }

        //task 6-Remove spaces
        String removeSpaces = "Java is very cool";
        String[] removeSpacesSplitted = removeSpaces.split(" ");
        String spacesRemoved = "";
        for (int x=0;x<removeSpacesSplitted.length;x++){
            spacesRemoved+= removeSpacesSplitted[x];
        }
        System.out.println(spacesRemoved);

        //task 7 - Count character frequency
        String s = "football";
        HashMap<Character, Integer> characterFrequency = new HashMap<>();
        for (int x=0; x<s.length();x++){
            if (characterFrequency.containsKey(s.charAt(x))){
                characterFrequency.put(s.charAt(x), characterFrequency.get(s.charAt(x)) + 1);
            } else {
                characterFrequency.put(s.charAt(x), 1);
            }
        }
        System.out.println(characterFrequency.toString());

        //task 8-Check if two strings are equal
        String a = new String("hello");
        String b = new String("hello");

        if (a==b){
            System.out.println("Equal with ==");
        } else {
            System.out.println("Not Equal with ==");
        }

        if (a.equals(b)){
            System.out.println("Equal with .equals()");
        } else {
            System.out.println("Not Equal with .equals()");
        }

        //task 9-Convert string ↔ char array
        String convertS = "java";
        ArrayList<Character> convertedS = new ArrayList<>();

        for (int x=0;x<convertS.length();x++){
            convertedS.add(convertS.charAt(x));
        }
        System.out.println(convertedS);

    }
}

