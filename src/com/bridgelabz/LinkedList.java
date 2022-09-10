package com.bridgelabz;

public class LinkedList {
    public Node head;
    public Node tail;

    static class Node {
        int data;
        Node next;

        Node(int data) {    // when we call this constructor it will create new node everytime
            this.data = data;
            this.next = null;
        }
    }
    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node currnode = head;
        while (currnode.next != null) {
            currnode = currnode.next;
        }
        currnode.next = newNode;
    }
    public void display() {

        if (head == null) {
            System.out.println("List is empty");
        }
        Node currnode = head;
        while (currnode != null) {
            System.out.println(currnode.data + " ");
            currnode = currnode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.append(56);
        list.append(30);
        list.append(70);
        list.display();
    }
}
