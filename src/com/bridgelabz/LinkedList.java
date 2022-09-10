package com.bridgelabz;

public class LinkedList<T> {
    public Node<T> head;
    public Node<T> tail;

    class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<T> currnode = head;
        while (currnode.next != null) {
            currnode = currnode.next;
        }
        currnode.next = newNode;
    }

    public int search(T value) {
        int index = 0;
        Node<T> currnode = head;
        while (currnode != null) {
            if (currnode.data.equals(value)) {
                return index;
            }
            index++;
            currnode = currnode.next;
        }
        return -1;
    }

    public void insertAt(int pos, T value) {
        Node<T> node = new Node<T>(value);
        if (pos == 0) {
            node.next = head;
            head = node;
            return;
        }
        Node<T> previous = head;
        for (int i = 0; i < pos; i++) {
            previous = previous.next;
        }
        node.next = previous.next;
        previous.next = node;
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
        System.out.println("Position of the element is : " + list.search(30));
        list.insertAt(list.search(30), 40);
        System.out.println("Linked list after insertion is : ");
        list.display();
    }
}
