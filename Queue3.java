package com.example.myconversions;

public class Queue3 {
    private int[] items;
    private int front, rear, size;

    public Queue3(int capacity) {
        items = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == items.length;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % items.length;
        items[rear] = value;
        size++;
        //  System.out.println("Successfull entry to the queue");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = items[front];
        front = (front + 1) % items.length;
        size--;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return items[front];
    }

    public void display() {
      /*  if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }*/

        if (size == 0)
        {

        }

        else {
            for (int i = 0; i < size; i++) {
                int index = (front + i) % items.length;

                System.out.print(items[index]);


            }
        }
        //System.out.println();
    }
}
