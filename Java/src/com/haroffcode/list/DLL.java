package com.haroffcode.list;

public class DLL {
    Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null){
            head.prev = node;
        }
        head = node;
    }

    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    public static class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }


    }
}
