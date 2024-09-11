package com.cxl.chqm.demo4;

public class TestLinkedList {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        Node current = node1;
        while (current != null) {
            System.out.print(current.getData());
            if (current.getNext() != null) {
                System.out.print("----");
            }
            current = current.getNext();
        }
        System.out.println();
    }
}