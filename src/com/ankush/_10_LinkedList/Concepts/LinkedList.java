package com.ankush._10_LinkedList.Concepts;

public class LinkedList {

   private Node head=null;
   private Node tail=null;
   // if you want size int size also taken whenver insertion and deletion happened the size will change -+


    class Node
    {
        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(int val) {
            this.val = val;
        }
    }
    void InsertionAtBegin(int val)
    {
        Node temp = new Node(val);

        temp.next=head;
        head=temp;

    }
    void InsertionAtEnd(int val)
    {
        Node temp= head;
        if(temp == null)
        {
            InsertionAtBegin(val);
            return;
        }

        while(temp.next!=null)
        {
            temp=temp.next;
        }

        Node in = new Node(val);
        temp.next=in;
    }
    void Traverse()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.val+" --> ");
            temp=temp.next;
        }
        System.out.println(" End ");


    }
    void DeleteFromStart()
    {
        if(head==null || head.next == null) {
            head=null;
            System.out.print("UnderFlow");
            return;
        }
        head=head.next;

    }
    void DeleteFromEnd()
    {
        if(head==null ||head.next == null) {
            head=null;
            System.out.print("UnderFlow");
            return;
        }
        Node temp = head;
        while(temp.next.next!=null)
        {
            temp = temp.next;
        }
        temp.next=null;

    }
    void CountNode()
    {
        Node temp= head;
        int count=0;
        while(temp != null)
        {
            count+=1;
            temp=temp.next;
        }

        System.out.println("Total Node is  "+count);
    }
    void SearchinLL(int key)
    {
        Node temp = head;
        while(temp != null)
        {
            if(temp.val == key)
            {
                System.out.println("Key Found "+temp.val);
                return;
            }
            temp=temp.next;
        }
        System.out.println(" Key Not Found ");
    }

    void InsertionAtIndex(int val , int pos)
    {
        if(pos == 0)
        {
            InsertionAtBegin(val);
        }
         Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp=temp.next;
        }
        Node in =new Node(val,temp.next);
        temp.next=in;

    }

    void DeleteAtIndex(int pos)
    {
        if(head == null ) System.out.print("Underflow");
        if(pos == 0)
        {
            DeleteFromStart();
        }
        Node temp= head;

        for (int i = 1; i <pos-1 ; i++) {
            temp = temp.next;
            if(temp.next ==null || temp.next.next == null) return;
        }
        int v = temp.next.val;
        temp.next = temp.next.next;

        System.out.println("Delete "+v);
    }



    public static void main(String[] args) {

        LinkedList ls = new LinkedList();

        ls.InsertionAtBegin(10);
        ls.InsertionAtBegin(36);
        ls.InsertionAtBegin(95);
        ls.InsertionAtBegin(54);
        ls.Traverse();

        ls.InsertionAtEnd(28);
        ls.InsertionAtEnd(55);
        ls.InsertionAtEnd(200);
        ls.Traverse();
        ls.DeleteFromEnd();
        ls.DeleteFromStart();
        ls.Traverse();
        ls.CountNode();
        ls.SearchinLL(200);
        ls.InsertionAtIndex(52,3);
        ls.Traverse();
        ls.DeleteAtIndex(3);
        ls.Traverse();
    }


}
