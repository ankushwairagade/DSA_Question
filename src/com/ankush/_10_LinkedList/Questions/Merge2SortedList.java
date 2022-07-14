package com.ankush._10_LinkedList.Questions;

public class Merge2SortedList {
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
    void Display()
    {
       Node temp =head;
        while(temp!=null)
        {
            System.out.print(" "+temp.val);
            temp=temp.next;
        }
    }

    void InsertionBegin(int val)
    {
        Node in = new Node(val);
        in.next=head;
        head=in;

    }

    Merge2SortedList  MergeSortLinked(Merge2SortedList ls)
    {
        Node f = head;
        Node s = ls.head;
        Merge2SortedList copy= new Merge2SortedList();
        while(f!=null && s!=null)
        {
            if(f.val <s.val)
            {
                copy.InsertionBegin(f.val);
                f=f.next;
            }else{
                copy.InsertionBegin(s.val);
                s=s.next;

            }
        }

        while(f!=null)
        {
            copy.InsertionBegin(f.val);
            f=f.next;
        }
        while(s!=null)
        {
            copy.InsertionBegin(s.val);
            s=s.next;
        }

        return copy;
    }

    public static void main(String[] args) {
        Merge2SortedList list1 = new Merge2SortedList();
        Merge2SortedList list2 = new Merge2SortedList();
        list1.InsertionBegin(14);list1.InsertionBegin(9);list1.InsertionBegin(5);
        list1.InsertionBegin(3);list1.InsertionBegin(2);

        list2.InsertionBegin(8);list2.InsertionBegin(4);list2.InsertionBegin(1);
        list2.InsertionBegin(0);

        list1.Display();
        System.out.println();
        list2.Display();

        Merge2SortedList ll ;
        ll = list1.MergeSortLinked(list2);
       System.out.println();
        ll.Display();

        ll.reverse();
        System.out.println();
        ll.Display();
        System.out.println();
        ll.printtting();
    }


    private void reverse() {
        Node curr=head,prev=null,next=null;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    static void printRev(Node ls)
    {
        if(ls==null)
        {
            return;
        }

        printRev(ls.next);
        System.out.print(ls.val+"     ");
    }

    static void printForw(Node ls)
    {
        if(ls==null)
        {
            return;
        }
        System.out.print(ls.val+"     ");
        printForw(ls.next);

    }
    private void printtting() {


        printForw(head);
        System.out.println();
        printRev(head);
    }

}


