package Sessions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class session2 {
    public static void main(String[] args) {

        //task 1 reverse a string
        String sentenceToReverse = "I love to watch UFC";
        System.out.println(reverseString(sentenceToReverse));


        //task 2 find second largest number
        int[] nums111 = {1,2,44,55,6};
        System.out.println(findSecondLargestNumber(nums111));

        //task 3 find first non-repeating word
        String s1 = "java is java and java is fun";
        System.out.println(findFirstNonRepeatingWord(s1));

        //task 4
        int[] nums222 = {1,2,3,4,55,6,7,8,9,10,11,12, 3};
        System.out.println(longestConsecutiveSequence(nums222));

        //task 5 Check if array is sorted
        int[] numsToCheck222 = {1,4,7,8,10};
        int[] numsToCheck111 = {1,3,2,4};
        System.out.println(checkIfArraySorted(numsToCheck222));
        System.out.println(checkIfArraySorted(numsToCheck111));

        //task 6 lecture task sum of array
        System.out.println(sumOfArray(numsToCheck222));

        //task 7 Count occurrences of a value
        System.out.println(countOccurrencesOfValue(nums222, 2));

        //task 8 Find last occurrence
        System.out.println(findLastOccurrence(nums222, 3));

        //task 9 Check all elements equal
        int[] equalNums ={1,1,1};
        int[] notEqualNums ={1,2,3};
        System.out.println(checkAllElementsEqual(equalNums));
        System.out.println(checkAllElementsEqual(notEqualNums));

        //task 10 Count elements greater than average
        System.out.println(countElementsGreaterThanAverage(numsToCheck222));

    }

    public static String reverseString(String sentence){
        String res = "";
        for (int x = sentence.length()-1;x>=0;x--){
            res += sentence.charAt(x);
        }
        return res;
    }

    public static int findSecondLargestNumber(int[] numsToCheck){
        int max = numsToCheck[0];
        int secondMax = numsToCheck[0];
        for (int x=0;x<numsToCheck.length;x++){
            if (numsToCheck[x] > max){
                max = numsToCheck[x];
            }
        }

        for (int u=0;u<numsToCheck.length;u++){
            if (numsToCheck[u] < max && numsToCheck[u] > secondMax){
                secondMax = numsToCheck[u];
            }
        }
        return secondMax;
    }

    public static String findFirstNonRepeatingWord(String sentence){
        String[] listOfWords = sentence.split(" ");
        Map<String, Integer> countWords = new HashMap<>();
        String res = "";

        for (int x=0;x<listOfWords.length;x++){
            if (!countWords.containsKey(listOfWords[x])){
                countWords.put(listOfWords[x], 1);
            }
            else if(countWords.containsKey(listOfWords[x])){
                countWords.put(listOfWords[x], countWords.get(listOfWords[x]) + 1);
            }
        }

        for (int y =0;y<listOfWords.length;y++){
            if (countWords.get(listOfWords[y]) == 1){
                res += listOfWords[y];
                break;
            }
        }

        return res;
    }

    public static int longestConsecutiveSequence(int[] nums){  //???
        int count  = 0;

        for (int y=0;y<nums.length-1;y++){
            if (nums[y] + 1 == nums[y+1]){
                count ++;
            }
            else if (nums[y] + 1 != nums[y+1]){
                count = 0;
            }
        }
        return count;
    }

    public static boolean checkIfArraySorted(int[] nums){
        boolean res = true;
        for (int x=0;x<nums.length-1;x++){
            if (nums[x] > nums[x+1]){
                res = false;
                break;
            }
        }
        return res;
    }

    public static int sumOfArray(int[] nums1){
        int sum = 0;
        for (int x=0;x<nums1.length;x++){
            sum += nums1[x];
        }
        return sum;
    }

    public static int countOccurrencesOfValue(int[] nums, int x){
        int count = 0;
        for (int y=0;y<nums.length;y++) {
            if (nums[y] == x) {
                count++;
            }
        }
        return count;
    }

    public static int findLastOccurrence(int[] nums, int xLast){
        int lastIndexOfX = -1;
        for (int r = 0;r<nums.length;r++){
            if (nums[r] == xLast){
                lastIndexOfX = r;
            }
        }
        return lastIndexOfX;
    }

    public static boolean checkAllElementsEqual(int[] nums){
        boolean res = true;
        for (int x=0;x<nums.length;x++){
            for (int t = 0;t<nums.length;t++){
                if (nums[x] != nums[t]){
                    res = false;
                    break;
                }
            }

        }
        return res;
    }

    public static int countElementsGreaterThanAverage(int[] nums){
        double sum = 0;
        double avg = 0;
        int count = 0;

        for (int t = 0;t<nums.length;t++){
            sum += nums[t];
        }

        avg = sum/nums.length;

        for (int s = 0;s<nums.length;s++){
            if(nums[s]>avg){
                count++;
            }
        }
        return count;

    }




}
