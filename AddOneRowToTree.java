public class AddOneRowToTree {
    
    public TreeNode addOneRow(TreeNode root,int val,int depth)
    { if (depth == 1) {
        TreeNode n = new TreeNode(val);
        n.left = root;
        return n;
    }
        dfs(root, val, depth);
         return root;
    }

    public void dfs(TreeNode root,int val,int depth)
    {
        if (root == null)
        return;
    if (depth == 2) {
        TreeNode t = root.left;
        root.left = new TreeNode(val);
        root.left.left = t;
        t = root.right;
        root.right = new TreeNode(val);
        root.right.right = t;
    } else {
        dfs( root.left,val, depth -1);
        dfs( root.right,val, depth -1);
    }
        
    }
}
