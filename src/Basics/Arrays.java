package Basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args) {
        //Array basics
        //task 1
        ArrayList<Integer> reversedArray = new ArrayList<>();
        int[] arrayNums = {1,2,3,3,4};

        for (int x=arrayNums.length-1;x>=0;x--){
            reversedArray.add(arrayNums[x]);
        }

        System.out.println(reversedArray);

        //task 2
        ArrayList<Integer> movedRight = new ArrayList<>();
        int first = arrayNums[0];
        for (int x=1;x<arrayNums.length;x++) {
            movedRight.add(arrayNums[x]);
        }
        movedRight.add(first);
        System.out.println(movedRight.toString());

        //task 3 option 1
        HashSet<Integer> nums = new HashSet<>();
        for (int s = 0;s<arrayNums.length;s++){
            nums.add(arrayNums[s]);
        }
        System.out.println(nums.toString());

        //task 3 option 2 manual
        ArrayList<Integer> noDublicates = new ArrayList<>();
        for (int s = 0;s<arrayNums.length;s++){
            if (!noDublicates.contains(arrayNums[s])){
                noDublicates.add(arrayNums[s]);
            }
        }
        System.out.println(noDublicates);

        //task 4 count odd vs even
        int odd = 0;
        int even = 0;

        for (int x=0; x<arrayNums.length;x++){
            if (arrayNums[x]%2==0){
                even++;
            }
            else {
                odd++;
            }
        }

        System.out.println("Array has: odds-"+odd+", even-" + even);

        //task 5
        //shows list from 1 to 3. only one miss allowed
        int missed = 0;
        int sum = 0;
        int correctSum = 0;
        int [] toFive = {1,2,4,5};
        for (int x=0;x<toFive.length;x++){
            sum += toFive[x];
        }
        for (int i = 1;i<=toFive[toFive.length-1];i++){
            correctSum += i;
        }

        if (sum==correctSum){
            System.out.println("all good, correct array");
        }
        else {
            System.out.println("Not correct result");
            System.out.println("Lost number is: "+ (correctSum-sum));
        }

        System.out.println(sum);
        System.out.println(correctSum);

        //task 6
        int[] randomArray = {1, 2, 3, 5, 4, 6};

        boolean isSorted = true;

        for (int x = 0; x < randomArray.length - 1; x++) {
            if (randomArray[x] > randomArray[x + 1]) {
                isSorted = false;
                break;
            }
        }

        System.out.println(isSorted);

        //task 7
        int[] numsToMerge1 = {1,2,3};
        int[] numsToMerge2 = {4,5,6};
        ArrayList<Integer> merged = new ArrayList<>();

        for (int x = 0;x<numsToMerge1.length;x++){
            merged.add(numsToMerge1[x]);

        }
        for (int x = 0;x<numsToMerge2.length;x++){
            merged.add(numsToMerge2[x]);
        }

        System.out.println(merged.toString());

        //task 8
        int[] nums234 = {1,0,2,3,0,3,0,0,6};
        ArrayList<Integer> zerosToBack = new ArrayList<>();
        for (int x=0;x<nums234.length;x++){
            if (nums234[x]!=0){
                zerosToBack.add(nums234[x]);
            }
        }

        for (int x=0;x<nums234.length;x++){
            if (nums234[x]==0){
                zerosToBack.add(nums234[x]);
            }
        }
        System.out.println(zerosToBack.toString());

        //task 9
        HashMap<Integer, Integer> frequencyCheck = new HashMap<>();
        for (int x =0; x<nums234.length;x++){
            int value = nums234[x];
            if(frequencyCheck.containsKey(value)){
                frequencyCheck.put(value, frequencyCheck.get(value)+1);
            }else {
                frequencyCheck.put(value, 1);
            }
        }
        System.out.println(frequencyCheck.toString());

    }
}
