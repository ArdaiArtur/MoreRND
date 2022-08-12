package BinaryTreeBasics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BT2 {
    public static void main(String[] args) {
        
    }

    public static ArrayList<Integer> dididi(TreeNode me)
    {
        Queue<TreeNode> qu=new LinkedList<>();
        qu.add(me);
    ArrayList<Integer> a=new ArrayList<>();
        while(qu.size()!=0)
        {
            var de=qu.poll();
            a.add(de.val);
            if(de.left!=null)
            qu.add(de.left);
            if(de.right!=null)
            qu.add(de.left);
        }
        return a;
    }
}
