package com.gabo.labs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(8);
        bt.add(7);
        bt.add(9);

        bt.traverseInOrder();
    }
}
