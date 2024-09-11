package com.cxl.qm.demo6;

public class Test {
    public static void main(String[] args) {
        Node node = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);

        node.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);

        Node current = node;
        while(current != null){
            System.out.print(current.getData());
            if(current.getNext() != null){
                System.out.print("----");
            }
            current = current.getNext();
        }

    }
}
