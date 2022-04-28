package com.ankush._10_LinkedList.Concepts;

public class main {
        private Node head=null;
    class Node  // blueprint of Node / Linked
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

    void  insertbegin(int val)
    {
         Node temp = new Node(val);
         temp.next=head;
         head=temp;
    }

    void insertend(int val)
    {
        Node temp = new Node(val);
        Node tra= head;

        while(tra.next != null)
        {
            tra=tra.next;
        }
        tra.next=temp;
        temp.next=null;
    }

    void display()
    {
        Node temp =head;

        while( temp != null)
        {
            System.out.print(+temp.val+" --> ");
            temp=temp.next;
        }
            System.out.println(" end");
    }

    void deletebeing()
    {
        if(head.next== null){
          head=null;
            System.out.print("underflow");
        }else {
            head = head.next;
        }
    }

    void deleteend()
    {
        Node temp =head;

        while(temp.next.next != null)
        {
            temp= temp.next;
        }
        temp.next=null;
    }

    void searchinLL(int key)
    {
        Node temp =head;
        int c=0;
        while(temp != null)
        {
            if(temp.val == key){
                System.out.print("found");
                c=1;
                break;
            }
            temp=temp.next;
        }
        if(c==0)System.out.print("Not Found");
    }

    void KthnodeFromend( int n) {
        Node fast = head;
        Node slow = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
            if (fast == null) return;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;


    }





    public static void main(String[] args) {

        main List1 = new main();
        List1.insertbegin(3);
        List1.insertbegin(5);
        List1.insertbegin(6);
        List1.insertbegin(2);
        List1.insertbegin(2);

        main List2 = new main();
        List2.insertbegin(2);
        List2.insertbegin(1);
        List2.insertbegin(2);
        List2.insertbegin(5);
        List2.insertbegin(7);

        List1.display();
        //List2.display();
        List1.KthnodeFromend(2);
        List1.display();





    }
}


