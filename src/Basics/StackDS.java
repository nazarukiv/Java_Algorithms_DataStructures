package Basics;

import java.util.Stack;

public class StackDS {
    public static void main(String[] args) {
        //LLIFO DS. push() - to add. pop()-to remove. Last-In.First-Out.

        Stack<String> stack = new Stack<String>();

        stack.push("Minecraft");
        stack.push("PUBG");
        stack.push("FIFA");
        stack.push("CS2");

        stack.pop(); //top most object to be removed
        //peek() takes the last object without removing it


        System.out.println(stack.search("FIFA")); //from top
        System.out.println(stack);




    }

    public static void addUrl(String url, Stack<String> stack){
        stack.push(url);
    }

    public static void back(Stack<String> stack) {
        if (stack.size() > 1) {
            String removed = stack.pop();
            System.out.println("Going back from: " + removed);
            System.out.println("Current page: " + stack.peek());
        } else {
            System.out.println("Can't go back! You are at the start.");
        }
    }


}
