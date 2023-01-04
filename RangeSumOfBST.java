import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RangeSumOfBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
     Queue<TreeNode>qe=new LinkedList<>();
     qe.add(root);
        int count=0;
     while (qe.size()>0) {
            int size=qe.size();
            for (int i = 0; i < size; i++) {
                var a=qe.poll();
                if(a.val>=low&&a.val<=high)
                count+=a.val;
                if(a.left!=null&&a.val>low)
                qe.add(a.left);
                if(a.right!=null&&a.val<high)
                qe.add(a.right);
            }
        }
     return count;


    }

}
