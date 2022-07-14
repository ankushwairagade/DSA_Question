package com.ankush._10_LinkedList.Questions;

public class RemoveDuplicateFromSortedList {
    Node head=null;
    class Node {
        int val;
        Node next;
        Node(int val)
        {
            this.val =val;
            this.next=null;
        }

        Node (int val , Node next)
        {
            this.val=val;
            this.next=next;
        }
    }

    void insertatbegin(int val)
    {
        Node in = new Node(val);
        in.next=head;
        head=in;

    }

    void removeduplicate()
    {
        Node curr = head;

        while(curr!=null)
        {
            Node temp= curr.next;

            while(temp!=null && temp.val==curr.val)
            {
                temp =temp.next;
            }

            curr.next=temp;
            curr=curr.next;
        }
    }
    void Display()
    {
        Node temp =head;
        while(temp!=null)
        {
            System.out.print(" "+temp.val);
            temp=temp.next;
        }
    }


    public static void main(String[] args) {
        RemoveDuplicateFromSortedList ll = new RemoveDuplicateFromSortedList();
        ll.insertatbegin(1);
        ll.insertatbegin(1);
        ll.insertatbegin(1);
        ll.insertatbegin(2);
        ll.insertatbegin(2);
        ll.insertatbegin(3);
        ll.insertatbegin(3);
        ll.insertatbegin(3);
        ll.insertatbegin(3);
        ll.insertatbegin(5);

        ll.Display();

        ll.removeduplicate();
        System.out.println();
        ll.Display();

    }
}
