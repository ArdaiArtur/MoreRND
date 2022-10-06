public class AddOneRowToTree {
    public TreeNode done;
    public TreeNode addOneRow(TreeNode root,int val,int depth)
    {
         return dfs(root, val, depth);
    }

    public TreeNode dfs(TreeNode root,int val,int depth)
    {
        
        if(depth==1)
        {
            
        
            var x=new TreeNode(val,root.left,null);
            root=x;
            return root;
        }
        dfs(root.left, val, depth-1);
        dfs(root.right, val, depth-1);
        return root;
        
    }
}
