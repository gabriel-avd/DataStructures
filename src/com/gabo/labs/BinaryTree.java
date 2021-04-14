package com.gabo.labs;

public class BinaryTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.getValue()) {
            current.setLeft(addRecursive(current.getLeft(), value));
        } else if (value > current.getValue()) {
            current.setRight(addRecursive(current.getRight(), value));
        } else {
            return current;
        }
        return current;
    }

    public void add(int value) {
        this.root = addRecursive(this.root, value);
    }

    public void traverseInOrder() {
        traverseInOrderRecursive(this.root);
    }

    private void traverseInOrderRecursive(Node node) {
        if (node != null) {
            traverseInOrderRecursive(node.getLeft());
            System.out.println(" " + node.getValue());
            traverseInOrderRecursive(node.getRight());
        }
    }

}
