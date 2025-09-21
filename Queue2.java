public class Queue2 {
    private int[] items;
    private int front, rear, size;

    public Queue2(int capacity) {
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
        if (isEmpty()) {
            //System.out.println("Queue is empty");
            System.out.println(0);
            return;
        }
       
        for (int i = 0; i < size; i++) {
            int index = (front + i) % items.length;
            if(items[index] == 10)
            {
                System.out.print("A");
            }
            else if (items[index] == 11)
            {
                System.out.print("B");
            }
            else if (items[index] == 12)
            {
                System.out.print("C");
            }
            else if (items[index] == 13)
            {
                System.out.print("D");
            }
            else if (items[index] == 14)
            {
                System.out.print("E");
            }
            else if (items[index] == 15)
            {
                System.out.print("F");
            }
            else 
            {
              System.out.print(items[index]);  
            }
      
        }
        //System.out.println();
    }
}