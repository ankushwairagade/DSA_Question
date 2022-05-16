package com.ankush._10_LinkedList.Questions;
// vvimp question
// Ques__
/*
*   Each Node of a linked list consist of data next point and also a random pointer which
*   points to a random node in the List given an Algorithm for Cloning the List..
*
*   Application of this concept
*       - snack and Ladders
*       - Music Player
*       - next url searched web Browser
*       -  etc.......
*/
public class CloningLinkedList {

    Node head;
    class Node{
        int val;
        Node next;
        Node random;

        public Node(Node next) {
            this.next = next;
        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node random) {
            this.val = val;
            this.next = next;
            this.random = random;
        }
    }  // [ data , random -> , next -> ]

    void Insertbegin(int val)
    {
        Node temp = new Node(val);
        temp.next=head;
        head=temp;

    }

    void Traverse()
    {
        Node temp = head;
        System.out.print("Start --> ");
        while (temp!= null)
        {
            System.out.print(temp.val+" --> ");
            temp=temp.next;
        }
        System.out.println(" End ");
    }

    int CountNode()
    {
     Node temp = head;
     int count=0;

     while(temp != null)
     {
         count+=1;
         temp=temp.next;
     }
     return count;
    }


    void Makerandomlinked()
    {

    }
    public static void main(String[] args) {
        CloningLinkedList cll = new CloningLinkedList();
        cll.Insertbegin(20);
        cll.Insertbegin(36);
        cll.Insertbegin(78);
        cll.Insertbegin(98);
        cll.Insertbegin(80);
        cll.Insertbegin(45);
        cll.Traverse();
        System.out.println("total no of Nodes "+cll.CountNode());

    }
}
