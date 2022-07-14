package com.ankush._10_LinkedList.Questions;

public class RecursiveInsertion {
    Node head=null;
    class Node
    {
        int val;
        Node next;

        Node(int val)
        {
            this.val = val;
            this.next=null;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    void insertatbegin(int val)
    {
       Node in = new Node(val);
        in.next=head;
        head=in;

    }

    void Display()
    {
        Node temp = head;

        while(temp!=null)
        {
            System.out.print("  "+temp.val);
            temp = temp.next;
        }
    }

    void insertRec (int index , int val )
    {

    }

    Node insertRecursion(int index, int val ,Node node)
    {
        if(index == 0)
        {
            Node ls = new Node(val);
            ls.next=node.next;
            node.next=ls;

            return ls;
        }
       return insertRecursion(index-1,val,node.next);
    }


    public static void main(String[] args) {
        RecursiveInsertion ll = new RecursiveInsertion();
        ll.insertatbegin(3);
        ll.insertatbegin(5);
        ll.insertatbegin(9);
        ll.insertatbegin(1);
        ll.Display();

        ll.insertRecursion(3,10,ll.head);
        System.out.println();
        ll.Display();
    }

}
