package Labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class binarySearch{
    public static void main(String[] args) {
        int[] nums = {7,8,10,13,16,20};
        int target = 20;

        System.out.println(binarySearch(nums, target));

        int[] nums1 = {7,8,10,13,16, 16,20};
        int target1 = 16;

        System.out.println(findFirstOccurance(nums1, target1));


        int[] nums3 = {7,8,10,13,16, 16,20};
        int target3 = 17;

        System.out.println(searchInsertPosition(nums3, target3));

    }

    public static int binarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        while (left<=right){
            int mid = left + (right-left) / 2;

            if (nums[mid] == target){
                return mid;
            }
            else if (target < nums[mid]){
                right = mid - 1;
            }
            else if (target>nums[mid]){
                left = mid + 1;
            }
        }
        return -1;
    }

    public static int findFirstOccurance(int[] nums1, int target1){
        int left = 0;
        int right = nums1.length - 1;
        int asnwer = -1;

        while (left<=right){
            int mid = left + (right - left) /2;

            if (nums1[mid] == target1){
                asnwer = mid;
                right = mid - 1;
            }
            else if (target1 < nums1[mid]){
                right = mid-1;
            }
            else if (target1 > nums1[mid]){
                left = mid+1;
            }
        }
        return asnwer;
    }

    public static int searchInsertPosition(int[] nums2, int target2){
        int left = 0;
        int right = nums2.length - 1;

        while (left<=right){
            int mid = left + (right-left)/2;

            if (nums2[mid] == target2){
                return mid;
            }
            else if (target2 < nums2[mid]){
                right = mid - 1;
            }
            else if (target2 > nums2[mid]){
                left = mid +1;
            }
        }
        return left;

    }








}
