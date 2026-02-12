package Sessions;

public class session3 {
    public static void main(String[] args) {
        //part 1 Array
        int[] nums11={1,2,3,4,5};
        System.out.println(reverseArray(nums11));


        int[] nums22 = {1,2,3,4,5,6};
        int l = 1;
        int r = 4;

        System.out.println(reverseSubarray(nums22, l, r));


        int[] nums33 = {3, 4, -1, 1};
        System.out.println(smallestPositive(nums33));


    }

    public static int[] reverseArray(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while (start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
        for (int x=0;x<nums.length;x++){
            System.out.print(nums[x] + ", ");
        }
        return nums;
    }

    public static int[] reverseSubarray(int[] nums, int l, int r){
        int start = l;
        int end = r;

        while (start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
        for (int x=0;x<nums.length;x++){
            System.out.print(nums[x] + ", ");
        }
        return nums;
    }

    public static int smallestPositive(int[] nums){
        int min = nums[0];
        for (int x=0;x<nums.length;x++){
            if (nums[x] > 0 && nums[x]<min){
                min = nums[x];
            }
        }
        return min;
    }

}
