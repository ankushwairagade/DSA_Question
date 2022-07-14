package com.ankush._10_LinkedList.Questions;

public class MergeSortonLinkedList {

    ListNode head;
    class ListNode{
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
    void DisplayList()
     {
        ListNode temp = head;
        System.out.print("start -> ");
        while(temp!=null)
        {
            System.out.print(temp.val +" -> ");
            temp=temp.next;
        }
        System.out.println(" End");
    }

    ListNode getMiddle (ListNode head)
    {
        if(head==null ) return head;
        ListNode slow=head, fast=head;

        while(fast.next!=null && fast.next.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    ListNode TwoMergeList(ListNode left , ListNode right)
    {
        ListNode dummy = new ListNode(0);
        ListNode ptr=dummy;
        while(left !=null && right !=null)
        {
            if(left.val < right.val)
            {
                ptr.next = left;
                left = left.next;
                ptr = ptr.next;
            }else{
                ptr.next = right;
                right = right.next;
                ptr = ptr.next;
            }
        }

        while(left!=null)
        {
            ptr.next = left;
            left = left.next;
            ptr = ptr.next;
        }

        while(right!=null)
        {
            ptr.next = right;
            right = right.next;
            ptr = ptr.next;
        }

        return dummy.next;
    }

    ListNode Merge(ListNode head)
    {
        if(head==null || head.next==null){
            return head;
        }

        ListNode mid =getMiddle(head);

        ListNode left =head;
        ListNode right = mid.next;

        mid.next=null;

        left = Merge(left);
        right = Merge(right);

        return TwoMergeList(left,right);

    }


    void MergeSort()
    {
       head=Merge(head);
    }


    public static void main(String[] args) {
        MergeSortonLinkedList ll = new MergeSortonLinkedList();
        ll.insertAtBegining(2);
        ll.insertAtBegining(25);
        ll.insertAtBegining(1);
        ll.insertAtBegining(36);
        ll.insertAtBegining(24);
        ll.insertAtBegining(84);
        ll.insertAtBegining(90);
        ll.insertAtBegining(5);

        ll.DisplayList();

        ll.MergeSort();

        ll.DisplayList();

    }


}
