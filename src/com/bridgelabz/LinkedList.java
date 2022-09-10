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

    public boolean search(T value) {
        Node currnode = head;
        while (currnode != null) {
            if (currnode.data.equals(value)) {
                return true;
            }
            currnode = currnode.next;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(56);
        list.add(30);
        list.add(70);
        list.add(2.6f);
        System.out.println(list.search(30));
    }
}
