package Labs;


import java.util.ArrayList;
import java.util.Scanner;

public class labNumber1 {
    public static void main(String[] args) {
        int[] arrayOfNums = {27,14,77,85,34,16,58,34,29,39};
        System.out.println(findIndexOfValueInArray(arrayOfNums, 34));
        System.out.println(findMaxInArray(arrayOfNums));

        System.out.println();
        System.out.println();
        System.out.println("SPLIT");
        swapArray(arrayOfNums);

        System.out.println();
        System.out.println();
        System.out.println("SPLIT");

        swapArrayWithRange(arrayOfNums, 2, arrayOfNums.length-2);
    }

    public static int findIndexOfValueInArray(int[] nums, int xTarget){
        for (int x = 0; x < nums.length; x++){
            if (nums[x] == xTarget){
                return x;
            }
        }
        return nums.length;
    }

    public static int findMaxInArray(int[] nums){
        int max = nums[0];
        for (int x =0;x<nums.length;x++){
            if (nums[x]>max){
                max = nums[x];
            }
        }
        return max;
    }

    public static void swapArray(int[] nums){
        int left = 0;
        int right = nums.length - 1;

        while (left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }

        for (int x = 0;x<nums.length;x++){
            System.out.println(nums[x]);
        }

    }

    public static void swapArrayWithRange(int[] nums, int startX, int finishY){
        int left = startX;
        int right = finishY;

        while (left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }

        for (int x = 0;x<nums.length;x++){
            System.out.println(nums[x]);
        }
    }


}

