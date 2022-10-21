package com.example.linkedlist;

public class SingleDriver {
    public static void main(String[] args) {
    LinkedList<String> linkedlist = new SinglyLinkedList<>();
        linkedlist.addFirst("first");
        linkedlist.addFirst("second");
        linkedlist.addFirst("third");
        linkedlist.addFirst("fourth");
        linkedlist.addFirst("fifth");
        System.out.println(linkedlist);

        linkedlist.addLast("sixth");
        linkedlist.addLast("seventh");
        linkedlist.addLast("eighth");

        System.out.println(linkedlist);

        linkedlist.pollFirst();
        linkedlist.pollFirst();

        System.out.println(linkedlist);

        linkedlist.pollLast();
        linkedlist.pollLast();
        System.out.println(linkedlist);


    }
}
