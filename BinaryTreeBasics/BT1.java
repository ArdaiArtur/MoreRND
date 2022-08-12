package BinaryTreeBasics;

import java.util.Stack;

public class BT1 {
    //most 2 childern
    //1 root
     //1 phat to any root 
    
    public static void main(String[] args) {
       
    }
    public static void tree(TreeNode me)
    {
        Stack<TreeNode> sts=new Stack<>();
        sts.add(me);
        while(sts.size()!=0)
        {var cur=sts.pop();
            if(cur.left!=null)
            sts.add(cur.left);
            if(cur.right!=null)
            sts.add(cur.right);
            
        }

    }

    }


 class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
     }
