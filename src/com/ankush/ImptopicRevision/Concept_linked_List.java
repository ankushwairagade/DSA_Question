package com.ankush.ImptopicRevision;

public class Concept_linked_List {

    Node head=null;
    class Node{
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }

        Node (int val , Node next)
        {
            this.val = val ;
            this.next = next;
        }
    }
        // BluePrint of Node class

    // Insertion
    void insertAtBegin(int val)
    {
        Node in = new Node(val);
        in.next=head;
        head=in;

    }

    void insertAtEnd(int val)
    {
        if(head == null)
        {
            insertAtBegin(val);
        }
        Node temp= head;
        while(temp.next !=null) temp = temp.next;

        Node in = new Node(val);
        temp.next=in;
    }

    void insertAtMid(int val , int pos)
    {
        //
    }

    // Deletion
    void DeleteAtBegin()
    {
        System.out.println("Process data "+head.val+" Deleting Begin Node");
        head=head.next;
    }
    void DeleteAtEnd(){
        Node temp = head;
        while(temp.next.next != null) temp =temp.next;

        System.out.println("Process data "+temp.next.val+ " Deleting Ending Node");
        temp.next=null;
    }
    void DeleteAtMid(int pos)
    {
        Node temp = head;
        while(pos !=0)
        {
            pos -=1;
            temp =temp.next;
        }

    }

    // Simple Operation on Linked List
    void Display()
    {
        Node temp  = head;
        System.out.println("Start --> ");
        while(temp != null)
        {
            System.out.print(temp.val+" --> ");
            temp = temp.next;
        }
        System.out.println(" End ");
    }

    void CountNode()
    {
        Node temp = head;
        int count=0;

        while(temp!= null)
        {
            temp = temp.next;
            count +=1;
        }
        System.out.println(" Total Number of Node is  "+count);
    }

    void ReverseNode()
    {
        Node curr= head , prev = null , next=null;

        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr=next;
        }
        head= prev;
    }











    public static void main(String[] args) {
        Concept_linked_List ll = new Concept_linked_List();
        ll.insertAtBegin(10);ll.insertAtBegin(12);ll.insertAtBegin(1);ll.insertAtBegin(98);ll.insertAtBegin(35);ll.insertAtBegin(24);ll.insertAtBegin(9);
        ll.Display();

    }
}
