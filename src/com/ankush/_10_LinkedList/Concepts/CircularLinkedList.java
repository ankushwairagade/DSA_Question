package com.ankush._10_LinkedList.Concepts;

public class CircularLinkedList {

    Node head;
    class Node
    {
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

    void InsertatBegin(int val)
    {
        Node in = new Node(val);
        if(head == null)
        {
            head = in;
            in.next=head;
        }
        Node temp = head;
        head=in;
        while(temp.next !=head)
        {
            temp = temp.next;
        }
        temp=head;
    }
    void Traverse()
    {
        Node temp = head;

        while(temp !=null);
    }


    public static void main(String[] args) {
        CircularLinkedList Cll = new CircularLinkedList();
        Cll.InsertatBegin(20);
        Cll.InsertatBegin(65);
        Cll.InsertatBegin(80);
        Cll.InsertatBegin(50);
        Cll.InsertatBegin(88);
    }
}
