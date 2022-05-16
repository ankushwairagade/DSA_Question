package com.ankush._19_Binary_Search_Tree;

public class
Concepts {
    // Creating Structure of BST

    TreeNode root;

    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public TreeNode InsertintoBST(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }
        //  5 < 50
        if (root.data > data) {
            root.left = InsertintoBST(root.left, data);
        } else if (root.data < data) {
            root.right = InsertintoBST(root.right, data);
        }
        return root;
    }

    public TreeNode search(TreeNode root, int Target) {
        if (root == null || root.data == Target) {
            return root;
        }

        if (root.data > Target) {
            return search(root.left, Target);
        } else {
            return search(root.right, Target);
        }

    }

    public void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print("  " + root.data);
        inOrder(root.right);
    }

    public void preOrder(TreeNode root) {
        if (root == null) return;
        System.out.print("  " + root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(TreeNode root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print("  " + root.data);
    }

    // rapo method

    public void insertBST(int data) {
        root = InsertintoBST(root, data);
    }

    public int SearchinBST(int target) {
        TreeNode in = search(root, target);
        if (in.data == target) return 1;
        else return -1;
    }

    public void INORDER() {
        System.out.println("PRINT IN_ORDER");
        inOrder(root);
    }

    public void PREORDER() {
        System.out.println("PRINT PRE_ORDER");
        preOrder(root);
    }

    public void POSTORDER() {
        System.out.println("PRINT POST_ORDER");
        postOrder(root);
    }


    int Height(TreeNode root) {
        if (root == null) return 0;
        else {
            int left = Height(root.left);
            int right = Height(root.right);

            if (left < right) return right + 1;
            else return left + 1;
        }

    }

    void height() {
        System.out.println("height of Tree is " + Height(root));
    }

    int SIZE(TreeNode root)
    {
        if(root == null) return 0;

        return 1+SIZE(root.left)+SIZE(root.right);
    }

    void size()
    {
        System.out.println("Size of Binary Tree is  "+SIZE(root));
    }

    public static void main(String[] args) {
        Concepts bst = new Concepts();
        bst.insertBST(50);bst.insertBST(10);bst.insertBST(25);bst.insertBST(150);bst.insertBST(105);bst.insertBST(120);
        bst.insertBST(900);bst.insertBST(5);

       System.out.println(bst.SearchinBST(900));
        bst.INORDER();
        System.out.println();
        bst.POSTORDER();
        System.out.println();
        bst.PREORDER();
        System.out.println();
         bst.height();

         bst.size();

    }
}
