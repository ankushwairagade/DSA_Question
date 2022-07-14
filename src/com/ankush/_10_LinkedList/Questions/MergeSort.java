package com.ankush._10_LinkedList.Questions;

public class MergeSort {
    // Merge Sort on LinkedList
    // Two function is important
//  heart of () is twoMergeList(left , right)
    //  mergeSort( head )


    ListNode head;
  class ListNode {
     int val;
     ListNode next;
     ListNode(int val)
     {
         this.val = val;
         this.next=null;
     }
 }

 void insertatbegin(int val){
     ListNode in = new ListNode(val);

     in.next=head;
     head=in;
 }

 ListNode MergeTwo(ListNode left , ListNode right)
 {
     ListNode dummy = new ListNode(0);
     ListNode temp = dummy;

     while(left != null && right != null)
     {
         if(left.val < right.val)
         {
             temp.next=left;
             left=left.next;
             temp= temp.next;
         }
         else
         {
             temp.next=right;
             right=right.next;
             temp= temp.next;
         }


     }

    while(left!=null)
    {
        temp.next=left;
        left=left.next;
        temp=temp.next;
    }

     while(right!=null)
     {
         temp.next=right;
         right=right.next;
         temp=temp.next;
     }

     return dummy.next;
 }

 public ListNode MergeSorts( ListNode head)
 {
     if(head == null || head.next == null) {
         return head;
     }

     //find mid
     ListNode mid = getmid(head);
     //linked list break in two parts
     //left linked list head to mid
     ListNode fssh = head;   //fssh first section half;
     //right linked list mid.next to null
     ListNode sssh = mid.next;  //second section half
     mid.next = null;
     //recrsive call
     fssh = MergeSorts(fssh);
     sssh = MergeSorts(sssh);
     // and finally merging the LinkedList
     ListNode res = MergeTwo(fssh,sssh);

     return res;
 }



     ListNode getmid(ListNode head) {
         if(head == null)return head;
        ListNode slow=head , fast = head;

        while(fast.next!=null && fast.next.next!=null)
        {
            fast = fast.next.next;
            slow =slow.next;
        }
    return slow;
 }

 void display()
 {
     ListNode temp = head;
     while(temp != null)
     {
         System.out.print("  "+temp.val);
        temp = temp.next;
     }
 }
    public static void main(String[] args) {
        MergeSort ls  =new MergeSort();
        ls.insertatbegin(25);
        ls.insertatbegin(54);
        ls.insertatbegin(8);
        ls.insertatbegin(951);
        ls.insertatbegin(98);
        ls.insertatbegin(3);

        ls.display();
            System.out.println();


       ls.MergeSorts(ls.head);
        System.out.println();
        ls.display();
    }

}
