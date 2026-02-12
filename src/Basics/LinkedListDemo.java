package Basics;

public class LinkedListDemo {

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);


        Node cur = head;

        while (cur != null) {
            System.out.println(cur.value);
            cur = cur.next;
        }

        int countElements = 0;

        while (cur != null){
            countElements++;
            cur = cur.next;
        }

        System.out.println(countElements);
    }
}
