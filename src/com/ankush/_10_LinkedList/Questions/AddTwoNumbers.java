package com.ankush._10_LinkedList.Questions;

public class AddTwoNumbers {

   ListNode head;
    class ListNode {
        int val;
       ListNode next;

        ListNode(int val)
        {
            this.val = val;
            this.next =null;
        }
    }

    void insertAtBegining(int val) {
       ListNode in = new ListNode(val);
        in.next = head;
        head = in;

    }
    void DisplayList() {
      ListNode temp = head;
        System.out.print("start -> ");
        while(temp!=null)
        {
            System.out.print(temp.val +" -> ");
            temp=temp.next;
        }
        System.out.println(" End");
    }

    ListNode Reverse(ListNode head)
    {
        ListNode curr=head, next=null,prev=null;

        while (curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }

    public static void main(String[] args) {
        AddTwoNumbers l1 = new AddTwoNumbers();
        AddTwoNumbers l2 = new AddTwoNumbers();
        l1.insertAtBegining(9);
        l1.insertAtBegining(2);
        l1.insertAtBegining(8);

        l2.insertAtBegining(7);
        l2.insertAtBegining(8);
        l2.insertAtBegining(6);

        l1.DisplayList();
        l2.DisplayList();
        AddTwoNumbers list = new AddTwoNumbers();
       list.head= list.addtwo(l1.head,l2.head);
       list.head=list.Reverse(list.head);
       list.DisplayList();
    }


    ListNode addtwo(ListNode l1 , ListNode l2)
    {
        ListNode dummy = new ListNode(0);
        ListNode ptr =dummy;
        int carry=0;
        while(l1 != null || l2 != null)
        {
            int x = l1.val;
            int y =l2.val;
            int sum = carry + x + y;
            carry = sum/10;
            ptr.next = new ListNode(sum%10);
            ptr = ptr.next;

            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;

        }
        if(carry >0)
        {
            ptr.next= new ListNode(carry);
        }

        return dummy.next;
    }

}
