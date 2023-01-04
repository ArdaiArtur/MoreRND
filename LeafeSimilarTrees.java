import java.util.LinkedList;
import java.util.List;

public class LeafeSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
     List<Integer>l1=new LinkedList<>();
     List<Integer>l2=new LinkedList<>();
     dfs(root1, l1);
     dfs(root2, l2);
     return l1.equals(l2);
    }

    public void dfs(TreeNode nod,List<Integer>lv)
    {
        if(nod==null)
        {
            return;
        }
        if(nod.left==null&&nod.right==null)
        lv.add(nod.val);
        dfs(nod.left, lv);
        dfs(nod.right, lv);
    }
}
