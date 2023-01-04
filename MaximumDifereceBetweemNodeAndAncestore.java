public class MaximumDifereceBetweemNodeAndAncestore {
  private int result;
    public int maxAncestorDiff(TreeNode root) {
        if (root == null) {
            return 0;
        }
        result = 0;
        helper(root, root.val, root.val);
        return result;
    }
    private void helper(TreeNode node,int max,int min)
    {
        if(node==null)
        return;
        int posres=Math.max(Math.abs(max-node.val),Math.abs(min-node.val));
        result=Math.max(result, posres);
        max=Math.max(max, node.val);
        min=Math.min(min, node.val);
        helper(node.left, max, min);
        helper(node.right, max, min);
        return;
    }
}
