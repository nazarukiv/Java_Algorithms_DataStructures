package Labs;



import java.util.ArrayList;
import java.util.Arrays;

public class sortingLab{
    public static void main(String[] args) {
        // task 1 Bubble Sort
        int[] nums = {3, 1, 4, 2};
        bubbleSort(nums);

        System.out.println();
        System.out.println();

        //task 2 Selection Sort
        int[] nums2 = {5, 3, 4, 1};
        selectionSort(nums2);

        //task 3 Insertion Sort
        int[] nums3 = {9, 1, 8, 2, 7, 3, 6, 5, 4};
        insertionSort(nums3);

        System.out.println();
        System.out.println();

    }

    public static void bubbleSort(int[] nums){
        boolean swapped = true;

        while (swapped){
            swapped = false;
            for (int x= 0;x<nums.length-1;x++){
                if (nums[x] <nums[x+1]){

                    int temp = nums[x];
                    nums[x] = nums[x+1];
                    nums[x+1] = temp;
                    swapped = true;
                }
            }
        }

        for (int x: nums){
            System.out.println(x);
        }
    }

    public static void selectionSort(int[] nums){
        int swapCount = 0;
        for (int i=0;i<nums.length;i++){
            int min = i;
            for(int j = i+1;j<nums.length;j++){
                if (nums[j] < nums[min]){
                    min = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
            swapCount++;
        }

        for (int h: nums){
            System.out.println(h);
        }
        System.out.println("Swap Count: " + swapCount );
    }


    public static void insertionSort(int[] array){
        for (int i = 1;i<array.length;i++){
            int temp =array[i];
            int j = i - 1;

            while (j>= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+ 1] = temp;
        }

        for (int x: array){
            System.out.print(x + ", ");
        }
    }

}