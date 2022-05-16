package com.ankush._10_LinkedList.Questions;

import java.util.Scanner;

public class AlternatingSplit {
    // SingleLinkedList ko Split krna hai without copy element S(n) = 0(constant)


    Node head = null;
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
        in.next=head;
        head=in;
    }

    void Travers()
    {
        Node temp = head;
        if(temp== null) return;
        System.out.print("start");
        while(temp != null)
        {
            System.out.print(" --> "+temp.val+" --> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    void Alternate(AlternatingSplit h1 , AlternatingSplit h2)
    {
        Node temp= head;
        Node a=head, b=head.next;
        h1.head= head;
        h2.head= head.next;

        while( a.next!=null && b.next!=null)
        {
            a.next=a.next.next;
            b.next=b.next.next;
            a=a.next;
            b=b.next;
        }
    }

    public static void main(String[] args) {

        AlternatingSplit list = new AlternatingSplit();
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            list.InsertatBegin(sc.nextInt());
        }
        list.Travers();
        AlternatingSplit ls1 = new AlternatingSplit();
        AlternatingSplit ls2 = new AlternatingSplit();
        list.Alternate(ls1,ls2);
        ls1.Travers();
        ls2.Travers();


    }
}
