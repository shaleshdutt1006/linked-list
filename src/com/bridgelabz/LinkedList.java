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

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
        }
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add(70);
        list.add(30);
        list.add(56);
        list.display();
    }
}
