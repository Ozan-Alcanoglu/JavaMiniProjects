package org.example.example9;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BST {

    private Node root;

    public BST(Node root){
        this.root = root;
    }

    private int getHeight(Node node) {
        return (node == null) ? 0 : node.height;
    }

    private void updateHeight(Node node) {
        node.height = 1 + Math.max(getHeight(node.getLeft()), getHeight(node.getRight()));
    }

    private int getBalanceFactor(Node node) {
        return (node == null) ? 0 :
                getHeight(node.getLeft()) - getHeight(node.getRight());
    }

    public void add(Node node) {
        root = addRecursive(root, node.getKey());
    }

    private Node addRecursive(Node current, int key) {

        if (current == null) {
            return new Node(key);
        }

        if (key < current.getKey()) {
            current.setLeft(addRecursive(current.getLeft(), key));
        }
        else if (key > current.getKey()) {
            current.setRight(addRecursive(current.getRight(), key));
        }
        else {
            System.out.println("kayıt mevcut");
            return current;
        }

        updateHeight(current);

        int bf = getBalanceFactor(current);


        if (bf > 1 && key < current.getLeft().getKey()) {
            return rotateRight(current);
        }

        if (bf < -1 && key > current.getRight().getKey()) {
            return rotateLeft(current);
        }


        return current;
    }

    private void updateTreeHeights(Node node) {
        if (node == null) return;

        updateTreeHeights(node.getLeft());
        updateTreeHeights(node.getRight());

        updateHeight(node);

        System.out.println("Node " + node.getKey() + " BF = " + getBalanceFactor(node));
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

        updateTreeHeights(root);

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

    public Node rotateRight(Node y) {
        Node x = y.getLeft();
        Node T2 = x.getRight();

        x.setRight(y);
        y.setLeft(T2);

        updateHeight(y);
        updateHeight(x);

        return x;
    }


    public Node rotateLeft(Node x) {
        Node y = x.getRight();
        Node T2 = y.getLeft();

        y.setLeft(x);
        x.setRight(T2);

        updateHeight(x);
        updateHeight(y);

        return y;
    }

}
