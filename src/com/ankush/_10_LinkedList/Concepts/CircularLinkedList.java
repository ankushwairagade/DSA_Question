package com.ankush._10_LinkedList.Concepts;

public class CircularLinkedList<V> {

    Node head;
    class Node
    {
        V val;
        Node next;

        public Node(V val) {
            this.val = val;
        }

        public Node(V val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    void InsertatBegin(V val)
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
        CircularLinkedList<Integer> Cll = new CircularLinkedList<>();
        Cll.InsertatBegin(20);
        Cll.InsertatBegin(65);
        Cll.InsertatBegin(80);
        Cll.InsertatBegin(50);
        Cll.InsertatBegin(88);
    }
}
