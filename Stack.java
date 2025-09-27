package com.example.myconversions;

public class Stack {

    int maxSize;
    int[] stackArray;
    int top;


    public  Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;

    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public int pop() {
        if (top >= 0) {
            return stackArray[top--];
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int peek() {
        return stackArray[top];

    }

}


