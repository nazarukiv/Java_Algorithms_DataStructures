package Basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings(allowed, words));
    }


    public static int countConsistentStrings(String allowed, String[] words) {
        Set<Character> s = new HashSet<>();
        int count =0;

        for (int x=0; x<words.length;x++){
            for (int j=0;j<words[x].length();j++){
                s.add(words[x].charAt(j));
            }
        }
        System.out.println(s.toString());
        return 1;

    }

}
