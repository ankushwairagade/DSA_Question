package com.ankush._10_LinkedList.Questions;

// Two Questioon is done /
// Detecting Loop
// Detecting loop point from where loop begins

public class DetectingCycle {
    private Node head=null;
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

    void insertatbegin(int val)
    {
        Node in = new Node(val);
        in.next=head;
        head=in;
    }

    void traverse()
    {
        Node temp = head;

        while (temp != null)
        {
            System.out.print(temp.val+" --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void traverseloop(int bob)
    {
        Node temp = head;
        int count=bob;
        while (count !=0)
        {   count-=1;
            System.out.print(temp.val+" --> ");
            temp = temp.next;
        }
        System.out.println(".......");
    }


    void createLoop()
    {
        Node temp = head;

        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=head.next.next.next;
    }

    void DetectingCycle()
    {
        Node slow = head , fast = head;

        while (fast!=null ||fast.next !=null|| slow != null)
        {
            fast= fast.next.next;
            slow=slow.next;
            if(slow == fast)
            {
                System.out.println("...... Warning Loop Detecting .......");
                return;
            }
        }

        System.out.println("No Loop in LinkedList ");
    }

    void DetectingCycleFromPosition()
    {
        Node fast = head, slow = head;
        while (fast != null || fast.next !=null || slow!=null)
        {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow)
            {
                System.out.println(" !!!!! Warning Loop has been Found !!!!! \n    calculating Points....");
                break;
            }
        }

        slow = head;
        int pos=0;
        while (fast != null || fast.next !=null || slow!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
            pos+=1;
            if(fast == slow)
            {
                System.out.println(" Starting Point for Cycle Node is "+slow.val+"  position of Node is "+pos);
                break;
            }
        }
    }



    public static void main(String[] args) {
        DetectingCycle list = new DetectingCycle();
        list.insertatbegin(10);
        list.insertatbegin(60);
        list.insertatbegin(65);
        list.insertatbegin(34);
        list.insertatbegin(98);
        list.insertatbegin(88);
        list.createLoop();
        list.traverseloop(20); // Successfully added Cycle into Linked List
        // Using two Pointer Slow, Fast Detect Cycle in Linked List

        list.DetectingCycle(); // Success
        list.DetectingCycleFromPosition();  // Run nicely
    }
}
