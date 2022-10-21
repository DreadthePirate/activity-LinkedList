package com.example.linkedlist;

import java.util.StringJoiner;

public class SinglyLinkedList<E> implements LinkedList<E> {
    private Node head;
    private Node tail;

    @Override
    public void addFirst(E element) {
        //step 1: create a new node
        //step 2: add the element to the head
        Node node = new Node(element, head);
        //edge case

        if (head == null) {
            head = node;
            tail = node;
        } else{
            head = node; // step 3: point to the new node
        }
    }

    @Override
    public void addLast(E element) {
        Node node = new Node(element, null);//step 1: create a new node
        if (tail == null) {
            tail = node;//step 3
            head = tail;//step 3: point to the head to the tail
        }else{
            tail.next = node; // step 2: point to the new node
            tail = node; //step 3:
        }
    }

    @Override
    public E pollFirst() {
        E element;

        if (head == null) {
            element = null;//step 1: create a new node
        } else {
            element = head.element;//step 1: point to the head

            Node next = head.next;//step 2;
            head.next = null;// step 3:
            head = next;//step 4:
        }
        return element;
    }

    @Override
    public E pollLast() {
        E element;

        if (tail == null) {
            element = null;//step 1: create a new node

        } else {
            element = tail.element;// step 1
            if (head == tail){//only one element
                head = null;
                tail = null;
            }else{
                Node current = head;
                Node previous = head;
                while (current.next != null){// step 2
                    previous = current;//this is walking the list set previous to current node
                    current = current.next;//you set current to new current node
                }

                tail = previous;// step 3
                tail.next = null;// step 4
            }
        }
        return element;
    }

    @Override
    public E peekFirst() {
        return head.element;
    }

    @Override
    public E peekLast() {
        return tail.element;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        StringJoiner joiner = new StringJoiner(", ");
        Node current = head;

        while (current != null) {
            joiner.add(current.element.toString());
            current = current.next;//this actually moves the pointer
        }

        builder.append(joiner);
        builder.append("]");
        return builder.toString();

    }

    private class Node{

        Node next;

        E element;

        public Node(E element, Node next) {
            this.element = element;
            this.next = next;//this is variable shadowing I'm calling next and element that I created earlier

        }
    }
}
