package com.ankush._10_LinkedList.Concepts;

public class DoublyLinkedlist {
     private Node head = null;

    class Node {
        int val;
        Node prev;
        Node next;

        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }

        public Node(int val) {
            this.val = val;
        }
    }

    void InsertFirst(int val) {
        Node in = new Node(val);
        in.prev = null;
        in.next = head;
        if(head !=null)
        {
            head.prev = in;
        }
        head = in;
    }

    void InsertEnd(int val)
    {
        if(head == null) InsertFirst(val);
        Node temp = head;

        while(temp.next != null)
        {
            temp =temp.next;
        }
        Node in = new Node(val);
        temp.next=in;

    }

    void InsertAtMid(int val ,int pos)
    {
        if(pos==0)
        {
            InsertFirst(val);
        }
        Node temp = head;

        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        Node in = new Node(val);
        temp.next.prev=in;
        in.next=temp.next;
        temp.next = in;
        in.prev=temp;




    }
    void Traverse()
    {   Node temp = head;

        if(temp == null) {System.out.print("Underflow"); return;}

        System.out.print(" start ");
        while(temp!= null)
        {

            System.out.print(" <-- "+temp.val+" --> ");
            temp=temp.next;
        }
        System.out.println(" End ");

    }
    void Deletebegin()
    {
        Node temp =head;
        if(temp==null) System.out.println("UnderFlow");

        System.out.println("Deleting Begin Node "+temp.val);
          head= temp.next;
          head.prev=null;
    }

    void DeleteEnd()
    {
        Node temp = head;
        if(head == null)
        {
            System.out.println("UnderFlow"); return;
        }

        while(temp.next !=null)
        {
            temp = temp.next;
        }
        System.out.println("Deleting Ending Node "+temp.val);
        temp.prev.next=null;
        temp.prev=null;


    }
    void DeleteAtMid(int pos)
    {
        Node temp = head;
        if(pos==0) Deletebegin();
        if (temp == null) {
            System.out.print("underflow");
            return;
        }

        for (int i = 1; i < pos; i++) {
            temp =temp.next;
        }
        System.out.println("Deleting Node at pos "+pos+ "  "+temp.val);
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
    }
    void TraverseInReverse()
    {
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        System.out.println("Printing in Reverse Traversing");
        System.out.print("Start ");
        while(temp!=null)
        {
            System.out.print(" <--> "+temp.val+" <--> ");
            temp = temp.prev;
        }
        System.out.println(" End ");
    }

    void Searching(int key )
    {
        Node temp = head;
        int pos=0;
        while(temp != null)
        {   pos +=1;
            if(temp.val == key) {
                System.out.println("key is Found in Doubly Linked list "+key+" at position "+pos); return;
            }

            temp = temp.next;
        }

        System.out.println("Not Found  "+key);
    }

    void CountNode()
    {
        Node temp = head;
        int count=0;
        if(head == null) {
            System.out.println("Empty List");
        }
        while(temp != null)
        {
            count+=1;
            temp = temp.next;

        }
        System.out.println("Total Number of Nodes is "+count);

    }


    public static void main(String[] args) {

        DoublyLinkedlist Dll = new DoublyLinkedlist();
        Dll.InsertFirst(20);
        Dll.InsertFirst(30);
        Dll.InsertFirst(90);
        Dll.Traverse();
        Dll.InsertEnd(66);
        Dll.Traverse();
        Dll.InsertAtMid(50,2);
        Dll.InsertAtMid(70,4);
        Dll.Traverse();
        Dll.Deletebegin();
        Dll.Deletebegin();
        Dll.Traverse();
       Dll.DeleteAtMid(3);
        Dll.Traverse();
        System.out.println("-------");
        Dll.TraverseInReverse();
        Dll.Searching(20);
        Dll.Searching(98);
        Dll.InsertEnd(65);
        Dll.CountNode();
        Dll.InsertAtMid(92,3);
        Dll.Traverse();


    }
}
