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

    public void delete(int pos, T value) {
        if (pos == 0) {
            head = head.next;
            return;
        }
        Node previous = head;
        for (int i = 0; i < pos - 1; i++) {
            previous = previous.next;
        }
        previous.next = previous.next.next;
    }

    public void display() {
        int count = 0;
        if (head == null) {
            System.out.println("List is empty");
        }
        Node currnode = head;
        while (currnode != null) {
            System.out.println(currnode.data + " ");
            currnode = currnode.next;
            count++;
        }
    }

    public int size() {
        int count = 0;
        Node<T> currnode = head;
        while (currnode != null) {
            currnode = currnode.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(56);
        list.add(30);
        list.add(40);
        list.add(70);
        System.out.println("Position of the element " + "40" + " is : " + list.search(40));
        list.delete(list.search(40), 40);
        System.out.println("Linked list after deletion is : ");
        list.display();
        System.out.println("Size of linked list is : " + list.size());
    }
}
