package com.greatlearning.lab3.dsa.question1;

import java.util.Scanner;

public class BalancingBracketsDriverMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression");
        String input = scanner.next();
        scanner.close();

        MyStack myStack = new MyStack();
        if (input.length() % 2 == 1) {
            System.out.println("The entered Strings do not contain Balanced Brackets");
        } else {
            if (myStack.validate(input)) {
                System.out.println("The entered String has Balanced Brackets");
            } else {
                System.out.println("The entered Strings do not contain Balanced Brackets");
            }
        }


    }
}
