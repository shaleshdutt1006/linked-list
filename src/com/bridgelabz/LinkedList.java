package com.bridgelabz;

public class LinkedList<T> {
    public Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
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

    public int size() {
        int count = 0;
        Node currnode = head;
        while (currnode != null) {
            currnode = currnode.next;
            count++;
        }
        return count;
    }

    public void sorting() {
        for (int i = 0; i < size(); i++) {
            Node currnode = head;
            Node nextnode = currnode.next;
            int temp;
            for (int j = 0; j < size() - 1; j++) {

                if (currnode.data > nextnode.data) {
                    temp = currnode.data;
                    currnode.data = nextnode.data;
                    nextnode.data = temp;
                }
                currnode = nextnode;
                nextnode = nextnode.next;
            }
        }
        System.out.println("Sorted array is this : ");
        Node node = head;
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(56);
        list.add(30);
        list.add(40);
        list.add(70);
        list.sorting();
    }
}
