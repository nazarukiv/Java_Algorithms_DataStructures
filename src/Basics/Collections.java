package Basics;

import java.util.ArrayList;


public class Collections {
    public static void main(String[] args) {
        //Collection tasks
        //ArrayList
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(10);
        nums.add(15);
        nums.add(20);

        nums.remove(2);

        nums.add(7);
        nums.add(3);
        nums.add(19);
        nums.add(4);
        nums.add(11);

        //find max/min
        int max = 0;
        int min = nums.get(0);
        for (int x=0;x<nums.size();x++){
            if (nums.get(x)>max){
                max = nums.get(x);
            }
        }
        for (int x=0;x<nums.size();x++){
            if (nums.get(x)<min){
                min = nums.get(x);
            }
        }

        System.out.println("Max:" + max+ "| Min:" + min);

        //filter value
        for (int x=0;x<nums.size();x++){
            if (nums.get(x)>5){
                System.out.print(nums.get(x) + " | ");
            }
        }


    }
}


