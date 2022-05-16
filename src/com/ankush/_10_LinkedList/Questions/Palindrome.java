package com.ankush._10_LinkedList.Questions;

public class Palindrome {
    Node head;

    class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    void Insertbegin(int val)
    {
        Node in = new Node(val);
        in.next=head;
        head=in;
    }

    void Display()
    {
        Node temp = head;
        System.out.print(" start --> ");
        while(temp != null)
        {
            System.out.print(temp.val+" --> ");
            temp=temp.next;
        }
        System.out.println(" End ");
    }

    int CountNode()
    {
        Node temp=head;
        int count=0;
        while(temp != null)
        {
            count+=1;
            temp = temp.next;
        }
        return count;
    }
}
