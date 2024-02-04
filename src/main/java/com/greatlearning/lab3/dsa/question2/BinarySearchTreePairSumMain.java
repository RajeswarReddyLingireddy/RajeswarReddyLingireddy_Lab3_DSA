package com.greatlearning.lab3.dsa.question2;

import java.util.Scanner;

public class BinarySearchTreePairSumMain {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter size of binary tree");
        int size = scanner.nextInt();
        Node root = null;
        System.out.println("Please enter data of binary tree");
        for(int i=0;i<size;i++){
            int data = scanner.nextInt();
            root = addElementTOBinarySearchTree(data,root);
        }
        System.out.println("Please enter the sum for which pairs to be found");
        int sum=scanner.nextInt();
       BinarySearchTreePairFinder binarySearchTreePairFinder = new BinarySearchTreePairFinder(root,sum);
        binarySearchTreePairFinder.findPairs();

    }





    private static Node addElementTOBinarySearchTree(int data, Node root) {

        Node node = new Node(data);
        if(root == null){
            root = node;
        }else{
            if(root.data <node.data){
                if(root.right !=null)
                addElementTOBinarySearchTree(data,root.right);
                else
                    root.right=node;
            }else if(root.data >node.data){
                if(root.left !=null)
                addElementTOBinarySearchTree(data,root.left);
                else
                    root.left=node;
            }
        }
        return root;

    }



    private static void findPairs(int sum, Node root) {



    }
}

