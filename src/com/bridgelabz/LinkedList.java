package com.bridgelabz;

public class LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {    // when we call this constructor it will create new node everytime
            this.data = data;
        }

    }

    public static void main(String[] args) {

        Node n1 = new Node(56);
        Node n2 = new Node(30);
        Node n3 = new Node(70);
        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = null;
        System.out.println("Data in the linklist are : " + n1.data + " " + n2.data + " " + n3.data);
        System.out.println("Address of node n1 is : " + n1.next);
        System.out.println("Address of node n2 is : " + n2.next);
        System.out.println("Address of node n3 is : " + n3.next);
    }


}
