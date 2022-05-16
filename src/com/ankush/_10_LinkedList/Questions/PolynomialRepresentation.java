package com.ankush._10_LinkedList.Questions;

public class PolynomialRepresentation {
 Node head = null;

 class Node{
     // N X^n   [ int , int , next]
     int val1 , val2;
     Node next;

     public Node(int val1, int val2, Node next) {
         this.val1 = val1;
         this.val2 = val2;
         this.next = next;
     }

     public Node(int val1, int val2) {
         this.val1 = val1;
         this.val2 = val2;
     }
 }

 void InsertionAtBegin(int X,int pn)
 {
     Node in = new Node(X,pn);
     in.next=head;
     head=in;
 }

    public static void main(String[] args) {
        PolynomialRepresentation see = new PolynomialRepresentation();
        see.InsertionAtBegin(-10,4);
        see.InsertionAtBegin(25,3);
        see.InsertionAtBegin(-90,2);
        see.InsertionAtBegin(66,1);
        see.InsertionAtBegin(2,0);
        see.Traverse();
    }

    private void Traverse() {
     Node temp = head;
     System.out.print("Start + ");
     while(temp!=null)
     {
         System.out.print(temp.val1+"X^"+temp.val2+" + ");
        temp = temp.next;
     }
     System.out.println(" End ");
    }
}

