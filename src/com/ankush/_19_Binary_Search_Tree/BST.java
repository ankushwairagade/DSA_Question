package com.ankush._19_Binary_Search_Tree;

import java.util.Random;

public class BST {
    Node root;
    
    class Node{
        int val;
        Node left; 
        Node right;
        Node(int val)
        {
            this.val = val;
            this.left = this.right=null;
        }
    }  // blueprint is ready
    
     Node INSERT(Node root , int val)
    {
        if(root == null)  // base condition of recusion function
        {
            root = new Node(val);
            return root;
        }
        
        if(root.val > val)
        {
            root.left = INSERT(root.left,val);
        } else if (root.val < val ) {
            root.right =INSERT(root.right,val);
        }
        return root;
    }
    void insertintoBST(int val)
    {
        root=INSERT(root,val);
    }

    void INORDER(Node root)
    {
        if(root==null) {return;}

        INORDER(root.left);
        System.out.print("  "+root.val);
        INORDER(root.right);

    }
    void PREORDER(Node root)
    {
        if(root == null) return;
        System.out.print("  "+root.val);
        PREORDER(root.left);
        PREORDER(root.right);
    }
    void POSTORDER(Node root)
    {
        if(root == null) return;
        POSTORDER(root.left);
        POSTORDER(root.right);
        System.out.print("  "+root.val);
    }
    void inorder()
    {
        System.out.println("Printing INORDER");
        INORDER(root);
        System.out.println();
    }
    void preorder()
    {
        System.out.println("Printing PreOrder ");
        PREORDER(root);
        System.out.println();
    }
    void postorder()
    {
        System.out.println(" Printing PostOrder");
        POSTORDER(root);
        System.out.println();
    }
    
    int HEIGHT(Node root)
    {
        if(root ==null) return 0;
        else{
            int lheight = HEIGHT(root.left);
            int rheight = HEIGHT(root.right);
            if(lheight < rheight)
            {
                return (rheight+1);
            }
            else return (lheight+1);
        }
        
        
    }

    void height()
    {
        int len = HEIGHT(root);
        System.out.println("height of tree "+len);
    }

    void CURRENTLEVEL(Node root , int level)
    {
        if(root == null) return;
        if(level == 1){
            System.out.print(root.val+"  ");
        }else if(level>1)
        {
            CURRENTLEVEL(root.left,level-1);
            CURRENTLEVEL(root.right,level-1);
        }
    }

    void printlevelOrder()
    {
        System.out.println("Printing Level Order");
        int h = HEIGHT(root);
        for (int i = 0; i <=h ; i++) {
         CURRENTLEVEL(root,i);
        }
        System.out.println();
    }
    int SIZE(Node root)
    {
        if(root == null) return 0;
        else return (SIZE(root.left)+1+SIZE(root.right));
    }
    void sizeofbinarytree()
    {
        int size = SIZE(root);
        System.out.println("Size of Binary Tree is "+size);
    }

    public static void main(String[] args) {
        BST tree = new BST();
        Random rand  =new Random();

      tree.insertintoBST(1);
        tree.insertintoBST(2);
        tree.insertintoBST(4);
        tree.insertintoBST(5);
        tree.insertintoBST(3);
        tree.insertintoBST(20);
        tree.insertintoBST(40);
        tree.insertintoBST(44);

        tree.inorder();
        tree.preorder();
        tree.postorder();
        tree.height();
        tree.printlevelOrder();
        tree.sizeofbinarytree();

    }

    
}
