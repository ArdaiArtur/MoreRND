import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import BinaryTreeBasics.TreeNode;

public class ConstructStringFromBinaryTree {
    public String tree2str(TreeNode root) {
        if(root==null) return "";
        Stack<TreeNode>stack=new Stack<>();
        stack.add(root);
        StringBuilder fin=new StringBuilder();
        HashSet<TreeNode>hs=new HashSet<>();
        while(!stack.isEmpty())
        {
            TreeNode p=stack.peek();
            if(hs.contains(p))
            {
                stack.pop();
                fin.append(")");

            }
            else
            {
                hs.add(p);
                fin.append("("+p.val);
                if(p.left==null&&p.right!=null)
                {
                    fin.append("()");
                }
                if(p.right!=null)
                stack.push(p.right);
                if(p.left!=null)
                stack.push(p.left);
            }
        
        }
        return fin.substring(1,fin.length()-1);
    }
}
