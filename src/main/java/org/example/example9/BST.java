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

    private int findMinValue(Node root) {
        int minValue = root.getKey();
        while (root.getLeft() != null) {
            minValue = root.getLeft().getKey();
            root = root.getLeft();
        }
        return minValue;
    }

    public void delete(int key) {
        this.root = deleteRecursive(this.root, key);
        System.out.println(key + " başarıyla silindi (veya bulunamadı).");
    }

    private Node deleteRecursive(Node current, int key) {
        if (current == null) {
            return null;
        }

        if (key < current.getKey()) {
            current.setLeft(deleteRecursive(current.getLeft(), key));
            return current;
        }

        if (key > current.getKey()) {
            current.setRight(deleteRecursive(current.getRight(), key));
            return current;
        }

        if (current.getLeft() == null) {
            return current.getRight();
        }

        if (current.getRight() == null) {
            return current.getLeft();
        }

        int smallestValue = findMinValue(current.getRight());
        current.setKey(smallestValue);

        current.setRight(deleteRecursive(current.getRight(), smallestValue));

        return current;
    }




}
