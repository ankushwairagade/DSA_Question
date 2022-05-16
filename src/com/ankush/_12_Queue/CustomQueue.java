package com.ankush._12_Queue;

public class CustomQueue {
    Queue front=null;
    Queue rear=null;
    class Queue
    {
        int val;
        Queue next;

        public Queue(int val) {
            this.val = val;
        }
    }

    void front() // Deletion done at front
    {

        if(front== null)
        {
        System.out.println("UnderFlow");
        return;
        }
        System.out.println(" Deletion at front "+front.val);
        front=front.next;

    }

    void rear(int val) // Insertion done at end
    {
        Queue in = new Queue(val);
        if(rear==null)
        {
            rear = in;
            front =in;
        }

        rear.next=in;
        rear=in;
    }

    void Display()
    {
        Queue temp = front ;

        while(temp!=null)
        {
            System.out.print(" "+temp.val);
            temp=temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();
        queue.rear(10);
        queue.rear(25);
        queue.rear(50);
        queue.rear(90);
        queue.rear(100);
        queue.rear(5);
        queue.Display();
        queue.front();
        queue.Display();
        queue.front();
        queue.front();
        queue.Display();
        queue.front();
        queue.front();
        queue.front();
        queue.front();
        queue.front();
        queue.front();

    }
}

