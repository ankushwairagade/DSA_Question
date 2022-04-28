package com.ankush._10_LinkedList.Questions;

public class ReverseLinkedList {

    Node head;
    class Node{
        int val;
        Node next;
        Node rand;
        public Node(int val) {
            this.val = val;
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
        System.out.print("Start ");
        while(temp != null)
        {
            System.out.print(temp.val+" --> ");
            temp=temp.next;
        }
        System.out.println(" End ");
    }

    void Reverse()
    {
        Node prev=null,next=null, curr=head;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    public static void main(String[] args) {
        ReverseLinkedList ll = new ReverseLinkedList();
        ll.insertatbegin(69);
        ll.insertatbegin(98);
        ll.insertatbegin(12);
        ll.insertatbegin(14);
        ll.insertatbegin(6);
        ll.insertatbegin(43);
        ll.insertatbegin(70);
        ll.Display();
        ll.Reverse();
        ll.Display();


    }
}
