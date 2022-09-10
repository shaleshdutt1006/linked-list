package com.bridgelabz;

public class LinkedList<T> {
    public Node head;
    public Node tail;

    class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T data) {
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

    public void delete() {
        if (head == null) {
            System.out.println("The list is empty");
        }
        if (head.next == null) {
            head = null;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

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
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(56);
        list.add(30);
        list.add(70);
        list.add("dutt");
        list.add(2.6f);
        list.delete();
        list.display();
    }
}
