package com.ankush._19_Binary_Search_Tree;

public class BSTimplementation {
        BinaryTree root=null;
    class BinaryTree{
        int data;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    BinaryTree INSERT(BinaryTree root , int data)
    {
        if(root == null)
        {
            root= new BinaryTree(data);
            return root;
        }

        if(root.data > data)
        {
            root.left = INSERT(root.left , data);
        }else {
            root.right = INSERT(root.right,data);
        }

        return root;
    }

    void INORDER(BinaryTree root)
    {
        if(root == null) return;
        INORDER(root.left);
        System.out.print("  "+root.data);
        INORDER(root.right);

    }

    int SIZE (BinaryTree root)
    {       // optimal approach
        if(root == null) return 0;
        return 1+SIZE(root.right)+SIZE(root.left);

    }

    int FindSizeUT(BinaryTree root , int count)
    {
        //
        if(root == null) return 1;
        return FindSizeUT(root.left,count)+FindSizeUT(root.right,count);
    }


        boolean checkIdenticalTrees(BinaryTree p , BinaryTree q)
        {
            if(p==null && q==null) return true;
            if(p!=null && q!=null) {
               return  (p.data == q.data) &&
                       checkIdenticalTrees(p.left, q.left) &&
                       checkIdenticalTrees(p.right, q.right);
            }
                return false;
        }

    void insertBST(int data)
    {
        root = INSERT(root,data);
    }

    void inorder()
    {
        INORDER(root);
        System.out.println();
    }

    void findsizeUT()
    {
        System.out.println(FindSizeUT(root,0));
    }

    void size()
    {
        System.out.println(SIZE(root));
    }

    void checktrees(BSTimplementation bs)
    {
        System.out.println(checkIdenticalTrees(root,bs.root));
    }

    public static void main(String[] args) {
        BSTimplementation bs = new BSTimplementation();
        BSTimplementation b1 = new BSTimplementation();
        bs.insertBST(10);
        bs.insertBST(5);
        bs.insertBST(50);
        bs.insertBST(25);
        bs.insertBST(44);

        bs.inorder();

        bs.size();
        bs.findsizeUT();



        b1.insertBST(10);
        b1.insertBST(5);
        b1.insertBST(50);
        b1.insertBST(25);
        b1.insertBST(45);
        bs.checktrees(b1);
    }


}

