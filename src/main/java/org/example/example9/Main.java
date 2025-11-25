package org.example.example9;

public class Main {

    public static void main(String[] args) {
        Node node=new Node(50);

        BST bst= new BST(node);

        Node node1=new Node(30);
        Node node2=new Node(70);
        Node node3=new Node(20);
        Node node4=new Node(40);
        Node node5=new Node(60);
        Node node6=new Node(80);

        bst.add(node1);
        bst.add(node2);
        bst.add(node3);
        bst.add(node4);
        bst.add(node5);
        bst.add(node6);

        bst.inorderTraversal();

        bst.delete(40);

        bst.inorderTraversal();
    }
}
