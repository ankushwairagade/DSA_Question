package com.ankush._10_LinkedList.Questions;

public class LinkedList {
    // normal LinkedList

    Node head=null;
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

    void InsertionBegin(int val)
    {
       Node in = new Node(val);
       in.next=head;
        head=in;

    }

    void Traverse()
    {
        Node temp = head;
        if(temp == null){
            System.out.println("Underflow");
            return;
        }
        System.out.print("Start ");
        while(temp != null)
        {
            System.out.print(temp.val+" --> ");
            temp = temp.next;
        }
        System.out.println(" End");
    }

    void ReverseLinkedList()
    {
        Node currhead = head;
        Node pre=null , next=null;
        while(currhead!=null)
        {
            next =currhead.next;
            currhead.next=pre;
            pre = currhead;
            currhead =next;
        }
        head=pre;
    }

    // Insertion using Recursions
    public void InsertRec(int val , int index) {
    }
     void ReverseLL()
     {
            Node curr=head, pre=null,next=null;

            while(curr != null)
            {
                next=curr.next;
                curr.next=pre;
                pre=curr;
                curr=next;
            }
            head= pre;
        }

    void FindMiddle()
    {
    Node fast =head, slow =head;

    while(fast.next!=null)
    {
        fast= fast.next.next;
        slow=slow.next;
    }
    System.out.println("Middle Element is "+slow.val);
}

    void KthNodefromEnd(int k) {
        Node front = head;
        Node pick = head;
        for (int i = 0; i < k; i++) {
            front = front.next;
            if (front.next == null) {
                System.out.println("K is out of Bound");
            }
        }
        while (front != null)
        {
            front=front.next;
            pick=pick.next;
        }
        System.out.println("Kth Node from end is "+pick.val);
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.InsertionBegin(20);
        ll.InsertionBegin(10);
        ll.InsertionBegin(25);
        ll.InsertionBegin(65);
        ll.InsertionBegin(75);
        ll.InsertionBegin(99);
        ll.InsertionBegin(80);

        ll.Traverse();
        ll.ReverseLL();
        ll.Traverse();
        ll.FindMiddle();
        ll.KthNodefromEnd(5);
    }

}

//  Acc to me Question not that hard , Easy - Medium

/* Print Linkedlist in Reverse                                              // DONE
    LinkedList Reverse krho                                                 // DONE
    Find the Middle Point ( two pointer method slow, fastX2)                // DONE
    Loop Detecting in LinkedList ( two pointer method )                     // DONE
        Optimized way is floyed's cycle finding algorithm                   // DONE
        Modification question
            --- Loop detecting + find Start point of loop                   // DONE
     Linked List Application
     Adding
     Polynomial Representation                                              // DONE
    Hard Question---
        Suppose there are two Singly Linked lists both of which merge at same point and become a single LinkedList
        find the node at which they Merge?  Finding Merging Point
    Alternating Split in Linked List
 */