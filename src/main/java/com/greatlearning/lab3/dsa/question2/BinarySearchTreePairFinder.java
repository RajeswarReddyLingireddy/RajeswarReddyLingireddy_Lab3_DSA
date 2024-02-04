package com.greatlearning.lab3.dsa.question2;

import java.util.LinkedHashSet;
import java.util.Set;

public class BinarySearchTreePairFinder {

    Node bst;
    Integer sum;

    Set<Integer> previouslyVisitedNodes;

    boolean pairFound;


    public BinarySearchTreePairFinder(Node bst, Integer sum) {

        this.bst = bst;
        this.sum = sum;

        this.previouslyVisitedNodes =
                new LinkedHashSet<>();
        // new HashSet
    }

    void findPairs() {

        preOrderTraversal();
        if(!pairFound)
            System.out.println("Nodes are not found");
    }

    void preOrderTraversal() {
        preOrderTraveralInternal(bst);
    }

    void preOrderTraveralInternal(Node currentNode) {
        if (currentNode == null) {
            return;
        }
        Integer difference = (sum - currentNode.getData());
        if (previouslyVisitedNodes.contains(difference)) {
            pairFound= true;
            System.out.println("Match Identified");
            System.out.printf("[%d, %d]",
                    currentNode.getData(), difference);
            System.out.println();
        }

        this.previouslyVisitedNodes.add(currentNode.getData());

        preOrderTraveralInternal(currentNode.getLeft());
        preOrderTraveralInternal(currentNode.getRight());
    }



}