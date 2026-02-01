package Sessions;

import java.util.ArrayList;
import java.util.HashMap;


public class session1 {
    public static void main(String[] args) {
        //task 1
        int[] nums = {1, 2, 3, 4, 5};
        reverseArray(nums);


        //task 2
        int target1 =9;
        int[] nums1 = {2, 7, 11, 15};
        twoSum(target1, nums1);

        //task 3
        String toCheck = "programming";
        firstNonRepeatingCharacter(toCheck);

        //task 4
        int[] nums4 = {1,2,3,2,2,4};
        int target  = 2;
        countOccurrencesOfNumber(nums4, target);


        //task 5
        int[] nums7 = {1,2,3,4,6,5,7};
        isSorted(nums7);


    }

    static public void reverseArray(int[] nums){
        int left = 0;
        int right = nums.length-1;

        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
        for (int x=0;x<nums.length;x++){
            System.out.println(nums[x]);
        }
    }

    static public void twoSum(int target, int[] nums){
        ArrayList<Integer> final1 = new ArrayList<>();
        for (int x=0;x<nums.length;x++){
            for (int j=x+1;j<nums.length;j++){
                if (nums[x] + nums[j] == target){
                    final1.add(x);
                    final1.add(j);
                }
            }
        }
        System.out.println(final1);
    }

    static public void firstNonRepeatingCharacter(String s){
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (int x = 0; x < s.length(); x++){
            charCount.put(
                    s.charAt(x),
                    charCount.getOrDefault(s.charAt(x), 0) + 1
            );
        }

        for (int i = 0; i < s.length(); i++){
            if (charCount.get(s.charAt(i)) == 1){
                System.out.println(s.charAt(i));
                return;
            }
        }

        System.out.println("No non-repeating character");
    }

    static public void countOccurrencesOfNumber(int[] nums, int target){
        HashMap<Integer, Integer> integerOccuranceHashMap = new HashMap<>();
        for (int s=0; s<nums.length; s++){
            if (!integerOccuranceHashMap.containsKey(nums[s])){
                integerOccuranceHashMap.put(nums[s], 1);
            } else if(integerOccuranceHashMap.containsKey(nums[s])){
                integerOccuranceHashMap.put(nums[s], integerOccuranceHashMap.get(nums[s]) + 1);
            }
        }

        for (Integer key: integerOccuranceHashMap.keySet()){
            if (key == target){
                System.out.println(integerOccuranceHashMap.get(key));
            }
        }
    }

    static public void isSorted(int[] array){
        boolean isSorted = true;
        for (int x=0; x<array.length; x++){
            for (int j=x+1;j<array.length;j++){
                if (array[j] < array[x]){
                    isSorted = false;
                }
            }
        }
        System.out.println(isSorted);

    }

}


