package com.bridgelabz;

public class LinkedList {
    public static Node head;
    public Node tail;

    static class Node {
        int data;
        Node next;

        Node(int data) {    // when we call this constructor it will create new node everytime
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
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

    public void insert(int data, Node head, int pos) {
        Node newNode = new Node(data);
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node previous = head;
        for (int i = 0; i < pos - 1; i++) {
            previous = previous.next;
        }
        newNode.next = previous.next;
        previous.next = newNode;
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
        list.add(56);
        list.add(70);
        list.insert(30, head, 1);
        list.display();
    }
}
