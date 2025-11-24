package org.example.example9;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BST {

    private Node root;

    public BST(Node root){
        this.root=root;
    }


    public void add(Node node){
        Node current = root;

        while (true){
            if (node.getKey() < current.getKey()){
                if (current.getLeft() == null){
                    current.setLeft(node);
                    return;
                }
                current = current.getLeft();
            }
            else if (node.getKey() > current.getKey()){
                if (current.getRight() == null){
                    current.setRight(node);
                    return;
                }
                current = current.getRight();
            }
            else {
                System.out.println("kayıt mevcut");
                return;
            }
        }
    }

    public boolean searchKey(int key) {
        Node current = root;

        while (current != null) {
            if (key < current.getKey()) {
                current = current.getLeft();
            } else if (key > current.getKey()) {
                current = current.getRight();
            } else {
                return true;
            }
        }
        return false;
    }

    public void inorderTraversal() {
        List<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {

            while (current != null) {
                stack.push(current);
                current = current.getLeft();
            }

            current = stack.pop();
            list.add(current.getKey());
            current = current.getRight();
        }

        System.out.println(list);
    }




}
