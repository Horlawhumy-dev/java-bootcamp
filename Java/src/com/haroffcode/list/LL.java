package com.haroffcode.list;

import java.util.*;

public class LL {
    private Node head;
    private Node tail;
    public int size;

    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if (tail == null){
            insertFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
    }

    public void insert(int val, int index){
        if (index == 0){
            insertFirst(val);
            return;
        }

        if (index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = new Node(val, temp.next);
    }

    public void displayList(){
        Node temp = head;
         while (temp != null){
             System.out.print(temp.value + " --> ");
             temp = temp.next;
         }
        System.out.println("END");
        System.out.println("The size of the list is " + size);
    }

    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        size--;
        return value;
    }

    public int deleteLast(){
        if (size<=1){
            return deleteFirst();
        }
        Node node = getSecondLastNode(size-1);
        int value = tail.value;
        tail = node;
        tail.next = null;
        size--;
        return value;
    }

    public int delete(int index){
        if (index == 0) {
            return deleteFirst();
        }
 
        if (index == size - 1){
            return deleteLast();
        }

        Node prev = getSecondLastNode(index-1);
        int value = prev.next.value;
        prev.next = prev.next.next;
        return value;
    }

    public Node find(int value){
        Node node = head;
        while (node != null){
            if (node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node getSecondLastNode(int index){
        Node node =  head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    private class Node {
        private int value;
        private Node next;

        public  Node(int val){
            this.value = val;
        }

        public  Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
